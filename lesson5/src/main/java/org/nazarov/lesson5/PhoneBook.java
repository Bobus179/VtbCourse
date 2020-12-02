package org.nazarov.lesson5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    Map<String, HashSet<Integer>> book = new HashMap<>();

    public void add(String name,int number){
        if (book.containsKey(name)){
            book.get(name).add(number);
        }else {
            book.put(name, new HashSet<>());
            book.get(name).add(number);
        }
    }
    public void get(String name){
        boolean noname=true;

        for (Map.Entry<String,HashSet<Integer>> entry: book.entrySet()){
            if (name.equals(entry.getKey())){
                System.out.println("Фамилия - " + entry.getKey()+ ", телефон - " +entry.getValue() );
                noname=false;
            }
        }
        if (noname){
            System.out.println("Человек не найден");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBookBook = new PhoneBook();
        phoneBookBook.add("иванов",111111);
        phoneBookBook.add("петров",222222);
        phoneBookBook.add("сидоров",333333);
        phoneBookBook.add("сидоров",444444);
        phoneBookBook.add("петров",555555);

        phoneBookBook.get("выап");
        phoneBookBook.get("иванов");
        phoneBookBook.get("петров");
        phoneBookBook.get("сидоров");
    }


}
