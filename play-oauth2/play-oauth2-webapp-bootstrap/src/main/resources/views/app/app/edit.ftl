<link type="text/css" rel="stylesheet" href="//cdn.bootcss.com/bootstrap-fileinput/4.3.3/css/fileinput.min.css">
<style>
    .kv-avatar .file-preview-frame, .kv-avatar .file-preview-frame:hover {
        margin: 0;
        padding: 0;
        border: none;
        box-shadow: none;
        text-align: center;
    }

    .kv-avatar .file-input {
        display: table-cell;
        max-width: 220px;
    }
</style>

<section class="content-header">
    <h1>
        应用列表
        <small>开始管理应用列表</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="javascript:;">
            <i class="fa fa-home"></i> 首页
        </a></li>
        <li><a href="#/page/app/app/list">
            <i class="fa fa-cloud"></i>我的应用
        </a></li>
        <li class="active">${app.name}</li>
    </ol>
</section>

<!-- Main content -->
<section class="content">

    <div class="row">
        <div class="col-xs-12">

            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">${app.name}</h3>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form role="form" class="app-form" action="/app/app/save">
                    <input type="hidden" name="id" value="${app.id}"/>
                    <input type="hidden" name="source" value="${app.source}"/>
                    <input type="hidden" name="installedFilePath" value=""/>
                    <input type="hidden" name="fileSizeBytes" value="${app.fileSizeBytes?c}"/>
                    <div class="box-body">

                        <div class="form-group">
                            <label for="nameInput">TrackID</label>
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="请输入或点击搜索选择" name="trackId"
                                       value="${app.trackId}" data-bv-notempty="true"
                                       data-bv-notempty-message="请填写TrackID" data-bv-integer="true"
                                       data-bv-integer-message="请输入整数">
                                <span class="input-group-btn">
									<button class="btn btn-primary" type="button" id="getStroreAppButton">获取</button>
									<button class="btn btn-success" type="button" id="chooseStoreAppButton">搜索</button>
								</span>
                            </div>
                            <p class="help-block">
                                请填入TrackID获取应用信息，或点击搜索，选择应用。
                                <a href="javascript:;">如何获取TrackID?</a>
                            </p>
                        </div>
                        <div class="form-group">
                            <label for="nameInput">应用名称</label>
                            <input type="text" name="name" class="form-control" id="nameInput" placeholder="请填写应用名称"
                                   data-bv-notempty="true"
                                   data-bv-notempty-message="请填写应用名称" value="${app.name}">
                        </div>
                        <div class="form-group">
                            <label for="iconInput">应用图标</label>
                            <div class="kv-avatar">
                                <input type="hidden" name="iconPath" value="${app.iconPath}"/>
                                <input type="file" id="iconInput" class="file-loading" name="file">
                            </div>
                            <p class="help-block">上传的图片最佳大小是160px*160px。</p>
                        </div>
                        <div class="form-group">
                            <label for="platformInput">所属平台</label>
                            <input type="text" name="platform" class="form-control" id="platformInput"
                                   placeholder="根据应用文件自动获取" readOnly value="ios">
                        </div>
                        <div class="form-group">
                            <label for="identifierInput">应用标识</label>
                            <input type="text" name="identifier" class="form-control" id="identifierInput"
                                   placeholder="根据应用文件自动获取" data-bv-notempty="true"
                                   data-bv-notempty-message="请上传应用文件" value="${app.identifier}">
                        </div>
                        <div class="form-group">
                            <label for="versionInput">应用版本</label>
                            <input type="text" name="version" class="form-control" id="versionInput"
                                   placeholder="根据应用文件自动获取" readOnly value="${app.version}">
                        </div>
                        <div class="form-group">
                            <label for="imageInput">应用图片</label>
                            <input type="hidden" name="photos"
                                   value="<#list app.photos as photo><#if photo_index==0>${photo}<#else>,${photo}</#if></#list>"/>
                            <input type="file" id="imageInput" class="file-loading" name="file" multiple>
                            <p class="help-block">只允许上传最多5张图片。</p>
                        </div>
                        <div class="form-group">
                            <label for="descriptionInput">应用描述</label>
                            <textarea name="description" class="form-control" id="descriptionInput"
                                      rows="10">${app.description}</textarea>
                        </div>
                    </div>
                    <!-- /.box-body -->

                    <div class="box-footer">
                        <button type="button" class="btn btn-default" onclick="location.href='#/page/app/app/list'">
                            返回列表
                        </button>
                        <button type="submit" class="btn btn-primary pull-right">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<script type="text/javascript">
    require(["domReady", "fileinputzh"], function (domReady) {
        domReady(function () {
            activeMenu("app");

            var $form = $(".app-form");

            var $fileInput = $("#fileInput");
            $fileInput.fileinput({
                language: "zh",
                uploadUrl: base + "/center/app/upload_app_file", // server upload action
                initialCaption: $form.find("input[name=installedFilePath]").val(),
                showPreview: false,
                multiple: false,
                showUpload: false, // hide upload button
                showRemove: false, // hide remove button
                minFileCount: 1,
                maxFileCount: 1,
                allowedFileExtensions: ["ipa"],
                maxFileSize: 100 * 1024 * 1024
            }).on("filebatchselected", function (event, files) {
                $fileInput.fileinput("upload");
            }).on('fileuploaded', function (event, data, previewId, index) {
                var response = data.response;
                if (response.success) {
                    $form.find("input[name=installedFilePath]").val(response.url);

                    var fileInfo = response.fileInfo;

                    $form.find("input[name=name]").val(fileInfo.cfbundleDisplayName);
                    $form.find("input[name=platform]").val("ios");
                    $form.find("input[name=identifier]").val(fileInfo.cfbundleIdentifier);
                    $form.find("input[name=version]").val(fileInfo.cfbundleVersion);
                    $form.find("input[name=fileSizeBytes]").val(fileInfo.fileSizeBytes);

                    $form.find("input[name=iconPath]").val(fileInfo.cfbundleIconFile);
                    $(".kv-avatar img").attr("src", fileInfo.cfbundleIconFile);
                }

            }).on('fileuploaderror', function (event, data, msg) {
                response = data.response;
                alert(msg);
            });

            var iconImage = "${app.iconPath}";
            var $iconInput = $("#iconInput");
            $iconInput.fileinput({
                overwriteInitial: true,
                language: "zh",
                uploadUrl: base + "/center/multipart/upload",
                maxFileSize: 1500,
                showClose: false,
                showCaption: false,
                multiple: false,
                showUpload: false, // hide upload button
                showRemove: false, // hide remove button
                minFileCount: 1,
                maxFileCount: 1,
                allowedFileTypes: ["image"],
                maxFileSize: 10 * 1024 * 1024,
                defaultPreviewContent: "<img src='" + (iconImage && iconImage != "" ? iconImage : "#") + "' alt='图标' style='width:160px'>"
            }).on("filebatchselected", function (event, files) {
                $iconInput.fileinput("upload");
            }).on('fileuploaded', function (event, data, previewId, index) {
                response = data.response;
                if (response.success) {

                    $form.find("input[name=iconPath]").val(response.urls);
                }
            });

            var appPhotos = [<#list app.photos as photo><#if photo_index==0>"${photo}"<#else>, "${photo}"</#if></#list>];
            var appPhotosConfig = [];
            if (appPhotos) {
                for (var i in appPhotos) {
                    appPhotos[i] = "<img src='" + appPhotos[i] + "' class='file-preview-image img-responsive'>";
                    appPhotosConfig[i] = "" + i;
                }
            } else {
                appPhotos = [];
            }
            var $imageInput = $("#imageInput");
            $imageInput.fileinput({
                language: "zh",
                uploadUrl: base + "/center/multipart/upload", // server upload action
                uploadAsync: false,
                overwriteInitial: false,
                initialPreview: appPhotos,
                initialPreviewConfig: appPhotosConfig,
                showPreview: true,
                autoReplace: true,
                showUpload: false, // hide upload button
                showRemove: false, // hide remove button
                minFileCount: 1,
                maxFileCount: 5,
                allowedFileTypes: ["image"],
                maxFileSize: 100 * 1024 * 1024
            }).on("filebatchselected", function (event, files) {
                $imageInput.fileinput("upload");
            }).on("filebatchuploadsuccess", function (event, data, previewId, index) {
                response = data.response;
                var $photos = $form.find("input[name=photos]");
                var photos = $photos.val();

                if (photos != null && photos != "") {
                    $photos.val(photos + "," + response.urls);
                } else {
                    $photos.val(response.urls);
                }
            }).on('filesuccessremove', function (event, id) {
                var index = $("#" + id).prevAll().length;

                var $photos = $form.find("input[name=photos]");
                var photos = $photos.val();

                var values = photos.split(",");
                values.splice(index, 1);
                $photos.val(values.join());
            }).on('filedeleted', function (event, key) {
            }).on('filecleared', function (event) {
                $form.find("input[name=photos]").val("");
            });

            $("#getStroreAppButton").on("click", function () {
                var trackId = $form.find("input[name=trackId]").val();
                if (trackId && trackId != "") {
                    $.ajax({
                        url: "https://itunes.apple.com/lookup",
                        type: "GET",
                        data: {
                            id: trackId
                        },
                        dataType: "jsonp",
                        success: function (data, textStatus, jqXHR) {
                            var count = data.resultCount;
                            var apps = data.results;

                            if (apps && apps.length > 0) {
                                var app = apps[0];

                                $form.find("input[name=trackId]").val(app.trackId);
                                $form.find("input[name=name]").val(app.trackName);
                                $form.find("input[name=platform]").val("ios");
                                $form.find("input[name=identifier]").val(app.bundleId);
                                $form.find("input[name=version]").val(app.version);
                                $form.find("input[name=fileSizeBytes]").val(app.fileSizeBytes);

                                $form.find("input[name=iconPath]").val(app.artworkUrl100);
                                $(".kv-avatar img").attr("src", app.artworkUrl100);

                                ////////////

                                //////////////
                            } else {
                                $.alert({
                                    title: false,
                                    content: "该TrackID找不到对应的应用",
                                    confirmButton: "关闭"
                                });
                            }
                        }
                    });
                } else {
                    $.alert({
                        title: false,
                        content: "请输入TrackID",
                        confirmButton: "关闭"
                    });
                }
            });

            $("#chooseStoreAppButton").on("click", function () {
                $.confirm({
                    title: "搜索store上的应用",
                    content: "url:" + base + "/center/dialog/storeAppList",
                    columnClass: "col-md-10 col-md-offset-1",
                    confirmButton: "确定",
                    cancelButton: "取消",
                    confirmButtonClass: 'btn-primary',
                    cancelButtonClass: 'btn-danger',
                    confirm: function () {
                        var me = this;
                        var $table = me.$b.find("table");

                        var checked = $table.find("input[type=radio]:checked");

                        if (checked && checked.length > 0) {

                            var $tr = $(checked[0]).closest("tr");

                            $form.find("input[name=trackId]").val($tr.data("trackId"));
                            $form.find("input[name=name]").val($tr.data("name"));
                            $form.find("input[name=platform]").val("ios");
                            $form.find("input[name=identifier]").val($tr.data("identifier"));
                            $form.find("input[name=version]").val($tr.data("version"));
                            $form.find("input[name=fileSizeBytes]").val($tr.data("fileSizeBytes"));

                            $form.find("input[name=iconPath]").val($tr.data("iconPath"));
                            $(".kv-avatar img").attr("src", $tr.data("iconPath"));

                            var screenshotUrls = $tr.data("screenshotUrls");
                            $form.find("input[name=photos]").val(screenshotUrls);

                            $form.find("textarea[name=description]").val($tr.data("description"));

                            var screenshotUrlsConfig = [];
                            if (screenshotUrls) {
                                screenshotUrls = screenshotUrls.split(",");
                                for (var i in screenshotUrls) {
                                    screenshotUrls[i] = "<img src='" + screenshotUrls[i] + "' class='file-preview-image img-responsive'>";
                                    screenshotUrlsConfig[i] = "" + i;
                                }
                            } else {
                                screenshotUrls = [];
                            }

                            $imageInput.fileinput('refresh', {
                                initialPreview: screenshotUrls,
                                initialPreviewConfig: screenshotUrlsConfig
                            });

                            return true;
                        } else {
                            $.alert({
                                title: false,
                                content: "请至少选择一个应用",
                                confirmButton: "关闭"
                            });
                        }

                        return false;
                    }
                });
            });

            $(".app-form").bootstrapValidator().on('success.form.bv', function (e) {
                e.preventDefault();

                var $form = $(e.target);

                var bv = $form.data('bootstrapValidator');

                $.post($form.attr('action'), $form.serialize(), function (result) {

                    if (result.success) {
                        $.alert({
                            title: false,
                            content: "保存成功",
                            confirmButton: "返回列表",
                            confirm: function () {
                                location.href = "#/page/app/app/list";
                            }
                        });

                    } else {

                        $form.bootstrapValidator('disableSubmitButtons', false);
                    }
                }, 'json');
            });
        });
    });
</script>