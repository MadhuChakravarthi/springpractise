package com.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ClickjackInterceptor extends HandlerInterceptorAdapter 
{
    private String mode = "DENY";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		System.out.println("In ClickjackInterceptor preHandle()");
		
		String configMode=request.getParameter("mode");
        if(configMode!=null)
        {
        	mode=configMode;
        }
		
		response.addHeader("X-FRAME-OPTIONS", mode);
        response.addHeader("X-Content-Type-Options", "nosniff");
        response.addHeader("X-FRAME-OPTIONS", "SAMEORIGIN");
        response.addHeader("Server", "INC");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
       
        
        	return true;
	}
}
