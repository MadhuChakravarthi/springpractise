package com.nic.projectproposal.controller;

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


import com.nic.projectproposal.dao.PhysicalTargetDAO;
import com.nic.projectproposal.model.PhysicalTarget;
import com.nic.projectproposal.model.PhysicalTargetTrngwiseTargets;



@Controller
public class PhysicalTartgetController {

	
	
	@RequestMapping("/physicalInterface")
	public String userInterface(Model model)
	{
        PhysicalTarget physical=new PhysicalTarget();
	    model.addAttribute("physical",physical);
	    return "physical";
	}
	
	@RequestMapping(value = "/physicalEntry", method = RequestMethod.POST)
	public String physicalInsertion(@Valid @ModelAttribute("physical") PhysicalTarget physical, BindingResult result,
			Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (result.hasErrors()) {

			model.addAttribute("physical", physical);

			return "physical";
		}

		else {

		
			//generalService.categoryCreation(category);
			 //System.out.println("--2-"+physical.getPhysicalTargetTrngwiseTargets().get(0));
	         
			 // physical.getPhysicalTargetTrngwiseTargets();
			  
			  physicalTest.add(physical);
			 // System.out.println(test);
			  
			 
			 /* for(PhysicalTargetTrngwiseTargets tx:physical.getPhysicalTargetTrngwiseTargets())
			  {
				  System.out.println("STATE"+tx.getStatecode());
				  System.out.println("DIST"+tx.getDistcode());
				  System.out.println("TARGET"+tx.getTarget());
				  
			  }*/
			 
			 
			
	         
	         
			
		    //System.out.println("TESTTTTTTTT"+physicalID);
			
			
			model.addAttribute("message", "Successfully User Created");
			model.addAttribute("physical", physical);
		
			return "physical";
		}

	}
	
	
	@Autowired(required=true)
	private  PhysicalTargetDAO physicalTest;	
	
}



