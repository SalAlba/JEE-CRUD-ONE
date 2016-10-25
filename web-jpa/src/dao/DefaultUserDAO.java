package dao;

import javax.ejb.Stateless;
import javax.persistence.*;

import model.User;

@Stateless
public class DefaultUserDAO implements UserDAO{
	
	@PersistenceContext(name="web-jpa")
	private EntityManager em;
	
	@Override
	public void createUser(User user) { em.persist(user); }

}
