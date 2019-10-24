<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
    response.setDateHeader("Expires", 0);
    response.setHeader("Cache-Control", "no-cache");
    System.out.println("===============");
    System.out.println("::"+request.getContextPath());
    if (session.getAttribute("USER") == null) {
System.out.println("::"+request.getContextPath());

response.sendRedirect("sesfailed.jsp");
%>

<jsp:forward page="sesfailed.jsp"/>  
<%            
    }
%>