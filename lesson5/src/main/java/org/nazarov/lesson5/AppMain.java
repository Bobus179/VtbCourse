package org.nazarov.lesson5;

import java.util.HashMap;
import java.util.Map;

public class AppMain {
    public static void main(String[] args) {
        String[]arr = new String[]{"2","1","3","4","4","3","2","1","2","2","3","4","4","4","1","1","1","1","1","1"};
        originalString(arr);
    }

    public static void originalString(String[]arr){
        Map<String,Integer> map = new HashMap<>();
        int count;
        for (String s : arr) {
            if (map.get(s) == null) {
                count = 0;
            } else count = map.get(s);
            map.put(s, ++count);
        }
        for (String s: map.keySet() ) {
            System.out.println(s + " : " + map.get(s));
        }
    }
}
