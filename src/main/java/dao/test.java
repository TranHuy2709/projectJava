/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Calendar;
import model.MonHoc;
import model.SinhVien;

/**
 *
 * @author ACER
 */
public class test {
    public static void main(String[] args) {
        
        SinhVien sv= new SinhVien();
        sv.setMaSV("SV001");
        try{
        for(MonHoc mh: SQLdata.getSQLdata().getLstMHSV(sv)){
            String[] rows= new String[6];
            rows[0]= mh.getIdMonHoc();
            rows[1]= mh.getTenMonHoc();
            rows[2]= mh.getSoTinChi()+"";
            rows[3]= mh.getDiemQuaTrinh()+"";
            rows[4]= mh.getDiemThi()+"";
            float diemThi= (float)(mh.getDiemQuaTrinh()*0.3+ mh.getDiemThi()*0.7);
            rows[5]= diemThi+ "";
            
            System.out.println(rows[0]);
            System.out.println(rows[1]);
            System.out.println(rows[2]);
            System.out.println(rows[3]);
            System.out.println(rows[4]);
            System.out.println(rows[5]);
        }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
