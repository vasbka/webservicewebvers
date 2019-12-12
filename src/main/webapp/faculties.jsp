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
 	<c:when test="${ faculties == null || empty faculties }">
		<h2>No trips found</h2>
 	</c:when>
	<c:otherwise>
	<table class="brd">
	<thead class="tabhead">
		<colcolgroup class="left"/>
		<colcolgroup class="left"/>
		<colcolgroup class="left"/>
		<colcolgroup class="right"/>
		<colcolgroup class="right"/>
		<colcolgroup class="left"/>
		<tr>
			<th class="brd">Title</th>
			<th class="brd">Short title</th>
			<th class="brd">Place count</th>
			<th class="brd">BUdget place count</th>
			<th class="brd">Faculty branch</th>
			<th class="brd">FacultyRoomNumber</th>
			<th class="brd">Bacheloer count</th>
			<th class="brd">Employed count</th>
			<th class="brd">Delete</th>

		</tr>
	</thead>
	<tbody>
	<c:forEach var="faculty" items="${ faculties }">
		<tr>
			<td class="brd">${faculty.title}</td>
			<td class="brd">${faculty.shortTitle}</td>
			<td class="brd">${faculty.placeCount}</td>
			<td class="brd">${faculty.budgetPlaceCount}</td>
			<td class="brd">${faculty.facultyBranch}</td>

			<c:if test="${faculty.facultyRoomNumber.no != null}">
				<td class="brd">no</td>
			</c:if>
			<c:if test="${faculty.facultyRoomNumber.yes != null}">
				<td class="brd">${faculty.facultyRoomNumber.yes}</td>
			</c:if>
			<c:if test="${faculty.additional.bacheloerCount != null}">
				<td class="brd">${faculty.additional.bacheloerCount}</td>
			</c:if>
			<c:if test="${faculty.additional.employedStudents != null}">
				<td class="brd">${faculty.additional.employedStudents}</td>
			</c:if>
			<c:if test="${faculty.additional.employedStudents == null}">
                <td class="brd"></td>
            </c:if>
			<td>
			<form action="delete" method="post">
                <input type="hidden" name="id" value="${faculty.id }">
                <input type="submit" value="delete">
            </form>
			</td>

		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:otherwise>
	</c:choose>
</body>
</html>