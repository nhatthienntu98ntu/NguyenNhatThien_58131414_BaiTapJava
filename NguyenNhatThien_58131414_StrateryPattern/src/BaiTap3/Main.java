/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Collections;

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
        ISoSanh sosanhten = new SoSanhTheoTen();
        ISoSanh sosanhdiem = new SoSanhTheoDiem();
        QLSV qlSV = new QLSV();
        SinhVien sv1 = new SinhVien("1", "1998-10-10", 9);
        SinhVien sv2 = new SinhVien("8", "1998-10-10", 6);
        SinhVien sv3 = new SinhVien("6", "1998-10-10", 7);
        SinhVien sv4 = new SinhVien("9", "1998-10-10", 5);
        qlSV.dsSV.add(sv1);
        qlSV.dsSV.add(sv2);
        qlSV.dsSV.add(sv3);
        qlSV.dsSV.add(sv4);
        qlSV.setSoSanh(sosanhdiem);
        qlSV.sapXep();
        qlSV.inDS();
        
        
    }
    
}
