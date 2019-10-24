package common;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.rpc.ServiceException;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;



public class RetriveLandDetails {

	
	public LandListDetails retriveLandDetails(String uid,int distcode)  {
		
		  LandListDetails landDetailsList = new LandListDetails();
		try
		{
	  
		org.tempuri.StateWiseSearchOnUIDLocator service = new org.tempuri.StateWiseSearchOnUIDLocator();
        org.tempuri.StateWiseSearchOnUIDSoap port = service.getStateWiseSearchOnUIDSoap();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        LandDetailsBean[] lBean = null;
       // List<LandDetailsBean> insertedLandList = null;
        Double totextnt=0.0D;
        java.lang.String result = port.stateWiseSearchBasedonUID(uid, distcode, "WebLand", "WebLand@APNIC");
		
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(result));
		Document doc = db.parse(is);
		// NodeList mainNode = doc.getElementsByTagName("memberdetails");

		NodeList cardNodeList = doc.getElementsByTagName("DocumentElement");
		// //" + cardNodeList.getLength());
		HashMap cardMap = new HashMap();
		List<HashMap<String, String>> memberMapList = new ArrayList<HashMap<String, String>>();
		if (cardNodeList.getLength() > 0)  
		{
			NodeList cardChildNodeList = cardNodeList.item(0).getChildNodes();
			for (int xx = 0; xx < cardChildNodeList.getLength(); xx++) {
				cardMap.put(cardChildNodeList.item(xx).getNodeName(), cardChildNodeList.item(xx).getTextContent());
			}

			NodeList memberNodeList = doc.getElementsByTagName("AadharDetails");
			for (int yy = 0; yy < memberNodeList.getLength(); yy++) {
				HashMap<String, String> memberMap = new HashMap();
				NodeList memberChildNodeList = memberNodeList.item(yy).getChildNodes();
				for (int xx = 0; xx < memberChildNodeList.getLength(); xx++) {
					memberMap.put(memberChildNodeList.item(xx).getNodeName(),
							memberChildNodeList.item(xx).getTextContent());
				}
				memberMapList.add(memberMap);
			}
			
			
			//System.out.println("MEMBER LIST"+memberMapList.size());
			
			
			
			
			
			int i=0;
			//LandDetailsli=new LandDetails();
			for (HashMap<String, String> member : memberMapList) 
			{
			    LandDetailsBean landDetailsBean = new LandDetailsBean();
				landDetailsBean.set_dist_cod(member.get("dist_code"));
				landDetailsBean.set_dist_name(member.get("dist_name"));
				landDetailsBean.set_Khata_No(member.get("Khata_No"));
				landDetailsBean.set_mand_code(member.get("mand_code"));
				landDetailsBean.set_mand_name(member.get("mand_name"));
				landDetailsBean.set_Occupant_Name(member.get("Occupant_Name"));
				landDetailsBean.set_Occupant_Extent(decimalFormat.format(Double.parseDouble(member.get("Occupant_Extent"))).toString());
				landDetailsBean.set_Pattadar_Name(member.get("Pattadar_Name"));
				landDetailsBean.set_Pattadar_Father_Name(member.get("Pattadar_Father_Name"));
				landDetailsBean.set_Survey_No(member.get("Survey_No"));
				landDetailsBean.set_Village_Code(member.get("Village_Code"));
				landDetailsBean.set_Village_Name(member.get("Village_Name"));
				totextnt = totextnt + Double.parseDouble(member.get("Occupant_Extent"));
				landDetailsList.getLandDetailslist().add(landDetailsBean);
			
			}
			
			
			
			
			System.out.println("");
			
			
			
			
			
			
			
		}
			else
			{
				
				
				NodeList memberNodeList = doc.getElementsByTagName("AadharDetails");
				for (int yy = 0; yy < memberNodeList.getLength(); yy++) {
					HashMap<String, String> memberMap = new HashMap();
					NodeList memberChildNodeList = memberNodeList.item(yy).getChildNodes();
					for (int xx = 0; xx < memberChildNodeList.getLength(); xx++) {
						memberMap.put(memberChildNodeList.item(xx).getNodeName(),
								memberChildNodeList.item(xx).getTextContent());
					}
					memberMapList.add(memberMap);
				}

				for (HashMap<String, String> member : memberMapList) {

					if (member.get("Survey_No").equals("No Details With The Given Aadhaar")) {
						
					}

				}	
				
			}
			
			
		
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return landDetailsList;
		
		
		
		
	}
	
	
}
