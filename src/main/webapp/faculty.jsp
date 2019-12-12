<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of trips</title>
<link href="css/default.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="jspf/head.jspf"></jsp:include>
        <c:choose>
        <c:when test="${ faculty == null }">
            <h2>No trips found</h2>
        </c:when>
      <c:otherwise>
      <div class="">
         Faculty title is : ${faculty.title}
       </div>
       <div class="">
          Faculty short title is : ${faculty.shortTitle}
        </div>
        <div class="">
         Faculty place count is : ${faculty.placeCount}
       </div>
       <div class="">
          Faculty budget place count is : ${faculty.budgetPlaceCount}
        </div>
        </c:otherwise>
	</c:choose>
</body>
</html>
