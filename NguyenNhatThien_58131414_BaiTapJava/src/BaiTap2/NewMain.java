/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.nhanvien;

/**
 *
 * @author thien
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IQuanLy qlnv = new QuanLyNhanVien();
        nhanvien nv1 = new nhanvien("thien", "22", "phu yen", 200, 200);
        nhanvien nv2 = new nhanvien("thien", "22", "phu yen", 200, 200);
        nhanvien nv3 = new nhanvien("thien", "22", "phu yen", 200, 200);
        nhanvien nv4 = new nhanvien("thien", "22", "phu yen", 200, 200);
        nhanvien nv5 = new nhanvien("thien", "22", "phu yen", 200, 200);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
    
}
