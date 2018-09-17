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

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class MainMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String database_url = "jdbc:mongo://localhost:27017/torrecontrol";
        String username = "";
        String password = "";
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("RegistroVuelos");
        System.out.println(database.getName());
        System.out.println(database.toString());
        
 //       DBCollection collection = database.getCollection("TheCollectionName");
    
        
        
 /*       collection.insert(person);
        try {
            Class.forName("mongodb.jdbc.MongoDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: No ha sido posible cargar el driver JDBC");
            ex.printStackTrace();
            return;
        }
        System.out.println("Driver cargado");
        try {
            connection = DriverManager.getConnection(database_url, username, password);
        } catch (SQLException ex) {
            System.out.println("Error: No ha sido posible realizar la conexion");
            ex.printStackTrace();
            return;
        }

        if (connection != null) {
            DatabaseMetaData metadata = connection.getMetaData();
            System.out.println("JDBC Driver " + metadata.getDriverName());
            System.out.println("JDBC Driver Version " + metadata.getDriverVersion());
        } else {
            System.out.println("Se perdió la conexion");
        }

        if (connection != null) {
            connection.close();
        }
         */
    }

}
