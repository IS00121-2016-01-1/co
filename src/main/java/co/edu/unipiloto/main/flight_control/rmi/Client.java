/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Client {

    public Client() {
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String host=(args.length<1)? null: args[0];
       
        try {
            Registry registry=LocateRegistry.getRegistry(host);
            Hello stub= (Hello) registry.lookup("Hello");
            String response=stub.sayHello();
            stub.RegistrarUbicacion(host, Double.NaN, Double.NaN, Integer.SIZE);
            System.out.println("Respuesta "+response);
            
        } catch (Exception e) {
            System.err.println("Client exception: "+e.toString());
        }
        
    }
    
}
