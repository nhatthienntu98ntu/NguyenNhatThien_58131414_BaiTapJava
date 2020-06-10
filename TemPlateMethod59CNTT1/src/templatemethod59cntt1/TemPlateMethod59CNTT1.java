/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod59cntt1;

/**
 *
 * @author thien
 */
public class TemPlateMethod59CNTT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaffeinBeverage coffee = new Coffe();
        CaffeinBeverage tea = new Tea();
        
        System.out.println(coffee.prepareRecipe());
        System.out.println(tea.prepareRecipe());
    }
    
}
