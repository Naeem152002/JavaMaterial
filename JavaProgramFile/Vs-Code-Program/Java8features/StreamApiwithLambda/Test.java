import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // create a list and filter all even numbers from list

        List<Integer> list1 = List.of(4, 5, 7, 9);// immutable list hain since java-9

        System.out.println(list1);

        // without stream
        List<Integer> even = new ArrayList<>();

        for (Integer i : list1) {
            if (i % 2 == 0) {
                even.add(i);
            }

        }
        System.out.println(even);

        // using stream
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> newList1 = list1.stream().filter(i -> i > 7).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println(newList1);

        // stream.forEach(e->{ ye nahi kr paoge ek hi strem per kyuki immutable hoti hain 
        // System.out.println(e);
        // });
    }

}