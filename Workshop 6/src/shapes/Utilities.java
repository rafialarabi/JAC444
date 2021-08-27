/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 6
 * Date: 2021-07-13
 */

package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Objects;

public class Utilities {

    public static void printHeader(){
        System.out.print("------->JAC 444 Assignment 6<-------\n");
    }
    
    
    public static void printTask(int i){
        System.out.printf("------->Task %d ...<-------\n", i);
    }
    

    public static String format(double dec){
        DecimalFormat decFormat = new DecimalFormat("0.00000");
        return decFormat.format(dec);
    }

    
    public static void readShapes(int[] counter, Shape[] shapesArray, String fileName){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String string;

            while ((string = br.readLine()) != null) {
                String[] tokens = string.split(","); //token string will keep all tokens from file that is read.
                
                
               
                if (Objects.equals(tokens[0], "Parallelogram") && tokens.length == 3){              //check if it's Parallelogram
                    try {
                        shapesArray[counter[0]] = new Parallelogram(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                        counter[0]++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                
                
                
                else if (Objects.equals(tokens[0], "Rectangle") && tokens.length == 3){            //check if it's Rectangle
                    try {
                        shapesArray[counter[0]] = new Rectangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                        counter[0]++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                
                
               
                else if (Objects.equals(tokens[0], "Square") && tokens.length == 2){              //check if it's Square
                    try {
                        shapesArray[counter[0]] = new Square(Double.parseDouble(tokens[1]));
                        counter[0]++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                
                
                
                else if(Objects.equals(tokens[0], "Triangle") && tokens.length == 4){             //check if it's Triangle
                    try {
                        shapesArray[counter[0]] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                                Double.parseDouble(tokens[3]));
                        counter[0]++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                
                
                
                else if(Objects.equals(tokens[0], "Circle") && tokens.length == 2){               //check if it's Circle
                    try {
                        shapesArray[counter[0]] = new Circle(Double.parseDouble(tokens[1]));
                        counter[0]++;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
     public static void printTask1(int[] counter, Shape [] array){
        printTask(1);
        System.out.println("\n" + counter[0] + " shapes were created:");
        for(int i = 0; i < counter[0]; i++){
            System.out.println(array[i] + "\n");
        }
    }
   
    
    /*************************Task 2********************************/
    public static Shape[] printTask2(int [] counter, Shape[] shapesArray){
        printTask(2);
        
        //new array 
        Shape[] copyShapes = new Shape[counter[0]];
        
        double minTriangle = Double.MAX_VALUE;
        double maxCircle = 0;
        
        int count = 0;
        
        
        //Here, the array saves the maximum perimeter for Circle
        for (int i = 0; i < counter[0]; i++) {
            if (shapesArray[i].getClass().getSimpleName().contentEquals("Circle")) {
                if (shapesArray[i].perimeter() > maxCircle) {
                    maxCircle = shapesArray[i].perimeter();
                }
            }
        }
        
        
        //Here, the array saves the minimum perimeter for Triangle
        for (int i = 0; i < counter[0] ; i++){
            if (shapesArray[i].getClass().getSimpleName().contentEquals("Triangle")) {
                if (shapesArray[i].perimeter() < minTriangle) {
                    minTriangle = shapesArray[i].perimeter();
                }
            }
        }
        
        
        //shapes without the max and min perimeter 
        for (int i = 0; i < counter[0] ; i++)
            if (shapesArray[i].getClass().getSimpleName().contentEquals("Triangle")
                    || shapesArray[i].getClass().getSimpleName().contentEquals("Circle")) {
                if (shapesArray[i].perimeter() != minTriangle && shapesArray[i].perimeter() != maxCircle )
                    copyShapes[count++] = shapesArray[i];
            } else {
                copyShapes[count++] = shapesArray[i];
            }

        
        //printing new shapes
        for (int i = 0; i < count ; i++) {
            System.out.println(copyShapes[i] + "\n");
        }

        return copyShapes;
    }
    
    
    /**************************Task 3***************************/
    public static void printTask3(Shape[] shapesArray) {
        
    	//declaration of variables for total perimeter
        double totalTriangle = 0;
        double totalParallelogram = 0;

        for (Shape shape : shapesArray) {
            if (shape != null && shape.getClass().getSimpleName().contentEquals("Triangle")) {
                totalTriangle += shape.perimeter();
            }
            else if (shape != null && shape.getClass().getSimpleName().contentEquals("Parallelogram")) {
                totalParallelogram += shape.perimeter();
            }
        }

        //printing task 3
        printTask(3);
        System.out.println("Total perimeter of Parallelogram is: " + totalParallelogram);
        System.out.println("Total perimeter of Triangle is: " + totalTriangle);
    }
}