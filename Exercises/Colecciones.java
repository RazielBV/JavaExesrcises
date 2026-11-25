package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Colecciones {
    ArrayList<String> cars;
    String[] bikes;
    Set<String> bicicles;
    public HashMap<Integer, String> transport;

    public Colecciones() {
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport = new HashMap<Integer, String>();
    }

    public void inicializar() {
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");

        this.bikes[1] = "Yamaha V-Star 250";
        this.bikes[2] = "Royal Enfield Meteor 350";
        this.bikes[3] = "Kawasaki Eliminator";
        this.bikes[4] = "Honda CMX500A2 SE Rebel.";

        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String> obtenerHash() {
        Set<String> unicos = new LinkedHashSet<>();

        for (String car : cars) {
            if (car != null && !car.trim().isEmpty()) {
                unicos.add(car);
            }
        }
        for (String bike : bikes) {
            if (bike != null && !bike.trim().isEmpty()) {
                unicos.add(bike);
            }
        }
        for (String bicicle : bicicles) {
            if (bicicle != null && !bicicle.trim().isEmpty()) {
                unicos.add(bicicle);
            }
        }

        transport.clear();
        int count = 1;
        for (String item : unicos) {
            transport.put(count++, item);
        }

        return transport;
    }
}