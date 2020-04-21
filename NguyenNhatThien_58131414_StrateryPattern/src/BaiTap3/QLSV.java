/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thien
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dsSV = new ArrayList<>();

    public QLSV() {
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    
    public void sapXep(){
        for (int i = 0; i < dsSV.size()-1; i++) {
            for (int j = i+1; j < dsSV.size(); j++) {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) == 1)
                    Collections.swap(dsSV, i, j);
            }
            
        }
    }
    
    public void inDS(){
        for (int i = 0; i < dsSV.size(); i++) {
            System.out.println("\nTên: "+dsSV.get(i).getHoTen()+
                                " Ngày sinh: "+dsSV.get(i).getNgaySinh()+
                                " Điểm trung bình: "+dsSV.get(i).getDiemTB()
                    );
            
        }
    }
}
