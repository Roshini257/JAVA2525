package src.main.java.Week5;
import java.util.Optional;
import java.util.Scanner;
public class StringOp {

        public Optional<Integer> calculateLength(String input) {
            if (input == null) {
                return Optional.empty();
            } else {
                return Optional.of(input.length());
            }
        }

        public static void main(String[] args) {
            StringOp calculator = new StringOp();
            System.out.println("Enter a string");
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();

            Optional<Integer> op = calculator.calculateLength(input);
            if (op.isPresent()) {
                int length = op.get();
                System.out.println("Length: " + length);
            } else {
                System.out.println(op);
            }


        }
    }

