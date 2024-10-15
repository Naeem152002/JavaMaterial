class Java {
    Java get() {
        return new Java();
    }

    void demo(Java j) {
        System.out.println("Java");
    }

    public static void main(String args[]) {
        Java j = new Java();
        System.out.println(j.get());
        j.demo(new Java());
Hathi h=j.set();
System.out.println(h);
    }

    Hathi set() {
        
        return new C();
    }}

interface Hathi {

}

class C implements Hathi {

}