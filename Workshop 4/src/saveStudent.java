/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 4
 * Date: 2021-06-22
 */

import java.util.ArrayList; //import ArrayList
import java.util.Scanner;
import java.io.*;

public class saveStudent extends Student {
	
	public static void main(String[] args) throws IOException{
		
		//setting scanner to include user's credentials
		Scanner reader = new Scanner(System.in);
		
		
		//new student object
		Student std = new Student();
		
		//sets student ID
		System.out.print("Enter a student ID: ");
		
		while(!reader.hasNextInt()) {
			System.out.print("Please enter a valid student ID(must be greater than 0): ");
			reader = new Scanner(System.in);
		}
		
		int sID = reader.nextInt();
		std.setStdID(sID);
		
		
		//sets first name for the student
		reader = new Scanner(System.in);
		System.out.print("First Name: ");
		String fName = reader.nextLine();
		std.setFirstName(fName);
		
		
		//sets last name for the student
		System.out.print("Last Name: ");
		String lName = reader.nextLine();
		std.setlastName(lName);
		
		
		//sets courses
		System.out.println("Please enter courses. Press Enter to stop: ");
		ArrayList<String>courses = new ArrayList<String>();
		String course = "start";
		
		int num = 0;
		
		while(!course.isEmpty()) {
			System.out.print(num++ + 1 + ". ");
			course = reader.nextLine();
			courses.add(course);
		}
		
		std.setCourses(courses);
		
		//for saving students object
		File fileName = new File("Student.bin");
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(std);
		
		oos.flush();
		fos.close();
		
		System.out.println("Object saved successfully into the file " + fileName.getName());
	}
}
