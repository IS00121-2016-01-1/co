/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Administrador
 */
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    void RegistrarUbicacion (String id,Double latitud,Double longitud,Integer altitud) throws RemoteException;
    
}
