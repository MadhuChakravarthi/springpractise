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

<script type="text/javascript">
$(document).ready(function(){
    $(".add-row").click(function(){
    	var rest=$("#tabletest tr").length-1;
    	
    	alert(rest);
        var statecode = $("#statecode option:selected").text();
        var distcode = $("#distcode option:selected").text();
        var target=$("#target").val();
        var markup = "<tr><td><input type='checkbox' name='record'></td><td>" + statecode + "<input type=text name=physicalTargetTrngwiseTargets["+rest+"].statecode value="+$("#statecode").val()+"></input></td><td>" + distcode + "<input type=text name=physicalTargetTrngwiseTargets["+rest+"].distcode value="+$("#distcode").val()+"></input></td><td>" + target + "<input type=text name=physicalTargetTrngwiseTargets["+rest+"].target value="+$("#target").val()+"></input></td></tr>";
       
        //TEST
 
        
         // alert(dynaValue);
        // markup=markup+dynaValue;
        // dynaValue=dynaValue+'<input type=hidden name=trng_targets['+rest+'].statecode value='+statecode+' />;
        // dynaValue=dynaValue+'<input type=hidden name=trng_targets['+rest+'].distcode value='+distcode+' />;
        $("#tabletest tbody").append(markup);
       // $("#tabletest tbody").append(dynaValue);
    });
    
    // Find and remove selected table rows
    $(".delete-row").click(function(){
        $("#tabletest tbody").find('input[name="record"]').each(function(){
        	if($(this).is(":checked")){
                $(this).parents("tr").remove();
            }
        });
    });
});    


</script>
<body>
<font color=red><center>${message}</center></font>

<form:form action="/physicalEntry" commandName="physical" method="post" >
<div class="content-wrapper">
<div class="container" >
  <div class="panel-group">
    <div class="panel panel-primary style="margin-top:50px">
      <div class="panel-heading">Physical Targets
</div>
      <div class="panel-body">

<div class="row">

				
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-6 label-style">Proposed State/UT</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:select path="statecode" id="statecode">
							    <form:option value="1" label="Andhra Pradesh"></form:option>
								<form:option value="2" label="Telangana"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>

				  <%--   <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-6 label-style">Proposed duration of the project(in months)</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="proposeDuration" id="projectduration"/>
							</div>
						</div>
					</div>
				</div>
				             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-6 label-style">Proposed Training target</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="proposeTrngTarget"/>
							</div>
						</div> --%>
					</div><br>
				</div>
				</div>
				
				<div class="col-md-12 box">
				<div class="row subhead"><h5>Proposed Training wise Training Targets</h5></div>
             <div class="col-md-12">

  <div class="table-responsive">  
  
          
  <table class="table">
    <thead>
      <tr>
        <th>State</th>
        <th>District</th>
        <th>Target No. of candidates</th>
        <th></th>
      </tr>
    </thead>
    
    
    

      <tr>
        <td>
        						<select name="statecode" id="statecode">
							    <option value="">Select</option>
							    <option value="1">Andhra Pradesh</option>
							    <option value="2">Telangana</option>
						        </select>
        </td>
        <td>

								<select name="distcode" id="distcode">
							    <option value="">Select</option>
								 <option value="1">Krishna</option>
								  <option value="2">East Godavari</option>
						        </select>

		</td>
        <td><input type="text" value="" id="target" /></td>
        <td><input type="button" class="add-row" value="Add Row"></td>
      </tr>
   
    
  </table>
  
  
  
  </div>
  
 <div class="table-responsive">          
  <table class="table" id="tabletest" border=1>
    <thead style="background:#337ab7; color:white;">
      <tr>
        <th>S.No</th>
        <th>Proposed State</th>
        <th>Proposed District</th>
        <th>Target</th>
       
      </tr>
    </thead>
    <tbody >
      <%-- <tr>
	   <td><form:input path=""/></td>
        <td><form:input path="trng_targets[0].statecode" id="statecode"/></td>
        <td><form:input path="trng_targets[0].distcode" id="distcode"/></td>
        <td><form:input path="trng_targets[0].target" id="target"/></td>
        
      </tr> --%>
	  
    </tbody>
  </table>
  <input type="submit" value="Save">
  
  <button type="button" class="delete-row">Delete Row</button>
  </div>
  
	</div>
</div>
				
  </div>       
				
          </div>
		</div>
	</div>
</div>
</div>
   
</form:form>



</body>
</html>