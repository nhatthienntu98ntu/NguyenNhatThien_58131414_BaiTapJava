/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

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
        SinhVienPoly svPoly;
        svPoly = new SinhVienPoly("Poly", "Poly") {
            @Override
            public double getDiem() {
                return 0;
            }
        };
        
        SinhVienPoly svIT = new SinhVienIT(9, 8, 8, "thien", "CNTT");
        SinhVienPoly svBiz = new SinhVienBiz(9, 9, "Biz", "Maketing");
        
        svPoly.xuat();
        System.out.println("Điểm: " + svPoly.getDiem() + "\nHọc lực: " + svPoly.getHocLuc() + "\n");
        
        svIT.xuat();
        System.out.println("Điểm: " + svIT.getDiem() + "\nHọc lực: " + svIT.getHocLuc() + "\n");
        svBiz.xuat();
        System.out.println("Điểm: " + svBiz.getDiem() + "\nHọc lực: " + svBiz.getHocLuc() + "\n");
    }
    
}
