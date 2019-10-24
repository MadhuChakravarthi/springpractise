package com.nic.usermanagement.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.net.MediaType;
import com.nic.usermanagement.model.BhudharRegistration;

import com.nic.usermanagement.model.StudentRegistration;
import com.nic.usermanagement.service.BhudharService;
import com.nic.usermanagement.service.UserService;

@Controller
public class AjaxController {
	

	@Autowired
	private BhudharService bhudharService;

/*@RequestMapping(value="/getVillages",method=RequestMethod.GET)
public String getVillages(Model model) { 


Map<String,String>	villageMap = bhudharService.getVillages();

ObjectMapper mapper = new ObjectMapper();

String json = "";

try {
	json = mapper.writeValueAsString(villageMap);
} catch (JsonProcessingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println(json);


return json;  
		}*/


@RequestMapping(value="/getDistrict", method=RequestMethod.POST)
@ResponseBody
public String getDistrict(@RequestParam("distcode") String distcode,  Model model) { 


System.out.println(distcode);	

Map<String,String>	districtMap = bhudharService.getDistricts(distcode);
 
/*
ObjectMapper mapper = new ObjectMapper();
String json = "";
try {
	
	json = mapper.writeValueAsString(districtMap);

} catch (JsonProcessingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}

String result;

result="{\"success\":\"success message\",";
String tcode="\"district\":["+json;

result += tcode+"]}";


//System.out.println(result);

*/

String jsonresult=(String)districtMap.get("dist");
//System.out.println(jsonresult);

return (jsonresult);
}


/*@RequestMapping(value="/getMandal",method=RequestMethod.GET)
public String getMandals(Model model) { 


Map	mandalMap = bhudharService.getMandals();

ObjectMapper mapper = new ObjectMapper();
String json = "";
try {
	json = mapper.writeValueAsString(mandalMap);
} catch (JsonProcessingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
return json;
}
*/
	
	
	

}
