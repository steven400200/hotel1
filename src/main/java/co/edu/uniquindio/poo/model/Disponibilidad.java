package co.edu.uniquindio.poo.model;

import java.util.Date;

public interface Disponibilidad {
    boolean estaDisponible(Date fechaEntrada, Date fechaSalida);
}

