package co.edu.uniquindio.poo.model;

public class Factura {
    private Cliente cliente;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    public void generarFactura() {
        double total = 0;
        System.out.println("Factura para: " + cliente.getNombre());

        for (Reserva reserva : cliente.getReservasActivas()) {
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Reserva en Habitación: " + habitacion.getNumero() +
                    " (" + habitacion.getTipo() + ") - Precio por noche: $" + habitacion.getPrecio());

            // Aquí puedes calcular el costo total de la reserva si es necesario
            total += calcularCostoReserva(reserva);
        }

        System.out.println("Total a pagar: $" + total);
    }

    private double calcularCostoReserva(Reserva reserva) {
        // Ejemplo simple para calcular el costo de una reserva. Puedes ajustar según tus necesidades.
        long diffInMillis = reserva.getFechaSalida().getTime() - reserva.getFechaEntrada().getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        return reserva.getHabitacion().getPrecio() * diffInDays;
    }
}


