
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Random"%>


<head>
    <title>INC</title>
</head>

<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>

<%
    Random r = new Random();
    Integer val = (Integer) r.nextInt();

    session.setAttribute("rvalue", val);
%>

<link href="<c:url value="/resources/css/bootstrap/bootstrap.min.css" />" rel="stylesheet">
 <script src="<c:url value="/resources/jquery.min.js"/>"></script>
 <script src="<c:url value="/resources/bootstrap.min.js"/>"></script>
 <script src="<c:url value="/resources/js/md5_1.js"/>"></script>



 






<!--<link rel="stylesheet" type="text/css" href="css/software.css" />-->
<body  onpageshow="if(event.persisted) noBack();" onunload=" ">
    <div class="row3">

        <marquee scrollamount="4" direction="left" loop="true">
            <b> <font color="maroon"> 
                </font>
            </b>
        </marquee>
        <div id="container">
            <div class="ONE_T">

                <section class="main_slider">
                    <div class="rslides_container clear">
                        <P align="justify"><b><font size="3">
                                </font></b>
                        <P align="justify">

                    </div>
                </section>
            </div>

            <div class="TWO_T">    
             <center><font size="2" color="red"> <html:errors/>    	</font>	</center> 
            
            <div class="container" style="margin:0 auto;width:500px">
<form action="logintest" method="POST" focus="property(username)" styleClass="formBean" onsubmit="return checkValues()"> 
                               <html:hidden property="mode" value="login"/> 
  <div class="panel panel-primary">
    <div class="panel-heading text-center">Login</div>
    <div class="panel-body">
    <font color=red> ${msg}</font>
    <div class="row ">
      <div class="col-sm-5">
        <label>  User Id(Username)</label>
      </div>
      <div class="col-sm-6">
        <input name="username" type="text" autocomplete="off" autofocus class="form-control" style="width: 100%">
      </div>
  </div> <br>
  <div class="row ">
      <div class="col-sm-5">
          <label>  Password </label>
      </div>
      <div class="col-sm-6">
           <input name="password" type="password" onchange="changePass()" value="" class="form-control" style="width: 100%">
      </div>
  </div> <br>
  <div class="row ">
      <div class="col-sm-5">
          <input type=hidden id= captchaid name=captchaimg> <img src="CaptchaServlet" style="width: 80%"  >
      </div>
      <div class="col-sm-6">
          <input type="text" name="property(captchauser)" autocomplete="off" style="width:100%" class="form-control" /> 
      </div>
  </div> <br>
  <div class="row">
      <div class="col-sm-1 col-sm-offset-5">
         <input class="buttoncss btn  btn-primary " style="width: 80px !important; border-color: #084884" type="submit" value="Login"/></div>
          <div class="col-sm-4 col-sm-offset-2">
         <input class="buttoncss btn btn-danger" style="width: 80px !important; border-color: #084884" type="reset" value="Reset"/>
      </div>
      </div><br>
     

    
      <p>&nbsp;<a href="userInterface">CREATE USER</a></p>

    
    </div>
    
  </div>
  </form>
</div>
            
            

                <section id="set-2" class="section" >
<!--                     <table align="center" border="1" id="table1" style="width: 400px !important"> -->
<%--                         <center><font size="2" color="red"> <html:errors/>    	</font>	</center> --%>
<%--                             <html:form action="/login" method="POST" focus="property(username)" styleClass="formBean" onsubmit="return checkValues()"> --%>
<%--                                 <html:hidden property="mode" value="login"/> --%>
<!--                             <br/><br/> -->

<!--                             <tr> -->
<!--                                 <td colspan="2" align="center" style="background-color: #084884;"> -->
<!--                                     <font color="white">LOGIN</font> -->
<!--                                 </td> -->
<!--                             </tr> -->
<!--                             <tr> -->
<!--                                 <td> -->
<!--                                     Email Id(Username) -->
<!--                                 </td> -->
<!--                                 <td> -->
<!--                                     <input name="property(username)" type="text" autocomplete="off" autofocus> -->
<!--                                 </td> -->
<!--                             </tr> -->
<!--                             <tr> -->
<!--                                 <td> -->
<!--                                     Password -->
<!--                                 </td> -->
<!--                                 <td> -->
<!--                                     <input name="property(password)" type="password" onchange="changePass()" value=""> -->
<!--                                 </td> -->
<!--                             </tr> -->
<!--                             <tr> -->
<!--                                 <td> -->
<!--                                     <input type=hidden id= captchaid name=captchaimg> -->
<!--                                     <img src="CaptchaServlet" style="width: 100px"> -->
<!--                                 </td> -->
<!--                                 <td> -->
<!--                                     <input type="text" name="property(captchauser)" autocomplete="off"  /> -->
<!--                                 </td> -->
<!--                             </tr> -->
<!--                             <tr> -->
<!--                                 <td colspan="2" align="center"> -->
<!--                                     <input class="buttoncss" style="width: 80px !important; border-color: #084884" type="submit" value="Login"/>&nbsp;&nbsp;&nbsp; -->
<!--                                     <input class="buttoncss" style="width: 80px !important; border-color: #084884" type="reset" value="Reset"/> -->

<!--                                     <br/><br/> -->
<%--                                     <p style="width: 500px !important; border-color: #084884"><a href="<%=request.getContextPath()%>/registerpage.nic?mode=register"><img style="width: 300px !important" src="images/newreg.png"/></a> --%>
<%--                                     <p style="width: 500px !important; border-color: #084884"><a href="<%=request.getContextPath()%>/userregisterpage.nic?mode=userregisterpage"><img style="width: 300px !important" src="images/newreg_individual.png"/></a> --%>
<!--                                 </td> -->
<%--                             <center><font size="2" color="red"><logic:notEmpty name="msg">${msg }</logic:notEmpty> 	</font>	</center> --%>

<!--                                 </tr> -->


<!--                                 Change this to a button or input when using this as a form -->




<%--                         </html:form> --%>

<!--                     </table> -->
                </section>


            </div>
        </div>
    </div>

  
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>


</body>


<script type="text/javascript">
    function checkValues()
    {
       
                    
        if(check_alphanumeric_all(document.forms[0].elements["property(password)"],"Password")
            &&check_alphanumeric_all(document.forms[0].elements["property(captchauser)"],"Captcha"))
        {
            
            document.forms[0].submit();
        }
        else
        {
            return false;
        } 
                    
        
    }		
</script>
