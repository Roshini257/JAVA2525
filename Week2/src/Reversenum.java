package Week2.src;

public class Reversenum {

    int num = 18675;
    int rev = 0;
    int remainder;

    public void reverse() {
        while (num != 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;



        }

        System.out.println("Reversed string is " +rev);


    }
}
