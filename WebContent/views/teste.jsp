<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
	Titulo da pagina
</title>
<spring:url value="resourcers/js/libs/jquery-1.10.0.min.js" var="jquerymin" />
<spring:url value="resourcers/js/libs/jquery-ui.min.js" var="jquery-ui" />
<spring:url value="resourcers/js/libs/bootstrap.min.js" var="bootstrap" />
<spring:url value="resourcers/js/general.js" var="general" />
<spring:url value="resourcers/js/cusel-min.js" var="cusel" />
<spring:url value="resourcers/css/jquery-ui-1.8.20.custom.css" var="cssJquery" />
<spring:url value="resourcers/css/bootstrap.css" var="cssBoot" />
<spring:url value="resourcers/css/cusel.css" var="cssCusel" />

<script src="${jquerymin}"></script>
<script src="${jquery-ui}"></script>
<script src="${bootstrap}"></script>
<script src="${general}"></script>
<script src="${cusel}"></script>
<link href="${cssJquery}" rel="stylesheet">
<link href="${cssBoot}" rel="stylesheet">
<link href="${cssCusel}" rel="stylesheet">

<script type="text/javascript">
	$(document).ready(function(){
		alert(1)
	});
</script>

</head>
<body>
<h1>Teste Jsp</h1>
</body>
</html>