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
public class LopHoc {

    public LopHoc() {
    }
    
    QLDS qldsHS = new QLDS();
    QLDS qldsGV = new QLDS();
    
    public int ThemHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    public int ThemGiaoVien(GiaoVien gv){
        qldsGV.them(gv);
        return 1;
    }
    
    public int inDSHS(){
        qldsHS.inDS();
        return 1;
    }
    
    public int inDSGV(){
        qldsGV.inDS();
        return 1;
    }
    
    public int xoaHS(String ten){
        qldsHS.xoa(ten);
        return 1;
    }
    
    public int xoaGV(String ten){
        qldsGV.xoa(ten);
        return 1;
    }
}
