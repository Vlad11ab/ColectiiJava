package app.view;

import app.RepositoryMapExample;
import app.RepositoryMapExampleSingleton;
import app.car.model.Car;
import app.service.*;

import java.util.Scanner;

public class ViewCustomer {

    private CommandService commandService;
    private QueryService queryService;
    private RepositoryMapExample repositoryMapExample;
    private Scanner scanner;

    public ViewCustomer() {
        this.commandService = CommandServiceSingleton.getINSTANCE();
        this.queryService = QueryServiceSingleton.getINSTANCE();
        this.repositoryMapExample = RepositoryMapExampleSingleton.getINSTANCE();
        this.scanner = scanner;
        this.play();
    }

    public void menu() {
        System.out.println("1->Afiseaza posesorul unei masini");
    }

    public void play() {
        boolean running = true;

        while (running) {
            this.menu();
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    this.select1();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void select1() {
        System.out.println("Introduceti masina pe care o cautati: ");
        String carName = scanner.nextLine();

        Car car = repositoryMapExample.getCarByModel(carName);

    }


}
