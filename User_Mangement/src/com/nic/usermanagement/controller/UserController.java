package com.nic.usermanagement.controller;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.nic.usermanagement.model.Roles;
import com.nic.usermanagement.model.Users;
import com.nic.usermanagement.service.UserService;
@Controller
public class UserController {
	
	@RequestMapping("/login")
	public ModelAndView login() 
	{
			return new ModelAndView("login1");	
	}
	
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session,HttpServletRequest request) 
	{
		session.invalidate();	
		request.setAttribute("msg", "Successfully Logout");  
		return new ModelAndView("login1");	
	}
	
	
	@RequestMapping("/userInterface")
	public String userInterface(Model model)
	{
        Users user=new Users();
	    model.addAttribute("user",user);
	    List<Roles> rolesMap= userService.getRoles();
//	    for(Roles role:rolesMap)
//	    {
//	      System.out.println(role.getRole_name()+"---"+role.getRole_id());	
//	    }
	    
	    
	    
	    model.addAttribute("rolesList", rolesMap);
	    return "userEntry";
	}
	
	
	
	@RequestMapping(value="/userEntry",method=RequestMethod.POST)
	public String userInsertion(@Valid @ModelAttribute("user") Users user,BindingResult result,Model model)
	{
	     if(result.hasErrors())
		{
			 model.addAttribute("user",user);
			   // List<Roles> role=userService.getRoles();
			   //  Map<Integer,String> rolesMap = new HashMap<Integer,String>();
			   //  rolesMap.put("roleList", role);
			   // for (Object[] i : role) rolesMap.put((Integer)i[0],(String)i[1]);
		       // model.addAttribute("rolesList", rolesMap);
			return "userEntry";
		}
		
		else  {
	    userService.userCreation(user);
		model.addAttribute("message","Successfully User Created");	
	    model.addAttribute("user",user);
		return "userEntry";}

	}
	
	
	
	
	
	@RequestMapping("/logintest")
		public ModelAndView loginAuthentication(@RequestParam Map<String,String> requestMap,HttpServletRequest request) 
	{
		
		HttpSession session=request.getSession(true);
		
		boolean result=false;
		String pageResult="";
		try
		{
		  result=userService.userLoginAuthentication(session, requestMap);
             
		 if(result)
		 { pageResult="dashboard"; }
            
          else {
             request.setAttribute("msg", "Incorrect Username/Password....<br> Try Again!");
             pageResult="login1";
         }
		
		
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
		
		
		return new ModelAndView(pageResult);
		
		
	}
	
	
/*	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String registration(Model model) { 
	StudentRegistration student=new StudentRegistration();
	model.addAttribute("student",student);
	return "student";  
		}


@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
public ModelAndView saveStudents(@ModelAttribute("student") @Valid StudentRegistration student,BindingResult br){
	

	ModelAndView mv=new ModelAndView();

	if(br.hasErrors()){
		 mv.addObject("student",student);
	     mv.setViewName("view");
	     return mv;
	}
	else{
		
	   MultipartFile mtf=student.getFile();
	   MultipartFile mtf1=student.getPhoto();
	   
	   File file=new File("E:/File/"+mtf.getOriginalFilename());
	   File file1=new File("E:/File/"+mtf1.getOriginalFilename());
	   try{
			mtf.transferTo(file);
			mtf1.transferTo(file1);
		}
		catch(IllegalStateException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	   student.setFilename(mtf.getOriginalFilename());
	   student.setPhotoname(mtf1.getOriginalFilename());
	   
	   userService.saveStudent(student);	
		
	mv.addObject("student",student);
	mv.setViewName("success.jsp");
	
	return mv;
	}
}
*/
	
	







@Autowired
private UserService userService;


}
