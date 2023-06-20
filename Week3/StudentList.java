package Week3;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentList {

        public static void main(String[] args) {
            ArrayList<Object> mainList = new ArrayList<>();
            ArrayList<Object> resultList = new ArrayList<>();


            ArrayList<Object> list1 = new ArrayList<>();
            list1.add("John");
            list1.add("Doe");
            list1.add(2.5);
            mainList.add(list1);

            ArrayList<Object> list2 = new ArrayList<>();
            list2.add("Jane");
            list2.add("Smith");
            list2.add(3.0);
            mainList.add(list2);

            System.out.println(mainList);
            mainList.forEach(element -> {
                ArrayList<Object> lastList = (ArrayList<Object>) element;
                Object lastObject = lastList.get(lastList.size() - 1);
                System.out.println(lastObject);
                resultList.add(lastObject);


            });
            System.out.println(resultList);
        }

    }



