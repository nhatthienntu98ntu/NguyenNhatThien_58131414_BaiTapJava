/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;

/**
 *
 * @author thien
 */
public class QuanLyChuyenXe {

    public QuanLyChuyenXe() {
    }

    
    ArrayList<ChuyenXe> dsChuyenXe =new ArrayList<>();
//    ChuyenXe[] dsChuyenXe = new ChuyenXe[10];
    
    public void addChuyenXe(ChuyenXe chuyenXe){
        this.dsChuyenXe.add(chuyenXe);
    }
    
    public void xuat(){}
    
    public void xuatDS(){
        for(int i = 0; i < dsChuyenXe.size(); i++)
            System.out.println("Mã số chuyến: " + dsChuyenXe.get(i).maChuyenXe + "Tài xế: " + dsChuyenXe.get(i).hoTenTaiXe);
       
    }
    
    public void xuatThongTinDS(){
        for(int i = 0; i < dsChuyenXe.size(); i++){
            dsChuyenXe.get(i).xuat();
            System.out.println("\n");
        }
    }
    
    public void tongDoanhThuTheoLoai(){
        double doanhThuNoiThanh = 0;
        double doanhThuNgoaiThanh = 0;
        for(int i = 0; i < dsChuyenXe.size(); i++){
            if( dsChuyenXe.get(i) instanceof XeNoiThanh) doanhThuNoiThanh += dsChuyenXe.get(i).doanhThu;
            if( dsChuyenXe.get(i) instanceof XeNgoaiThanh) doanhThuNgoaiThanh += dsChuyenXe.get(i).doanhThu;
        }
        System.out.println("Doanh thu xe nội thành: " + doanhThuNoiThanh);
        System.out.println("Doanh thu xe ngoại thành: " + doanhThuNgoaiThanh + "\n");
    }
    
    public void tongDoanhThu(){
        double doanhThu = 0;
        for(int i = 0; i < dsChuyenXe.size(); i++){
            doanhThu += dsChuyenXe.get(i).doanhThu;
        }
        System.out.println("Tổng doanh thu: " + doanhThu + "\n");
     }
}
