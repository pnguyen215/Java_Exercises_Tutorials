package com.phuocnguyen001.lab3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculateImplement extends UnicastRemoteObject implements CalculateInterface {

	protected CalculateImplement() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public long add(long a, long b) throws RemoteException {
		return a + b;
	}

	@Override
	public long sub(long a, long b) throws RemoteException {
		return a - b;
	}

}
