package com.interceptor;

import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SQLInterceptor extends HandlerInterceptorAdapter 
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		
    System.out.println("************************* In SQLInterceptor preHandle()**************************");
   	//RequestDispatcher rd = request.getRequestDispatcher("login");
    	
    	
    	boolean chk=true;
    	String name=null,value=null;
    	
    	
    	String qry = request.getQueryString();
    	//System.out.println("URL query string : "+qry);
    	
    	    	
    	// ATTACK PATTERNS
    	
    	String[] AttackPattern={"1'","1' "," 1'","1' OR","1' OR '1'=1","1'%20","1 '%20","'%20","'%20OR","' OR","'%20OR%20'1","'%20'1","1 '%20OR%20'1'%3d'1","'%20OR%20'1'%3d'1"," '%20",
    							" CREATE"," ALTER"," DROP"," RENAME"," SELECT"," INSERT"," INSERT INTO"," UPDATE1"," DELETE"," DELETE FROM"," REVOKE"," @@VERSION",
    							" EXEC"," UNION"," WAITFOR"," GROUP BY"," ORDER BY"," SHUTDOWN"," RESTART"};
    	
    	// Delete from the above list "AND", " OR",   " GRANT"  "'"," '", ";"," CHAR"," INT"
    	
		int i=0,fnd;
		for(i=0;i<AttackPattern.length;i++)
		{
			if(qry!=null)
			{				
				fnd=(qry.toLowerCase()).indexOf(AttackPattern [i].toLowerCase());				
				if (fnd!=-1) 
				{
					chk=false; //Attack Pattern Present		
					//System.out.println("Attack Pattern Present (SQL Injection @ Qry String): Patter Value="+AttackPattern [i]+"\n Qry String="+qry);					
					//System.out.println("RequestURL : "+req1.getRequestURL());
					break; 
				}				
				
			}
			
		} // AttackPattern.length for loop (i for loop)	
			
		
		if (chk==true) 
		{
			// Get the values of all request parameters		
			Enumeration enumm = request.getParameterNames();
			for (; enumm.hasMoreElements(); ) 
			{
				
	            // Get the name of the request parameter
	            name = (String)enumm.nextElement();
	            // Get the value of the request parameter
	            value = request.getParameter(name);
	            //System.out.println("value="+value);
	            
	            String arr[]=value.split(" ");
	            
	            for(i=0;i<AttackPattern.length;i++) {
		            for(int j=0;j<arr.length;j++) {
		            //if(value!=null)
		            	
			            if(arr[j]!=null && !arr[j].equals("") && !arr[j].equals(" ")) {			
			            	//fnd=(value.toString().toLowerCase().trim()).indexOf(AttackPattern [i].toLowerCase().trim());		            	
							//if (fnd!=-1)
			            	
			            	//System.out.println("Param value="+arr[j]);
			            	
			            	if(arr[j].equalsIgnoreCase(AttackPattern [i].toLowerCase().trim())) {
								chk=false; //Attack Pattern Present		
								//System.out.println("Attack Pattern Present (SQL Injection @ request parameter): Param name="+name+", Param value="+arr[j]+", Pattern value="+AttackPattern[i]+", Index="+i);								
								//System.out.println("RequestURL : "+req1.getRequestURL());
								break; 
							}
						}
		            }
		            if (chk==false) {
		    			break;	    		
		    		}
	    		}
	            if (chk==false) {
	    			break;	    		
	    		}
	            
	            
			} // for loop enumm
		} // if chk = true	
			
		if (chk==true) 
		{	
			
			//new ModelAndView("logout");
			return true;			
		}
		else  
		{			
			 System.out.println("Failed the REquest ");
			 new ModelAndView("logout");
			 return false;
			 
				//rd.forward(request, response);	 //Redirect to session expire page	
			  //new ModelAndView("logout");
	                        
	            //            System.out.println("FAiled the REquest1 ");
		}
		
		//return false;
	}
	
	
}
