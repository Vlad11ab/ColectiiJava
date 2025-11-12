package app.service;

import app.comparators.CarComparatorByPrice;
import app.model.Car;

import java.util.*;

public class Service{

    public List<Car> list = new ArrayList<>();

    public void addLast(Car car){

        ListIterator<Car> it = list.listIterator();

        while(it.hasNext()){
            it.next();
        }
        it.add(car);

    }

    public void addStart(Car car){
        ListIterator<Car> it = list.listIterator();

        it.add(car);

    }

    public void addPos(Car car, int pos){

        if (pos <= 0) {
            addStart(car);
        } else if (pos > list.size()) {
            addLast(car);
        } else {

            ListIterator<Car> it = list.listIterator();

            for (int i = 0; i < pos - 1; i++) {
                it.next();
            }
            it.add(car);

        }
    }

    public void remove(Car car){

        if (list.isEmpty()) {
            System.out.println("Error.Empty list");
            return;
        }

        ListIterator<Car> it = list.listIterator();
        boolean found = false;
        Car currentCar;

        while (it.hasNext()) {
            currentCar = it.next();

            if (currentCar.equals(car)){
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println(car + " not found");
        } else {
            it.remove();
        }

    }

    public void removeStart() {

        if (list.isEmpty()) {
            System.out.println("Error.Empty list");
            return;
        }

        ListIterator<Car> it = list.listIterator();

        it.next();
        it.remove();
    }

    public void removeLast() {

        if (list.isEmpty()) {
            System.out.println("Error.Empty list");
        } else {
            ListIterator<Car> it = list.listIterator();

            while (it.hasNext()) {
                it.next();
            }

            it.previous();
            it.remove();
        }
    }

    public void showList() {

        ListIterator<Car> it = list.listIterator();

        while(it.hasNext()) {
            Car car = it.next();
            System.out.println("Masina: " + car);
        }


    }

    public int indexOf(Car o) {

        ListIterator<Car> it = list.listIterator();
        Car currentCar;
        int index = 0;

        while (it.hasNext()) {
            currentCar = it.next();

            if (currentCar.equals(o)) {
                System.out.println("index: " + index);
                return index;
            }
            index++;
        }

        return -1;
    }

    public int lastIndexOf(Object o) {

        ListIterator<Car> it = list.listIterator();
        Car currentCar;
        int index = 0;
        int lastIndex = 0;


        while (it.hasNext()) {
            currentCar = it.next();

            if (currentCar.equals(o)) {
                lastIndex = index;
            }

            index++;
        }
        System.out.println("lastIndex: " + lastIndex);
        return lastIndex;
    }
}
