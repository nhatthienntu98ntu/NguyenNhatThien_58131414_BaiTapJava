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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoten, String nganh) {
        this.hoTen = hoten;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        if( getDiem() < 5) return "Yếu";
        else if (getDiem() >= 5 && getDiem() < 6.5) return "Trung bình";
        else if (getDiem() >= 6.5 && getDiem() < 7.5) return "Khá";
        else if (getDiem() >= 7.5 && getDiem() < 9) return "Giỏi";
        else if (getDiem() >= 9) return "Xuất sắc";
        return "Điểm không hợp lệ";
    }
    
    public void xuat(){
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngành: " + this.nganh);
    }
}
