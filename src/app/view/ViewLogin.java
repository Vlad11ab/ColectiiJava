package app.view;

//import app.car.service.*;
import app.service.*;
import app.users.model.User;
//import app.users.service.*;

import java.util.Scanner;

public class ViewLogin {

    private CommandService commandService;
    private QueryService queryService;
    private Scanner scanner;

    public ViewLogin() {

        this.queryService = QueryServiceSingleton.getINSTANCE();
        this.commandService = CommandServiceSingleton.getINSTANCE();
        this.scanner = new Scanner(System.in);
        this.play();
    }

    public void loginMenu() {
        System.out.println("1->Login");
        System.out.println("2->Register");
    }

    public void play() {
        boolean running = true;

        while (running) {
            this.loginMenu();
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    this.select1();
                    break;
                case 2:
                    this.select2();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

    private void select1() {
        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();

        User user = commandService.getUserForLogin(username,password);
//        ViewCustomer viewCustomer = new ViewCustomer();

    }
    private void select2() {

    }

}
