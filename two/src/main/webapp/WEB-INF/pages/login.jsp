<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>注册页面</title>
    <style>
        /* 这里可以添加一些简单的样式 */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
        }
        label, input {
            display: block;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="name">客户名称:</label>
        <input type="text" id="name" name="name" required>

        <label for="danwei">客户单位:</label>
        <input type="text" id="danwei" name="danwei" required>

        <label for="zhiwei">客户职位:</label>
        <input type="text" id="zhiwei" name="zhiwei" required>

        <label for="birthday">客户生日:</label>
        <input type="text" id="birthday" name="birthday" required>

        <label for="sex">客户性别:</label>
        <input type="text" id="sex" name="sex" required>

        <label for="phone">客户联系方式:</label>
        <input type="text" id="phone" name="phone" required>

        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>