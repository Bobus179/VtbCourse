package Animals;

public class Cat extends Animal{

    static int count;
    {
        runLimit=200;
        canSwim=false;
    }

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void info() {
        System.out.println("Cat's name is: "+name);
    }

    public static void counts(){
        System.out.println("All cats are: "+count);
    }
}
