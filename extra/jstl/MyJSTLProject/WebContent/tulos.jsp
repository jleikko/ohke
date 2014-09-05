<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TULOS</title>
</head>
<body>

<h1>Tulos:</h1>
<h2>Lähetit yhden henkilön tiedot:</h2>
<p><c:out value="${henk.sukunimi}"/>, <c:out value="${henk.etunimi}"/></p>

<h2>Muita henkilöitä:</h2>
<p>
<c:forEach items="${hlist}" var="h">
	<c:out value="${h.sukunimi}"/>, <c:out value="${h.etunimi}"/><br/>
</c:forEach>
</p>
</body>
</html>