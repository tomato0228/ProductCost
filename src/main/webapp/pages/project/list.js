layui.extend({
    admin: '{/}../../static/js/admin'
})
layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function () {
    var admin = layui.admin,
        form = layui.form,
        $ = layui.jquery,
        layer = layui.layer,
        table = layui.table
    //直接赋值数据
    table.render({
        elem: '#projectList'
        , width: 803
        , url: '/Project/getProjectList'
        , method: 'POST'
        //,height: 274
        , page: true
        /*
        , page: { //详细参数可参考 laypage 组件文档
            curr: 5
            , groups: 1
            , first: false
            , last: false
            , layout: ['limit', 'prev', 'page', 'next', 'count'] //自定义分页布局
        }
        */
        , limits: [1, 5, 10, 15, 20, 30, 50, 100]
        , limit: 10 //每页默认显示的数量
        , cols: [[ //标题栏
            {type: 'checkbox', fixed: 'left'}
            , {type: 'numbers', hide: true}
            , {field: 'projectId', title: '项目编号', width: 200, sort: true}//field（必填项）设定字段名。字段名的设定非常重要，且是表格数据列的唯一标识
            , {field: 'projectName', title: '项目名称', width: 400}
            , {fixed: 'right', title: '操作', width: 150, align: 'center', toolbar: '#barprojectList'} //这里的toolbar值是模板元素的选择器
        ]]
        , skin: 'row' //表格风格
        , even: true
        //,size: 'lg' //尺寸

        //,loading: false //请求数据时，是否显示loading
    })

    //监听表格行点击
    table.on('tr', function (obj) {
        console.log(obj)
    })

    //监听表格复选框选择
    table.on('checkbox(projectList)', function (obj) {
        console.log(obj)
    })

    //监听表格单选框选择
    table.on('radio(projectList)', function (obj) {
        console.log(obj)
    })

    //监听单元格编辑
    table.on('edit(projectList)', function (obj) {
        var value = obj.value //得到修改后的值
            , data = obj.data //得到所在行所有键值
            , field = obj.field //得到字段

    })

    //监听工具条
    table.on('tool(projectList)', function (obj) {
        var data = obj.data
        if (obj.event === 'projectDel') {
            layer.confirm('真的删除行么', function (index) {
                layer.close(index)
                $.ajax({
                    url: '/Project/deleteProject',
                    method: 'post',
                    data: data,
                    dataType: 'JSON',
                    success: function (res) {
                        if (res.code === 0) {
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
        } else if (obj.event === 'projectEdit') {
            var w = ($(window).width() * 0.9)
            var h = ($(window).height() - 50)
            layer.open({
                type: 2,
                skin: 'CLYM-style',
                area: [w + 'px', h + 'px'],
                title: '修改项目',
                content: 'editProject.html',
                success: function (layero, index) {
                    var body = layer.getChildFrame('body', index)//建立父子联系
                    var iframeWin = window[layero.find('iframe')[0]['name']]
                    iframeWin.setVal(data)
                }
            })
        }
        return false
    })

    //监听排序
    table.on('sort(projectList)', function (obj) {
        table.reload('projectList', {
            initSort: obj
            //,page: {curr: 1} //重新从第一页开始
            , where: { //重新请求服务端
                sort: obj.field //排序字段
                , order: obj.type //排序方式
            }
        })
        return false
    })

    //监听提交
    form.on('submit(projectSreach)', function (data) {
        var myDate = data.field
        table.reload('projectList', {
            where: { //设定异步数据接口的额外参数，任意设
                projectName: data.field.projectName
            }
            , page: {
                curr: 1 //重新从第 1 页开始
            }
        })
        return false
    })

    var active = {
        projectDelAll: function () {
            var checkStatus = table.checkStatus('projectList'),
                data = checkStatus.data,
                tempProjrct = [],
                delList = []
            data.forEach(function (dataItem, i) {
                tempProjrct = []
                tempProjrct.projectId = dataItem.projectId
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
                                table.reload('projectList', {})
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
        table.reload('projectList', {})
    }
})
