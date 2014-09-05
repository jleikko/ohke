<%@page import="java.util.ArrayList"%>
<%@page import="bean.Henkilo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Otetaan JSTL-kirjastot käyttöön -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
List<Henkilo> henkiloLista = new ArrayList<Henkilo>();
henkiloLista.add(new Henkilo("Pekka", "Nieminen"));
henkiloLista.add(new Henkilo("Jaana", "Oikonen"));
henkiloLista.add(new Henkilo("Ville", "Järvinen"));
henkiloLista.add(new Henkilo("Anna", "Ammonen"));

request.setAttribute("henkiloLista", henkiloLista);

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ekasivu</h1>

<c:if test="${3 lt 4}">
<h2>hello</h2>
</c:if>


<c:choose>
	<c:when test="${ 2>6}">
		<h3>a</h3>
	</c:when>
	<c:otherwise>
		<h3>b</h3>
	</c:otherwise>
</c:choose>
<br/>
<br/>
<br/>
<br/>

<c:forEach items="${henkiloLista}" var="henk">

	<p>
	<b><c:out value="${henk.etunimi}"/></b>
	<i><c:out value="${henk.sukunimi}"/></i>
	</p>
</c:forEach>


</body>
</html>