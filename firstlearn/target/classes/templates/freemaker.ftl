<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FreeMaker Template</title>
</head>
<body>
    <#list student as u>
        id:${u.getId()},name:${u.getUsername()},password:${u.getPassword()}<br>
    </#list>
</body>
</html>