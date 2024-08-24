package Exercises;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Colecciones {

    ArrayList<String> cars;
    String[] bikes;
    Set<String> bicicles;
    HashMap<Integer, String> transport;

    public Colecciones() {
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport = new HashMap<Integer, String>();
    }

    public void inicializar() {
        // carros
        cars.add("VW Vento");
        cars.add("Nissan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");

        // motos
        this.bikes[1] = "Yamaha V-Star 250";
        this.bikes[2] = "Royal Enfield Meteor 350";
        this.bikes[3] = "Kawasaki Eliminator";
        this.bikes[4] = "Honda CMX500A2 SE Rebel.";

        // bicicletas
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String> obtenerHash() {
        Set<String> uniqueTransport = new HashSet<>();

        // Agregar elementos de cars
        for (String car : cars) {
            if (car != null && !car.isEmpty()) {
                uniqueTransport.add(car);
            }
        }

        // Agregar elementos de bikes
        for (String bike : bikes) {
            if (bike != null && !bike.isEmpty()) {
                uniqueTransport.add(bike);
            }
        }

        // Agregar elementos de bicicles
        for (String bike : bicicles) {
            if (bike != null && !bike.isEmpty()) {
                uniqueTransport.add(bike);
            }
        }

        // Crear el HashMap con llave incremental
        int count = 1;
        for (String transportItem : uniqueTransport) {
            transport.put(count++, transportItem);
        }

        return transport;
    }
}
