/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 2
 * Date: 2021-06-09
 */


package shapes;

import static shapes.Utilities.*;

public class Square extends Rectangle {

    
    public Square(double w) throws Exception {
        super(w,w);             //as all the square sides are same
    }

    @Override
    public void setH(double h) throws Exception {
        if (h > 0){
            this.h = h;
            this.w = h;
        }
        else {
            throw new Exception("Invalid side!");
        }
    }

    @Override
    public void setW(double h) throws Exception {
        if (h > 0){
            this.h = h;
            this.w = h;
        }
        else {
            throw new Exception("Invalid side!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{s=" + getW() + "} perimeter = " + format(perimeter());
    }
}
