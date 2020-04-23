/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thien
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String date = "1998/10/10";
        Date ngaySinh = new SimpleDateFormat("yyy/mm/dd").parse(date);
        ISoSanh sosanhten = new SoSanhTheoTen();
        ISoSanh sosanhdiem = new SoSanhTheoDiem();
        QLSV qlSV = new QLSV();
        SinhVien sv1 = new SinhVien("A", ngaySinh, 9);
        SinhVien sv2 = new SinhVien("B", ngaySinh, 6);
        SinhVien sv3 = new SinhVien("C", ngaySinh, 7);
        SinhVien sv4 = new SinhVien("D", ngaySinh, 5);
        qlSV.dsSV.add(sv1);
        qlSV.dsSV.add(sv2);
        qlSV.dsSV.add(sv3);
        qlSV.dsSV.add(sv4);
        qlSV.setSoSanh(sosanhten);
        qlSV.sapXep();
        qlSV.inDS();
        
        
    }
    
}
