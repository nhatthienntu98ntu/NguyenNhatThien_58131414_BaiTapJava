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
public class Coffe extends CaffeinBeverage{

    public Coffe() {
    }

    
    @Override
    public String brew() {
        return "Brew coffee in boiling wate";
    }

    @Override
    public String addCondiments() {
        return "Add sugar and Milk";
    }
    
}
