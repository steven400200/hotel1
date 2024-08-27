package co.edu.uniquindio.poo.model;
import lombok.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Habitacion {
    private int numero;
    private String tipo;  // Puede ser "simple", "doble", "suite"
    private double precio;
    private List<Servicio> servicios = new ArrayList<>();

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void agregarServicio(Servicio servicio) {
                servicios.add(servicio);

    }
}

