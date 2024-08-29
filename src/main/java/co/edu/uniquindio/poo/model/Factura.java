package co.edu.uniquindio.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Factura {
    protected Cliente cliente;

    public abstract void generarFactura();



}


