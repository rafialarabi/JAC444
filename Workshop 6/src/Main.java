/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 6
 * Date: 2021-07-13
 */

import shapes.*;

import static shapes.Utilities.*;

public class Main{
	
    public static void main(String[] args) throws Exception {

        //to hold the constructed shapes
        Shape[] shapesArray = new Shape[100];
        int [] counter = { 0 };

        printHeader();	
        
        //as per instruction
        readShapes(counter, shapesArray, "shapes.txt");
      
        
        //to run Task1
        printTask1(counter, shapesArray);
        
        //to run Task2
        Shape[] outputShape = printTask2(counter, shapesArray);
        
        //to run Task3
        printTask3(outputShape);
    }
}