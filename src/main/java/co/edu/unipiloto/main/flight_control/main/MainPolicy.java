/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.main;

import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Policy;

/**
 *
 * @author Administrador
 */
public class MainPolicy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodeSource cs = null;
        PermissionCollection pcoll = Policy.getPolicy().getPermissions(cs);
        System.out.println(pcoll);
    }
    
}
