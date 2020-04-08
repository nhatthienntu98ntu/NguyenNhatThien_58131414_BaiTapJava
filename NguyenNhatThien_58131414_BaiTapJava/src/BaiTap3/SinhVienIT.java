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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }


    @Override
    public double getDiem() {
        return (2*this.diemJava + this.diemCss + this.diemHtml)/4;
    }
    
}
