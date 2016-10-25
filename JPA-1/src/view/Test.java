package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;  // dla emx

import model.Employee;
 
public class Test {
 
//	@PersistenceContext(name="JPA-1")
//	static private EntityManager emx;
	
	public static void main(String[] args) {
 
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-1");
 
		/* Create and populate Entity */
		Employee employee = new Employee();
		employee.setFirstName("Marek");
		employee.setSecondName("Test");
		employee.setSalary(13);
//		employee.setId(1);
 
		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();
 
		/* Persist entity */
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
 
		/* Retrieve entity */
//		employee = emx.find(Employee.class, 7);
//		employee = em.find(Employee.class, "Karol"); // it's not work like this
		employee = em.find(Employee.class, 7);
		System.out.println(employee);
 
		/* Update entity */
		em.getTransaction().begin();
		employee.setSecondName("Kowalski");
		System.out.println("Employee after updation :- " + employee);
		em.getTransaction().commit();
 
		/* Remove entity */
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
 
		/* Check whether enittiy is removed or not */
		employee = em.find(Employee.class, 7);
		System.out.println("Employee after removal :- " + employee);
 
	}
}