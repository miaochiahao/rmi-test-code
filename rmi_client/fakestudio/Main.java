package com.fakestudio;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) throws NamingException, RemoteException {
        // client
        // lookup for Hello Class and invoke remote method
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put(Context.PROVIDER_URL, "rmi://127.0.0.1:1099");
        System.getProperties().setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.getProperties().setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        String uri = "rmi://127.0.0.1:1099/aa";
        Context ctx = new InitialContext(env);
        Hello obj = (Hello) ctx.lookup(uri);
        System.out.println(obj.sayHello());

    }
}

