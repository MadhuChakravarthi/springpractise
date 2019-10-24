<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<link rel="stylesheet" type="text/css" href="css/software.css" />
<body  onload="pre('yes')">
    <div id="wrapper" > 
        <section id="set-2" class="section" >
            <table border="1" id="table1" >

	<form:form  action="/saveStudent"  method="POST" commandName="student" enctype="multipart/form-data">
                   <font color="red" size="2"><form:errors /></font>
                        <table border="1" width="60%" style="border-collapse: collapse; font-family:Verdana; font-size:10px" bordercolor="#E0E0E0">
                            <tr>
                                <td colspan="4" bgcolor="#E0E0E0">
                                    <p align="center"><font color="#000080" size="5"><b>REGISTRATION FORM </b></font></p>
                                </td>
                            </tr>
                            <tr>
                                <td><font face="Verdana" size="2">Hall Ticket No</font><span><font color="red">*</span></td>
                                <td><form:input size="15"  path="htno" styleId="htno" maxlength="15" />
                                    
                                </td>
                                <td><font face="Verdana" size="2">Year of Passing</font><span><font color="red">*</span></td>
                                <td><form:input   path="year"  maxlength="4" /></td>
                            </tr>
                            <tr>
                                <td><font face="Verdana" size="2">Name</font><span><font color="red">*</span></td>
                                <td><form:input   path="name"  maxlength="100" /></td>
                                <td><font face="Verdana" size="2">Tenth Board</font><span><font color="red">*</span></td>
                                <td><form:input   path="board" maxlength="10"  /></td>
                            </tr>
                            <tr>
                                <td><font face="Verdana" size="2">Father Name</font><span><font color="red">*</span></td>
                                <td><form:input   path="fname"  maxlength="100" />
                                    <font color="red" size="2">
                                    <div align="center" id="fname_error"></div>
                                </td>
                                <td><font face="Verdana" size="2">Sex</font><span><font color="red">*</span></td>
                                <td><form:select size="1" path="sex"  styleId="sex" >
                                        <form:option value=""><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="F">FEMALE</form:option>
                                        <form:option value="M">MALE</form:option>
                                            </font>
                                    </form:select></td>
                            </tr>
                            <%-- <tr>
                                <td><font face="Verdana" size="2">Date of Birth</font><span><font color="red">*</span></td>
                                <td colspan="3"><form:input path="dob" styleId="dob"  maxlength="10"/></td>
                           </tr> --%>
                            <tr>
                                <td  colspan="2"><font face="Verdana" size="2">Native state</font><span><font color="red">*</span></td>
                                <td colspan="2"> <font face="Verdana">
                                    <form:select  styleId="nstate"  path="nstate" style="text-transform: uppercase; font-size: 8pt; font-family: Verdana" >
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="27">ANDAMAN AND NICOBAR ISLAND</form:option>
                                        <form:option value="02">ANDHRA PRADESH</form:option>
                                        
                                            </font>
                                    </form:select>
                                    <font color=#CC0033 size="2"> <div align="left" id="nativestate_error"></div>
                                        </font>
                                    </td>
                                </tr>
                                <tr>
                                    <td  colspan="2"><font face="Verdana" size="2">Native district</font><span><font color="red">*</span> </td>
                                    <td colspan="2"><font face="Verdana">
                                    <form:select  styleId="nativedistrict" path="ndistrict"  style="text-transform: uppercase; font-size: 8pt; font-family: Verdana" >
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="01">West Godavari</form:option>
                                        <form:option value="02">East Godavari</form:option>
  									</font>
                                    </form:select>
  
                                </td>
                            </tr>
                            <tr>
                               <td colspan="4" bgcolor="#E0E0E0" align="center" ><font face="Verdana" size="2" >Communication Details </font></td>
                            </tr>
                            <tr>
                                <td colspan="2" align="left" bordercolor="#E0E0E0">
                                    <font face="Verdana" size="2">PRESENT ADDRESS</font></b></td>
                                <td colspan="2" align="left" bordercolor="#E0E0E0">
                                    <font face="Verdana" size="2">PERMANENT ADDRESS</font></td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <font face="Verdana" size="2">
                                    Is the Present Address Same as Permanent Address
                                    </font><span><font color="red">*</span>
                                </td>
                                <td colspan="2">
                                    <font face="Verdana" size="2">
                                    <form:select  path="present">
                                        <form:option value="yes">YES</form:option>
                                        <form:option value="no">NO</form:option>
                                    </form:select>
                                    </font>
                                </td>
                            </tr>
                            <tr>
                                <td ><font face="Verdana" size="2">State</font><span><font color="red">*</span></td>
                                <td><font face="Verdana">
                                    <form:select   path="state" styleId="state"  style="text-transform: uppercase; font-size: 8pt; font-family: Verdana" >
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="27">ANDAMAN AND NICOBAR ISLAND</form:option>
                                        
                                            </font>
                                    </form:select>
                                    <font color=#CC0033 size="2"> <div align="left" id="state_error"></div>
                                </td>
                                <td>
                                    <font face="Verdana" size="2">State</font></td>
                                <td><font face="Verdana">
                                    <form:select path="stateap" style="text-transform: uppercase; font-size: 8pt; font-family: Verdana" >
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="27">ANDAMAN AND NICOBAR ISLAND</form:option>
                                        <form:option value="02">ANDHRA PRADESH</form:option>
                                     
                                            </font>
                                    </form:select>
                                    <font color=#CC0033 size="2">

                            </tr>
                            <tr>
                                <td >
                                    <font face="Verdana" size="2">District</font><span><font color="red">*</span></td>
                                <td><font face="Verdana">
                                    <form:select  styleId="nativedistrict" path="ndistrict"  style="text-transform: uppercase; font-size: 8pt; font-family: Verdana" >
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="27">West Godavari</form:option>
                                        <form:option value="02">East Godavari</form:option>
  									</font>
                                    </form:select>
  
                                    
                                    <font color=#CC0033 size="2"> <div align="left" id="district_error"></div>
                                    <td><font face="Verdana"><form:select size="1"   path="district" style="text-transform: uppercase; font-size: 8pt; font-family: Verdana">
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                  		<form:option value="01">West Godavari</form:option>
                                        <form:option value="02">East Godavari</form:option>
                                            </font>
                                    </form:select>
                                    <font color=#CC0033 size="2">
                            </tr>
 							<tr><td><font face="Verdana" size="2">District</font></td>
                                <td><font face="Verdana"><form:select size="1"   path="districtp" style="text-transform: uppercase; font-size: 8pt; font-family: Verdana">
                                        <form:option value="0"><font size="2">---select---</font></form:option><font size="2">
                                  		<form:option value="01">West Godavari</form:option>
                                        <form:option value="02">East Godavari</form:option>
                                            </font>
                                    </form:select>
                                    <font color=#CC0033 size="2">
                            </tr>
                            <tr>
                                <td><font face="Verdana" size="2">Address</font><span><font color="red">*</span></td>
                                <td><form:input   path="address" size="20" maxlength="100"/>
                                    <font color=#CC0033 size="2"><div align="left" id="address_error"></div>
                                <td><font face="Verdana" size="2">Address</font></td>
                                <td><form:input   path="addressp" size="20" maxlength="100"/>
                                    <font color=#CC0033 size="2">
                                </td>
                            </tr>
                            <tr><td >
                                    <font face="Verdana" size="2">Pincode</font><span><font color="red">*</span></td>
                                <td ><form:input  path="pincode" size="20" maxlength="6"/> <font color=#CC0033 size="2">
                                <td >
                                    <font face="Verdana" size="2">Pincode</font></td>
                                <td>
                                    <form:input   path="pincodep" size="20" maxlength="6"/> <font color=#CC0033 size="2">
                            </tr>
                            <tr>
                               <td colspan="4" bgcolor="#E0E0E0" align="center" ><font face="Verdana" size="2" >Other Details </font></td>
                            </tr>
                            <tr>
                                <td><font face="Verdana" size="2">Aadhar</font><span><font color="red">*</span></td>
                                <td><form:input   path="aadhar"  maxlength="11" /></td>
                                <td><font face="Verdana" size="2">Mobile</font><span><font color="red">*</span></td>
                                <td><form:input   path="mobile"  maxlength="11" /></td>
                            </tr>
                            <tr>
                                <td><font face="Verdana" size="2">Town in which you would like to appear for examination </font><span><font color="red">*</span></td>
                                <td><form:select size="1" path="towncenter"   >
                                        <form:option value=""><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="town1">town1</form:option> </font>
                                    </form:select></td>
                                <td><font face="Verdana" size="2">Local/Region</font></td>
                                <td><form:select size="1" path="region"  >
                                        <form:option value=""><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="hindu">hindu</form:option>
                                        <form:option value="muslim">muslim</form:option>
                                            </font>
                                    </form:select></td>
                            </tr>
                            <%-- <tr>
                                <td ><font face="Verdana" size="2">Social status</font><span><font color="red">*</span></td>
                                <td colspan="3"><form:select size="1" path="socialstatus"  styleId="socialstatus">
                                        <form:option value=""><font size="2">---select---</font></form:option><font size="2">
                                        <form:option value="OC">OC</form:option>
                                        <form:option value="BCA">BCA</form:option>
                                        <form:option value="BCB">BCB</form:option>
                                        <form:option value="BCC">BCC</form:option>
                                        <form:option value="BCD">BCD</form:option>
                                        <form:option value="BCE">BCE</form:option>
                                        <form:option value="SC">SC</form:option>
                                        <form:option value="ST">ST</form:option>
                                        <form:option value="others">Others</form:option>
                                            </font>
                                    </form:select>  
                                    <form:input path="socothers" styleId="socothers" maxlength="20"/>
                                </td>
                            </tr> --%>
                            <%-- <tr>
                                <td><font face="Verdana" size="2">Minority Community </font><span><font color="red">*</span></td>
                                <td><form:select size="1" path="minority"   >
                                        <form:option value="nothing">---select---</form:option>
                                        <form:option value="SIKH">SIKH</form:option> 
                                        <form:option value="ANG">ANG</form:option>
                                        <form:option value="OTH">OTH</form:option>
                                        <form:option value="BUD">BUD</form:option>
                                        <form:option value="NA">NA</form:option>
                                        <form:option value="CHR">CHR</form:option>
                                        <form:option value="MUS">MUS</form:option>
                                    </form:select></td>
                                <td><font face="Verdana" size="2">Willingness to have assistance in Urdu</font><span><font color="red">*</span></td>
                                <td><form:select size="1" path="urduasst"  >
                                        <font size="2">
                                        <form:option value="nothing">---select---</form:option>
                                        <form:option value="N">No</form:option>
                                        <form:option value="Y">Yes</form:option>
                                            </font>
                                    </form:select></td>
                            </tr>
                             --%><tr>
                                <td><font face="Verdana" size="2">Special Category </font><span><font color="red">*</span></td>
                                <td colspan="3">
                                    <font face="Verdana" size="2">Physically Handicape:</font><span><font color="red">*</font></span>&nbsp;
                                    <form:select size="1" path="handicap">
                                        <font size="2">
                                        <form:option value="">---select---</form:option>
                                        <form:option value="N">No</form:option>
                                        <form:option value="Y">Yes</form:option>
                                    </form:select>
                                    <font face="Verdana" size="2">NCC:</font><span><font color="red">*</font></span>&nbsp;
                                    <form:select size="1" path="ncc">
                                        <font size="2">
                                        <form:option value="">---select---</form:option>
                                        <form:option value="N">No</form:option>
                                        <form:option value="Y">Yes</form:option>
                                    </form:select><br><br>
                                    <font face="Verdana" size="2">Sports & Games:</font><span><font color="red">*</font></span>&nbsp;
                                    <form:select size="1" path="sports">
                                        <font size="2">
                                        <form:option value="">---select---</form:option>
                                        <form:option value="N">No</form:option>
                                        <form:option value="Y">Yes</form:option>
                                    </form:select>
                                    <font face="Verdana" size="2">CAP:</font><span><font color="red">*</font></span>&nbsp;
                                    <form:select size="1" path="cap">
                                        <font size="2">
                                        <form:option value="">---select---</form:option>
                                        <form:option value="N">No</form:option>
                                        <form:option value="Y">Yes</form:option></font>
                                    </form:select>
                                </td>
                            </tr>
                            <tr><td colspan="4" align="center"><font size="2">Would you like to Upload Photo & Signature </font><span><font color="red">*</font></span><font face="Verdana" size="2">
                                    <form:select path="upstatus">
                                        <form:option value="">---select---</form:option>
                                        <form:option value="N">No</form:option>
                                        <form:option value="Y">Yes</form:option>
                                    </form:select>
                                    </font></td></tr>
                            <tr>
                                
                                
                                
                                <td>Photo uplode<font color="#FF0000">*</font>:</td>
                            <td><form:input path="photo" type="file" maxlength="32" value="" style="width:170px"/>
                            <a href="saveStudent.do?photoname=${student.photoname }">${student.photoname}</a>
                            <b>(Only JPEG,JPG,BMP,PNG  of up to 50 KB SIZE ) </b></td>
                                
<%--                                 
                                <td ><font size="2">Photo Upload</font></td>
                                <td><form:input path="photo" styleId="photo" disabled="true" />
                                    <img id="img_photo" src="" alt="your photo" /><b>
                                        (Only JPEG,JPG,BMP,PNG  of up to 50 KB SIZE ) </b><form:button>Upload</form:button></td>
 --%> 
 
 							       <td>signature uplode<font color="#FF0000">*</font>:</td>
                            <td><form:input path="file" type="file" maxlength="32" value="" style="width:170px"/>
                            <a href="saveStudent.do?filename=${student.filename }">${student.filename}</a>
                            <b>(Only JPEG,JPG,BMP,PNG  of up to 50 KB SIZE ) </b></td>
                         
 
 
<%--                                 <td ><font size="2">Signature Upload</font></td>
                                <td><form:input  path="signature" styleId="signature" disabled="true"/>
                                    <img id="img_signature" src="" alt="your signature" /><b>
                                        (Only JPEG,JPG,BMP,PNG  of up to 50 KB SIZE ) </b><form:button>Upload</form:button></td>
 --%>                            </tr>
                            <tr>
                                <td colspan="4"><font face="Verdana" size="2">Application Fee can be paid through HLC/ ApOnline or Online using Internet Banking/ Debit/ Credit Cards after uploading Photo & Signature. </font></td>
                            </tr>
                            <tr>
                                <td colspan="4"><font face="Verdana" size="2">Note: Assistance in Urdu will be available in MASAB TANK, HYDERABAD only. </font></td>
                            </tr>
                            <tr>
                                <td colspan="4" bgcolor="#E0E0E0" align="center" ><font face="Verdana" size="2" >Declaration </font></td>
                            </tr>
                            <tr>
                                <td colspan="4" ><input type="checkbox" name="declaration" value="1"/>&nbsp;<font face="Verdana" size="2" style="align:center">
                                    I declare that I fulfill the eligibility criteria laid down for
                                    appearing at POLYCET - 2016 and I shall submit all the original
                                    documents in proof at the time of admission into polytechnic for the
                                    academic year 2016 - 2017 . I also certify that I am not suffering
                                    from any of the following defects. (a) MENTALLY RETARDED (b) BLINDNESS
                                    (c) DEAF & DUMB (d) CHRONIC HEART, LUNG, KIDNEY, LIVER DISEASES (e)
                                    MUSCULAR DYSTROPHY.
                                    The information furnished above is true to the best of my knowledge
                                    and belief. In case any false information is furnished by me, I shall
                                    be made ineligible for addmission and I will have no right or claim.
                                    </font></td>
                            </tr>
                            <tr><td colspan="2"><center> <font face="Verdana" size="3" ><form:button  value="SUBMIT" /> </font></center></td></tr>


</table>
</form:form>
</table>
</section>
</div>

</body>

