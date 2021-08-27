/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 5
 * Date: 2021-07-07
 */

import java.io.Serializable;
import java.util.ArrayList;  

public class Student implements Serializable{
	
	//members of the student class
	int stdID;
	String firstName;
	String lastName;
	ArrayList<String> courses = new ArrayList<String>();
	
	
	//default constructor
	public Student() {
		
	}
	
	
	//Custom constructor
	public Student(int stdID, String firstName, String lastName, ArrayList<String>courses) {
		this.stdID = stdID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
	}
	
	
	//getters
	public int getStdID() {
		return stdID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public ArrayList<String>getCourses(){
		return courses;
	}
	
	
	//setters
	public void setStdID(int stdID) {
        this.stdID = stdID;
    }
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setCourses(ArrayList<String>courses) {
		this.courses = courses;
	}
	
	public void setCourse(String course) { 
		this.courses.add(course); 
	}
}
