/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 3
 * Date: 2021-06-16
 */


package shapes;
import static shapes.Utilities.*;

public class Circle implements Shape {
	
    private double r;   //radius is required as of instruction

    //Constructor 
    public Circle(double r) throws Exception {
        if (r > 0) {
            this.r = r;
        }else { 
        	throw new Exception("Invalid radius!");
        }
    }

    
    //getters
    public double getR() {
        return r;
    }

    
    //setters
    public void setR(double r) throws Exception {
        if (r > 0) {
            this.r = r;
        }else { throw new Exception("Invalid radius!");
      }
    }
    
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{r=" + getR() + "} perimeter = " + format(perimeter());
    }
}
