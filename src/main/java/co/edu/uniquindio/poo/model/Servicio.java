package co.edu.uniquindio.poo.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Servicio implements Iconsumible{
    private String nombre;

    public abstract void consumir();
}

