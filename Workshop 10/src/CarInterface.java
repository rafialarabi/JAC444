/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 10
 * Date: 2021-08-10
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarInterface extends Remote {
	public String carRegistration(Car car) throws RemoteException;
}
