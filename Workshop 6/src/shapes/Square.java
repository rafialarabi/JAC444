/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 6
 * Date: 2021-07-13
 */


package shapes;

import static shapes.Utilities.*;

public class Square extends Rectangle {
    public Square(double w) throws ParallelogramExcept {
        super(w,w);             //as all the square sides are same
    }

    @Override
    public void setH(double h) throws ParallelogramExcept {
        if (h > 0){
            this.h = h;
            this.w = h;
        }
        else {
            throw new ParallelogramExcept("Invalid side!");
        }
    }

    @Override
    public void setW(double h) throws ParallelogramExcept {
        if (h > 0){
            this.h = h;
            this.w = h;
        }
        else {
            throw new ParallelogramExcept("Invalid side!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{s=" + getW() + "} perimeter = " + format(perimeter())  + " area= " + format(obj.getArea());
    }
}
