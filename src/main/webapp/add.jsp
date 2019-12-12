<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of books</title>
<link href="css/default.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="jspf/head.jspf"></jsp:include>
 	<div>
 		<form action="add" method="post">
 			<label for="title">Title: </label>
 			<input type="text" name="title" />
 			<label for="shortTitle">Short title: </label>
 			<input type="text" name="shortTitle" />
 			<label for="placeCount">Place count: </label>
 			<input type="number" name="placeCount" min="0" max="120"/>
 			<label for="budgetPlaceCount">Budget place count: </label>
 			<input type="number" name="budgetPlaceCount" min="0.0" step="1"/>
 			<label for="facultyBranch">Faculty Branch: </label>
 			<select name="facultyBranch">
                <option disabled>Выберите уклон:</option>
                <option value="Mathmetical">Математический</option>
                <option selected value="Philology">Филологический</option>
           </select>
            <label for="facultyRooNumber">Faculty room: </label>
            <select name="facultyRooNumber">
                <option disabled>Есть закрепленная аудитория:</option>
                <option value="yes">Да</option>
                <option selected value="no">Нет</option>
           </select>
            <label for="facultyRooNumberYes">Faculty room if yes: </label>
           <input type="text" name="facultyRooNumberYes" />
           <input disabled value="Дополнительная информация" />
           <label for="bacheloer">Количество бакалавров </label>
           <input type="text" name="bacheloerCount" />
           <label for="year"> За год: </label>
           <input type="number" name="bacheloerYear" />
           <label for="employedCount">Количество работников</label>
           <input type="text" name="employedCount" />
           <input type="submit" value="Add" />
 		</form>
 	</div>
</body>
</html>