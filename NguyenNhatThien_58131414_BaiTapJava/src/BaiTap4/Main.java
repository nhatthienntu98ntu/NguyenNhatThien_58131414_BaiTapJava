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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChuyenXe noiThah1 = new XeNoiThanh(3, 3, "1", "Nguyễn A", "78G1-123", 500);
        ChuyenXe noiThah2 = new XeNoiThanh(3, 3, "2", "Nguyễn B", "78G1-123", 400);
        ChuyenXe noiThah3 = new XeNoiThanh(3, 3, "3", "Nguyễn C", "78G1-123", 500);
        ChuyenXe ngoaiThah1 = new XeNgoaiThanh(3, "Phú Yên", "4", "Nguyễn A", "78G1-123", 500);
        ChuyenXe ngoaiThah2 = new XeNgoaiThanh(3, "Nha Trang", "5","Nguyễn A", "78G1-123", 600);
        ChuyenXe ngoaiThah3 = new XeNgoaiThanh(3, "Đà Nẵng", "6","Nguyễn A", "78G1-123", 700);
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.addChuyenXe(noiThah1);
        qlcx.addChuyenXe(noiThah2);
        qlcx.addChuyenXe(noiThah3);
        qlcx.addChuyenXe(ngoaiThah1);
        qlcx.addChuyenXe(ngoaiThah2);
        qlcx.addChuyenXe(ngoaiThah3);
        qlcx.xuatThongTinDS();
        qlcx.tongDoanhThuTheoLoai();
        qlcx.tongDoanhThu();
    }
    
}
