/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author thien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conText tinhToan1 = new conText();
        ITinh cong = new Cong();
        tinhToan1.setTinhToan(cong);
        System.out.println("75 + 12 = "+tinhToan1.tinh(75, 12));
        
        conText tinhToan2 = new conText();
        ITinh tru = new Tru();
        tinhToan2.setTinhToan(tru);
        System.out.println("54 - 78 = "+tinhToan2.tinh(54, 78));
    }
    
}
