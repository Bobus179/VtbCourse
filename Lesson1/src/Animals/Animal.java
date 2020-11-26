package Animals;

public abstract class Animal {
    private static int count;
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected  boolean canSwim;

    public Animal(String name) {
        count++;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance<0) System.out.println("Distance can't be less than 0");
        if (distance>runLimit){
            System.out.println(name + " dead");
        } else System.out.println(name + " ran " + distance + " meters");
    }
    public void swim(int distance){
        if (distance<0) System.out.println("Distance can't be less than 0");
        if (!canSwim || distance>swimLimit){
            System.out.println(name + " dead");
        } else System.out.println(name + " swan " + distance + " meters");
    }
    public abstract void info ();

    public static void counts(){
        System.out.println("All animals are: "+count);
    }
}
