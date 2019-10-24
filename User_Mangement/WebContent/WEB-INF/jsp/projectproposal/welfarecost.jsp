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
text-align:center;
color:white;
}

</style>
<body>
<font color=red><center>${message}</center></font>

<form:form action="/welfareEntry" commandName="welfare" method="post" >


<div class="container" >
  

<div class="row">


		
	
				
				<div class="col-md-8 col-md-offset-2 box">
				<div class="row subhead "><h5>Welfare Cost</h5></div>
				    <div class="col-md-12 ">
					<div class="form-group"><br>
						<label class="col-md-6 label-style">Retention Support</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:input path="retentionSupport"/>
							</div>
						</div><br>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-6 label-style">Carrer Progression</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
				             <form:input path="carrerProgression"/>
							</div>
						</div><br>
					</div>
				</div>
             <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-6 label-style">Foreign Placement</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="foreignPlacement"/>
							</div>
						</div><br>
					</div>
				</div>
				</div>
				
				
				<div class="col-md-3 col-md-offset-5">

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
					

   


</form:form>

</body>
</html>