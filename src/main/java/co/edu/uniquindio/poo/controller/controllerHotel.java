package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.*;

import java.util.Date;

public class controllerHotel {

    public static void inicializarDatos(){
        // cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Yeral");
        cliente1.setId("1004");

        // cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Maria");
        cliente2.setId("1005");

        // cliente 3
        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Pedro");
        cliente3.setId("1006");

        // Crear habitación
        Habitacion habitacion = new Habitacion(101, "doble", 150.0);

        // Crear fechas
        Date fechaEntrada = new Date(System.currentTimeMillis() + 2L * 24 * 60 * 60 * 1000); // Dentro de 2 días
        Date fechaSalida = new Date(System.currentTimeMillis() + 5L * 24 * 60 * 60 * 1000);

        // Crear reserva
        Reserva reserva = new Reserva(habitacion, cliente1, fechaEntrada, fechaSalida);
        cliente1.agregarReserva(reserva);

        // Añadir servicios a la habitación
        Servicio servicioHabitacion = new ServicioHabitacion();
        habitacion.agregarServicio(servicioHabitacion);
        servicioHabitacion.consumir();

        Servicio spa = new Spa();
        habitacion.agregarServicio(spa);
        spa.consumir();
        // Crear y generar factura
        Factura factura = new Factura(cliente1);
        factura.generarFactura();

        // Crear instancia de ReservaChecker
        ReservaChecker reservaChecker = new ReservaChecker();

        // Crear instancia de RecordatorioServicio
        RecordatorioServicio recordatorioServicio = new RecordatorioServicio(reservaChecker);

        // Enviar recordatorios
        recordatorioServicio.enviarRecordatorio(cliente1);

    }


}
