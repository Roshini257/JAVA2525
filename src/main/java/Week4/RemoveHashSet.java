package src.main.java.Week4;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveHashSet {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String");
            String s=sc.nextLine();
            HashSet<Character> mySet= new HashSet();
            for(int i=0;i<s.length();i++){
                mySet.add(s.charAt(i));
            }
            System.out.print(" The characters in the string are: ");
            mySet.forEach(i->System.out.print(i));
        }
}
