package app;

import app.model.Car;
import app.model.User;
import app.service.Service;

import java.sql.SQLOutput;
import java.util.*;

public class MapExamples {

    Map<String, Car> map= new TreeMap<>();

    Map<User,List<Car>> mapForUsersAndCars = new TreeMap<>();

    public void exempluAdaugareSiParcurgere(){

         map.put("Alex", Car.builder().id(200).anFabricatie(1993).price(3500).build());
         System.out.println(map.get("Alex"));

         Car c203 = Car.builder()
                 .id(203)
                 .model("Skoda")
                         .anFabricatie(2015)
                                 .price(10500)
                                         .build();


         map.put("Andrei", Car.builder().id(201).anFabricatie(1998).price(10000).build());
         map.put("Vali", Car.builder().id(202).anFabricatie(2000).price(5000).build());
         map.put("Dragos", c203);
         map.put("Edi", Car.builder().id(204).anFabricatie(2010).price(1000).build());
         System.out.println(map.get("Edi"));

         map.remove("Vali");
         System.out.println(map.get("Vali"));

        System.out.println(map.containsKey("Dragos"));
        System.out.println(map.containsValue(c203));

        System.out.println(map.isEmpty());

        System.out.println("Size inainte de clear: " + map.size());
        System.out.println("--------");

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Key-Value: " + map.entrySet());

//        map.clear();
//        System.out.println("--------");
//        System.out.println("Size dupa clear: " + map.size());

    }

    public void showKeys() {
        System.out.println("Keys:");

        if (map.isEmpty()) {
            System.out.println("Error.Emtpy list");
            return;
        }

        Iterator<String> it = map.keySet().iterator();
        String currentCarPossesor;

        while (it.hasNext()) {
            currentCarPossesor = it.next();
            System.out.println(currentCarPossesor);
        }

    }

    public void showValues() {
        System.out.println("Values: ");

        if (map.isEmpty()) {
            System.out.println("Error.Empty list");
            return;
        }

        Iterator<Car> it = map.values().iterator();
        Car currentCar;

        while (it.hasNext()) {
            currentCar = it.next();
            System.out.println(currentCar);
        }
    }

    public void showEntries() {
        System.out.println("Entries: ");

        if (map.isEmpty()) {
            System.out.println("Error.Empty list");
            return;
        }


        Iterator< Map.Entry<String,Car> > it = map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String,Car> pair = it.next();


            System.out.println("[" + pair.getKey() + "," + pair.getValue() + "]");
        }

    }








}
