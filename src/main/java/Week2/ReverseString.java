package src.main.java.Week2;

public class ReverseString {

    String initial="Java J2EE Reverse Me";

    int l=initial.length();
    String[] str=initial.split(" ");
    int s= str.length;

    public void rev(){

        for (String a : str)
            System.out.println(a);

        for(int i=0;i<s;i++){
            for (int j = str[i].length()-1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));

            }
            System.out.print(" ");
        }



    }
}
