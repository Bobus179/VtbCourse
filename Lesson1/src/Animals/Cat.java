package Animals;

public class Cat extends Animal{

    static int count;
    {
        runLimit=200;
        swimLimit=0;
    }

    public Cat(String name) {
        super("Cat", name);
        count++;
    }

    public static void counts(){
        System.out.println("All cats are: "+count);
    }
}
