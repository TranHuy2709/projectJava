package model;

import java.util.List;


public class SinhVien extends Lop{
    private String maSV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String queQuan;
    private String email;
    private float diemTrungBinh;
    private String matKhau;
    private List<MonHoc> lstMHSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String gioiTinh, String ngaySinh, String queQuan, 
            String email, float diemTrungBinh, String matKhau) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.email = email;
        this.diemTrungBinh = diemTrungBinh;
        this.matKhau = matKhau;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public List<MonHoc> getLstMHSV() {
        return lstMHSV;
    }

    public void setLstMHSV(List<MonHoc> lstMHSV) {
        this.lstMHSV = lstMHSV;
    }
    
}
