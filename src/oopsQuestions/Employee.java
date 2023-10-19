package oopsQuestions;

/*Write a Java program to create a class called "Employee" with a name, 
job title, and salary attributes, and methods to calculate and update salary.
 */
public class Employee {
	
private String name;
private String jobTitle;
private double salary;

public Employee(String name,String jobTitle,double salary) {
	this.name=name;
	this.jobTitle=jobTitle;
	this.salary=salary;
}

public double getSalary() {
	return this.salary;
}

public void setSalary(double salary) {
	this.salary=salary;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name=name;
}

public String getJobTitle() {
	return this.jobTitle;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle=jobTitle;
}

public void raiseSalary(double percentage) {
    salary = salary + salary * percentage / 100;
  }

public void printEmployeeDetails() {
	System.out.println("EmployeeName:"+name);
	System.out.println("JobTitle:"+jobTitle);
	System.out.println("Salary:"+salary);
}
}
