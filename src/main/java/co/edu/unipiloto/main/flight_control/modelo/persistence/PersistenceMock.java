/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.modelo.persistence;

import co.edu.unipiloto.main.flight_control.modelo.entidades.Aeropuerto;
import co.edu.unipiloto.main.flight_control.modelo.interfaces.IPersistenceMock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Administrador
 */
public class PersistenceMock implements IPersistenceMock {

    private static ArrayList<Aeropuerto> aeropuertos;

    public PersistenceMock() {
        aeropuertos=new ArrayList<>();
        File file = new File("C:/Users/Administrador/Downloads/aeropuertos.json");
        String content = null;
        try {
            content = FileUtils.readFileToString(file, "utf-8");
        } catch (IOException ex) {
            System.out.println(ex.toString());
            //Logger.getLogger(MainJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
        JSONArray jsonarray = new JSONArray(content);
        
        System.out.println("constructor Persistence mock");
        Iterator<Object> iterator=jsonarray.iterator();
        JSONObject jsonobject=null;
        while (iterator.hasNext()){
            jsonobject=(JSONObject) iterator.next();
            aeropuertos.add(new Aeropuerto(jsonobject.getInt("idAeropuerto"),jsonobject.getString("nombre"),jsonobject.getString("ciudad"),jsonobject.getString("pais"),
                    jsonobject.getString("IATAnombre"),jsonobject.getString("ICAO"), jsonobject.getDouble("latitud"),jsonobject.getDouble("longitud"),jsonobject.getInt("altitud"),
                    jsonobject.getInt("zonaHoraria"), jsonobject.getString("DST"), jsonobject.getString("dz")));
        }
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Aeropuerto) {
            Aeropuerto ae = (Aeropuerto) obj;
            aeropuertos.add(ae);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {

        if (obj instanceof Aeropuerto) {
            Aeropuerto ae = new Aeropuerto();
            Aeropuerto aeBusca = (Aeropuerto) obj;
            int i;
            System.out.println("id " + aeBusca.getIdAeropuerto());
            for (i = 0; i < aeropuertos.size(); i++) {
                ae = aeropuertos.get(i);
                System.out.println(i + "-" + ae.getIdAeropuerto());
                if (ae.getIdAeropuerto() == aeBusca.getIdAeropuerto()) {
                    aeropuertos.set(i, aeBusca);
                    break;
                }
            }
            System.out.println("Objeto no encontrado");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Aeropuerto) {
            Aeropuerto ae = new Aeropuerto();
            Aeropuerto aeBusca = (Aeropuerto) obj;
            int i;
            for (i = 0; i < aeropuertos.size(); i++) {
                ae = aeropuertos.get(i);
                if (ae.getIdAeropuerto() == aeBusca.getIdAeropuerto()) {
                    aeropuertos.remove(ae);
                    break;
                }
            }
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findAll(Class c) {
        if (c.equals(Aeropuerto.class)) {
            return aeropuertos;
        }
        return null;

    }

}
