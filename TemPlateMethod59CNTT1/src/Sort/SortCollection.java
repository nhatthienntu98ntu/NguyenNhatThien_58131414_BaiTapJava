/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author thien
 * @param <T>
 */
public abstract class SortCollection<T> {

    public SortCollection() {
    }
    
    public abstract int compare(T t1, T t2);
    
    public void sort(List<T> list){
        
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(compare(list.get(i), list.get(j)) == 1)
                    Collections.swap(list, i, j);
            }
            
        }
    }
}
