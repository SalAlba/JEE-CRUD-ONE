package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQuery(name="EmployeeAuto.findAll", query="SELECT e FROM EmployeeAuto e")
public class EmployeeAuto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String firstName;

	private int salary;

	private String secondName;

	public EmployeeAuto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

}