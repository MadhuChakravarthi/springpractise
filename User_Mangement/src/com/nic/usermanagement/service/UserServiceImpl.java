package com.nic.usermanagement.service;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import com.nic.usermanagement.dao.UserDAOImpl;
import com.nic.usermanagement.model.Roles;
import com.nic.usermanagement.model.StudentRegistration;
import com.nic.usermanagement.model.Users;

public class UserServiceImpl implements UserService {

//	@Autowired
	private UserDAOImpl userdao;
	
    
	
	public void setUserdao(UserDAOImpl userdao) {
		this.userdao = userdao;
	}

	//	
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int resetPassword() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changePassword() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public int userCreation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void saveStudent(StudentRegistration student) {
		
		userdao.saveStudent(student);
		
		
	}

	@Override
	public boolean userLoginAuthentication(HttpSession session, Map requestMAp) {
		
		return userdao.userLoginAuthentication(session, requestMAp);
	}

	@Override
	public void userCreation(Users user) {
			
		userdao.userCreation(user);
		
	}

	@Override
	public List<Roles> getRoles() {
		
		return userdao.getRoles();
	}









}
