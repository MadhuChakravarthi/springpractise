<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.style1{
width:900px !important;
}
</style>
</head>
<body>
<div class="style1 container" >
<div class="panel panel-primary" >
    <div class="panel-heading text-center">Acknowledgement Slip </div>
    <div class="panel-body">
<div class=row>
<form action="saveBhudharDetails" method="POST" commandName="LandListDetails"  > 
  <c:if test="${!empty ackWebCardlandDetails}">
  <table align=center   class="table table-striped table-bordered" id="dataTables-example" style="font-size: 14px; color:#0064AC" >
<tr><td>SNo</td><td>Allotment ID</td></tr>
  <c:forEach items="${ackWebCardlandDetails}" var="bhudhar" varStatus="test">
  <tr><td>${test.count}</td><td>${bhudhar.allotment_id}</td></tr>
</c:forEach>
</c:if>
</table></div></div></div></div></div>
</body>
</html>