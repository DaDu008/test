<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>注册页面</title>
</head>
<body>
<div class="container">
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath}/login2" method="post">

        请选择你的爱好：
        篮球<input type="checkbox" name="fans" value="篮球">
        羽毛球<input type="checkbox" name="fans" value="羽毛球">
        乒乓球<input type="checkbox" name="fans" value="乒乓球">
        高尔夫<input type="checkbox" name="fans" value="高尔夫">

        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>