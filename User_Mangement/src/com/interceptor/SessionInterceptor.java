package com.interceptor;

import java.util.*;



import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.nic.usermanagement.utils.Constants;

public class SessionInterceptor	extends HandlerInterceptorAdapter 
{
    static ArrayList<String> escapeList = new ArrayList<String>();
    
    static {

        //escapeList.add("changePassword.nic");
        escapeList.add("logintest");
        escapeList.add("login");
        escapeList.add("userInterface");
        escapeList.add("retrieveCardServiceDetails");
        escapeList.add("retrieveBhudharDetails");
        escapeList.add("getService");
        escapeList.add("service");

    }

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
        String path = request.getRequestURI();
        HttpSession session = request.getSession();
        int p = path.lastIndexOf("/");
        String action = path.substring(p + 1, path.length() - Constants.URLEXTENTION.length());
        String action1 = path.substring(p + 1);
        if (session != null) {
            if (action != null && escapeList.contains(action1)) {
            	return true;
                //filterChain.doFilter(request, response);
            } else {
                boolean flag = false;
                ArrayList services = (ArrayList) session.getAttribute("services");
                System.out.println("TEST"+services);
                if (session.getAttribute("userinfo") == null) {
                    /*RequestDispatcher rd=((HttpServletRequest)request).getRequestDispatcher("login"+Constants.URLEXTENTION);
                     rd.forward(request,response);*/
                } else if (session.getAttribute("services") == null) {
                    /*RequestDispatcher rd=((HttpServletRequest)request).getRequestDispatcher("login"+Constants.URLEXTENTION);
                     rd.forward(request,response);*/
                } else if (services != null) {
                    for (Iterator<Map<String, Object>> servicemap = services.iterator(); servicemap.hasNext();) {
                        HashMap<String, Object> service = (HashMap<String, Object>) servicemap.next();
                        if (action1.equals(service.get("path"))) {
                            flag = true;
                            break;
                        }
                        if ((service.get("path") + "").indexOf(action1) >= 0) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag) {
                    return true;
                } else {
                    //"login"+Constants.URLEXTENTION
                    request.setAttribute("msg", "Invalid Access or Session Expired");
                    System.out.println("11111TTTTTTTTTTTTTTTT11111");
                    new ModelAndView("logout");
                   // RequestDispatcher rd = request.getRequestDispatcher(Constants.INITMODULE + Constants.URLEXTENTION + "?mode=unspecified");
                  //  rd.forward(request, response);
                }
            }
        } else {
            request.setAttribute("msg", "Invalid Access or Session Expired");
            System.out.println("00000000");
           // RequestDispatcher rd =  request.getRequestDispatcher("login.nic?mode=unspecified");
           // rd.forward((request), (response));
        }
		return false;
		

	}
}
