package co.edu.uniquindio.poo.model;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    private String nombre;
    private String id;
    private List<Reserva>  reservasActivas  = new ArrayList<>();




    public void agregarReserva(Reserva reserva) {
        reservasActivas.add(reserva);
    }

    public FacturaUsual generarFacturaUsual() {
        FacturaUsual facturaUsual = new FacturaUsual(this);
        facturaUsual.generarFactura();
        return facturaUsual;
    }

    public FacturaDescuento generarFacturaDescuento(double descuento) {
        FacturaDescuento facturaDescuento = new FacturaDescuento(this, descuento );
        facturaDescuento.generarFactura();
        return facturaDescuento;
    }
}

