package Animals;

public class Tiger extends Animal {

    static private int count;
    {
        runLimit=1000;
        swimLimit=300;
        canSwim=true;
    }
    public Tiger(String name) {
        super(name);
        count++;
    }

    @Override
    public void info() {
        System.out.println("All tigers are: "+count);
    }
}
