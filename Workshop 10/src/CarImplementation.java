/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 10
 * Date: 2021-08-10
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//implementing car interface using CarImplemnetation function
public class CarImplementation extends UnicastRemoteObject implements CarInterface{
	
    //declaration of RemoteException exception
    public CarImplementation() throws RemoteException {
        super();
    }

    //generating the new plate and returns the plate number in a string format
    @Override
    public String carRegistration(Car car) throws RemoteException {
        return " " + car.hashCode();
    }
}
