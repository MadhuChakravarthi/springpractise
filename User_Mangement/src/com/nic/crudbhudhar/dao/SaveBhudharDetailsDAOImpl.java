package com.nic.crudbhudhar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nic.model.DocumentDetailsBean;
import com.nic.usermanagement.utils.DBUtils;

import common.LandDetailsBean;
import common.LandListDetails;
public class SaveBhudharDetailsDAOImpl implements SaveBhudharDetailsDAO {

	
	 private DataSource dataSource; 
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<LandListDetails> retriveBhudharDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LandDetailsBean> saveBhudharDetails(List<LandDetailsBean> listDetails)   {
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String sql="";
		int i=0;
		List<LandDetailsBean> endResult=new ArrayList();
		
		try
		{
			con=dataSource.getConnection();
			
			
			
			
			
			for(LandDetailsBean retrive:listDetails)
			{
				Long allotementID=DBUtils.getDBValue("select nextval('bhudhar_details_allotment_id_seq')",con, null);
				retrive.setAllotement_id(allotementID.toString());
				pstmt=con.prepareStatement("insert into bhudhar_details (survey_number,khatha_number,dist_code,mand_code,vill_code,adar_number) values (?,?,?,?,?,?) ");
				pstmt.setString(1, retrive.get_Survey_No());
				pstmt.setString(2, retrive.get_Khata_No());
				pstmt.setString(3, retrive.get_dist_cod());
				pstmt.setString(4, retrive.get_mand_code());
				pstmt.setString(5, retrive.get_Village_Code());
				pstmt.setString(6, retrive.getAdarnumber());
				endResult.add(retrive);
				i=pstmt.executeUpdate();
				
			    
			  
							
			}
			
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		finally
		{
			
		}
		
		return endResult;
	}

	@Override
	public List<DocumentDetailsBean> saveDocumentDetails(List<DocumentDetailsBean> documnetDetails) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String sql="";
		int i=0;
		List<DocumentDetailsBean> endResult=new ArrayList();
		
		try
		{
			con=dataSource.getConnection();
			
			for(DocumentDetailsBean retrive:documnetDetails)
			{
				Long allotementID=DBUtils.getDBValue("select nextval('bhudhar_details_allotment_id_seq')",con, null);
				retrive.setAllotment_id(allotementID.toString());
				pstmt=con.prepareStatement("insert into card_bhudhar_details (schedule_no,registrationdate,boundaries,buildarea) values (?,to_date(?,'DD-MM-YYYY'),?,?) ");
				pstmt.setString(1, retrive.getSchedule_no());
				pstmt.setString(2, retrive.getRegistrationDate());
				pstmt.setString(3, retrive.getNorth());
				pstmt.setString(4, retrive.getBuildarea());
				endResult.add(retrive);
				i=pstmt.executeUpdate();
				
			}
			
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		finally
		{
			
		}
		
		return endResult;
	}

	

}
