package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String familyMemberDetails;
	private String department;
	private String supervisor;
	private double salaryScale;
	private String officeRelatedDetails;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId, String familyMemberDetails, String department, String supervisor, double salaryScale, String officeRelatedDetails) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.setFamilyMemberDetails(familyMemberDetails);
		this.setDepartment(department);
		this.setSupervisor(supervisor);
		this.setSalaryScale(salaryScale);
		this.setOfficeRelatedDetails(officeRelatedDetails);
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "family_member_details", nullable = false)
	public String getFamilyMemberDetails() {
		return familyMemberDetails;
	}

	public void setFamilyMemberDetails(String familyMemberDetails) {
		this.familyMemberDetails = familyMemberDetails;
	}

	@Column(name = "department", nullable = false)
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "supervisor", nullable = false)
	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	@Column(name = "salary_scale", nullable = false)
	public double getSalaryScale() {
		return salaryScale;
	}

	public void setSalaryScale(double salaryScale) {
		this.salaryScale = salaryScale;
	}

	@Column(name = "office_related_details", nullable = false)
	public String getOfficeRelatedDetails() {
		return officeRelatedDetails;
	}

	public void setOfficeRelatedDetails(String officeRelatedDetails) {
		this.officeRelatedDetails = officeRelatedDetails;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", familyMemberDetails="+ familyMemberDetails +",department="+ department +",supervisor="+ supervisor +",salaryScale="+ salaryScale +",officeRelatedDetails="+ officeRelatedDetails +"]";
	}
	
}
