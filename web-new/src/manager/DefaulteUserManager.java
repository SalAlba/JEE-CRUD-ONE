package manager;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;

import dao.UserDAO;
import enities.User;

//@Named(value="DefaulteUserManager")
//@Named("DefaulteUserManager")
@SessionScoped
@ManagedBean
public class DefaulteUserManager{
	
	
	@EJB
	private UserDAO userDAO;
	
	private User user=new User();
	
	public User getUser() { return user; }
	public void setUser(User user) { this.user = user; }
	public void createUser(){ userDAO.creatUser(user); }
	public List<User> getAllUsers(){ return userDAO.getAllUsers();}
	
	
}
