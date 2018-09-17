/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.main.flight_control.modelo.entidades;

/**
 *
 * @author Administrador
 */
public class Aeropuerto {
    private int idAeropuerto;
    private String nombre;
    private String ciudad;
    private String pais;
    private String IATAnombre;
    private String ICAO;
    private double latitud;
    private double longitud;
    private int altitud;
    private int zonaHoraria;
    private String DST;
    private String dz;

    public Aeropuerto() {
    }

    public Aeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    
    public Aeropuerto(int idAeropuerto, String nombre, String ciudad, String pais, String IATAnombre, String ICAO, double latitud, double longitud, int altitud, int zonaHoraria, String DST, String dz) {
        this.idAeropuerto = idAeropuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.IATAnombre = IATAnombre;
        this.ICAO = ICAO;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
        this.zonaHoraria = zonaHoraria;
        this.DST = DST;
        this.dz = dz;
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIATAnombre() {
        return IATAnombre;
    }

    public void setIATAnombre(String IATAnombre) {
        this.IATAnombre = IATAnombre;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public int getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(int zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public String getDST() {
        return DST;
    }

    public void setDST(String DST) {
        this.DST = DST;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }
    

    

   

    
}
