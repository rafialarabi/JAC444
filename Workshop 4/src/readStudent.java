/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 4
 * Date: 2021-06-22
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.ListIterator;
import java.io.ObjectOutputStream;


public class readStudent extends Student{
	
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		
		//reads the file
		File fileName = new File("Student.bin");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//instantiating student object from the file
		Student student = (Student) ois.readObject();
		fis.close();
		
		
		//printing object info
		System.out.println("Student ID: " + student.getStdID());
		System.out.println("Student's Name: " + student.getFirstName() + " " + student.getLastName());
        ListIterator<String> list = null;
        list = student.getCourses().listIterator();
        
        System.out.println("\n Enrolled courses:");
        while(list.hasNext()) {
        	if(list.nextIndex() + 1 < student.getCourses().size()) {
        		System.out.println(list.nextIndex() + 1 + "." + list.next());
        	}
        }
	}
}