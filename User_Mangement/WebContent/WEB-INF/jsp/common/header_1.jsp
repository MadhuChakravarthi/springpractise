 
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>

<Script type="text/javascript">
    if(window.history.length>0)
    {
        window.history.forward(1);
    }
</Script>


<link href="./styles/main.css" rel="stylesheet" type="text/css" media="all">
<link href="./styles/mediaqueries.css" rel="stylesheet" type="text/css" media="all">
<!-- Scripts -->
<script src="./scripts/jquery-latest.min.js"></script>
<script src="./scripts/jquery-ui.min.js"></script>

<script>window.jQuery || document.write('<script src="./scripts/jquery-latest.min.js"><\/script>\
<script src="./scripts/jquery-ui.min.js"><\/script>')</script>

<script>jQuery(document).ready(function($){ $('img').removeAttr('width height'); });</script>


<script src="./scripts/jquery-mobilemenu.min.js"></script>
<script src="./scripts/custom.js"></script>

<style>
    .box-hover {
        background-color: rgba(0, 0, 0, 0.6);
        position: absolute;
        width: 40px;
        height: 60px;
        margin: 5px 5px 0 5px;
        opacity: 0;
        color:transparent;
        -webkit-transition:  0.4s;
        transition:  0.4s;
        line-height:185px;
        text-align:center;
    }
    .box-hover:hover {
        color:white;
        opacity:1;
    }

</style>

<div class="">
     <header id="header" class="full_width clear"></header>

        <div id="">
            <table >
                <tr>
                    <td>
                        <img src="resources/images/header4.png" style="width:1346px;height: 140px; align: center"></td>
                  
                </tr>
                
               
            </table>
        </div>
</div>               

<div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
    </button>
    <!--<a  href="login.do?mode=logout"><b><img src='images/naco1small.png'></img></b></a>-->
</div>
<!-- /.navbar-header -->



<ul class="nav navbar-top-links navbar-right">




    <li style="color:black;">USER NAME:<font color="green" size="10px"><b>${userinfo.FULL_NAME}</b></font></li>
    
    <li style="color:#000;"><span id="date_time"></span><span id="timeout_div"></span>
                        <script type="text/javascript">//window.onload = date_time('date_time');</script></li>

    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
        </a>
        <ul class="dropdown-menu dropdown-user">


            <li><a href="changePassword.nic"><i class="fa fa-key fa-fw"></i>Change Password</a>
            </li>

            <li class="divider"></li>
            <li><a href="logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
            </li>
        </ul>
        
         
        <!-- /.dropdown-user -->
    </li>
    <!-- /.dropdown -->
</ul>
<!-- /.navbar-top-links -->
<script type="text/javascript" src="js/timeout-dialog.js"></script>
<script>
function resetLogoutTimer()
{
   $.timeoutDialog({timeout: 1, countdown: 60*25, logout_redirect_url: 'login.nic', restart_on_yes: false});
   $("html,body").scrollTop(0);
}
resetLogoutTimer();
</script>