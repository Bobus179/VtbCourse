package nazarov.org;

import java.util.*;

public class AppMain {
    static class Cat{
        public String getName() {
            return name;
        }
        String name;

        public Cat(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        String[]strings = new String[]{"a","b","c","d","e","f","g"};
        System.out.println("проверка переставления для Стринга");
        System.out.println(Arrays.asList(strings));
        replacement(strings,3,5);
        System.out.println(Arrays.asList(strings));

        Cat[] cats = new Cat[]{
                new Cat("a"),
                new Cat("b"),
                new Cat("c"),
                new Cat("d")
        };
        System.out.println("проверка переставления для объекта");
        for (Cat cat : cats) {
            System.out.print(cat.getName() + " ");
        }
        System.out.println();
        replacement(cats,0,2);
        for (Cat cat : cats) {
            System.out.print(cat.getName() + " ");
        }

        System.out.println("\nпроверка класса объекта "+cats[0].getClass().getName());

        System.out.println("АррайЛист через Лист");
        List<Cat> cats1 = new ArrayList<>(toMyList(cats));
        for (Cat c:cats1) {
            System.out.print(c.getName()+" ");
        }

        System.out.println("\nпроверка класса объекта "+cats1.get(0).getClass().getName());
        System.out.println("АррайЛист через АррайЛист");
        ArrayList<Cat> cats2 = toMyArray(cats);
        for (Cat c:cats2) {
            System.out.print(c.getName()+" ");
        }
        System.out.println("\nпроверка класса объекта "+cats2.get(0).getClass().getName());
    }

    public static void replacement(Object[] o, int a, int b){
        Object tmp=o[a];
        o[a]=o[b];
        o[b]=tmp;
    }

    public static <T>List <T> toMyList(T[]o){
        return  Arrays.asList(o);
    }

    public static <T>ArrayList<T>toMyArray(T[]o){
        ArrayList <T> list = new ArrayList<>(o.length);
        list.addAll(Arrays.asList(o));
        return list;
    }
}
