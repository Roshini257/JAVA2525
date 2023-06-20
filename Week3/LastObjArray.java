package Week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LastObjArray {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.remove(names.size()-1);

        names.forEach(element -> System.out.println(element));


    }
}
