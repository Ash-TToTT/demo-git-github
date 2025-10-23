package com.mycompany.eventoplus.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private String descripcion;
    private LocalTime hora;
    private int id;
    private int capacidadMaxima;

    public Evento() {
    }

    public Evento(String nombre, LocalDate fecha, String lugar, String descripcion, LocalTime hora, int id, int capacidadMaxima) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.hora = hora;
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", descripcion=" + descripcion + ", hora=" + hora + ", id=" + id + ", capacidadMaxima=" + capacidadMaxima + '}';
    }
    
    
}
