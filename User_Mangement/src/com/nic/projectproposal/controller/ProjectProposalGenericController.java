package com.nic.projectproposal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nic.projectproposal.model.PpCategoryDetails;
import com.nic.projectproposal.model.PpGeneralDetails;
import com.nic.projectproposal.service.GeneralService;
import com.nic.projectproposal.service.GeneralServiceImpl;

@Controller
public class ProjectProposalGenericController {
	
	
	@RequestMapping("/genericInterface")
	public String userInterface(Model model)
	{
        PpGeneralDetails general=new PpGeneralDetails();
	    model.addAttribute("general",general);
	    return "general";
	}
	
	@RequestMapping(value="/generalEntryGeneric",method=RequestMethod.POST)
	public String usergenericInsertion(@Valid @ModelAttribute("general") PpGeneralDetails project,BindingResult result,Model model,HttpServletRequest req)
	{
		
		HttpSession session=req.getSession(true);
	     if(result.hasErrors())
		{
			 model.addAttribute("user",project);
			  
			return "general";
		}
		
		else  {

			
			   	
		if(project.getProjectProposalId()==0)	
		{	
	    System.out.println("IF"+project.getProjectProposalId()); 		
	    int project_proposal_code=proposalGenericService.add(project);
	    List<PpGeneralDetails> listGeneral= proposalGenericService.getAll();        
	    model.addAttribute("list",listGeneral);
	    session.setAttribute("projectproposalcode", project_proposal_code);
		model.addAttribute("message","Successfully User Created");	
	    model.addAttribute("user",project);
		}
		else
		{
			
			System.out.println("ELSE"+project.getProjectProposalId());
	    	proposalGenericService.update(project); 
	    	model.addAttribute("message","Successfully Updated");	
	    	List<PpGeneralDetails> listGeneral= proposalGenericService.getAll();        
		    model.addAttribute("list",listGeneral);
	       
		}
	    
		return "general";}

	}
	
	@RequestMapping(value="/editRetrival/{id}")  
    public String edit(@PathVariable int id,Model model){ 
	    PpGeneralDetails general=proposalGenericService.get(id);
	    System.out.println("POJO"+general.getProjectProposalId());
		model.addAttribute("general", general);
        return "general";  
    }  
	

	
	
	
		

	@Autowired
	private GeneralService proposalGenericService;
	
}
