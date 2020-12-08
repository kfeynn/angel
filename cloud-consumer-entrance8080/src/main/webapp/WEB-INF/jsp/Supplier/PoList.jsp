<%--
  Created by IntelliJ IDEA.
  User: yuanqiang.zheng
  Date: 2020/11/20
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <%--<meta charset="utf-8" />--%>
    <title>PNList</title>
    <!--响应式设置，自动检测客户端设备-->
    <meta name="description" content="overview &amp; stats" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/bootstrap.min.css" /><!-- Url.Content 路径取绝对路径 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
    <!-- page specific plugin styles -->
    <!-- text fonts -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/fonts.googleapis.com.css" />
    <!-- ace styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
    <![endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/ace-skins.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/ace-rtl.min.css" />
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Content/assets/css/ace-ie.min.css" />
    <![endif]-->
    <!-- inline styles related to this page -->
    <!-- ace settings handler -->
    <script src="${pageContext.request.contextPath}/Content/assets/js/ace-extra.min.js"></script>
    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->
    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath}/Content/assets/js/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath}/Content/assets/js/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/_share.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/components/my97datepicker/WdatePicker.js"></script>
    <!--------------------------------------------- basic scripts -------------------------------------------->
    <!--[if !IE]> -->
    <script src="${pageContext.request.contextPath}/Content/assets/js/jquery-2.1.4.min.js"></script>
    <!-- <![endif]-->
    <!--[if IE]>
    <script src="${pageContext.request.contextPath}/Content/assets/js/jquery-1.11.3.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        if('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath}/Content/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
    </script>
    <script src="${pageContext.request.contextPath}/Content/assets/js/bootstrap.min.js"></script>
    <!-- page specific plugin scripts -->
    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath}/Content/assets/js/excanvas.min.js"></script>
    <![endif]-->
    <!-- ace scripts -->
    <script src="${pageContext.request.contextPath}/Content/assets/js/ace-elements.min.js"></script>
    <script src="${pageContext.request.contextPath}/Content/assets/js/ace.min.js"></script>
    <!-- 自定义js -->
    <!-- iframe 高度设置 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/home/iframe.js"></script>
    <!-- 分页条控制 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/home/bootstrapPager.js"></script>
    <!--bootstrap 表单验证插件-->
    <script src="${pageContext.request.contextPath}/Content/bootstrap/validator/js/bootstrapValidator.min.js"></script>
    <script src="${pageContext.request.contextPath}/Content/bootstrap/validator/js/language/zh_CN.js"></script>
    <script type="text/javascript">

        $(function () {
            // //导出到Excel
            // $("#btnOutExcel").click(function () {
            //     //参数赋值
            //     $("#outExcel").val("1");
            //     //提交
            //     doPostBack("");
            //     $("#outExcel").val("0");
            //     return false;
            // });
            // //PDF模板测试
            // $("#btnOutPDF").click(function () {
            //     //参数赋值
            //     $("#outExcel").val("2");
            //     //提交
            //     doPostBack("");
            //     $("#outExcel").val("0");
            //     return false;
            // });
            // $("#btnAPI").click(function () {
            //     //参数赋值
            //     $("#outExcel").val("3");
            //     //提交
            //     doPostBack("");
            //     $("#outExcel").val("0");
            //     return false;
            // });
            //查询
            $("#btnQuery").click(function () {
                $("#outExcel").val("0");
                doPostBack("");
                return false;
            });
        });
    </script>
    <%--<script src="${pageContext.request.contextPath}/Scripts/holder.min.js"></script>--%>
    </head>

    <body>
    <form action="${pageContext.request.contextPath}/Supplier/PoList" method="post">
    <fieldset>



    <div class="form-group">
        <label  class="col-sm-2 control-label">供应商编号：</label>
        <div class="col-sm-2">
            <input type="text" class="form-control"   name="pmm09" placeholder="供应商编号" value="${PO.pmm09}">
        </div>
        <label  class="col-sm-2 control-label">采购单号:</label>
        <div class="col-sm-2">
            <input type="text" class="form-control"   name="pmm01" placeholder="采购单号" value="${PO.pmm01}">
        </div>
        <label  class="col-sm-2 control-label">料号：</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="pmn04" placeholder="料号" value="${PO.pmn04}">
        </div>
    </div>


    <div class="form-group">
        <div class="col-sm-offset-6 col-sm-4">
            <button type="button" class="btn btn-default" id="btnQuery">查询</button>
        </div>
        <div class="col-sm-2 btn-warning">
            ${message}
        </div>
    </div>
    </fieldset>


    <div class="row">
    <div class="col-xs-12">
    <table id="simple-table" class="table  table-bordered table-hover">
        <thead>
        <tr>
            <th width="180px">采购单号</th>
            <th>物料编号</th>
            <th>交货日期</th>
            <th class="hidden-480">供应商编号</th>
            <th class="hidden-480">可打印数量</th>
            <th class="hidden-480">采购量</th>
            <th>未交量</th>
            <th>已收货数量</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${poList}" var="row" >
                <tr>
                    <td >${row.pmm01}</td>
                    <td >${row.pmn04}</td>
                    <td >${row.pmn33}</td>
                    <td >${row.pmm09}</td>
                    <td >${row.wdve}</td>
                    <td >${row.pmn20}</td>
                    <td >${row.wdve1}</td>
                    <td >${row.pmn50}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div><!-- /.span -->
    </div><!-- /.row -->
    <%--分页导航条 --%>
    ${pageHelper}
    </form>
    </body>
    </html>

    <script type="text/javascript">

        // $(function () {
        //     /************  显示/隐藏 区域  ***/
        //     $('.show-details-btn').on('click', function (e) {
        //         e.preventDefault();
        //         //$(this).closest('tr').next().toggleClass('open');
        //         $(this).closest('tr').next().fadeToggle("slow");
        //         $(this).find(ace.vars['.icon']).toggleClass('fa-angle-double-down').toggleClass('fa-angle-double-up');
        //         $(this).closest('tr').next().css('visibility', 'visible');
        //
        //         //重新计算父框架高度
        //         initIFrameHeight();
        //     });
        // });
        $(function () {
            /***************/
            //载入时隐藏审批列表
            //$(".detail-row").hide();
            //重新计算父框架高度
            initIFrameHeight();
        });
    </script>