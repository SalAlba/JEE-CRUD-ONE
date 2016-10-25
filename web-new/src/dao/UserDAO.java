package dao;

import java.util.List;

import javax.ejb.Local;

import enities.User;

@Local
public interface UserDAO {
	
	public void creatUser(User user);
	public List<User> getAllUsers();
	public User getUserById(int id);
	public void updateUser(User user);
	public void deleteUser(User user);
}
