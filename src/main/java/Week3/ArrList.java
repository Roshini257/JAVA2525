package src.main.java.Week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        ArrayList<String> names1 = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("For loop:");

//        For loop

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

//        Enhanced for loop
        System.out.println("Enhanced For loop:");

        for(String s:names)
            System.out.println(s);

//     Iterator
        System.out.println("Iterator:");

        Iterator<String> namesItr=names.iterator();
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
        }

//        ForEach
        System.out.println("ForEach:");

        names.forEach(element -> System.out.println(element));
//Parallel stream

        System.out.println("Parallel Stream:");


        names.stream().parallel().forEach(element -> System.out.println(element));



    }

}
