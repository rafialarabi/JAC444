/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 2
 * Date: 2021-06-09
 */

package shapes;

import java.text.DecimalFormat;

public class Utilities {

    public static void printHeader(int i){
        System.out.print("------->JAC 444 Assignment 2 <-------\n");
        System.out.printf("------->Task 1 ...<-------\n", i);
    }

    public static String format(double d){
        DecimalFormat df = new DecimalFormat("0.00000");
        return df.format(d);
    }
}
