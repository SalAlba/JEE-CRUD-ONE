package dao;

import javax.ejb.Local;

import model.User;

@Local
public interface UserDAO {
	
	public void createUser(User user);
}
