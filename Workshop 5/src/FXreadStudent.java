/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 5
 * Date: 2021-07-07
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class FXreadStudent extends Application {

    @Override
    public void start(Stage fStage) {

        TableView tableView = new TableView();

        TableColumn<Student, String> column0 = new TableColumn<>("Student ID");
        column0.setCellValueFactory(new PropertyValueFactory<>("stdID"));

        TableColumn<Student, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Student, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, String> column3 = new TableColumn<>("Courses");
        column3.setCellValueFactory(new PropertyValueFactory<>("courses"));


        tableView.getColumns().add(column0);
        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);

        //instantiate list
        ArrayList<Student> studentList;
        
        
        // Read object from file
        File f = new File("Student.bin");

        
       
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Create object from file
            studentList = (ArrayList<Student>) ois.readObject();

            // Close file reader
            ois.close();
            fis.close();

            
            // Create a JPanel that holds the results
            // Set values to labels and append to result
            for ( Student s: studentList ) {
                tableView.getItems().add(new Student(s.getStdID(),s.getFirstName(),s.getLastName(),s.getCourses()));

            }


        } catch (IOException | ClassNotFoundException err) {
            tableView.setPlaceholder(new Label("No rows to display"));

        }

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        fStage.setScene(scene);
        fStage.setTitle("Student Read File");
        fStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}