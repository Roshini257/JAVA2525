package Week2.src;

import java.util.Arrays;

public class anagram {
    public String one = "anagram";
    public String two = "nagaram";


    int len1 = one.length();
    int len2 = two.length();

    public void ana() {
        // one = one.replaceAll("\\s", "").toLowerCase();
        //two = two.replaceAll("\\s", "").toLowerCase();



        char[] a1 = one.toCharArray();
        char[] a2 = two.toCharArray();



        Arrays.sort(a1);
        Arrays.sort(a2);


        System.out.println("Result is Anagram?:"+Arrays.equals(a1, a2));

//        int len1 = one.length();
//        int len2 = two.length();
//
//        if (len1 != len2) {
//            return 0;
//        } else {
//            for (int i = 0; i < len1; i++) {
//                for (int j = 0; j < len2; j++) {
//                    if (one.charAt(i) == two.charAt(j)) {
//                        two = two.substring(0, j) + two.substring(j + 1);
//                        break;
//                    }
//                }
//            }
//            return 1;
//
//        }
//
    }

}

