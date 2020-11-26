/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author ACER
 */
public class BoMon extends Khoa{
    private String idBoMon;
    private String tenBoMon;

    public BoMon() {
    }

    public BoMon(String idBoMon, String tenBoMon) {
        this.idBoMon = idBoMon;
        this.tenBoMon = tenBoMon;
    }

    public String getIdBoMon() {
        return idBoMon;
    }

    public void setIdBoMon(String idBoMon) {
        this.idBoMon = idBoMon;
    }

    public String getTenBoMon() {
        return tenBoMon;
    }

    public void setTenBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

    
    
}
