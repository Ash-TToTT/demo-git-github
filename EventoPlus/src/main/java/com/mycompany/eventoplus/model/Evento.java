package com.mycompany.eventoplus.model;

import java.util.Date;

public class Evento {
    private String nombre;
    private Date fecha;
    private String lugar;
    private String descripcion;
    private String hora;
    private String id;

    public Evento() {
    }
    

    public Evento(String nombre, Date fecha, String lugar, String descripcion, String hora, String id) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.hora = hora;
        this.id = id;
        
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", descripcion=" + descripcion + ", hora=" + hora + ", id=" + id + '}';
    }
    
    
}
