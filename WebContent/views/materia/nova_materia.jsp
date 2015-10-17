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
<title>Matérias</title>
</head>
<body>
	<c:import url="../index.jsp"/>
	<div class="body_wrap">
	<div class="row">
		<div class="col-sm-5">
			<h6 class="foo">Matérias</h6>
			<div class="add-comment add-comment-velvet styled" id="addcomments">
            	<div class="add-comment-title"><h3>Novo/Edição</h3></div>
               	<div class="comment-form">
                    <form action="#" method="post" id="commentForm" class="ajax_form">
                         <div class="form-inner">
                            <div class="field_text">
                                <label for="contact_name" class="label_title">Name:</label>
                            </div>
                            <div class="field_text">
                                <label for="subject" class="label_title">Subject:</label>
                                <input type="text" name="subject" id="subject" value="" placeholder="Hello, Mike!" class="inputtext input_middle required" />
                            </div>
                            <div class="clear"></div>
                        </div>
                        <div class="rowSubmit">
                            <a onclick="document.getElementById('commentForm').reset();return false" href="#" class="link-reset btn btn-black"><span>Discard</span></a>
                            <span class="btn btn-send"><input type="submit" id="send" value="Send Message" /></span>
                        </div>
                    </form>
                </div>
            </div>	
		</div>
	</div>
	</div>
</body>
</html>