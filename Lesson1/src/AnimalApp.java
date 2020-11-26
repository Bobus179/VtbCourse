import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Tiger;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Barsik"),
                new Cat("Loki"),
                new Cat("Tihe"),
                new Dog("Sharik"),
                new Dog("Tusik"),
                new Dog("Drugok"),
                new Tiger("Hunger"),
                new Tiger("Pestilence"),
                new Tiger("War")
        };

        for (int i=0;i<animals.length;i++){
            int distance = (int)(Math.random()*200);
            if (i%2==0){
                System.out.print(": The animal tries to run and ");
                animals[i].run(distance);
            }else {
                System.out.print(": The animal tries to swim and ");
                animals[i].swim(distance);
            }
        }
        Animal.counts();
        Cat.counts();
        Dog.counts();
        Tiger.counts();
    }
}
