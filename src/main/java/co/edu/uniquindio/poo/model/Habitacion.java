package co.edu.uniquindio.poo.model;
import lombok.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Habitacion {
    private int numero;
    private String tipo;  // Puede ser "simple", "doble", "suite"
    private double precio;
    private List<Servicio> servicios;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void agregarServicio(Servicio servicio) {

        if (servicio == null){
            servicios.add( servicio);
        }

    }
}

