package co.edu.uniquindio.poo.model;

public abstract class Servicio implements Iconsumible{
    private String nombre;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void consumir();
}

