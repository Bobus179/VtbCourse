import Animals.*;

public class AnimalApp {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new HomeCat("Barsik",100,0),
                new HomeCat("Loki",150,0),
                new HomeCat("Tihe",120,0),
                new Dog("Sharik",200,100),
                new Dog("Tusik",250,120),
                new Dog("Drugok",180,80),
                new Tiger("Hunger",1000,300),
                new Tiger("Pestilence",1500,500),
                new Tiger("War",1200,400)
        };

        for (int i=0;i<animals.length;i++){
            int distance = (int)(Math.random()*200);
            if (i%2==0){
                System.out.print("The "+ animals[i].getType()+" "+ animals[i].getName() + " tries to run and ");
                animals[i].run(distance);
            }else {
                System.out.print("The "+ animals[i].getType()+" "+ animals[i].getName() + " tries to swim and ");
                animals[i].swim(distance);
            }
        }
        Animal.counts();
        Cat.counts();
        Dog.counts();
        Tiger.counts();
    }
}
