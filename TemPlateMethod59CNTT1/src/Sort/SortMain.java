/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thien
 */
public class SortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p1 = new Product("product 1", 20000, 2);
        Product p2 = new Product("product 2", 22000, 2);
        Product p3 = new Product("product 3", 23000, 2);
        Product p4 = new Product("product 4", 2000, 2);
        Product p5 = new Product("product 5", 10000, 2);
        
        List<Product> list = new ArrayList<>();
        
        list.add(p1);
        list.add(p2);
        list.add(p5);
        list.add(p4);
        list.add(p3);
        
        SortCollection ssName = new SortProductByName();
        SortCollection ssPrice = new SortProductByPrice();
        
        ssName.sort(list);
        System.out.println("SO SANH THEO TEN: " + list.toString());
        
        ssPrice.sort(list);
        System.out.println("SO SANH THEO GIA: " + list.toString());
        
    }
    
}
