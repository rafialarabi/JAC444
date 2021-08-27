/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 6
 * Date: 2021-07-13
 */
package shapes;

import java.text.DecimalFormat;
import static shapes.Utilities.format;

public class Rectangle extends Parallelogram{
	
	double w;
    double l;
    
    //lambda Expression
    ShapeArea obj = () ->  w * l ;

	//the constructor expects two values for the rectangle's width and height, else it will throw an exception.
    public Rectangle(double w, double h) throws ParallelogramExcept {
        
        super(w,h);
        
        this.w = super.w;
        this.l = super.h;
    }
    
    public double getObjMethod() {
        return obj.getArea();
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{s=" + getW() + "} perimeter = " + format(perimeter())
                + " area= " + format(obj.getArea());
    }
}
