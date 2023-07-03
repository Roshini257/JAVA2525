package src.main.java.Week5;

import java.util.Optional;
import java.util.Scanner;

public record StringUpper() {

    public Optional<String> stringUpper(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            return Optional.of(input.toUpperCase());
        }
    }

    public static void main(String[] args) {
        StringUpper su = new StringUpper();
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        Optional<String> op = su.stringUpper(input);
        if (op.isPresent()) {
            input = String.valueOf(op.get());
            System.out.println("Given String is: " + input);
        } else {
            System.out.println(op);
        }


    }
}

