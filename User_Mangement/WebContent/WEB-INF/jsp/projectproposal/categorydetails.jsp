<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>
.box{
border: 1px solid #ADD8E6;
}
.subhead{
height:35px;
background-color:#337ab7;
}
.subhead{
text-align:center;
color:white;
}

</style>
<body>
<font color=red><center></center></font>

<form:form action="/categoryEntryTest" commandName="category" method="post" >

<center><font color=red>${message}</font></center>
<div class="" >
<div class="content-wrapper">
<div class="col-md-8  col-md-offset-2">
  <div class="panel-group">
    <div class="panel panel-primary" style="margin-top:50px;">
      <div class="panel-heading">Project Proposal General Details</div>
      <div class="panel-body">

<div class="row">


<div class="col-md-12">
					<div class="form-group">
						<label class="col-md-6 label-style">
                                       Category of the application organization</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">

							
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
						<label class="col-md-6 label-style">Category of consortium partner organization</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
	
	
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
						<label class="col-md-6 label-style">Eligible category for the project</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">

							
							</div>
						</div>
					</div><br>			
				</div></div>
				
				<div class="col-md-12">
                	<div class="col-md-12">
					
					<div class="form-group"><br>
						<div class="col-md-2 label-style"> 1 &nbsp;  &nbsp; &nbsp; <form:radiobutton path="categoryType" value="1"/></div>
	
						<div class="col-md-10  inputGroupContainer">
							<div class="input-group">
							    A project in which PIA commits to provide 500 or more overseas jobs anually at aminimum salary of USD500 or more per month or minimum wages as applicable in that country, which ever is higher
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
						<div class="col-md-2 label-style"> 2 &nbsp; &nbsp; &nbsp; <form:radiobutton path="categoryType" value="2"/></div>
						<div class="col-md-10  inputGroupContainer">
							<div class="input-group">
							    A project by a captive employer providing placements in 500 or more jobs to candidates anually in own or subcidiary agencies/companies
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="form-group">
						<div class="col-md-2 label-style"> 3 &nbsp; &nbsp; &nbsp; <form:radiobutton path="categoryType" value="3"/></div>
						<div class="col-md-10  inputGroupContainer">
							<div class="input-group">
							    A project for industrial internship for a minimum of 500 or more candidates for a period of 12 months with subsequent placement for atleast 70% of such interns.
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="form-group">
						<div class="col-md-2 label-style"> 4 &nbsp; &nbsp; &nbsp; <form:radiobutton path="categoryType" value="4"/></div>
						<div class="col-md-10  inputGroupContainer">
							<div class="input-group">
							    A Period for a minimum of 100 or more candidates which provides a long term course of more than 12 months duration, where government funda the cost for 12months and the PIA bears the remining cost of the course
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="form-group">
						<div class="col-md-2 label-style"> 5 &nbsp; &nbsp; &nbsp; <form:radiobutton path="categoryType" value="5"/></div>
						<div class="col-md-10  inputGroupContainer">
							<div class="input-group">
							    A project which provides assured foreign placements for 200 or more candidates anually ata minimum salary of USD500 or more per month or minimum wages as applicable in that country which ever is higher
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="form-group">
						<div class="col-md-2 label-style"> 6 &nbsp; &nbsp; &nbsp; <form:radiobutton path="categoryType" value="6"/></div>
						<div class="col-md-10 inputGroupContainer">
							<div class="input-group">
							    	Project by a captive employer providing placements in 200 or more jobs to candidates anually in own or subsidiary agencies/companies
							</div>
						</div>
					</div><br>
					</div>
					<div class="col-md-12">
					<div class="form-group">
						<div class="col-md-2 label-style"> 7 &nbsp;  &nbsp; &nbsp; <form:radiobutton path="categoryType" value="7"/></div>
						<div class="col-md-10 inputGroupContainer">
							<div class="input-group">
							    Any Other Project
							</div>
						</div>
					</div><br>
					</div>
				</div>	
				
				<div class="col-md-12 box">
				<div class="row subhead"><h5>Funding Eligibility Details</h5></div>
				    <div class="col-md-12">
					<div class="form-group"><br>
						<label class="col-md-9 label-style">Total Average anual turnover for the application organization or lead partner for the consortium as per last submitted organization profile (in Rs)</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
							 <form:input path="fundingEligibilityDetailsF1"/>
							</div>
						</div>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-9 label-style">Total Cost that can be approved for the application organization or lead partner for the consortium as per its annual Turnover (in Rs)</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
				                <form:input path="fundingEligibilityDetailsF2"/>
							</div>
						</div>
					</div>
				</div>
             <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-9 label-style">
                       Total cost of on-going DDU-GYK (including roshni) projects already approved by MoRDor SRLM for the application organization or lead partner for the consortium (in Rs.)</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
			              <form:input path="fundingEligibilityDetailsF3"/>
							</div>
						</div>
					</div>
				</div>
			
			 <form:hidden path="ppCategoryId" />		
			<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-9 label-style">Balance costs that can be approved for the application organization or lead partner for the consortium (in Rs.)</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
								 <form:input path="fundingEligibilityDetailsF4"/>
							</div>
						</div>
					</div><br>
				</div>
				
				
				 <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-9 label-style">Eligible project cost as per category of applicant PIA/Consortium (in Rs.)</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
		                         <form:input path="fundingEligibilityDetailsF5"/>
							</div>
						</div>
					</div><br>
				</div>
	   <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-9 label-style">Maximum Project cost that can be applied based on average annual turnover of the applicant organization/lead partner for consoritum and category of applicant organization /consortium(in Rs.)</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
                                 <form:input path="fundingEligibilityDetailsF6"/>
							</div>
						</div>
					</div></br></br>
				</div>
				</div>
				<div class="col-md-12">

					<div class="form-group"><br>
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

<table align="center"  width="75%" class="table-striped table-bordered" style=" border: 1px solid black; padding: 5px">  
<tr><th>Id</th><th>Category Type</th><th>Edit</th></tr>  
   
   <c:if test="${!empty list}">
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.ppCategoryId}</td>  
   <td>${emp.fundingEligibilityDetailsF1}</td>
     
  <td><a href="editCategoryRetrival/${emp.ppCategoryId}">Edit</a></td>    
   </tr>  
   </c:forEach>  
   </c:if>
   </table>

</form:form>

</body>
</html>