package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.controller.*;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Factura;
import co.edu.uniquindio.poo.model.FacturaDescuento;
import co.edu.uniquindio.poo.model.FacturaUsual;

public class Main {
    public static void main(String[] args) {
        controllerHotel controller = new controllerHotel();
        controller.inicializarDatos();

        Factura factura = new FacturaDescuento(new Cliente(), 12);
    }
}