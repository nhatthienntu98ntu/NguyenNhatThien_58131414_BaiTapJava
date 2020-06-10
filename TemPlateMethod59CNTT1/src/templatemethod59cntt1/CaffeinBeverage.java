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
public abstract class CaffeinBeverage {

    public CaffeinBeverage() {
    }
    
    public String prepareRecipe(){
         return boilWater() + brew() + pourInCup() + addCondiments();
    }
    
    private String boilWater(){
        return "Đun nước sôi ";
    }
    
    private String pourInCup(){
        return "Rót ra cốc ";
    }
    
    public abstract String brew();
    public abstract String addCondiments();
    
    
}
