package view;

import javax.persistence.*;

import model.Department;
import model.Student;

public class TestManyToOne {
	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA-1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		Student std=new Student();
		std.setName("Salem");
		std.setEmail("test@wp.pl");
		
		txn.begin();
		Department department=em.find(Department.class, 1);
		System.out.println(department);
		txn.commit();
		
		std.setDepartment(department);
		
		txn.begin();
		em.persist(std);
		txn.commit();
	}
}
