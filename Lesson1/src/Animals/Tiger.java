package Animals;

public class Tiger extends Animal {

    static private int count;
    {
        runLimit=1000;
        swimLimit=300;
    }

    public Tiger(String name) {
        super("Tiger", name);
        count++;
    }

    public static void counts() {
        System.out.println("All tigers are: "+count);
    }
}
