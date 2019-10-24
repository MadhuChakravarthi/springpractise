  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="<c:url value="/resources/js/md5_1.js"/>"></script>
<script language="javascript">
    function changePass()
    {
    	
        var pass=document.getElementById("password").value;
        var pass1=GM(GM(pass));
        pass1=GM(GM(pass1));
        alert(pass1);
        //alert(pass1+"--------");
       document.getElementById("password").value=pass1;
    }
    
</script>
<html>

<body>
<font color=red><center>${message}</center></font>

<form:form action="/userEntry" commandName="user" method="post" >

<form:errors path="username">
</form:errors>
<div class="container" >
<div class="col-md-12">
  <div class="panel-group">
    <div class="panel panel-primary">
      <div class="panel-heading">User Registration</div>
      <div class="panel-body">

<div class="row">


<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">User Name</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:input path="username"/>
							</div>
						</div>
					</div>
				</div>
                	<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Password</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:password path="password"  onchange="changePass()"/>
							</div>
						</div>
					</div>
				</div>
				
				
				
				    	<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">E mail</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:input path="email"/>
							</div>
						</div>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Mobile No</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:input path="mobileno"/>
							</div>
						</div>
					</div>
				</div>
             <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">Role_Id</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:input path="roleid"/>
							</div>
						</div>
					</div>
				</div>
			
			
			<div class="col-md-12">

					<div class="form-group">
						<label class="col-md-4 label-style">List of Roles</label>
						<div class="col-md-7  inputGroupContainer">
							<div class="input-group">
								<form:select path="roleid" 
					multiple="true" >
					
					
					<option >Select a type</option>
       <c:forEach items="${rolesList}" var="role">
        <option value="${role.role_id}">${role.role_name}</option>
       </c:forEach>
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


 </div>       </div>


</form:form>

</body>
</html>