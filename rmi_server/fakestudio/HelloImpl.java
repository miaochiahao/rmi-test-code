package com.fakestudio;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     *
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    protected HelloImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        System.out.println("hi");
        return ("Hello, the date is " + new java.util.Date());
    }
}
