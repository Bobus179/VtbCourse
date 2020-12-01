package nazarov.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    @SafeVarargs
    public final void addToList(T... fruit){
        if (list==null){
            list=new ArrayList<>();
        }
        list.addAll(Arrays.asList(fruit));

    }


    public List getList() {
        return list;
    }
    public double getWeight(){
        double weight=0;
        for (T fr:list){
            weight+=fr.getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?>another){
        return Math.abs(getWeight()-another.getWeight())<0.0001;
    }

    public void remove (Box<T> anotherApples){
        if (list.size()>0){
            for (T t : list) {
                anotherApples.addToList(t);
            }
            list.clear();
        }
    }

}
