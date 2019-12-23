<%@ taglib prefix="myprefix" uri="/WEB-INF/custom_tag/liontag.tld"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
</head>
<body>
    <h2 class="hello-title">Hello ${name}!</h2>
    <p>Time is:</p>
    <myprefix:LionTag />
</body>
</html>