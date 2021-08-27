/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 6
 * Date: 2021-07-13
 */


package shapes;

import static shapes.Utilities.*;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    //constructor
    public Triangle(double a, double b, double c) throws TriangleExcept {
        if (isValid(a,b,c)){
            this.a = a;
            this.b = b;
            this.c = c;
        } else  {
            throw new TriangleExcept("Invalid side(s)!");
        }
    }

    
    //function to check for triangle's validity
    public static boolean isValid(double a, double b, double c){
        return !(a + b <= c) && !(a + c <= b) && !(b + c <= a);
    }

    
    //getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    
    //setters
    public void setA(double a) throws TriangleExcept {
        if (isValid(a,b,c)) {
            this.a = a;
        }else {
            throw new TriangleExcept("Invalid side(s)!");
        }
    }

        
    public void setB(double b) throws TriangleExcept {
        if (isValid(a,b,c)) {
            this.b = b;
        }else {
            throw new TriangleExcept("Invalid side(s)!");
        }
    }

        
    public void setC(double c) throws TriangleExcept {
        if (isValid(a,b,c)) {
            this.c = a;
        }else {
            throw new TriangleExcept("Invalid side(s)!");
        }
    }
        

    @Override
    public double perimeter() {
        return getA() + getB() + getC();
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{s1=" + getA() + ", s2=" + getB() + ", s3=" + getC() +
                "} perimeter = " + format(perimeter());
    }
}