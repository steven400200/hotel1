package co.edu.uniquindio.poo.model;
import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;
    private final CalculadorCostoReserva calculadorCostoReserva = new CalculadorCostoReserva();


}

