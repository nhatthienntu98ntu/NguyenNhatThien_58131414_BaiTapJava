/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.nhanvien;
import java.util.ArrayList;

/**
 *
 * @author thien
 */
public class QuanLyNhanVien implements IQuanLy{

    ArrayList<nhanvien> nhanVien = new ArrayList();
    @Override
    public void them(nhanvien nv) {
        this.nhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for( int i = 0; i < nhanVien.size(); i++){
            System.out.println("Nhan Vien " + i);
            nhanVien.get(i).getThongTin(nhanVien.get(i));
        }
    }
    
}
