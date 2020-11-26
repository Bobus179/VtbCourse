package Animals;

public class Tiger extends Cat {

    static private int count;

    public Tiger(String name, int runLimit, int swimLimit) {
        super("Tiger", name, runLimit, swimLimit);
        count++;
    }

    public static void counts() {
        System.out.println("All tigers are: "+count);
    }
}
