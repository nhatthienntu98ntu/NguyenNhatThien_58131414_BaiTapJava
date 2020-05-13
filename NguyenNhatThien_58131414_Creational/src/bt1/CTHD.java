/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author thien
 */
public class CTHD {
    private String tenSanPham;
    private int soLuong;
    private double donGia;
    private double chietKhau; 

    public CTHD() {
    }

    public CTHD(String tenSanPham, int soLuong, double donGia, double chietKhau) {
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTDH{" + "tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + ", chietKhau=" + chietKhau + '}';
    }
}
