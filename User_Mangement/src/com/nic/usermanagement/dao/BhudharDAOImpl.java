package com.nic.usermanagement.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.impl.LogKitLogger;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nic.usermanagement.model.BhudharRegistration;
import com.nic.usermanagement.utils.Constants;
import com.nic.usermanagement.utils.DBUtils;

public class BhudharDAOImpl implements BhudharDAO {
	

	 private HibernateTemplate hibernateTemplate;

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


/*	@Override
	public void saveBhudharDetails(BhudharRegistration bhurdetail) {
	    hibernateTemplate.save(bhurdetail); 
	}
*/

	@Override
	public BhudharRegistration bhudharRegistration(BhudharRegistration bhurdetails) {
		
			
			hibernateTemplate.save(bhurdetails);
			return bhurdetails;

	}
	@Override
	public BhudharRegistration bhudharDetailsById(Integer bhudharid) {
		// TODO Auto-generated method stub
		return null;
	}


	


	@Override
	public BhudharRegistration BhudharDetailsById(Integer bhudharid) {
		// TODO Auto-generated method stub
		return null;
	}


/*	public BhudharRegistration BhudharDetailsById(Integer bhudharid){
		System.out.println(bhudharid);
		
		List<BhudharRegistration> bhudharDetails = hibernateTemplate.find("from BhudharRegistration where bhudharid=?",bhudharid);
	if(bhudharDetails.isEmpty()){
		System.out.println(bhudharDetails);
		return null;
	}
		else{
			System.out.println(bhudharDetails);
			return bhudharDetails.get(0);
		}
*/
	
	
	

@Override
public Map getDistricts(String distcode) {
		
System.out.println(distcode);
		
List<Object[]> list =  hibernateTemplate.find("select sr_cd,sr_name from District  where distcd= ?",distcode);
		
//System.out.println(list.toString());	


	String	result="{\"success\":\"success message\",";
	String tcode="\"district\":[";


	
		Map<String,String> distMap = new HashMap<String,String>();
		
		for (Object[] i : list){
		
			tcode+= "{\"sr_cd\":\""+(String) i[0]+"\",";
			tcode+="\"sr_name\":\""+(String) i[1]+"\"},";
			
		//		distMap.put("distname",(String) i[1]);
				
			//	System.out.println((String)i[0]+"====="+(String) i[1]);
			
				
			}
			
		result +=tcode.substring(0,tcode.length()-1)+"]}";
			
			 
System.out.println("orginal josn"+result);	


			//System.out.println(distMap);
		
distMap.put("dist", result);
		return distMap;
			
	}


	@Override
	public Map getVillages() {
		List<Object[]> list =  hibernateTemplate.find("select village_name,village_code from Village");
		
		Map<String,String> villageMap = new HashMap<String,String>();
			for (Object[] i : list) villageMap.put((String)i[0],(String) i[1]);

		
		return villageMap;
	}


	@Override
	public Map getMandals() {
	List<Object[]> list =  hibernateTemplate.find("select mandal_code,mandal_name from Mandal");
		
		Map<String,String> mandalMap = new HashMap<String,String>();
			for (Object[] i : list) mandalMap.put((String)i[0],(String) i[1]);

		
		return mandalMap;
	}


		
	}

	
	
	




	

