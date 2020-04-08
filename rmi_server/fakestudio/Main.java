package com.fakestudio;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Hashtable;

public class Main {

    // server
    // bind helloImpl to name "aa"
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        HelloImpl h = new HelloImpl();
        Reference aa = new Reference("HelloImpl", "HelloImpl", "http://127.0.0.1:8081");
        ReferenceWrapper refObjWrapper = new ReferenceWrapper(aa);
        registry.bind("aa", h);
    }
}
