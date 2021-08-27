/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 8
 * Date: 2021-07-27
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Student[] students = { new Student("Jack", "Smith", 50.0, "IT"), new Student("Aaron", "Johnson", 76.0, "IT"),
				new Student("Maaria", "White", 35.8, "Business"), new Student("John", "White", 47.0, "Media"),
				new Student("Laney", "White", 62.0, "IT"), new Student("Jack", "Jones", 32.9, "Business"),
				new Student("Wesley", "Jones", 42.89, "Media") };

		List<Student> studentsList = new ArrayList(Arrays.asList(students));

		// task 1
		StudentProcess.task1(studentsList);

		// task 2
		StudentProcess.task2(studentsList);

		// task 3
		StudentProcess.task3(studentsList);

		// task 4
		StudentProcess.task4(studentsList);

		// task 5
		StudentProcess.task5(studentsList);

		// task6
		StudentProcess.task6(studentsList);

		// task7
		StudentProcess.task7(studentsList);

		// task8
		StudentProcess.task8(studentsList);

		// task9
		StudentProcess.task9(studentsList);

		// task10
		StudentProcess.task10(studentsList);
	}
}
