package Animals;

public abstract class Animal {
    private static int count;

    public String getType() {
        return type;
    }

    protected String type;
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String type, String name, int runLimit, int swimLimit) {
        count++;
        this.type = type;
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance<0) System.out.println("Distance can't be less than 0");
        if (distance>runLimit){
            System.out.println(name + "is dead");
        } else System.out.println(name + " ran " + distance + " meters");
    }
    public void swim(int distance){
        if (distance<0) System.out.println("Distance can't be less than 0");
        if (distance==0 || distance>swimLimit){
            System.out.println(name + " is dead");
        } else System.out.println(name + " swan " + distance + " meters");
    }
    public String getName () {
        return name;
    }

    public static void counts(){
        System.out.println("All animals are: "+count);
    }
}
