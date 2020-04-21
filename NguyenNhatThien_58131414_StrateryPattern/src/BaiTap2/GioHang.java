/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author thien
 */
public class GioHang {

    public GioHang() {
    }
    
    IThanhToan hinhThucThanhToan;
    ArrayList<HangHoa> dsHH = new ArrayList<>();
    
    public double thanhToan(){
        double sum = 0;
        for (int i = 0; i < dsHH.size(); i++) {
            sum += hinhThucThanhToan.thanhToan(dsHH.get(i).getGia());
        }
        return sum;
    }
    
    public void inDS(){
        for (int i = 1; i <= dsHH.size(); i++) {
            System.out.println(i+ ": Tên hàng: "+ dsHH.get(i-1).getTenHH()
                               + "  Giá: "+ dsHH.get(i-1).getGia());
        }
        System.out.println("Tổng hóa đơn: "+thanhToan()+ "\n");
    }
    
    public void setThanhToan(IThanhToan thanhToan){
        this.hinhThucThanhToan = thanhToan;
    }
}
