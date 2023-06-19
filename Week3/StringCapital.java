package Week3;
import java.util.Arrays;
import java.util.Comparator;

public class StringCapital{
    public static void main(String[] args) {
        String[] s = {"food", "movie", "novel", "cooking", "apple"};

        String[] cap = Arrays.stream(s)
                .map(s1 -> s1.substring(0, 1).toUpperCase() + s1.substring(1))
                .toArray(String[]::new);

        Arrays.sort(cap);

        Arrays.stream(cap)
                .forEach(System.out::println);
    }
}