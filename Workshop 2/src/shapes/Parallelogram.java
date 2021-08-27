/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 2
 * Date: 2021-06-09
 */

package shapes;

import static shapes.Utilities.*;

public class Parallelogram implements Shape {
    //to measure the Parallelogram's sides
    public double w;
    public double h;

    
    //constructor
    public Parallelogram(double w, double h) throws Exception {
        if (h > 0 && w > 0){
            this.h = h;
            this.w = w;
        } else {
            throw new Exception("Invalid side!");
        }
    }
    
    
    //getters
    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }
    

    //setters
    public void setH(double h) throws Exception{
        if (h > 0) {
            this.h = h;
    }else {
            throw new Exception("Invalid side!");
        }
    }

    
    public void setW(double w) throws Exception{
        if (w > 0) {
            this.w = h;
        }else {
            throw new Exception("Invalid side!");
        }
    }

   
    @Override
    public double perimeter() {
        return (h * 2 + w * 2);  //calculating the perimeter
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{w=" + getW() + ", h=" + getH() + "} perimeter = " + format(perimeter());
    }
}
