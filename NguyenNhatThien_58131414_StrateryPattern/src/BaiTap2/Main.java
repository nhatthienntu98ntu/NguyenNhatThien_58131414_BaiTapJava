/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

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
        IThanhToan thanhToanOnline = new ThanhToanOnline();
        IThanhToan thanhToanCOD = new ThanhToanCOD();
        
        GioHang gioHang1 = new GioHang();
        HangHoa hh1 = new HangHoa("1", 20, "1");
        HangHoa hh2 = new HangHoa("2", 20, "2");
        HangHoa hh3 = new HangHoa("3", 20, "3");
        gioHang1.dsHH.add(hh1);
        gioHang1.dsHH.add(hh2);
        System.out.println("-----Giỏ hàng 1-----");
        gioHang1.setThanhToan(thanhToanOnline);
        gioHang1.thanhToan();
        gioHang1.inDS();
        
        
        GioHang gioHang2 = new GioHang();
        gioHang2.dsHH.add(hh1);
        gioHang2.dsHH.add(hh2);
        gioHang2.dsHH.add(hh3);
        System.out.println("-----Giỏ hàng 2-----");
        gioHang2.setThanhToan(thanhToanCOD);
        gioHang2.thanhToan();
        gioHang2.inDS();
    }
    
}
