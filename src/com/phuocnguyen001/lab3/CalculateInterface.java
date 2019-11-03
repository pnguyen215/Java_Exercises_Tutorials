package com.phuocnguyen001.lab3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculateInterface extends Remote {

	public long add(long a, long b) throws RemoteException;

	public long sub(long a, long b) throws RemoteException;
}
