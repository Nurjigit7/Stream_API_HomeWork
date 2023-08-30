import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 77, 54, 41, 89, 73};
        List<Integer> evenNumbers = Arrays.stream(integers).toList();
           evenNumbers.stream().filter(n -> n % 2 == 0).peek(System.out::println).
                   map(s->s*s).forEach(System.out::println);
    }
}