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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc lopHoc = new LopHoc();
        HocSinh hs1 = new HocSinh("58cntt1", "Lập trình", "Nguyễn Nhật Thiên", 22, "Phú Yên", "0123456789");
        HocSinh hs2 = new HocSinh("58cntt1", "Lập trình", "Nhật Thiên", 22, "Phú Yên", "0123456789");
        HocSinh hs3 = new HocSinh("58cntt1", "Lập trình", "Thiên", 22, "Phú Yên", "0123456789");
        GiaoVien gv1 = new GiaoVien("Mẫu thiết kế", "Phần mềm", "AAA", 30, "Phú Yên", "0123456789");
        GiaoVien gv2 = new GiaoVien("Thiết kế web", "Phần mềm", "BBB", 33, "Phú Yên", "0123456789");
        GiaoVien gv3 = new GiaoVien("Lập trình mạng", "Mạng", "CCC", 40, "Phú Yên", "0123456789");
        lopHoc.ThemHocSinh(hs1);
        lopHoc.ThemHocSinh(hs2);
        lopHoc.ThemHocSinh(hs3);
        lopHoc.ThemGiaoVien(gv1);
        lopHoc.ThemGiaoVien(gv2);
        lopHoc.ThemGiaoVien(gv3);
        System.out.println("DANH SÁCH HỌC SINH");
        lopHoc.inDSHS();
        System.out.println("DANH SÁCH GIÁO VIÊN");
        lopHoc.inDSGV();
    }
    
}
