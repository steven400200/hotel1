package co.edu.uniquindio.poo.model;

import java.util.List;

public class RecordatorioServicio {

    private ReservaChecker reservaChecker;

    public RecordatorioServicio(ReservaChecker reservaChecker) {
        this.reservaChecker = reservaChecker;
    }

    public void enviarRecordatorio(Cliente cliente) {
        List<Reserva> reservasActivas = cliente.getReservasActivas();
        for (Reserva reserva : reservasActivas) {
            if (reservaChecker.esDentroDeTresDias(reserva)) {
                System.out.println("Recordatorio para " + cliente.getNombre() + ": " +
                        "Tienes una reserva en la habitación " +
                        reserva.getHabitacion().getNumero() +
                        " desde el " + reserva.getFechaEntrada() +
                        " hasta el " + reserva.getFechaSalida());
            }
        }
    }
}

