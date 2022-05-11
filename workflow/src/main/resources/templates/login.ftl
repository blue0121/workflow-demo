<#include "include/header.ftl" />

<#if error??>
<div class="alert alert-danger-inverse">
    <i class="icon-remove-sign"></i>
    <div class="content">
        <h4>登录失败: ${error}</h4>
    </div>
</div>
</#if>

<form class="form-horizontal" action="/login" method="post">
    <div class="form-group">
        <label for="exampleInputAccount4" class="col-sm-2">用户名</label>
        <div class="col-md-6 col-sm-10">
            <input type="text" name="username" class="form-control" id="exampleInputAccount4" placeholder="用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword4" class="col-sm-2">密码</label>
        <div class="col-md-6 col-sm-10">
            <input type="password" name="password" class="form-control" id="exampleInputPassword4" placeholder="密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>

<#include "include/footer.ftl" />