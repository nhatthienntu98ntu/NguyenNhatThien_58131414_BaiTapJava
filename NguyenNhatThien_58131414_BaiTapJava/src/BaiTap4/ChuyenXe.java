/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author thien
 */
public abstract class ChuyenXe {
    String maChuyenXe;
    String hoTenTaiXe;
    String soXe;
    double doanhThu;
    
    public ChuyenXe(){};

    public ChuyenXe(String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public void xuat(){
        System.out.println("Mã chuyến xe: " + this.maChuyenXe);
        System.out.println("Họ tên tài xế: " + this.hoTenTaiXe);
        System.out.println("Biển số xe: " + this.soXe);
        System.out.println("Doanh thu: " + this.doanhThu);
    }
}
