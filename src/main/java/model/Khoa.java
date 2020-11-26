package model;


public class Khoa {
    private int idKhoa;
    private String tenKhoa;

    public Khoa() {
    }

    public Khoa(int idKhoa, String tenKhoa) {
        this.idKhoa = idKhoa;
        this.tenKhoa = tenKhoa;
    }

    public int getIdKhoa() {
        return idKhoa;
    }

    public void setIdKhoa(int idKhoa) {
        this.idKhoa = idKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    
    
}
