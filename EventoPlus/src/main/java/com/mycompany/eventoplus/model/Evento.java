package com.mycompany.eventoplus.model;

import java.util.Date;

public class Evento {
    private String nombre;
    private Date fecha;
    private String lugar;

    public Evento() {
    }
    

    public Evento(String nombre, Date fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + '}';
    }
    
    
}
