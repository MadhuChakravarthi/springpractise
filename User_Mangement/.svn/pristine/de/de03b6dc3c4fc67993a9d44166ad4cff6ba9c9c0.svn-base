package com.nic.cardclient;


import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import com.nic.model.BPMS_ServiceBean;
import com.nic.model.DocumentDetailsBean;

public class CardClientService {

	public static void main(String[] args) {
		
		
		
		try
		{
		
	     com.nic.DeedDetails_ServiceLocator service = new  com.nic.DeedDetails_ServiceLocator();
	     com.nic.DeedDetails_PortType port = service.getDeedDetailsPort();
		 byte[] test=port.documentInfo(707,2017, 2, "landhub", "landhub");
		 InputStream is= new ByteArrayInputStream(test);
		 XMLDecoder decoder= new XMLDecoder(is);
	     BPMS_ServiceBean bserviceBean=(BPMS_ServiceBean) decoder.readObject(); 
         List<DocumentDetailsBean>   dlist=( List<DocumentDetailsBean>)bserviceBean.getDetailsBean();
	     for(DocumentDetailsBean ddb:dlist)
		   {
			
			System.out.println(ddb.getRegistrationDate());
		   }
		

				
		bserviceBean.getOwnerNamesList();
		
		System.out.println(bserviceBean.getOwnerNamesList());
		
		
		
		//707,2017,1,1 
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		

	}

}
