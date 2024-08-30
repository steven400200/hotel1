package co.edu.uniquindio.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RecordatorioReserva {

    private ReservaChecker reservaChecker;


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

