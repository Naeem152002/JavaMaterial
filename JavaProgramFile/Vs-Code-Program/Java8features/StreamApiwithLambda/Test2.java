import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        // filter{predicate interface }-boolean value
        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
        List<String> newList = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());

        System.out.println(newList);

        // map each element oparion performe
        // map{function}

        List<Integer> numbers = List.of(23, 4, 2, 5, 7, 8);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

        numbers.stream().forEach(System.out::println);

        // sort

        numbers.stream().sorted().forEach(System.out::println);

        Integer i = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(i);

        Integer i1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(i1);

    }
}