package nazarov.org;

public class AppFruitBox {
    public static void main(String[] args) {
        Box <Apple> applesBox = new Box<>();
        applesBox.addToList(new Apple(),new Apple(),new Apple(),new Apple(),new Apple());
        applesBox.addToList(new Apple());
        applesBox.addToList(new Apple(),new Apple());
        //applesBox.addToList(3);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addToList(new Orange(), new Orange(), new Orange(), new Orange());
        System.out.println(applesBox.getList().toString());
//        System.out.println(orangeBox.getList().toString());
//        System.out.println(applesBox.getWeight());
//        System.out.println(orangeBox.getWeight());
//        System.out.println(applesBox.compare(orangeBox));
        Box <Apple> applesBox2 = new Box<>();
        applesBox.remove(applesBox2);
        System.out.println(applesBox.getList().toString());
        System.out.println(applesBox2.getList().toString());
    }
}
