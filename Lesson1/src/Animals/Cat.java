package Animals;

public class Cat extends Animal{

    static int count;

    public Cat(String type, String name, int runLimit, int swimLimit) {
        super(type, name, runLimit, swimLimit);
        count++;
    }


    public static void counts(){
        System.out.println("All cats are: "+count);
    }
}
