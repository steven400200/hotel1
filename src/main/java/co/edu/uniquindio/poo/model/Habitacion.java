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

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }
}

