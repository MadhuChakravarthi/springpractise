package com.nic.usermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nic.crudbhudhar.service.PublicationService;
import com.nic.usermanagement.model.CategoryBean;
import com.nic.usermanagement.model.PublicationBean;
@Controller
public class PublicationServiceController {
	
@RequestMapping("/getService")
public String getService(Model m)
{
PublicationBean pb=new PublicationBean();
List<CategoryBean> categoryBean= publicationService.getListofCategories();
System.out.println(categoryBean.size());
m.addAttribute("categories", categoryBean);
m.addAttribute("publicationBean",pb);
return "publication";
}

@RequestMapping("/service")
public void serviceAdd(@ModelAttribute("command")PublicationBean pubService)
{
	
	pubService.setPublicationID(1123);
	System.out.println("1"+pubService.getPublicationID()+"2"+pubService.getPubContent()+"3"+pubService.getCategoryBean().getCategoryId());
	
	publicationService.addPubliction(pubService);
	
}
	


@Autowired
private PublicationService publicationService;

}
