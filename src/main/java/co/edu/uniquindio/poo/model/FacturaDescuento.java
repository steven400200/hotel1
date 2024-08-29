package co.edu.uniquindio.poo.model;

public class FacturaDescuento extends Factura implements IFacturacion, IFacturacionDescuento{
    public FacturaDescuento(Cliente cliente) {
        super(cliente);
    }
    public void generarFactura() {
        System.out.println("Factura para: " + cliente.getNombre());
        for (Reserva reserva : cliente.getReservasActivas()) {
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Reserva en Habitación: " + habitacion.getNumero() +
                    " (" + habitacion.getTipo() + ") - Precio por noche: $" + habitacion.getPrecio());
        }
        System.out.println("Total a pagar sin descuento: $" + calcularCostoReserva());
        System.out.println("Total a pagar con descuento aplicado: $" + (calcularCostoReserva()*calcularDescuento(10))); // Ejemplo con un 10% de descuento
    }
    public double calcularCostoReserva() {
        double total = 0;
        for (Reserva reserva : cliente.getReservasActivas()) {
            total += reserva.getCalculadorCostoReserva().calcularCosto(reserva);
        }
        return total;
    }
    //El descuento se utiliza del 1 al 100
    public double calcularDescuento(double descuento) {
        if (descuento>0 && descuento<100) return descuento*00.1;
        else throw new IllegalArgumentException("El descuento debe estar entre 0 y 100. ");
    }
}
