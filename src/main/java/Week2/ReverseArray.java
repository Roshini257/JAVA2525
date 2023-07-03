package src.main.java.Week2;

import java.util.Arrays;

public class ReverseArray {
    int array[] = {1, 2, 3, 4, 5};
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };

    int[] dest_array = new int[5];

    String helloString = new String(helloArray);

    int n = array.length;
//    int d= dest_array.length;

    public void arrayReverse() {
        System.out.println(helloString);


        System.out.println("Original array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
        }


//            System.out.println("Array length is :" + d);
         System.out.println("");



        for (int i = 0; i < array.length; i++) {
                dest_array[n - 1] = array[i];

            n = n - 1;

            }
            System.out.println("Reversed array: ");
            for (int x = 0; x<array.length; x++) {
                System.out.println(dest_array[x] + " ");
            }
        }


    }



