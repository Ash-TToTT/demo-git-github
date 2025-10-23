package com.mycompany.eventoplus.service;

import com.mycompany.eventoplus.model.Evento;
import java.util.ArrayList;
import java.util.List;

public class EventoService {
    private final List<Evento> eventos;
    
public EventoService(){
    eventos = new ArrayList<>();
}
   
public boolean registrarEvento(Evento evento) {
        if (existeEvento(evento)) {
            System.out.println("Evento duplicado. No se registró.");
            return false;
        }
        eventos.add(evento);
        System.out.println("Evento registrado.");
        return true;
    }

    private boolean existeEvento(Evento evento) {
        for (Evento eventoExistente : eventos) {
            if (eventoExistente.getNombre().equalsIgnoreCase(evento.getNombre())) {
                return true;
            }
        }
        return false;
    }
}
