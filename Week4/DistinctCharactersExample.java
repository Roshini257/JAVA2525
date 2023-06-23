package Week4;
import java.util.*;

public class DistinctCharactersExample {
    public static void main(String[] args) {
        String input = "test string";
        new DistinctCharactersExample().printDistinctCharacters(input);
    }
    private void printDistinctCharacters(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}

