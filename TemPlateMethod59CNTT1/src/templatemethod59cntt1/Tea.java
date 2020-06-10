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
public class Tea extends CaffeinBeverage{

    public Tea() {
    }

    
    @Override
    public String brew() {
        return "Steep tea in boiling water";
    }

    @Override
    public String addCondiments() {
        return "Add lemon";
    }
    
}
