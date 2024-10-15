import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        // list.add("LCWD");
        list.add(123);

        List anotherList = new ArrayList();
        anotherList.add("LCWD");
        anotherList.add(12);
        anotherList.add(12.12);

        System.out.println(list);
        System.out.println(anotherList);

    }
}