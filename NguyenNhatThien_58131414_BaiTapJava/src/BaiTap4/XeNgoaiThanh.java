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
public class XeNgoaiThanh extends ChuyenXe{
    double soNgayDiDuoc;
    String noiDen;

    public XeNgoaiThanh(double soNgayDiDuoc, String noiDen, String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.soNgayDiDuoc = soNgayDiDuoc;
        this.noiDen = noiDen;
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Nơi đến: " + this.noiDen);
        System.out.println("Số ngày đi được: " + this.soNgayDiDuoc);
    }
}
