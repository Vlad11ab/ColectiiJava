import app.MapExamples;
import app.RepositoryMapExample;
import app.RepositoryMapExampleImpl;
import app.car.model.Car;
import app.ListExamples;
//import app.car.service.CarCommandService;
//import app.car.service.CarCommandServiceImpl;
//import app.car.service.CarQueryService;
//import app.car.service.CarQueryServiceImpl;
import app.service.*;
import app.users.model.User;
import app.view.ViewLogin;
//import app.users.service.UserQueryService;
//import app.users.service.UserQueryServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car c1 = Car.builder()
                .id(12)
                .anFabricatie(1905)
                .model("Turan")
                .culoare("negru")
                .price(9500)
                .build();

        Car c2 = Car.builder()
                        .id(13)
                .anFabricatie(1990)
                .price(16000)
                .model("Passat")
                                .culoare("alb")
                                        .build();

        Car c3 = Car.builder()
                        .id(14)
                .price(1200)
                .anFabricatie(2000)
                .model("Jetta")
                                .build();

        Car c100 = Car.builder().id(100).model("Beetle").culoare("rosu").price(10000).anFabricatie(2010).build();

        ListExamples.ex1();

        ListExamples le = new ListExamples();


        le.addLast(c1);
        le.addStart(c2);
        le.addPos(c3,3);
        le.removeStart();
        le.removeLast();
        le.showList();
        le.indexOf(c3);
        le.addStart(c2);
        le.addLast(c2);
        le.lastIndexOf(c2);
        le.remove(c3);

        System.out.println("Created Service");
//        Service service = new Service();
//
//        service.addLast(c1);
//        service.addStart(c2);
//        service.addPos(c3,3);
//        service.removeStart();
//        service.removeLast();
//        service.showList();
//        service.indexOf(c3);
//        service.addStart(c2);
//        service.addLast(c2);
//        service.lastIndexOf(c2);
//        service.addLast(c2);
//        service.addLast(c1);
//        service.indexOf(c1);
//        service.lastIndexOf(c1);
//        service.remove(c3);

        System.out.println("Created ServiceCollections");
        ServiceCollections sc = new ServiceCollections();

        sc.collectionsList.add(c1);
        sc.collectionsList.add(c2);
        sc.collectionsList.add(c3);
        sc.collectionsList.add(c100);
        sc.min();
        System.out.println("bs:");
        sc.binarySearch();
        sc.reverse();
        sc.shuffle();
        sc.swap();
        sc.rotate();
        sc.singleton();


        System.out.println("TreeMapExample");
        MapExamples me = new MapExamples();
        me.exempluAdaugareSiParcurgere();
        me.showKeys();
        me.showValues();
        me.showEntries();

        System.out.println("=================================");



        RepositoryMapExample repo = new RepositoryMapExampleImpl();
        User user = User.builder().id(1003)
                        .age(30)
                .firstName("Matei")
                        .lastName("Chiru")
                                .username("Matei")
                                        .password("MateiParola").build();

 //        System.out.println(repo.getCarByUser(repo.getUserById(1000))); //testing














    }
}