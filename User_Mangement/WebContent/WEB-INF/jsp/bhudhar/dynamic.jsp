<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align=center>
<tr><td>SNo</td><td>Name</td><td>Sex</td><td>Contact No</td></tr>

<form:form action="/saveEntry" method="post" commandName="contactFm" >
 <c:forEach items="${contactFm.contactlist}"  var="contact" varStatus="status" >
<tr><td>${status.count}</td><td><input type="text" name="contactlist[${status.index}].name"  value="${contact.name}" /></td>
<td><input type="text" name="contactlist[${status.index}].sex"  value="${contact.sex}" /></td>
<td><input type="text" name="contactlist[${status.index}].contactid"  value="${contact.contactid}" /> </td></tr>
</c:forEach> 
<tr><input type=submit value="ENTER"></tr>
</form:form>



</table>

</body>
</html>