<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>
.box{
border: 1px solid #337ab7;
margin-bottom:15px;
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

<form:form action="/outsourceEntry" commandName="outsource" method="post"  enctype="multipart/form-data">


<div class="container" >
  <div class="panel-group">
    <div class="panel panel-primary">
      <div class="panel-heading">Outsourcing of the project activities
</div>
      <div class="panel-body">

<div class="row">
	
				<div class="col-md-10 col-md-offset-1">
				    <div class="col-md-12">
					<div class="form-group"><br>
						<label class="col-md-8 label-style">Whether the Applicant PIA Process to undertake all the Project Activities on its own</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="applicantPiaProcess">
							    <form:option value="1" label="YES"></form:option>
								<form:option value="2" label="NO"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-8 label-style">Activity to be outsourced</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="activityToBeOutsourced">
							    <form:option value="1" label="TRAINING"></form:option>
								<form:option value="2" label="PLACEMENT"></form:option>
								<form:option value="2" label="BOTH"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Name of the Outsourcing partner</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="nameOfTheOutsourcingPartner"/>
							</div>
						</div>
					</div>
				</div>
				 <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Legal Status</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="legalStatus">
							    <form:option value="1" label="YES"></form:option>
								<form:option value="2" label="NO"></form:option>
						        </form:select>
							</div>
						</div>
					</div><br>
				</div>
				</div>
				<div class="col-md-10 col-md-offset-1 box">
				<div class="row subhead"><h5>10.2 Bank Details</h5></div>
				    <div class="col-md-12">
					<div class="form-group"><br>
						<label class="col-md-8 label-style">Bank Name</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="bankName">
							    <form:option value="1" label="ICICI"></form:option>
								<form:option value="2" label="IDBI"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-8 label-style">State</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="state">
							    <form:option value="1" label="AP"></form:option>
								<form:option value="2" label="TG"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">District</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="district">
							    <form:option value="1" label="Hyd"></form:option>
								<form:option value="2" label="Niz"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
				             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Bank Branch</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="bankBranch">
							    <form:option value="1" label="SR Nager"></form:option>
								<form:option value="2" label="Secundrabad"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
				             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">IFSC Code</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="ifscCode"/>
							</div>
						</div>
					</div>
				</div>
				             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">MICR</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="micr"/>
							</div>
						</div>
					</div>
				</div>
				  <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Name as per bank account</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="nameAsPerBankAccount"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Bank Account number</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="bankAccountNumber"/>
							</div>
						</div>
					</div><br>
				</div>
				</div>
				
				<div class="col-md-10 col-md-offset-1 box">
				<div class="row subhead"><h5>10.3 Financial Details</h5></div>
             <div class="col-md-12">
					<div class="form-group"><br>
						<label class="col-md-8 label-style">Financial Year</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:select path="financialYear">
							    <form:option value="1" label="2016-2017"></form:option>
								<form:option value="2" label="2015-2014"></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
				   <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Turn over</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="turnOver"/>
							</div>
						</div>
					</div>
				</div>
		 <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Net Worth</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="netWorth"/>
							</div>
						</div>
					</div>
				</div>
			 <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">CA Certificate of statutory auditor/annual auditor</label>
						<div class="col-md-3  inputGroupContainer">
							<div class="input-group">
			                <form:input path="" type="file"/>
							</div>
						</div>
						  <div class="col-md-1  inputGroupContainer">
							<div class="input-group">
			                <a href="#"><button>Add</button></a>
							</div>
						</div>
						<br>
					</div>
				</div>
				</div>
				
				<div class="col-md-10 col-md-offset-1 box">
				<div class="row subhead"><h5>10.4 Upload Document</h5></div>
				    <div class="col-md-12">
					<div class="form-group"><br>
						<label class="col-md-8 label-style">MoU as an outsourcing partner</label>
						<div class="col-md-4  inputGroupContainer">
							<div class="input-group">
								<form:input path="mouasoutsourcepartner" type="file"/>
							</div>
						</div>
					</div>
				</div>
                <div class="col-md-12">

					<div class="form-group">
						<label class="col-md-8 label-style">Registration certificate as legal entity</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
				             <form:input path="registrationcertficate" type="file"/>
							</div>
						</div>
					</div>
				</div>
             <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Bank Statement of last month</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
			                <form:input path="bankstatement" type="file"/>
							</div>
						</div>
					</div>
				</div>
				    <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Cheque leaf of given bank details</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
			                 <form:input path="checkleaf" type="file"/>
							</div>
						</div>
					</div>
				</div>
				   <div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Balance Sheet</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
			                 <form:input path="balancesheet" type="file"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<label class="col-md-8 label-style">Employee List for this project</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
			                 <form:input path="employeelist" type="file"/>
							</div>
						</div><br>
					</div>
				</div>
				</div>
				
				<div class="col-md-10 col-md-offset-1 box">
				<div class="row subhead"><h5>10.5 Address Details</h5></div>
				<div class="col-md-12">
				    <div class="col-md-6">
					<div class="form-group"><br>
						<label class="col-md-6 label-style">House No/Building/Apt.No</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:input path="houseAddress"/>
							</div>
						</div>
					 </div></div>
                     <div class="col-md-6">
					 <div class="form-group"><br>
						<label class="col-md-6 label-style">Street/Road/Lane</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
				             <form:input path="street"/>
							</div>
						</div>
					</div>
                    </div>
					</div>
					
					<div class="col-md-12">
					<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-6 label-style">Area/Locality/Sector</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                <form:input path="areaAddress"/>
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Landmark</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                <form:input path="landmark"/>
							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Town/City</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                <form:input path="townCity"/>
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Police Station</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="policeStation"/>
							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">State/UT</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:select path="stateUt">
							    <form:option value="1" label=""></form:option>
								<form:option value="2" label=""></form:option>
						        </form:select>
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Distict</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:select path="districtPartTwo">
							    <form:option value="1" label=""></form:option>
								<form:option value="2" label=""></form:option>
						        </form:select>
							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Block</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:select path="block">
							    <form:option value="1" label=""></form:option>
								<form:option value="2" label=""></form:option>
						        </form:select>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-6 label-style">Gram Panchayat</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:select path="gramPanchayat">
							    <form:option value="1" label=""></form:option>
								<form:option value="2" label=""></form:option>
						        </form:select>
							</div>
						</div>
					</div>
					</div></div>
					<div class="col-md-12">
                      <div class="col-md-6">
					<div class="form-group">
						<label class="col-md-6 label-style">Village</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
								<form:select path="village">
							    <form:option value="1" label=""></form:option>
								<form:option value="2" label=""></form:option>
						        </form:select>
							</div>
						</div>
					</div>
					</div>
                      <div class="col-md-6">
					<div class="form-group">
						<label class="col-md-6 label-style">PIN</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                <form:input path="pin"/>
							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Post Office</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="postOffice"/>
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Email ID</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                <form:input path="emailId"/>
							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Phone</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="phone"/>
							</div>
						</div>
					</div>
					</div>
					<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-6 label-style">Mobile Number</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                 <form:input path="mobileNumber"/>
							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="col-md-12">
					<div class="col-md-6">
						<div class="form-group">
						<label class="col-md-6 label-style">Address Proof</label>
						<div class="col-md-6  inputGroupContainer">
							<div class="input-group">
			                <form:input path="" type="file"/>
							</div>
						</div>
					</div>
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
						</div>
					</div>
				</div>

   


</form:form>

</body>
</html>