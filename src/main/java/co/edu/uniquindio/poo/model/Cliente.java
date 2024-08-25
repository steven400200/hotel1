package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String id;
    private List<Reserva>  reservasActivas  = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Reserva> getReservasActivas() {
    return reservasActivas;
    }

    public void agregarReserva(Reserva reserva) {
        reservasActivas.add(reserva);
    }
}

