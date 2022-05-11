<#include "../include/header.ftl" />

<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>状态</th>
    </tr>
    </thead>
    <tbody>
    <#list list as vo>
    <tr>
        <td>${vo_index+1}</td>
        <td>${vo.username}</td>
        <td>${vo.password}</td>
        <td>${vo.status}</td>
    </tr>
    </#list>
    </tbody>
</table>

<#include "../include/footer.ftl" />