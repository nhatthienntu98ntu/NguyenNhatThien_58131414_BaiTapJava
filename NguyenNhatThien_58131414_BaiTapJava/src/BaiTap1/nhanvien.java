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
public class nhanvien {
    String ten;
    String tuoi;
    String diaChi;
    double tienLuog;
    int tongGioLam;

    public nhanvien() {
    }

    public nhanvien(String ten, String tuoi, String diaChi, double tienLuog, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuog = tienLuog;
        this.tongGioLam = tongGioLam;
    }
    
    public  String getThongTin(nhanvien nv){
        System.out.println("Ten nhan vien: " + nv.ten);
        System.out.println("Ten nhan vien: " + nv.tuoi);
        System.out.println("Ten nhan vien: " + nv.diaChi);
        System.out.println("Ten nhan vien: " + nv.tienLuog);
        System.out.println("Ten nhan vien: " + nv.tongGioLam + "\n");
        return null;
    }
    
    public double tinhThuong(nhanvien nv){
        double tienThuong;
        if(nv.tongGioLam >= 200){
            return nv.tienLuog * 0.2;
        }else if(nv.tongGioLam >= 100 && nv.tongGioLam < 200){
            return nv.tienLuog * 0.1;
        }
        return 0; 
    }

}
