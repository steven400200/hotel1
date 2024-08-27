package co.edu.uniquindio.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Factura {
    private Cliente cliente;

    public void generarFactura() {
        double total = 0;
        System.out.println("Factura para: " + cliente.getNombre());

        for (Reserva reserva : cliente.getReservasActivas()) {
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Reserva en Habitación: " + habitacion.getNumero() +
                    " (" + habitacion.getTipo() + ") - Precio por noche: $" + habitacion.getPrecio());

            // Aquí puedes calcular el costo total de la reserva si es necesario
            //reserva.
            total += reserva.getCalculadorCostoReserva().calcularCosto(reserva);
        }

        System.out.println("Total a pagar: $" + total);
    }



}


