package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();

        people.add(new Person("Warren Buffet", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckerberg", 50));



//        List<Person> hundredClub = new ArrayList<>();

        List<Person> hundredClub = people.stream()
                .filter(person -> person.billions >= 100)
                .toList(); //?
        //Sout fara map
        hundredClub.forEach(person -> System.out.println(person.name));
        hundredClub.forEach(person -> System.out.println(person.billions));

        System.out.println("------");

        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());
        sortedList.forEach(person -> System.out.println(person.name));

        System.out.println("------");

        List<Person> hundredSortedClub = people.stream()
                .filter(person -> person.billions >= 100)
                .sorted(Comparator.comparing(person -> person.name))
                .toList();
        hundredSortedClub.forEach(person -> System.out.println(person.name));

        System.out.println("------");

        //Sout cu map
        people.stream()
                .map(person -> person.name)
                .forEach(System.out::println);








//        for(Person p : people){
//            if(p.billions >=100){
//                hundredClub.add(p);
//            }
//        }

        System.out.println("==FlatMap==");

        List<Business> businesses = new ArrayList<>();

        businesses.add(new Business("Apple", new ArrayList<Person>() {{
            add(new Person("Alex", 450));
            add(new Person("Andrei", 200));
        }}));

        businesses.add(new Business("Adobe", new ArrayList<Person>() {{
            add(new Person("Andra", 500));
            add(new Person("Alexia",210));
            add(new Person("Elena",180));
        }}));

        businesses.add(new Business("Microsoft", new ArrayList<Person>(){{
            add(new Person("Anya",300));
            add(new Person("Marius", 510));
            add(new Person("Ilinca", 290));
        }}));

        businesses.forEach(business -> System.out.println(business.name));
        System.out.println("->Businesses: ");
        businesses.stream()
                .map(business -> business.name)
                .forEach(System.out::println);

        System.out.println("->Employees fara map: ");
        businesses.stream()
                .flatMap(business -> business.employees.stream())
                .forEach(person -> System.out.println(person.name));

        System.out.println("->Employees cu map: ");
        businesses.stream()
                .flatMap(business -> business.employees.stream())
                .map(person -> person.name)
                .forEach(System.out::println);

    }

    static class Business {
        String name;
        List<Person> employees;

        public Business(String name, ArrayList<Person> employees) {
            this.name = name;
            this.employees = employees;
        }
    }


    static class Person {
        String name;
        int billions;

        public Person(String name, int billions){
            this.name = name;
            this.billions = billions;
        }
    }

}







