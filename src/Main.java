import app.model.Car;
import app.ListExamples;
import app.service.Service;
import app.service.ServiceCollections;

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

        Car c100 = new Car(100, "Beetle", "rosu",2010,10000);

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
        Service service = new Service();

        service.addLast(c1);
        service.addStart(c2);
        service.addPos(c3,3);
        service.removeStart();
        service.removeLast();
        service.showList();
        service.indexOf(c3);
        service.addStart(c2);
        service.addLast(c2);
        service.lastIndexOf(c2);
        service.addLast(c2);
        service.addLast(c1);
        service.indexOf(c1);
        service.lastIndexOf(c1);
        service.remove(c3);

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









    }
}