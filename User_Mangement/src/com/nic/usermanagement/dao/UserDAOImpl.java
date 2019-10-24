package com.nic.usermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import com.nic.usermanagement.model.Roles;
import com.nic.usermanagement.model.StudentRegistration;
import com.nic.usermanagement.model.Users;
import com.nic.usermanagement.utils.Constants;
import com.nic.usermanagement.utils.DBUtils;


public class UserDAOImpl implements UserDAO {


	
    private HibernateTemplate hibernateTemplate;
	
    private DataSource dataSource; 
    
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	
	}

	@Override
	public void logoutDAO() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int resetPasswordDAO() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changePasswordDAO() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int userCreation(Users user) {
			
		
		hibernateTemplate.save(user);
			
		return 1;
	}


	@Override
	public List<Roles> getRoles() {
		
		return hibernateTemplate.find("from Roles");
	}


	public void saveStudent(StudentRegistration student) {
		
		
		hibernateTemplate.save(student);

		
	}





	@Override
	public boolean userLoginAuthentication(HttpSession session,Map requestMap) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		boolean loginAuth=false;
		try
		{
			con=dataSource.getConnection();
			System.out.println(con);
			Map<String, Object> loginMap = DBUtils.getMap(Constants.LOGINSQL, con, new Object[]{
		    requestMap.get("username")});
	       if (!loginMap.isEmpty()) {
        	
             List services = DBUtils.getListMap(Constants.LOGINSERVICES, con, new Object[]{
                            loginMap.get(Constants.ROLEID)});
                  
             session.setAttribute("userinfo", loginMap);
             session.setAttribute("services", services);
          
             com.nic.usermanagement.utils.json.JSONArray links = new com.nic.usermanagement.utils.json.JSONArray(services);
             session.setAttribute("links", links.toString());
             loginAuth=true;
		}
	       
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return loginAuth;
	}


	




}
