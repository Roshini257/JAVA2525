package src.main.java.Week2;

public class Age {

    int x = 2;

    public void person() {


        if (x > 13 && x < 19) {
            System.out.println("teen");
        } else if (x < 13) {
            System.out.println("kid");

        }
        else if (x > 19) {
            System.out.println("adult");

        } else {
            System.out.println("Invalid");

        }

    }
}
