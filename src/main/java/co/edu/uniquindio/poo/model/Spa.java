package co.edu.uniquindio.poo.model;

public class Spa extends Servicio {

    public Spa() {
        super("Spa");
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Spa consumido.");
    }
}
