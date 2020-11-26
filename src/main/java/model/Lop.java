/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author ACER
 */
public class Lop extends Khoa{
    private String idLop;
    private int namVaoTruong;
    private int hocKi;
    private String idChuongTrinhHoc;
    private ChuongTrinhHoc cht;
    private String tenLop;
    
    public Lop() {
    }

    public Lop(String idLop, int namVaoTruong, String idChuongTrinhHoc, String tenLop) {
        this.idLop = idLop;
        this.namVaoTruong = namVaoTruong;
        this.idChuongTrinhHoc = idChuongTrinhHoc;
        this.tenLop = tenLop;
    }

    public String getIdLop() {
        return idLop;
    }

    public void setIdLop(String idLop) {
        this.idLop = idLop;
    }

    public int getNamVaoTruong() {
        return namVaoTruong;
    }

    public void setNamVaoTruong(int namVaoTruong) {
        this.namVaoTruong = namVaoTruong;
    }

    public int getHocKi() {
        return hocKi;
    }

    public void setHocKi(int hocKi) {
        this.hocKi = hocKi;
    }

    public String getIdChuongTrinhHoc() {
        return idChuongTrinhHoc;
    }

    public void setIdChuongTrinhHoc(String idChuongTrinhHoc) {
        this.idChuongTrinhHoc = idChuongTrinhHoc;
    }

    public ChuongTrinhHoc getCht() {
        return cht;
    }

    public void setCht(ChuongTrinhHoc cht) {
        this.cht = cht;
    }
    
    

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    
    
    
}
