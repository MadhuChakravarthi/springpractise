<%

System.out.println("===================================================");
 if (session.getAttribute("USER") != null)
     session.removeAttribute("USER");
     
 
 session.invalidate();



%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0038)# -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>e-Cabinet</title>
<style type="text/css">
<!--
body {
	background-color: #CCCCCC;
	background-image: url(images/bg4.jpg);
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.style1 {
	color: #FFFFFF;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 12px;
	font-weight: bold;
}
.style2 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; color: #FFFFFF;}
a:link {
	color: #000033;
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
.style5 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 12px;
}
.style29 {color: #66CC00}
-->
</style></head>
 <body>
        <div id="wrapper" > 


            <section id="set-2" class="section" >
              
                    <table border="1" id="table1" width="800">
                      <tr class="trcolor">
                          <td colspan="4" align="center"><font color="#FFFFFF"><b>Invalid Session web<br>
                             <a href="./loginpage.do?mode=loginpage">Click here to login</a>
                                      </br></b></font></td>
                        </tr>
                   </table>
 
            </section>


        </div>
    </body>


</html>