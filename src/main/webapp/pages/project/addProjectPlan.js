layui.extend({
    admin: '{/}../../static/js/admin'
})
var projectNameVal = []
layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function () {
    var admin = layui.admin,
        form = layui.form,
        $ = layui.jquery,
        layer = layui.layer,
        table = layui.table

    //监听提交
    form.on('submit(addProjectPlan)', function (data) {
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
                    layer.alert('增加成功', { icon: 6 }, function () {
                        var index = parent.layer.getFrameIndex(window.name)
                        parent.reloadTableData()
                        parent.layer.close(index)
                    })
                } else {
                    layer.alert('增加失败', { icon: 5 }, function () {
                        var index = parent.layer.getFrameIndex(window.name)
                        parent.reloadTableData()
                        parent.layer.close(index)
                    })
                }
                return true
            },
            error: function () {
                layer.alert('系统错误', { icon: 5 }, function () {
                    var index = parent.layer.getFrameIndex(window.name)
                    parent.reloadTableData()
                    parent.layer.close(index)
                })
            }
        })
        return false
    })

    //动态select option
    $(document).ready(function () {
        //产品结构
        var productTreeSelect = document.getElementById('productTree')
        $.ajax({
            url: './demo.json',
            dataType: 'JSON',
            type: 'post',
            success: function (data) {
                $.each(data, function (index, item) {
                    productTreeSelect.options.add(new Option(item.productTreeName, item.productTreeId))//往下拉菜单里添加元素
                })
                form.render('select')//菜单渲染 把内容加载进去
            }
        })
        //任务结构
        var taskTreeSelect = document.getElementById('taskTree')
        $.ajax({
            url: './demo.json',
            dataType: 'JSON',
            type: 'post',
            success: function (data) {
                $.each(data, function (index, item) {
                    taskTreeSelect.options.add(new Option(item.taskTreeName, item.taskTreeId))//往下拉菜单里添加元素
                })
                form.render('select')//菜单渲染 把内容加载进去
            }
        })
        //资源结构
        var resourceTreeSelect = document.getElementById('resourceTree')
        $.ajax({
            url: './demo.json',
            dataType: 'JSON',
            type: 'post',
            success: function (data) {
                $.each(data, function (index, item) {
                    resourceTreeSelect.options.add(new Option(item.resourceTreeName, item.resourceTreeId))//往下拉菜单里添加元素
                })
                form.render('select')//菜单渲染 把内容加载进去
            }
        })
        //时间结构
        var timeTreeSelect = document.getElementById('timeTree')
        $.ajax({
            url: './demo.json',
            dataType: 'JSON',
            type: 'post',
            success: function (data) {
                $.each(data, function (index, item) {
                    timeTreeSelect.options.add(new Option(item.timeTreeName, item.timeTreeId))//往下拉菜单里添加元素
                })
                form.render('select')//菜单渲染 把内容加载进去
            }
        })
        //技术结构
        var technologyTreeSelect = document.getElementById('technologyTree')
        $.ajax({
            url: './demo.json',
            dataType: 'JSON',
            type: 'post',
            success: function (data) {
                $.each(data, function (index, item) {
                    technologyTreeSelect.options.add(new Option(item.technologyTreeName, item.technologyTreeId))//往下拉菜单里添加元素
                })
                form.render('select')//菜单渲染 把内容加载进去
            }
        })
        //费用结构
        var costTreeSelect = document.getElementById('costTree')
        $.ajax({
            url: './demo.json',
            dataType: 'JSON',
            type: 'post',
            success: function (data) {
                $.each(data, function (index, item) {
                    costTreeSelect.options.add(new Option(item.costTreeName, item.costTreeId))//往下拉菜单里添加元素
                })
                form.render('select')//菜单渲染 把内容加载进去
            }
        })
    })
})
function setVal (val) {
    projectNameVal = val
}