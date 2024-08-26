package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
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

        // Crear habitaciones
        Habitacion habitacion1 = new Habitacion(101, "Doble", 150.0);
        Habitacion habitacion2 = new Habitacion(102, "Suite", 250.0);
        // Crear fechas
        Date fechaEntrada = new Date(System.currentTimeMillis() + 2L * 24 * 60 * 60 * 1000); // Dentro de 2 días
        Date fechaSalida = new Date(System.currentTimeMillis() + 5L * 24 * 60 * 60 * 1000);

        // Crear reserva
        Reserva reserva = new Reserva(habitacion1, cliente1, fechaEntrada, fechaSalida);
        cliente1.agregarReserva(reserva);

         //Añadir servicios a la habitación
        Servicio servicioHabitacion = new ServicioHabitacion();
        habitacion1.agregarServicio(servicioHabitacion);
        servicioHabitacion.consumir();

        Servicio spa = new Spa();
        habitacion1.agregarServicio(spa);
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

        //ultimo ejercicio


        // Crear reservas
        Calendar cal = Calendar.getInstance();

        cal.set(2024, Calendar.AUGUST, 1); // 1 de agosto de 2024
        Date fechaEntrada1 = cal.getTime();
        cal.set(2024, Calendar.AUGUST, 5); // 5 de agosto de 2024
        Date fechaSalida1 = cal.getTime();

        cal.set(2024, Calendar.AUGUST, 10); // 10 de agosto de 2024
        Date fechaEntrada2 = cal.getTime();
        cal.set(2024, Calendar.AUGUST, 15); // 15 de agosto de 2024
        Date fechaSalida2 = cal.getTime();

        Reserva reserva1 = new Reserva(habitacion1, cliente1, fechaEntrada1, fechaSalida1);
        Reserva reserva2 = new Reserva(habitacion2, cliente2, fechaEntrada2, fechaSalida2);

        // Agregar reservas a la lista
        List<Reserva> reservas = new ArrayList<>();
        reservas.add(reserva1);
        reservas.add(reserva2);

        // Crear reporte de ingresos y mostrarlo
        ReporteIngresos reporte = new ReporteIngresos();
        reporte.mostrarReporteIngresos(reservas, Calendar.AUGUST, 2024);

    }


}
