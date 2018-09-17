/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.main;

import co.edu.unipiloto.main.flight_control.modelo.entidades.Aeropuerto;
import co.edu.unipiloto.main.flight_control.modelo.interfaces.IPersistenceMock;
import co.edu.unipiloto.main.flight_control.modelo.persistence.PersistenceMock;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        PersistenceMock persistenceMock = new PersistenceMock();
        ArrayList<Aeropuerto> aerops = new ArrayList<>();
        Aeropuerto aerop = new Aeropuerto(2705, "El Eden", "Armenia", "Colombia", "AXM", "SKAR", 4.452775, -75.766447, 3990, -5, "U", "America/Bogota");
        persistenceMock.create(aerop);
        aerops = (ArrayList<Aeropuerto>) persistenceMock.findAll(Aeropuerto.class);
        for (int i = 0; i < aerops.size(); i++) {
            System.out.println(aerops.get(i).getIdAeropuerto() + " " + aerops.get(i).getCiudad());
        }
        System.out.println("-------------------MODIFICACION----------------");
        aerop = new Aeropuerto(2705, "Aeropuerto Nacional El Eden", "Armenia", "Colombia", "AXM", "SKAR", 4.452775, -75.766447, 3990, -5, "U", "America/Bogota");
        persistenceMock.update(aerop);
        aerops = (ArrayList<Aeropuerto>) persistenceMock.findAll(Aeropuerto.class);
        for (int i = 0; i < aerops.size(); i++) {
            System.out.println(aerops.get(i).getIdAeropuerto() + " " + aerops.get(i).getCiudad());
        }
        System.out.println("-------------------ELIMINACION----------------");
        aerop = new Aeropuerto(2);
        persistenceMock.delete(aerop);
        aerops = (ArrayList<Aeropuerto>) persistenceMock.findAll(Aeropuerto.class);
        for (int i = 0; i < aerops.size(); i++) {
            System.out.println(aerops.get(i).getIdAeropuerto() + " " + aerops.get(i).getCiudad());
        }

    }

}
