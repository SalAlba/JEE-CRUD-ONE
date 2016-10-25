package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import enities.User;

@Stateless
public class DefaulteUserDAO implements UserDAO {
	
//	@PersistenceContext(unitName="web-new")
	@PersistenceContext(name="web-new")
	private EntityManager em;
	
	@Override
	public void creatUser(User user) { em.persist(user);}

	@Override
	public List<User> getAllUsers() {
		Query query=em.createNamedQuery("User.findAll");
		return (List<User>) query.getResultList();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
