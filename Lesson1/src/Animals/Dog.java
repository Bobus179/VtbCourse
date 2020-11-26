package Animals;

public class Dog extends Animal {
    static int count;
    {
        runLimit=500;
        swimLimit=100;
        canSwim=true;
    }

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void info() {
        System.out.println("Dog's name is: "+name);
    }

    public static void counts(){
        System.out.println("All dogs are: "+count);
    }
}