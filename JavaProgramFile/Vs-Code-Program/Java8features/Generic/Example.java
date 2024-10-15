
public class Example {
    public static void main(String[] args) {

        Box<String> box = new Box<>("Wow this is amazing");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer> box1 = new Box<>(121);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

        box.container = "subscribe to youtube channel";
        box1.container = 1452;
        Box<Boolean> box2 = new Box<>(true);
        System.out.println(box2.getValue());
        box.performSomeTask();
        box1.performSomeTask();

    }
}
