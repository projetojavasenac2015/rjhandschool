<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="author" content="HandSchool">
<meta name="keywords" content="">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Insert title here</title>
<spring:url value="resourcers/js/libs/jquery-1.10.0.min.js" var="jquerymin" />
<spring:url value="resourcers/js/libs/jquery-ui.min.js" var="jquery-ui" />
<spring:url value="resourcers/js/libs/bootstrap.min.js" var="bootstrap" />
<spring:url value="resourcers/js/general.js" var="general" />
<spring:url value="resourcers/js/cusel-min.js" var="cusel" />
<spring:url value="resourcers/css/jquery-ui-1.8.20.custom.css" var="cssJquery" />
<spring:url value="resourcers/css/bootstrap.css" var="cssBoot" />
<spring:url value="resourcers/css/cusel.css" var="cssCusel" />
<spring:url value="resourcers/css/personalizado.css" var="persona" />

<script src="${jquerymin}"></script>
<script src="${jquery-ui}"></script>
<script src="${bootstrap}"></script>
<script src="${general}"></script>
<script src="${cusel}"></script>
<link href="${cssJquery}" rel="stylesheet">
<link href="${cssBoot}" rel="stylesheet">
<link href="${cssCusel}" rel="stylesheet">
<link href="${persona}" rel="stylesheet">
<script>
jQuery(document).ready(function ($) {
    var daysRange = 5;

    function assignCalendar(id) {
        $('<div class="calendar" />')
                .insertAfter($(id))
                .multiDatesPicker({
                    dateFormat: 'yy-mm-dd',
                    minDate: new Date(),
                    maxDate: '+1y',
                    altField: id,
                    firstDay: 1,
                    showOtherMonths: true
                }).prev().hide();
    }

    assignCalendar('#date_departure');
});
</script>
</head>
<body>
	<div class="body_wrap">
		<div class="container">
			<div class="content" role="main">
                <div class="row">
                    <div class="col-sm-3">
                        <h2 class="foo">HAND SCHOOL</h2>
                    </div>
                    <div class="col-sm-9">
                        <div class="widget-container widget_search boxed-velvet">
                            <div class="inner">
                                <form method="get" id="" action="#">
                                    <div class="clearfix">
                                        <span class="btn btn-small">
                                            <input type="submit" id="searchsubmit2" value="Pesquisar" />
                                        </span>
                                        <div class="input_wrap">
                                            <span class="input_icon"></span>
                                            <input class="inputField" name="search3" type="text" placeHolder="Digite a palavra chave" />
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
		</div>
	</div>
</body>
</html>