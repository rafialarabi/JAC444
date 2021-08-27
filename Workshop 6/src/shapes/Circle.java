/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 6
 * Date: 2021-07-13
 */


package shapes;
import static shapes.Utilities.*;

public class Circle implements Shape {
	
    private double r;   //radius is required as of instruction

    //lambda function implementation
    ShapeArea obj = () ->  Math.PI * r * r;
    
    //Constructor 
    public Circle(double r) throws CircleExcept {
        if (r > 0) {
            this.r = r;
        }else { 
        	throw new CircleExcept("Invalid radius!");
        }
    }

    
    //getters
    public double getR() {
        return r;
    }

    
    public double getObjMethod() {
        return obj.getArea();
    }
    
    //setters
    public void setR(double r) throws CircleExcept {
        if (r > 0) {
            this.r = r;
        }else { 
        	throw new CircleExcept("Invalid radius!");
        }
    }
    
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{r=" + getR() + "} perimeter = " + format(perimeter()) + " area= " + format(obj.getArea());
    }
}
