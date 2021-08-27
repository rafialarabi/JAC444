/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 10
 * Date: 2021-08-10
 */

import java.io.Serializable;

//Car object; implementing serializable for the server
public class Car implements Serializable {

	private String model;
	private String color;
	private int mileage;
	private String plate;

	
	// constructor
	public Car(String model, String color, int mileage) {
		this.model = model;
		this.color = color;
		this.mileage = mileage;
		
		this.plate = "undefined";
	}
	
    
    //getters
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getPlate() {
        return plate;
    }
    
    //setters
    public void setModel(String model) {
        if(!model.isEmpty())
            this.model = model;
    }

    public void setColor(String color) {
        if(!color.isEmpty())
            this.color = color;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            this.mileage = 0;
            System.out.println("Mileage cannot be negative. Mileage adjusted to 0.");
        } else  {
            this.mileage = mileage;
        }
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + "\nColor: " + getColor() + "\nMileage: "
                + Utilities.formation(getMileage()) + " Kilometers" + "\nPlate: " + getPlate();
    }
}
