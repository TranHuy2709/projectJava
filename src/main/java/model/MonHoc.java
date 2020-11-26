package model;

public class MonHoc extends BoMon{
    private String idMonHoc;
    private String idGiangVien;
    private int soTinChi;
    private float diemQuaTrinh;
    private float diemThi;
    private String tenMonHoc;
    private int hocKiHoc;

    public MonHoc() {
    }

    public MonHoc(String idMonHoc, String idGiangVien, int soTinChi, float diemQuaTrinh, float diemThi, 
            String tenMonHoc, int hocKiHoc) {
        this.idMonHoc = idMonHoc;
        this.idGiangVien = idGiangVien;
        this.soTinChi = soTinChi;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemThi = diemThi;
        this.tenMonHoc = tenMonHoc;
        this.hocKiHoc= hocKiHoc;
    }

    public String getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(String idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(String idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public float getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(float diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getHocKi() {
        return hocKiHoc;
    }

    public void setHocKi(int hocKiHoc) {
        this.hocKiHoc = hocKiHoc;
    }
    
    
    
}
