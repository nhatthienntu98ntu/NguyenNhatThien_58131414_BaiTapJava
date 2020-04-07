/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennhatthien_58131414_baitapjava;

import Interface.ICalculator;
import calculator.calculator;

/**
 *
 * @author thien
 */
public class NguyenNhatThien_58131414_BaiTapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICalculator calculator = new calculator();
        System.out.println("5 + 3 = " + calculator.cong(5, 3));
        System.out.println("5 - 3 = " + calculator.tru(5, 3));
        System.out.println("5 * 3 = " + calculator.nhan(5, 3));
        System.out.println("5 / 3 = " + calculator.chia(5, 3));
    }
    
}
