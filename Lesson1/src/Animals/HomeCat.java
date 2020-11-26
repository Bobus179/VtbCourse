package Animals;

public class HomeCat extends Cat{
    public HomeCat(String name, int runLimit, int swimLimit) {
        super("Home Cat", name, runLimit, swimLimit);
        count++;
    }
}
