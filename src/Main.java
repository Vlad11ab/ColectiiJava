import app.model.Car;
import app.ListExamples;
import app.service.Service;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car c1 = Car.builder()
                .id(12)
                .culoare("negru")
                .price(6500)
                .build();

        Car c2 = Car.builder()
                        .id(13)
                .model("Passat")
                                .culoare("alb")
                                        .build();

        Car c3 = Car.builder()
                        .id(14)
                .model("Jetta")
                                .build();

//        ListExamples.ex1();
//
//        ListExamples le = new ListExamples();
//
//
//        le.addLast(c1);
//        le.addStart(c2);
//        le.addPos(c3,3);
//        le.removeStart();
//        le.removeLast();
//        le.showList();
//        le.indexOf(c3);
//        le.addStart(c2);
//        le.addLast(c2);
//        le.lastIndexOf(c2);
//        le.remove(c3);

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
        service.remove(c3);








    }
}