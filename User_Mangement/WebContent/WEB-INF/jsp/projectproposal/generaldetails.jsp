  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<body>
<font color=red><center>${message}</center></font>

<form:form action="/generalEntryGeneric" commandName="general" method="post" >

<form:errors path="proposalType">
</form:errors>
<div class="" >
<div class="content-wrapper">
<div class="col-md-8 col-md-offset-2">
  <div class="panel-group">
    <div class="panel panel-primary" style="margin-top:50px;">
      <div class="panel-heading">Project Proposal General Details</div>
      <div class="panel-body">

<div class="row">


<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Proposal Type</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:radiobutton path="proposalType" label="Fresh Application" value="Fresh Application"/>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:radiobutton path="proposalType" label="Application For Addtional Target" value="Application For Addtional Target"/>
							</div>
						</div>
					</div>
				</div>
                	<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">PRN Number</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								TEST
							</div>
						</div>
					</div>
				</div>
				
				
				
				    	<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Name of the Organization</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								NAME
							</div>
						</div>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Applying As</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:select path="applyingAs">
							    <form:option value="Single" label="Single"></form:option>
								<form:option value="Consortium" label="Consortium"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
             <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">PRN of the Consortium Member</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:select path="prnOfConsortiumMember">
							    <form:option value="Single" label="Single"></form:option>
								<form:option value="Consortium" label="Consortium"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
			
	 <form:hidden path="projectProposalId" />		
			<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Consortium Member Name</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								NAME
							</div>
						</div>
					</div>
				</div>
				
				
				 <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Indicate Lead Partner</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:select path="indicateLeadPartner">
							    <form:option value="Single" label="Single"></form:option>
								<form:option value="Consortium" label="Consortium"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
				
				
				<div></div>
				<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style"></label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<input type="submit" value="Save">
							</div>
						</div>
					</div>
				</div>


 </div>       
				
</div>
						</div>
					</div>
				</div>


 </div>      
</div>


<table align="center"  width="75%" class="table-striped table-bordered" style=" border: 1px solid black; padding: 5px">  
<tr><th>Id</th><th>Proposal Type</th><th>Applying As</th><th>PRN of the Consortium Member</th><th>Indicate Lead Partner</th><th>Edit</th></tr>  
   
   <c:if test="${!empty list}">
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.projectProposalId}</td>  
   <td>${emp.proposalType}</td>  
   <td>${emp.applyingAs}</td> 
   <td>${emp.prnOfConsortiumMember}</td> 
   <td>${emp.indicateLeadPartner}</td> 
   <td><a href="editRetrival/${emp.projectProposalId}">Edit</a></td>  
   </tr>  
   </c:forEach>  
   </c:if>
   </table>


</form:form>

</body>
</html>