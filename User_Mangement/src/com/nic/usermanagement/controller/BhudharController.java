package com.nic.usermanagement.controller;

import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nic.crudbhudhar.service.SaveBhudharService;
import com.nic.dyna.ContactForm;
import com.nic.model.BPMS_ServiceBean;
import com.nic.model.DocumentDetailsBean;
import com.nic.usermanagement.model.BhudharRegistration;
import com.nic.usermanagement.service.BhudharService;

import common.LandDetailsBean;
import common.LandListDetails;
import common.RetriveLandDetails;

@Controller
public class BhudharController {

	
	@Autowired
	private BhudharService bhudharService;
	@Autowired
	private SaveBhudharService savebhudharService;
	

	
	@RequestMapping(value="/getAdhar",method=RequestMethod.GET)
	public ModelAndView getAdharView()
	{
	
		return new ModelAndView("getadhar");
		
	}	
	
	
	
	
	
	
	
	
@RequestMapping(value="/getbhudhar",method=RequestMethod.GET)
public String registration(Model model) { 


	BhudharRegistration bd = new BhudharRegistration();
	model.addAttribute("LandDetailsBean",bd);
	return "bhudhar";  
		}



@RequestMapping(value="/retrieveBhudharDetails",method=RequestMethod.POST)
public ModelAndView getAdharDetails(@RequestParam Map<String,String> testMap)
{

	Map<String, Object> model = new HashMap<String, Object>();
	RetriveLandDetails ret=new RetriveLandDetails();
	
	LandListDetails li =ret.retriveLandDetails(testMap.get("adharno"),10);
	
	for(LandDetailsBean retrive:li.getLandDetailslist())
	{
		
		System.out.println("###########"+retrive.get_dist_cod());
		
	}
	
	
	return new ModelAndView("getadhar","LandListDetails",li);
	
}




@RequestMapping(value="/saveBhudharDetails",method=RequestMethod.POST)
public ModelAndView saveDyna(@ModelAttribute("landDetails") LandListDetails landDetails,BindingResult result)
{
	List<LandDetailsBean> storeList=landDetails.getLandDetailslist();
	List<LandDetailsBean> filterList=new ArrayList<LandDetailsBean>();
	for(LandDetailsBean retrive:landDetails.getLandDetailslist())
	{
	 if(retrive.isCheckedItem())
		{
		
		filterList.add(retrive);
		
		}
	}
	
	
	
	List<LandDetailsBean> listDetails=savebhudharService.saveBhudharDetails(filterList);
	Map<String,Object> model=new HashMap<String,Object>();
	model.put("ackWeblandDetails", listDetails);
	
	
//	for(LandDetailsBean retrive:landDetails.getLandDetailslist())
//	{
//		
//		System.out.println("Survey"+retrive.get_Survey_No());
//		System.out.println("Checked"+retrive.getCheckedItem());
//		
//	}
	
	return new ModelAndView("ackWebland",model);

}





@RequestMapping(value="/getCardAdhar",method=RequestMethod.GET)
public ModelAndView getCardAdharView()
{

	return new ModelAndView("getCardAdhar");
	
}	


@RequestMapping(value="/retrieveCardServiceDetails",method=RequestMethod.POST)
public ModelAndView getCardServiceDetails(Model m) { 

	List<DocumentDetailsBean> dlist=new ArrayList<DocumentDetailsBean>();
	BPMS_ServiceBean ref=new BPMS_ServiceBean();
     try
     {
	com.nic.DeedDetails_ServiceLocator service = new  com.nic.DeedDetails_ServiceLocator();
    com.nic.DeedDetails_PortType port = service.getDeedDetailsPort();
    byte[] test=port.documentInfo(707,2017, 2, "landhub", "landhub");
	InputStream is= new ByteArrayInputStream(test);
	XMLDecoder decoder= new XMLDecoder(is);
    BPMS_ServiceBean bserviceBean=(BPMS_ServiceBean) decoder.readObject(); 
    dlist=( List<DocumentDetailsBean>)bserviceBean.getDetailsBean();
    ref.setDetailsBean(dlist);
     
  
	 }
     catch(Exception e)
     {
      System.out.println(e); 	 
     }
	
	
	return  new ModelAndView("getCardAdhar","BPMS_ServiceBean",ref);  
		}


@RequestMapping(value="/saveCardDetails",method=RequestMethod.POST)
public ModelAndView saveCardDetails(@ModelAttribute("bpmsbean") BPMS_ServiceBean bpmsBean)
{
	
	List<DocumentDetailsBean> listCardDetails=bpmsBean.getDetailsBean();
	
	List<DocumentDetailsBean> filterList=new ArrayList();
	
	for(DocumentDetailsBean li: listCardDetails)
	{
		
	  System.out.println("checked Item"+li.isCheckeditem()); 	
	  if(li.isCheckeditem())	
	  {
		  
		  filterList.add(li);
	
	  }
	  
	  
	} 
	  System.out.println(filterList.size());
	  List<DocumentDetailsBean> documentResult=savebhudharService.saveCardDetails(filterList);
	  Map<String,Object> model=new HashMap<String,Object>();
	  model.put("ackWebCardlandDetails", documentResult);
	 
	
	
	return new ModelAndView("ackCard",model);
}


}

//@RequestMapping(value="/saveBhudhar",method=RequestMethod.POST)
//public ModelAndView saveStudents(@ModelAttribute("bhudhar")BhudharRegistration bhudhar){
//	
//
//	ModelAndView mv=new ModelAndView();
//	
//	BhudharRegistration bhudharReg=bhudharService.saveBhudharRegistration(bhudhar);
//	
//	mv.addObject("bhudhar",bhudharReg);
//
//	mv.setViewName("success");
//	
//	return mv;
//	}






/*@RequestMapping("getDetailsByid")
public ModelAndView view(Integer bhudharid)
{
	ModelAndView mv=new ModelAndView();
	BhudharRegistration cp=bhudharService.BhudharDetailsById(bhudharid);
	mv.addObject("selected", cp);
	//bhudharService
	//List<Bh> li=bs.getdata();
	//mv.addObject("getall", li);
	mv.setViewName("bhudhar");	
	return mv;
}
*/










