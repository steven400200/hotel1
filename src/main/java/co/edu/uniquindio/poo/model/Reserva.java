package co.edu.uniquindio.poo.model;
import java.util.Date;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;

    public Reserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }
}

