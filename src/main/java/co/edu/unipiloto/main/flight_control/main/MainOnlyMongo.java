/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.main;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.sun.corba.se.impl.orbutil.ORBConstants;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import sun.rmi.server.UnicastRef;

/**
 *
 * @author Administrador
 */
public class MainOnlyMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase db = mongoClient.getDatabase("RegistroVuelos");

        System.out.println(db.getName());
        System.out.println(db.toString());

        List<Document> datosNuevos = new ArrayList<Document>();
        datosNuevos.add(new Document("Aerolinea", "Avianca")
                .append("Origen", "Bogota")
                .append("Destino", "Miami")
                .append("Ocupacion", 10)
        );

        datosNuevos.add(new Document("Aerolinea", "LATAM")
                .append("Origen", "Barranquilla")
                .append("Destino", "Medellin")
                .append("Ocupacion", 4)
        );
        datosNuevos.add(new Document("Aerolinea", "Avianca")
                .append("Origen", "Cali")
                .append("Destino", "Cartagena")
                .append("Ocupacion", 7)
        );

        MongoCollection<Document> vuelos = db.getCollection("vuelos");
        vuelos.insertMany(datosNuevos);

//        Document updateQuery = new Document("Aerolinea", "LATAM");
//        vuelos.updateOne(updateQuery, new Document("$set", new Document("origen", "Popayan")));

        Document findQuery = new Document("Ocupacion", new Document("$gte", 1));
        Document ordenarPor = new Document("Origen", 1);

        MongoCursor<Document> cursor = vuelos.find(findQuery).sort(ordenarPor).iterator();
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                System.out.println(
                        "Vuelo de " + doc.get("Origen") + " hasta " + doc.get("Destino")
                        + " Aerolinea " + doc.get("Aerolinea")+
                                " Ocupacion "+doc.get("Ocupacion"));
            }
        } finally {
            cursor.close();
        }
        vuelos.drop();
        mongoClient.close();
    }

}
