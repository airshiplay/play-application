/**
 * Created by lig on 17/12/28.
 */
var activeMenu = function (code) {
    Pace.restart();
    $(".sidebar-menu").find(".active").removeClass("active");
    //$(".sidebar-menu").find(".menu-" + code).parent().removeClass('menu-open');
    if (code == "home") {
        $(".sidebar-menu").find(".menu-open").slideUp(false);
    }
    $(".sidebar-menu").find(".menu-" + code).addClass("active");
    $(".sidebar-menu").find(".menu-" + code).parent().parent().addClass("active");
};
var baseUrl = '';
var assetsPath = base + "/assets/";
requirejs.config({
    baseUrl:baseUrl,
    paths: {
        text: assetsPath + "vendor/plugins/requirejs/text",
        domReady: assetsPath + "vendor/plugins/requirejs/domReady",
        jquery: [assetsPath + "vendor/plugins/jQuery/jquery-2.2.3.min", "//cdn.bootcss.com/jquery/2.2.4/jquery.min"],
        jqueryExtend: [assetsPath + "js/jquery-extend"],
        jqueryui: [assetsPath + "vendor/plugins/jQueryUI/jquery-ui.min"],
        bootstrap: [assetsPath + "vendor/bootstrap/js/bootstrap.min", "//cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min"],
        slimscroll: [assetsPath + "vendor/plugins/slimScroll/jquery.slimscroll.min", "//cdn.bootcss.com/jQuery-slimScroll/1.3.8/jquery.slimscroll.min"],
        fastclick: [assetsPath + "vendor/plugins/fastclick/fastclick.min", "//cdn.bootcss.com/fastclick/1.0.6/fastclick.min"],
        router: [assetsPath + "vendor/plugins/director/director.min", "//cdn.bootcss.com/Director/1.2.8/director.min"],
        //bootgrid : "//cdn.bootcss.com/jquery-bootgrid/1.3.1/jquery.bootgrid.min",
        knockout:[assetsPath+"vendor/knockout/knockout-3.4.2"],
        bootgrid: [assetsPath + "vendor/plugins/jquery.bootgrid/jquery.bootgrid", "vendor/plugins/jquery.bootgrid/jquery.bootgrid"],
        bootgridfa: [assetsPath + "vendor/plugins/jquery.bootgrid/jquery.bootgrid.fa.min", "//cdn.bootcss.com/jquery-bootgrid/1.3.1/jquery.bootgrid.fa.min"],
        confirm: [assetsPath + "vendor/plugins/jquery-confirm/jquery-confirm.min", "//cdn.bootcss.com/jquery-confirm/2.5.1/jquery-confirm.min"],
        validator: assetsPath + "vendor/plugins/bootstrapvalidator/js/bootstrapValidator.min",
        validatorzh: assetsPath + "vendor/plugins/bootstrapvalidator/js/language/zh_CN",
        treetable: "//cdn.bootcss.com/jquery-treetable/3.2.0/jquery.treetable",
        treegrid_bootstrap3: "//cdn.bootcss.com/jquery-treegrid/0.2.0/js/jquery.treegrid.bootstrap3",
        treegrid: "//cdn.bootcss.com/jquery-treegrid/0.2.0/js/jquery.treegrid.min",
        treeview_bootstrap: "//cdn.bootcss.com/bootstrap-treeview/1.2.0/bootstrap-treeview.min",
        jstree: "//cdn.bootcss.com/jstree/3.3.2/jstree.min",
        fancytree: assetsPath + "vendor/plugins/fancytree/jquery.fancytree-all",
        fileinput: [assetsPath + "vendor/plugins/bootstrap-fileinput/js/fileinput.min", "//cdn.bootcss.com/bootstrap-fileinput/4.3.3/js/fileinput.min"],
        fileinputzh: [assetsPath + "vendor/plugins/bootstrap-fileinput/js/locales/zh", "//cdn.bootcss.com/bootstrap-fileinput/4.3.3/js/locales/zh.min"],

        jquery_sidebar: assetsPath + "vendor/plugins/jquery.sidebar/jquery.sidebar.min",
        select2: [assetsPath + "vendor/plugins/select2/select2.full.min", "//cdn.bootcss.com/select2/4.0.3/js/select2.full.min"],
        select2zh: [assetsPath + "vendor/plugins/select2/i18n/zh-CN", "//cdn.bootcss.com/select2/4.0.3/js/i18n/zh-CN"],
        //bootstrapmultiselect : "//cdn.bootcss.com/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.min",

        typeahead: "//cdn.bootcss.com/bootstrap-3-typeahead/4.0.1/bootstrap3-typeahead.min",
        chartjs: assetsPath + "vendor/plugins/chartjs/Chart.min",
        datepicker: "//cdn.bootcss.com/bootstrap-datepicker/1.6.4/js/bootstrap-datepicker.min",
        datepickerzh: "//cdn.bootcss.com/bootstrap-datepicker/1.6.4/locales/bootstrap-datepicker.zh-CN.min",

        bootstrap_toggle: assetsPath + "vendor/bootstrap-toggle/js/bootstrap-toggle.min",
        datetimepicker: assetsPath + "vendor/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min",
        datetimepickerzh: assetsPath + "vendor/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN",
        kindeditor: assetsPath + "vendor/plugins/kindeditor/kindeditor-all-min",
        icheck: [assetsPath + "vendor/plugins/iCheck/icheck.min", "//cdn.bootcss.com/iCheck/1.0.2/icheck"],
        adminlte: assetsPath + "adminlte/js/adminlte.min",
        app: assetsPath + "adminlte/js/app"
    },
    shim: {
        slimscroll: ["jquery"],
        bootstrap: {
            deps: ["jquery"],
            exports: "bootstrap"
        },
        jstree: ["jquery"],
        treetable: ["jquery"],
        treegrid: ["jquery"],
        treegrid_bootstrap3: ["treegrid"],
        treeview_bootstrap: ["bootstrap", "css!//cdn.bootcss.com/bootstrap-treeview/1.2.0/bootstrap-treeview.min.css"],
        bootstrap_toggle: ["bootstrap", "css!" + assetsPath + "vendor/bootstrap-toggle/css/bootstrap-toggle.min.css"],
        bootgrid: ["jquery"],
        bootgridfa: ["bootgrid"],
        validator: ["bootstrap"],
        validatorzh: ["validator"],
        confirm: ["jquery"],
        fileinput: ["bootstrap", "css!" + assetsPath + "vendor/plugins/bootstrap-fileinput/css/fileinput.min.css"],
        fileinputzh: ["fileinput"],
        select2: {deps: ["bootstrap", "css!" + assetsPath + "vendor/plugins/select2/select2.min.css"]},
        icheck: ["css!" + assetsPath + "vendor/plugins/iCheck/all.css"],
        select2zh: ["select2"],
        datepicker: ["bootstrap"],
        datepickerzh: ["datepicker"],
        jqueryui: ["jquery"],
        fancytree: ["jqueryui", "css!" + assetsPath + "vendor/plugins/fancytree/skin-bootstrap/ui.fancytree.min.css"],
        jquery_sidebar: ["jquery"],
        datetimepicker: ["css!" + assetsPath + "vendor/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.css"],
        datetimepickerzh: ["datetimepicker"],
        adminlte: ["jquery", "bootstrap", "slimscroll", "fastclick", "bootgridfa", "confirm", "validatorzh"],
        app: ["adminlte","jqueryExtend", "css!" + assetsPath + "css/admin.css"]
    },
    map: {
        '*': {
            css: assetsPath + 'require-css/css.min.js'
        }
    }
});
requirejs(["jquery","knockout", "router", "text", "app"], function ($,ko) {
    $(function () {
        var contentWrapper = $(".content-wrapper");

        var errorHtml="<section class=\"content-header\"></section>\
                        <section class=\"content\">\
                            <div class=\"error-page\"  style=\"text-align: center\">\
                            <h2 class=\"headline\"  style=\"float: none\" data-bind='text: errorTitle, css:errorCss' ></h2>\
                            <div class=\"error-content\"  style=\"margin-left: auto !important;\">\
                            <h3 ><i class=\"fa fa-warning\" data-bind='css:errorCss'></i> <!--ko text: errorMessage--><!--/ko--></h3>\
                             <p><a href=\"#/page/center/home\">首页</a> or  <a href=\"javascript:history.back(-1);\">上一页</a>\
                        ";
        function  viewModel() {
            var self  =this;
            self.errorCode =ko.observable(500);
            self.errorTitle=ko.computed(function(){
                return self.errorCode()+"";
            });
            self.errorCss=ko.computed(function(){
                if(self.errorCode()==404){
                    return "text-yellow"
                }else if(self.errorCode()==500){
                    return "text-red"
                }
                return '';
            });
            self.errorMessage=ko.computed(function(){
                if(self.errorCode()==404){
                    return "Oops! Page not found."
                }else if(self.errorCode()==500){
                    return "Oops! Something went wrong."
                }
                return '';
            });
        };
        var init=false;
        var viewModel=  new viewModel();
        var routes = {
            "/page": {
                "?((\w|.)*)": function (path) {
                    require(["text!" + base + '/' + path + ".view?_t=" + (new Date()).getTime()], function (html) {
                        contentWrapper.html(html);
                        $("body").removeClass('sidebar-open');
                    }, function (err) {
                        contentWrapper.html(errorHtml);
                        viewModel.errorCode(err.xhr.status);
                        ko.cleanNode(contentWrapper[0]);
                        ko.applyBindings(viewModel,contentWrapper[0]);
                    });
                }
            }
        };
        var router = Router(routes);
        router.init();
        var hash = window.location.hash;
        if (hash && hash != "") {

        } else {
            window.location.href = admin + "#/page/center/home";
        }

    });
});