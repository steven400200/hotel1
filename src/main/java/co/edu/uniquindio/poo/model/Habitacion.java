package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numero;
    private String tipo;  // Puede ser "simple", "doble", "suite"
    private double precio;
    private List<Servicio> servicios;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.servicios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public List<Servicio> getServicios() {
        return servicios;
    }
}

