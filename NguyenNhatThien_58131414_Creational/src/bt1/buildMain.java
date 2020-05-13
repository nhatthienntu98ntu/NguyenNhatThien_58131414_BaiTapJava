/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author thien
 */
public class buildMain {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        HoaDonHeader hoaDonHeader = new HoaDonHeader("hoaDon1", new SimpleDateFormat("dd/mm/yyy").parse("10/02/1998"), "Nguyễn Nhật Thiên");
        CTHD cthd1 = new CTHD("Áo thun", 3, 3000, 10);
        CTHD cthd2 = new CTHD("Quần jean", 3, 3000, 10);
        CTHD cthd3 = new CTHD("Giày", 2, 3000, 10);
        HoaDon hoaDon = new HoaDon.Builder()
                        .addHoaDonHeader(hoaDonHeader)
                        .addCTHD(cthd1)
                        .addCTHD(cthd2)
                        .addCTHD(cthd3)
                        .build();
        System.out.println(hoaDon.toString());
    }
    
}
