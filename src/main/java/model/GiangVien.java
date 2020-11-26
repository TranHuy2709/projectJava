package model;

public class GiangVien extends BoMon{
    private String maGV;
    private String idMonHoc;
    private String matKhau;
    private String hoTen;

    public GiangVien() {
    }

    public GiangVien(String maGV, String idMonHoc, String matKhau, String hoTen) {
        this.maGV = maGV;
        this.idMonHoc = idMonHoc;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
    }


    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(String idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    
}
