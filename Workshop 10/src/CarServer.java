/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 10
 * Date: 2021-08-10
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CarServer {
	public CarServer() {
		try {
			//object implementation
			CarInterface obj = new CarImplementation();

			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("RegisterPlate", obj);

			System.out.println("Car is registerd in the registry");
		} catch (Exception e) {
			System.err.println("errorMessage: " + e);
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		new CarServer();
		System.out.println("CarServer is running");
	}
}
