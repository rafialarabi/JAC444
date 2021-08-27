/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 2
 * Date: 2021-06-09
 */


import shapes.Circle;
import shapes.Parallelogram;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import static shapes.Utilities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Main{
	
    public static void main(String[] args) throws Exception {

        //to hold the constructed shapes
        Shape[] shapesArray = new Shape[100];
        int counter = 0;

        printHeader(1);

        //same as instruction
        try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
            String s;


            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(","); //this string will keep all the read tokens
    
                //check if it's the Parallelogram
                if (Objects.equals(tokens[0], "Parallelogram") && tokens.length == 3){

                	try {
                        shapesArray[counter] = new Parallelogram(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                        counter++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }else if (Objects.equals(tokens[0], "Rectangle") && tokens.length == 3){                //check if it's the Rectangle
                	try {
                        shapesArray[counter] = new Rectangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                        counter++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }else if (Objects.equals(tokens[0], "Square") && tokens.length == 2){                      //check if it's the Square
                	try {
                        shapesArray[counter] = new Square(Double.parseDouble(tokens[1]));
                        counter++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }else if(Objects.equals(tokens[0], "Triangle") && tokens.length == 4){                      //check if it's the Triangle
                	try {
                        shapesArray[counter] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                                Double.parseDouble(tokens[3]));
                        counter++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }else if(Objects.equals(tokens[0], "Circle") && tokens.length == 2){                        //check if it's the Circle
                	try {
                        shapesArray[counter] = new Circle(Double.parseDouble(tokens[1]));
                        counter++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
      //printTask1
        System.out.println(counter +" shapes were created.");
        
        for(int i=0;i<counter;i++)
        	System.out.println(shapesArray[i]);
    }
}
