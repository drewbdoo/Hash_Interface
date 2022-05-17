package InterfaceProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        //Interface in a box Part 1: Packables
//        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
//        Book book2 = new Book("Robert Martin", "Clean Code", 1);
//        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
//
//        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
//        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
//        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
//
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);
//          //Part 2: Box
//        Box box = new Box(10);
//
//        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
//        box.add(new Book("Robert Martin", "Clean Code", 1));
//        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
//
//        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
//        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
//        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
//
//        System.out.println(box);
//        //Part 3: Box weight
//        System.out.println(box.weight());
//        //Part 4: A Box is a package too
//        Box box1 = new Box(5);
//        box1.add(box);
//        System.out.println(box1);
//        Box box2 = new Box(4);
//        box2.add(box1);
//        System.out.println(box2);
//        Box box3 = new Box(20);
//        box3.add(box1);
//        System.out.println(box3);
//        //List as a method parameter
//        List<String> names = new ArrayList<>();
//        names.add("First");
//        names.add("Second");
//        names.add("Third");
//
//        System.out.println(returnSize(names));
        //Map as a method parameter
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));




    }

    //Map as a method parameter method
    private static int returnSize(Map<String, String> names) {
        return names.size();
    }


//    //List a method parameter method
//    private static int returnSize(List<String> names) {
//        return names.size();
//
//    }
}
