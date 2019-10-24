package com.nic.usermanagement.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.nic.usermanagement.model.Roles;
import com.nic.usermanagement.model.Users;

public interface UserDAO {

	
	public boolean userLoginAuthentication(HttpSession session,Map requestMap);
	public int userCreation(Users user);
	public void logoutDAO();
	public int resetPasswordDAO();
	public int changePasswordDAO();
	public List<Roles>  getRoles();
	
	
	
	
}
