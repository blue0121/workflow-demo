<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title!"未知标题"}</title>
    <link href="/css/zui.min.css" rel="stylesheet" />
</head>
<body style="margin: 0 20px;">

<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <!-- 导航头部 -->
        <div class="navbar-header">
            <!-- 移动设备上的导航切换按钮 -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-example">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!-- 品牌名称或logo -->
            <a class="navbar-brand" href="/">工作流例子</a>
        </div>
        <!-- 导航项目 -->
        <div class="collapse navbar-collapse navbar-collapse-example">
            <!-- 一般导航项目 -->
            <ul class="nav navbar-nav">
                <li class="active"><a href="/task/todo">待办事项</a></li>
                <li><a href="/task/done">已办事项</a></li>
                <!-- 导航中的下拉菜单 -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown">管理 <b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/repository">流程定义</a></li>
                    </ul>
                </li>
            </ul>

            <!-- 右侧的导航项目 -->
            <ul class="nav navbar-nav navbar-right">
                <li><a href="your/nice/url">帮助</a></li>
                <li class="dropdown">
                    <a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">探索 <b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="your/nice/url">敏捷开发</a></li>
                        <li><a href="your/nice/url">HTML5</a></li>
                        <li><a href="your/nice/url">Javascript</a></li>
                        <li class="divider"></li>
                        <li><a href="your/nice/url">探索宇宙</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- END .navbar-collapse -->
    </div>
</nav>