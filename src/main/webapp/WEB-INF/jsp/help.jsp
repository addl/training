<%@ taglib prefix="myprefix" uri="/WEB-INF/custom_tag/liontag.tld"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello: ${name}!</title>
</head>
<body>
	<!-- Test service call -->
	<h2>Version of service: ${version} </h2>
	<br />
	<!-- Test attr on model -->
    <h2 class="hello-title">Hello ${name}!</h2>
    
    <!-- Testing tag libs -->
    <p>Time is:</p>
    <myprefix:LionTag />
</body>
</html>