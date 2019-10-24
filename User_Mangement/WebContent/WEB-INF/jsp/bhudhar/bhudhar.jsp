<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


   
  
<body>
    
    <form:form  action="/saveBhudhar"  method="POST" commandName="bhudhar">
    

	
	
    <!-- LOGO HEADER END-->

	
	<div> <span style="font-size: 16px">
	  <marquee style="color:#976607">
	    <strong>Welcome to e Pragathi Land Hub</strong>
    </marquee>
	  </span> </div>
	<!-- MENU SECTION END-->


	<p align="center" class="style1">Apply for Bhudhaar ID </p>
    <div class="content-wrapper">
    <div align="center">
<table border="1"  align=center>
		
		<tr>
			<td width="31%">
			<font color="#000000" face="Arial">&nbsp;</font><font color="#000000" face="Arial" size="3">Property Tax Identification Number</font></td>
			<td width="28%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:input path="propertytaxid" size="20"/></font></td>
			<td><font color="#000000" face="Arial">&nbsp;</font><font color="#000000" face="Arial" size="3">Address</font></td>
			<td width="28%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:input path="address" size="20"/></font></td>
		</tr>
		<tr>
			<td width="31%"><font face="Arial" color="#000000">&nbsp;State</font></td>
			<td width="28%"> <font face="Arial" color="#000000" size="3">
			  &nbsp;<form:input path="state" size="20"/>
			</font></td>
			<td width="18%"><font face="Arial" color="#000000">&nbsp;District</font></td>
			<td width="23%"> <font face="Arial" color="#000000" size="3">
			  &nbsp;<form:input path="district" size="20"/>
			</font></td>
		</tr>
		<tr>
			<td width="31%"><font face="Arial" color="#000000">&nbsp;Village</font></td>
			<td width="28%">&nbsp;<font face="Arial" color="#000000" size="3"><form:input path="village" size="20"/></font></td>
			<td width="18%"><font face="Arial" color="#000000">&nbsp;Hamlet</font></td>
			<td width="23%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:input path="hamlet" size="20"/></font></td>
		</tr>
		<tr>
			<td width="31%"><font face="Arial" color="#000000">&nbsp;Locality</font></td>
			<td width="28%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:input path="locality" size="20"/></font></td>
			<td width="18%"><font face="Arial" color="#000000">&nbsp;Pincode</font></td>
			<td width="23%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:input path="pincode" size="20"/></font></td>
		</tr>
		<tr>
			<td width="31%">&nbsp;Survey No.</td>
			<td width="28%"><font face="Arial" color="#000000" size="3">&nbsp;<form:input path="surveyno" size="20"/></font></td>
			<td width="18%">&nbsp;House No</td>
			<td width="23%">&nbsp;<font face="Arial" color="#000000" size="3"><form:input path="houseno" size="20"/></font></td>
		</tr>
		<tr>
			<td width="31%">&nbsp;Plot No</td>
			<td width="28%">&nbsp;<font face="Arial" color="#000000" size="3"><form:input path="plotno" size="20"/></font></td>
			<td width="18%">&nbsp;Flat No</td>
			<td width="23%">&nbsp;<font face="Arial" color="#000000" size="3"><form:input path="flatno" size="20"/></font></td>
		</tr>
		<tr>
			<td width="31%">&nbsp;Unique Service ID (Electricity)</td>
			<td width="28%">&nbsp;<font face="Arial" color="#000000" size="3"><form:input path="electricityserviceid" size="20"/></font></td>
			<td width="18%">&nbsp;Water Consumer ID</td>
			<td width="23%">&nbsp;<font face="Arial" color="#000000" size="3"><form:input path="waterid" size="20"/></font></td>
		</tr>
		<tr>
			<td width="31%"><font face="Arial" color="#000000">&nbsp;Property Extent</font></td>
			<td width="28%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:input path="propertyextent" size="20"/></font></td>
			<td width="18%"><font face="Arial" color="#000000">&nbsp;Units ID</font></td>
			<td width="23%"><font face="Arial" color="#000000">&nbsp;</font><font face="Arial" color="#000000" size="3"><form:select size="1"   path="unitsid">
							<form:option value="Sq. Ft">Sq. Ft</form:option>
							<form:option value="Acres">Acres</form:option>
							<form:option value="Hectares">Hectares</form:option>
							<form:option value="Sq Mtrs">Sq Mtrs</form:option>
							<form:option value="Guntas">Guntas</form:option>
							<form:option value="Meters">Meters</form:option>
							<form:option value="Feet">Feet</form:option>
							<form:option value="Kms">Kms</form:option>
							<form:option value="Others">Others</form:option></form:select>
						</font></td>
		</tr>
		</table>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
<p><input type="submit" value="Submit" name="B1">&nbsp;&nbsp;&nbsp;
<input type="submit" value=" Reset " name="B2"></div>
	</div>
           
            
</form:form>
</body>
</html>
