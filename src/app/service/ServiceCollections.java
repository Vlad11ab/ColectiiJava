package app.service;

import app.comparators.CarComparatorByPrice;
import app.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceCollections {

    public List<Car> collectionsList = new ArrayList<>();

    public void binarySearch() {

        Collections.sort(collectionsList);
        System.out.println(Collections.binarySearch(collectionsList, new Car(100, "Beetle", "rosu",2000,10000)));
    }

    public void reverse() {
        Collections.reverse(collectionsList);
    }

    public void shuffle() {}

    public void min() {

        System.out.println("Min: " + Collections.min(this.collectionsList, new CarComparatorByPrice()));
        System.out.print("Min: " + Collections.min(this.collectionsList));

    }


}
