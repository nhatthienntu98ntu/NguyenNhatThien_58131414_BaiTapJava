/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenNhatThien_58131414_59cntt1;

import java.util.ArrayList;

/**
 *
 * @author thien
 */
public class QLDS  implements IQLDS {
    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan caNhan) {
        dsCaNhan.add(caNhan);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (int i = 0; i < dsCaNhan.size(); i++) {
            CaNhan caNhan = dsCaNhan.get(i);
            dsCaNhan.remove(i);
        }
        return 1;
    }

    @Override
    public void inDS() {
        for (int i = 0; i < dsCaNhan.size(); i++) {
            System.out.println("stt: " + (i + 1));
            CaNhan caNhan = dsCaNhan.get(i);
            caNhan.HienThiTT();
        }
    }
    
    public QLDS() {
    }
   
}
