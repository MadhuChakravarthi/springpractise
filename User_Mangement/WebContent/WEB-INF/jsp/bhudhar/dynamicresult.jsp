<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<tr><td>NAME</td><td>SEX</td><td>CONTACT</td></tr>
<form:form action="/save" method="post" commandName="ContactForm" >

<table>
<c:forEach items="${contactForm.contactlist}"  var="contact" varStatus="status" >

<tr><td>${contact.name}</td><td>${contact.sex}</td><td>${contact.contactid}</td></tr>
</c:forEach>


</form:form>



</table>

</body>
</html>