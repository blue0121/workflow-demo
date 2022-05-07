<#include "../include/header.ftl" />

<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>序号</th>
        <th>名称</th>
        <th>Key</th>
        <th>Id</th>
        <th>版本</th>
        <th>资源名称</th>
    </tr>
    </thead>
    <tbody>
    <#list list as vo>
    <tr>
        <td>${vo_index+1}</td>
        <td>${vo.name}</td>
        <td>${vo.key}</td>
        <td>${vo.id}</td>
        <td>${vo.version}</td>
        <td>${vo.resourceName}</td>
    </tr>
    </#list>
    </tbody>
</table>

<#include "../include/footer.ftl" />