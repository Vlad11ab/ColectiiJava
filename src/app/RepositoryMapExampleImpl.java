package app;

import app.car.model.Car;
import app.users.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class RepositoryMapExampleImpl implements RepositoryMapExample {
    private RepositoryMapExample repositoryMapExample;

    public List<Car> cars;
    public List<User> users;
    Map<User, List<Car>> map;

    String carfilepath;
    String userfilepath;

    public RepositoryMapExampleImpl() {
        this.repositoryMapExample = RepositoryMapExampleSingleton.getINSTANCE();

        cars = new ArrayList<>();
        users = new ArrayList<>();
        map = new TreeMap<>();

        carfilepath = "/Users/vlad11ab/Documents/mycode/Recap/ColectiiJava/src/app/data/Cars.txt";
        userfilepath = "/Users/vlad11ab/Documents/mycode/Recap/ColectiiJava/src/app/data/Users.txt";

        this.loadData();
    }

    @Override
    public void loadData() {
        File file1 = new File(carfilepath);

        try (Scanner scanner = new Scanner(file1)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Car car = new Car(line);
                cars.add(car);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file2 = new File(userfilepath);

        try (Scanner scanner = new Scanner(file2)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                User user = new User(line);
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.loadMap();

    }

    @Override

    public void loadMap() {
         this.users.stream().forEach((user)->{
             this.map.put(user,this.getCarByUser(user));
         });
    }

//todo:functie ce prieste ca parametru  un user si returneaza o lista cu toate masinilile lui
    //todo:streams


    public List<Car> getCarByUser(User user) {
        return this.cars.stream().filter(car -> car.getUserId() == user.getId()).collect(Collectors.toList());
    } //stream => se numeste programare functionala


    //Returneaza user dupa id
    public User getUserById(int userId) {

        for (User user: users) {
            if(user.getId() == userId)
                return user;
        }

        return null;
    }


    //Returneaza car dupa carModel
    @Override
    public Car getCarByModel(String carModel) {

        for(Car car: cars) {
            if (car.getModel().equals(carModel)) {
                return car;
            }
        }
        return null;
    }


    //Returneaza posesorul unei masini
    @Override
    public AtomicReference<User> searchCarPossesor(Car car) { //explicatie
         AtomicReference<User> user = null;
        map.entrySet().stream().forEach(entry->{
           Optional<Car>result=  entry.getValue().stream().filter(c->c.equals(car)).findAny();
           if(result.isPresent()){
               user.set(entry.getKey());
           }
        });

        return user;

    }


}

//TODO: Streams - liste simple
