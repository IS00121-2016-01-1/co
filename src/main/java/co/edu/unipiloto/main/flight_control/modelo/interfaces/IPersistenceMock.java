/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.modelo.interfaces;

/**
 *
 * @author Administrador
 */
public interface IPersistenceMock {
    
    public void create(java.lang.Object obj);
    
    public void update (java.lang.Object obj);
    
    public void delete(java.lang.Object obj);
    
    public java.util.List findAll(java.lang.Class c);
    
    
}
