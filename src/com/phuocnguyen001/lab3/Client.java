package com.phuocnguyen.lab3;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static void main(String[] args) throws NotBoundException {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[0]);
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9999);
			CalculateImplement calculateImplement = (CalculateImplement) registry.lookup("Server");
			System.out.println("Result: " + calculateImplement.add(a, b));
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
