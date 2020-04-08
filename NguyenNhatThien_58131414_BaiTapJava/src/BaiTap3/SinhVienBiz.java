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
public class SinhVienBiz extends SinhVienPoly{
    double diemMaketing;
    double diemSale;

    public SinhVienBiz(double diemMaketing, double diemSale, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemMaketing = diemMaketing;
        this.diemSale = diemSale;
    }
    

    @Override
    public double getDiem() {
        return (2*this.diemMaketing + this.diemSale)/3;
    }
    
}
