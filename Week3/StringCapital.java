package Week3;
import java.util.Arrays;
import java.util.Comparator;

public class StringCapital{
    public static void main(String[] args) {
        String[] s = {"food", "movie", "novel", "cooking", "apple"};

        // Capitalize the first letter of each string
        String[] cap = Arrays.stream(s)
                .map(s1 -> s1.substring(0, 1).toUpperCase() + s1.substring(1))
                .toArray(String[]::new);

        // Sort the capitalized strings in alphabetical order
        Arrays.sort(cap);

        // Print the sorted and capitalized strings
        Arrays.stream(cap)
                .forEach(System.out::println);
    }
}