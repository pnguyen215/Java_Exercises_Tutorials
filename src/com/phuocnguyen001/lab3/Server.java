package com.phuocnguyen.lab3;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server extends CalculateImplement {

	protected Server() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		try {
			Registry registry = LocateRegistry.createRegistry(9999);
			CalculateImplement calculateImplement = new CalculateImplement();
			registry.bind("Server", calculateImplement);
			System.out.println("Server is ready!");
		} catch (RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}

	}

}
