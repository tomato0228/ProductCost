layui.extend({
    admin: '{/}../../static/js/admin'
})
var projectNameVal = { 'projectName': '', 'projectId': 0 }
layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function () {
    var admin = layui.admin,
        form = layui.form,
        $ = layui.jquery,
        layer = layui.layer,
        table = layui.table
    //直接赋值数据
    table.render({
        elem: '#projectPlanList'
        , url: './addProjectPlanListDemo.json'
        , page: true
        , limits: [5, 10, 15, 20, 30, 50, 100]
        , limit: 10 //每页默认显示的数量
        , cols: [[ //标题栏
            { type: 'checkbox', fixed: 'left' }
            , { field: 'schemeId', title: '方案编号', width: 100, sort: true }
            , { field: 'productTreeName', title: '产品结构' }
            , { field: 'taskTreeName', title: '任务结构' }
            , { field: 'resourceTreeName', title: '资源结构' }
            , { field: 'timeTreeName', title: '时间结构' }
            , { field: 'technologyTreeName', title: '技术结构' }
            , { field: 'costTreeName', title: '费用结构' }
            , { fixed: 'right', title: '操作', width: 150, align: 'center', toolbar: '#barProjectPlanList' } //这里的toolbar值是模板元素的选择器
        ]]
        , skin: 'row' //表格风格
        , even: true
    })

    //监听排序
    table.on('sort(projectPlanList)', function (obj) {
        table.reload('projectPlanList', {
            initSort: obj
            //,page: {curr: 1} //重新从第一页开始
            , where: { //重新请求服务端
                key: obj.field //排序字段
                , order: obj.type //排序方式
            }
        })
    })

    //监听提交
    form.on('submit(editProjectName)', function (data) {
        var myDate = data.field
        myDate.projectId = projectNameVal.projectId
        //发异步，把数据提交后台
        $.ajax({
            url: '',
            dataType: 'JSON',
            type: 'post',
            data: myDate,
            success: function (data) {
                if (data.code === '0') {
                    layer.msg('修改成功')
                    setVal(data.projectVal)
                    form.render()
                } else {
                    layer.msg('修改失败')
                    form.val('addProjectPlanFrom', {
                        'projectName': projectNameVal.projectName
                    })
                    form.render()
                }
                return true
            },
            error: function () {
                layer.msg('系统错误')
                form.val('addProjectPlanFrom', {
                    'projectName': projectNameVal.projectName
                })
                form.render()
            }
        })
        return false
    })

    //监听工具条
    table.on('tool(projectPlanList)', function (obj) {
        var data = obj.data
        if (obj.event === 'projectPlanDel') {
            layer.confirm('真的删除行么', function (index) {
                layer.close(index)
                $.ajax({
                    url: '',
                    method: 'post',
                    data: data,
                    dataType: 'JSON',
                    success: function (res) {
                        if (res.code === '0') {
                            layer.msg('删除成功')
                            obj.del()
                        } else {
                            layer.msg('删除失败')
                        }
                    },
                    error: function () {
                        layer.msg('系统错误')
                    }
                })
                return false
            })
        } else if (obj.event === 'projectPlanEdit') {
            layer.open({
                type: 2,
                skin: 'CLYM-style',
                area: ['420px', '480px'],
                title: '编辑方案',
                content: 'editProjectPlan.html',
                success: function (layero, index) {
                    var body = layer.getChildFrame('body', index)//建立父子联系
                    var iframeWin = window[layero.find('iframe')[0]['name']]
                    iframeWin.setVal(data)
                }
            })
        }
    })

    var active = {
        delAll: function () {
            var checkStatus = table.checkStatus('projectPlanList'),
                data = checkStatus.data,
                tempProjrct = [],
                delList = []
            data.forEach(function (dataItem, i) {
                tempProjrct = []
                tempProjrct.projectId = dataItem.projectId
                tempProjrct.schemeId = dataItem.schemeId
                delList.push(tempProjrct)
            })
            if (delList.length !== 0) {
                layer.confirm('确定删除所选项吗？', function (index) {
                    $.ajax({
                        url: '',
                        type: 'post',
                        dataType: 'JSON',
                        data: delList,
                        success: function (data, statusText) {
                            if (data.code === '0') {
                                layer.msg('删除成功')
                                table.reload('projectPlanList', {})
                            } else {
                                layer.msg('删除失败')
                            }
                        },
                        error: function () {
                            layer.msg('系统错误')
                        }
                    })
                })
            } else {
                layer.msg('请选择需要删除的行')
            }
        },
        projectPlanAdd: function () {
            layer.open({
                type: 2,
                skin: 'CLYM-style',
                area: ['420px', '480px'],
                title: '添加方案',
                content: 'addProjectPlan.html',
                success: function (layero, index) {
                    var body = layer.getChildFrame('body', index)//建立父子联系
                    var iframeWin = window[layero.find('iframe')[0]['name']]
                    iframeWin.setVal(projectNameVal)
                }
            })
        }
    }

    $('i').on('click', function () {
        var type = $(this).data('type')
        active[type] ? active[type].call(this) : ''
    })
    $('.layui-btn').on('click', function () {
        var type = $(this).data('type')
        active[type] ? active[type].call(this) : ''
    })

    //刷新表格
    window.reloadTableData = function () {
        layui.table.reload('projectPlanList', {})
    }
})

function setVal (val) {
    projectNameVal = val
    layui.form.val('addProjectPlanFrom', {
        'projectName': projectNameVal.projectName
    })
}