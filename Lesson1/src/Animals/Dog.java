package Animals;

public class Dog extends Animal {
    static int count;
    {
        runLimit=500;
        swimLimit=100;
    }

    public Dog(String name) {
        super("Dog", name);
        count++;
    }

    public static void counts(){
        System.out.println("All dogs are: "+count);
    }
}