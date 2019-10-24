package com.nic.dyna;


import java.util.ArrayList;

import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class DynaController {
	
	private static  List<Contact> contacts=new ArrayList<Contact>();
	
	static
	{
        
		contacts.add(new Contact("Madhu","M", "9989274848"));
		contacts.add(new Contact("Chakri","M", "9989274848"));
		
	}
	
@RequestMapping(value = "/getDyna", method = RequestMethod.GET)
public ModelAndView getDynaForm(Model m)
{
	
	ContactForm cf=new ContactForm();
	cf.setContactlist(contacts);
	return new ModelAndView("dynamic" , "contactFm", cf) ;	
}

@RequestMapping(value="/saveEntry",method=RequestMethod.POST)
public ModelAndView saveDyna(@ModelAttribute("contactForm") ContactForm contactForm)
{
	//Model m=new Model();
	//m.addAttribute("contactForm", contactForm);
	return new ModelAndView("dynamicentry","contactForm",contactForm);

}




}
