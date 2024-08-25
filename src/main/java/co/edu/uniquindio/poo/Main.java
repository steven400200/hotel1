package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.controller.*;

public class Main {
    public static void main(String[] args) {
        controllerHotel controller = new controllerHotel();
        controller.inicializarDatos();
        System.out.println("Hello world!");
    }
}