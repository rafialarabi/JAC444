/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 10
 * Date: 2021-08-10
 */

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Utilities {
	
    static public String formation(int value ) {
        return NumberFormat.getNumberInstance(Locale.US).format(value);
    }

    static public Car getCarInformation(){

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the car model: ");
        String model = in.nextLine();
        while (model.isEmpty()){
            System.out.print("You must enter a value: ");
            model = in.nextLine();
        }

        System.out.print("Please enter the car color: ");
        String color = in.nextLine();
        while (color.isEmpty()){
            System.out.print("You must enter a value: ");
            color = in.nextLine();
        }

        int mileage = 0;
        
        while(true) {
            try {
                System.out.print("Please enter the car mileage: ");
                Scanner input = new Scanner(System.in);
                mileage = input.nextInt();
                while (mileage < 0 ) {
                    System.out.print("You must enter a value:  ");
                    mileage = input.nextInt();
                }
                break;
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid Number! Please try again");
            }
        }

        in.close();
        return new Car(model, color, mileage);
    }
}
