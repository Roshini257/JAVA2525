package src.main.java.Week3;


import java.util.ArrayList;

public class ListToArray {

        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Hello");
            arrayList.add("World");
            arrayList.add("!");

            String[] array = arrayList.toArray(new String[arrayList.size()]);

            for (String element : array) {
                System.out.println(element);
            }
        }
    }

