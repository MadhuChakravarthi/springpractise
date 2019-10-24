<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en"> 
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
    
        <link href="<c:url value="/resources/css/bootstrap/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/metisMenu/metisMenu.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/timeline.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/sb-admin-2.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/morrisjs/morris.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/font-awesome/font-awesome.min.css" />" rel="stylesheet">
        
        


  <script src="<c:url value="/resources/js/jquery/jquery-2.1.3.js"/>"></script>
 <script src="<c:url value="/resources/js/bootstrap/bootstrap.min.js"/>"></script>
 <script src="<c:url value="/resources/js/bootstrap/bootstrap-dialog.min.js"/>"></script>
       
        
        
        
        
 <script src="<c:url value="/resources/js/metisMenu/metisMenu.min.js"/>"></script>
 <script src="<c:url value="/resources/js/raphael/raphael-min.js"/>"></script>
 <script src="<c:url value="/resources/js/raphael/raphael-min.js"/>"></script>

    
        <!-- <script src="../js/morris-data.js"></script> -->
        <style>
            .dataTable thead tr {
                background-color: #d9edf7;
            }
        </style>
    </head>
    <body >
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">

                <tiles:insertAttribute name="header" />

                
                <tiles:insertAttribute name="left" />
                
            </nav>

            <tiles:insertAttribute name="content" />
            <tiles:insertAttribute name="right" />

            <tiles:insertAttribute name="footer" />
        </div>    
    </body>
</html>