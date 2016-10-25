package manager;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UserDAO;
import model.User;

@ManagedBean
@SessionScoped
public class DefaulteUserManager implements UserManager{
	
	private User user=new User();
	
	@EJB
	private UserDAO userDAO;
	
	
	public User getUser() { return user; }
	public void setUser(User user) { this.user = user; }

	@Override
	public void CreateUser() { userDAO.createUser(user);}

}
