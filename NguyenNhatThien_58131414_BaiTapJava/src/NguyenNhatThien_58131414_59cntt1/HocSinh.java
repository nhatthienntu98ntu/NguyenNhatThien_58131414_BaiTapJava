    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenNhatThien_58131414_59cntt1;

/**
 *
 * @author thien
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT(){
        super.HienThiTT();
        System.out.println("Lớp: " + this.lop);
        System.out.println("Năng khiếu: " + this.nangKhieu + "\n");
        return "";
    }
    
    
}
