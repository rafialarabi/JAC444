/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 5
 * Date: 2021-07-07
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FXsaveStudent {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		// Create and setup JFrame
		JFrame frame = new JFrame("Saving students into bin file");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		// Create a JPanel that holds input fields
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		frame.add(inputPanel);

		// Create label and textfield for student ID
		JLabel studentIDLabel = new JLabel("Student ID: ");
		JTextField studentIDText = new JTextField(10);
		inputPanel.add(studentIDLabel);
		inputPanel.add(studentIDText);

		// Create label and textfield for student first name
		JLabel studentFirstNameLabel = new JLabel("Student First Name: ");
		JTextField studentFirstNameText = new JTextField(20);
		inputPanel.add(studentFirstNameLabel);
		inputPanel.add(studentFirstNameText);

		// Create label and textfield for student last name
		JLabel studentLastNameLabel = new JLabel("Student Last Name: ");
		JTextField studentLastNameText = new JTextField(20);
		inputPanel.add(studentLastNameLabel);
		inputPanel.add(studentLastNameText);

		// Create label and textfield for student courses
		JLabel studentCoursesLabel = new JLabel("Student Courses: ");
		JTextField studentCoursesText = new JTextField(30);
		inputPanel.add(studentCoursesLabel);
		inputPanel.add(studentCoursesText);

		// Creates a button that add student information
		JButton addButton = new JButton("ADD");
		inputPanel.add(addButton);

		// Creates a button that submits input information
		JButton saveButton = new JButton("SAVE");
		inputPanel.add(saveButton);

		// Add Action Listener to the submit button
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Create Student object
				Student student = new Student();

				// Use text field to input data from userID
				int stdID = Integer.parseInt(studentIDText.getText());
				student.setStdID(stdID);

				// First name
				String firstName = studentFirstNameText.getText();
				student.setFirstName(firstName);

				// Last Name
				String lastName = studentLastNameText.getText();
				student.setLastName(lastName);

				// Courses
				String coursesInput = studentCoursesText.getText();
				String[] str = coursesInput.split(",");
				for (String s : str) {
					student.setCourse(s);
				}

				// adding student
				students.add(student);

				// display message
				JOptionPane.showMessageDialog(frame, "Student Added!");

				// clear fields
				studentIDText.setText("");
				studentFirstNameText.setText("");
				studentLastNameText.setText("");
				studentCoursesText.setText("");

			}
		});

		// Add Action Listener to the submit button
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					// Create Student object
					Student student = new Student();

					// Use text field to input data from userID
					int stdID = Integer.parseInt(studentIDText.getText());
					student.setStdID(stdID);

					// First name
					String firstName = studentFirstNameText.getText();
					student.setFirstName(firstName);

					// Last Name
					String lastName = studentLastNameText.getText();
					student.setLastName(lastName);

					// Courses
					String coursesInput = studentCoursesText.getText();
					String[] stemp = coursesInput.split(",");
					for (String s : stemp) {
						student.setCourse(s);
					}
					
					// save to Arraylist
					students.add(student);
					
					// Write object to file
					File f = new File("Student.bin");
					FileOutputStream fos = new FileOutputStream(f);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(students);

					oos.flush();
					fos.close();

					// Create a JPanel for success submission
					JPanel submitedPanel = new JPanel();
					submitedPanel.setLayout(new BoxLayout(submitedPanel, BoxLayout.Y_AXIS));

					// Create success message
					JLabel successLabel = new JLabel("Students were successfully saved into file.");
					submitedPanel.add(successLabel);

					// JFrame setup to load success message
					frame.remove(inputPanel);
					frame.setSize(300, 100);
					frame.add(submitedPanel);
					frame.validate();

				} catch (IOException err) {
					System.out.println(err);
				}
			}
		});

		// JFrame setup
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}