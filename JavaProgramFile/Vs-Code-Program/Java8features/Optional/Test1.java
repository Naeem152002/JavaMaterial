import java.util.Optional;

public class Test1 {

    public static void main(String[] args) {

        Optional<String> of = Optional.of("hello");

        System.out.println(of.get());
        System.out.println(of.isPresent());
        System.out.println(of.isEmpty());
        System.out.println(of.orElse("hi"));
        System.out.println(of.orElseThrow());

        Optional<String> empty = Optional.empty();

        System.out.println(empty.get());
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        System.out.println(empty.orElse("hi"));
        System.out.println(empty.orElseThrow());

        Optional<String> ofNullable = Optional.ofNullable(null);

        System.out.println(ofNullable.get());
        System.out.println(ofNullable.isPresent());
        System.out.println(ofNullable.isEmpty());
        System.out.println(ofNullable.orElse("hi"));
        System.out.println(ofNullable.orElseThrow());

    }
}
