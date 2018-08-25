<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>登录</title>
    <style type="text/css">
        body {
            padding-top: 50px;
        }

        .starter-template {
            padding: 40px 15px;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="starter-template">
           <#--<#if param.logout==0>-->
               <#--<p class="bg-warning">已注销</p>-->
           <#--<#elseif param.error==1>-->
               <#--<p class="bg-danger">有错误，请重试</p>-->
           <#--</#if>-->
        <h2>使用账号密码登录</h2>
        <form class="form-signin" role="form" name="form" action="/login" method="post">
            <div class="form-group">
                <label for="username">账号</label>
                <input id="username" type="text" class="form-control" name="username" value="" placeholder="账号"/>
            </div>
            <div class="form-group">
                <label for="password">密码</label>
                <input id="password" type="password" class="form-control" name="password" placeholder="密码"/>
            </div>
            <#--<!--<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}"/>&ndash;&gt;-->
            <input type="submit" id="login" value="Login" class="btn btn-primary"/>
        </form>
    </div>
</div>
</body>
</html>