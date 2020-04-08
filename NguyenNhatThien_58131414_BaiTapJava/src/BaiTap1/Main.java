/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import BaiTap1.nhanvien;

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
        nhanvien nv1 = new nhanvien("Nguyen Nhat Thien", "22", "Phu Yen", 6000000, 300);
        nhanvien nv2 = new nhanvien("Nguyen Tan Phat", "22", "Nha Trang", 8000000, 120);
        nv1.getThongTin(nv1);
        System.out.println("Tien thuong: " + nv1.tinhThuong(nv1));
        nv2.getThongTin(nv2);
        System.out.println("Tien thuong: " + nv2.tinhThuong(nv2));
    }
    
}
