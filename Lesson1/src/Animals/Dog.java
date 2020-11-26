package Animals;

public class Dog extends Animal {
    static int count;

    public Dog(String name, int runLimit, int swimLimit) {
        super("Dog", name, runLimit, swimLimit);
        count++;
    }


    public static void counts(){
        System.out.println("All dogs are: "+count);
    }
}