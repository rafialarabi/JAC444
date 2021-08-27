/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 10
 * Date: 2021-08-10
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

//Car client function
public class CarClient {

	public static void main(String[] args) {
		System.out.println("New Car Registration");

		try {
			Car car = Utilities.getCarInformation();

			System.out.println("\nVehicle information:\n" + car.toString());
			System.out.println("\nRegistering new plate...");

			CarInterface obj = (CarInterface) Naming.lookup("rmi://localhost:1099/RegisterPlate");
			car.setPlate(obj.carRegistration(car));

			System.out.println("Plate " + car.getPlate() + " registered to Car");
			System.out.println(car.toString());

		} catch (MalformedURLException e) {
			System.out.println("MalformedURLException");
			System.out.println(e);
		} catch (RemoteException e) {
			System.out.println("RemoteException");
			System.out.println(e);
		} catch (NotBoundException e) {
			System.out.println("NotBoundException");
			System.out.println(e);
		}
	}
}