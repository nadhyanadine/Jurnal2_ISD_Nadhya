import java.util.ArrayList;
import java.util.Collections;

public class KelasGenerik<E>{
    private final ArrayList<E> list;

    public KelasGenerik(int capacity){
        int initCapacity = capacity > 0? capacity:0;
        this.list = new ArrayList<>(initCapacity);
    }  
    public void addData(E values){
        this.list.add(values);
    }
    public void display(){
        for (int i = 0; i<this.list.size();i++) {
        System.out.println(this.list.get(i) + " ");
        }
        System.out.println();
    }
    public void removeData(E entry){
        this.list.remove(entry);
    }
    public void setData(E object1, E object2){
        int index = this.list.indexOf(object1);
        this.list.add(index, object2);
  }
}