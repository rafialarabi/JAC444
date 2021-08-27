/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 5
 * Date: 2021-07-07
 */

import java.util.ArrayList; //import ArrayList
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.lang.*;

public class saveStudent extends Student {

	public static void main(String[] args) throws IOException, NullPointerException {

		//serialization object
		ArrayList<Student> students = new ArrayList<Student>();

		int select = -1;

		//setting scanner to include user's credentials
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter the number of students to add. 0 to exit: ");

		try {
			select = reader.nextInt();
			if (select <= 0)
				select = -1;
		} catch (Exception e) {
			System.out.print("No number was selected\n");
		};

		if (select > 0) {
			do {
				Student std = new Student();
				// set student ID
				System.out.print("Input Student ID: ");

				while (!reader.hasNextInt()) {
					System.out.print("Please enter a valid student ID(must be greater than 0): ");
					reader = new Scanner(System.in);
				}
				int stdID = reader.nextInt();
				std.setStdID(stdID);

				// sets first name for the student
				reader = new Scanner(System.in);
				System.out.print("Enter First Name: ");
				String fName = reader.nextLine();
				std.setFirstName(fName);

				// sets last name for the student
				System.out.print("Enter Last Name: ");
				String lName = reader.nextLine();
				std.setLastName(lName);

				// set courses
				System.out.println("Please enter courses. Press Enter to stop: ");
				ArrayList<String> courses = new ArrayList<String>();
				String course = "start";

				int num = 0;

				while (!course.isEmpty()) {
					System.out.print(num++ + 1 + ". ");
					course = reader.nextLine();
					courses.add(course);
				}
				std.setCourses(courses);
				students.add(std);
				select--;
			} while (select > 0);
		}

		// for saving students object
		if (select != -1) {
			File fileName = new File("Student.bin");
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(students);

			oos.close();
			fos.close();

			System.out.println("Object was successfully saved into file " + fileName.getName());
		} else {
			System.out.println("No object was saved");
		}
	}

}
