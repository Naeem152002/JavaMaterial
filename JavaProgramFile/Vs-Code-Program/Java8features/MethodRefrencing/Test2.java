import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        String names[] = { "Durgesh", "Uttam", "Ankit", "Divay" };

        Stream<String> stream1 = Stream.of(names);

        stream1.forEach(System.out::println);

    }
}
