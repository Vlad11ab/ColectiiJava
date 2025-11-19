package app;

import app.car.model.Car;
import app.users.model.User;

import java.util.concurrent.atomic.AtomicReference;

public interface RepositoryMapExample {

    void loadData();

    void loadMap();

    public Car getCarByModel(String carModel);

    public AtomicReference<User> searchCarPossesor(Car car);

}
