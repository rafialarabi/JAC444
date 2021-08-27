/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 7
 * Date: 2021-07-20
 */

import java.text.DecimalFormat;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private double grade;
	private String department;

	public Student(String firstName, String lastName, double grade, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.department = department;
	}

	// Getters
	public String getName() {
		return getFirstName() + " " + getLastName();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getGrade() {
		return grade;
	}

	public String getDepartment() {
		return department;
	}

	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	
	// to implement comparable in student
	@Override
	public int compareTo(Student std) {
		double compareGrade = std.getGrade();
		return (int) (Math.round(this.grade - compareGrade));
	}

	@Override
	public String toString() {
		// to get grades in double digit decimal format
		DecimalFormat decf = new DecimalFormat("0.00##");

		return getFirstName() + "\t" + getLastName() + "\t\t" + decf.format(getGrade()) + "\t" + getDepartment();
	}
}