/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 5
 * Date: 2021-07-07
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.ListIterator;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class readStudent extends Student {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		// instantiate list
		ArrayList<Student> studentList = new ArrayList<Student>();

		// reads the file
		File fileName = new File("Student.bin");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);

		// instantiating student object from the file
		studentList = (ArrayList) ois.readObject();

		ois.close();
		fis.close();

		// printing object info
		for (Student s : studentList) {
			System.out.println("\nStudent ID: " + s.getStdID());
			System.out.println("Students' Name: " + s.getFirstName() + " " + s.getLastName());

			int count = 0;
			for (String l : s.getCourses()) {
				if (!l.isBlank())
					System.out.println(++count + "." + l);
			}
		}
	}
}