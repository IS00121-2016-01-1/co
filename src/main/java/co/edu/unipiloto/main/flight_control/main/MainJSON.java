/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.main;

import java.io.File;
import java.io.IOException;
import org.json.*;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Administrador
 */
public class MainJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:/Users/Administrador/Downloads/aeropuertos.json");
        String content = null;
        try {
            content = FileUtils.readFileToString(file, "utf-8");
        } catch (IOException ex) {
            System.out.println(ex.toString());
            //Logger.getLogger(MainJSON.class.getName()).log(Level.SEVERE, null, ex);
        }

        JSONArray jsonarray = new JSONArray(content);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            String name = jsonobject.getString("nombre");
            String city = jsonobject.getString("ciudad");
            int idaeropuerto=jsonobject.getInt("idAeropuerto");
            System.out.println(name+"-"+city+"-"+idaeropuerto);
        }
        
        
        
        
        
        
            // Convert JSON string to JSONObject
 /*           JSONObject tomJsonObject = new JSONObject(content);
            JSONArray aeropuertos = tomJsonObject.getJSONArray("");
            for (int i = 0; i < aeropuertos.length(); i++) {
                String food = (String) aeropuertos.get(i);
                System.out.println(food);
            }

// Or convert the JSONArray to Java List
            List<Object> foods = aeropuertos.toList();
            for (Object food : foods) {
                System.out.println((String) food);
            }

            String nombre = tomJsonObject.getString("nombre");
            System.out.println(nombre);

            URL url = null;
            try {
                url = new URL("file:///C:/Users/Administrador/Downloads/aeropuertos.json");

            } catch (MalformedURLException ex) {
                Logger.getLogger(MainJSON.class.getName()).log(Level.SEVERE, null, ex);
            }
*/
        }

    }
