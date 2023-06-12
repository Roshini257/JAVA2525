package Week2.src;

public class Main {
    public static void main(String[] args) {

//        Interface

        Child c =new Child();
        c.setName("Example of Interfaces");
        String name = c.getParent1name();
        System.out.println("Name: " + name);

//        Constructor

        kid k = new kid();
        kid k1= new kid (4);
        kid k2= new kid(33,"Example of Constructor");



//        System.out.println("Default constructor--"+k.age);
        System.out.println("Constructor with single parameter--"+k1.age);
        System.out.println(k1.name);
        System.out.println(k2.age);
        System.out.println(k2.name);

//        static
        Static s = new Static();
        //Static s2 = new Static();



        System.out.println("Static variable value is "+Static.age());



//        Final

        Final f = new Final();
        f.finalstring();
//        Reverse string

        Reversenum r = new Reversenum();
        r.reverse();

//        Age

        Age a =new Age();
        a.person();

//        Fib

        Fibanocci f1 = new Fibanocci();
        f1.fib();
//        FizzBuzz

       Buzz buzz=new Buzz();
       buzz.Fizz();
//MinMax

        MinMax m =new MinMax();
        m.sort();
// Reverse array

        ReverseArray ra=new ReverseArray();
        ra.arrayReverse();

//       Array Rotation

        Rotation ro = new Rotation();

        int rot[]={1,2,3,4,5};
        ro.rotate(rot,2);
        System.out.println("\"Rotated array is :\"");
        for (int  aa= 0; aa < rot.length; aa++) {
            System.out.print(rot[aa] + " ");
            System.out.println(" ");
        }

//        StringVowel

        Vowels v = new Vowels();
        v.vow();

//        anagram
        anagram anagram= new anagram();
        anagram.ana();


//    reverseString
        ReverseString rs = new ReverseString();
        rs.rev();
        System.out.println(" ");



        //    Rotate string
        RotateString rot1 = new RotateString();
        rot1.rotate();
        System.out.println("Result String rotated or not? :"+rot1.rotate());
//


    }

    }





