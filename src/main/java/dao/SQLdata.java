package dao;

import SQL.DataProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.BoMon;
import model.ChuongTrinhHoc;
import model.GiangVien;
import model.Khoa;
import model.Lop;
import model.MonHoc;
import model.SinhVien;

public class SQLdata {
    private List<Khoa> lstKhoa = new ArrayList<Khoa>();
    private List<Lop> lstLop= new ArrayList<Lop>();
    private List<SinhVien> lstSV= new ArrayList<>();
    private List<BoMon> lstBoMon= new ArrayList<>();
    private List<MonHoc> lstMonHoc= new ArrayList<>();
    private List<GiangVien> lstGV= new ArrayList<>();
    private List<ChuongTrinhHoc> lstCTH= new ArrayList<>();
    private List<MonHoc> lstMHSV= new ArrayList<>();
    
    private int namHienTai= Calendar.getInstance().get(Calendar.YEAR);
    private int hocKi=1;
    
    private Connection conn= DataProvider.get().connect(); //ket noi sql sever
    private PreparedStatement ps= null;  //biến để thực thi câu lệnh query
    private ResultSet rs= null; //biến trả về kqua
    
    private static SQLdata INSTANCE;
    
    private SQLdata(){
    }
    
    public static SQLdata getSQLdata(){
        if(INSTANCE==null){
            INSTANCE= new SQLdata();
            return INSTANCE;
        }
        return INSTANCE;
    }
    
    public void getData(String str){
        try{
            ps= conn.prepareStatement(str); // ném câu lệnh vào SQL
            rs= ps.executeQuery(); // thực thi câu lệnh query và nhận kết quả trả về
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void getTablesData(String table){
        String str= "select * from projectcuoikhoa."+table;
        try{
            ps= conn.prepareStatement(str); // ném câu lệnh vào SQL
            rs= ps.executeQuery(); // thực thi câu lệnh query và nhận kết quả trả về
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<Khoa> getLstKhoa() {
        try{
            getTablesData("khoa");
            while(rs.next()){
                Khoa khoa= new Khoa(rs.getInt(1), rs.getString(2));
                lstKhoa.add(khoa);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstKhoa;
    }

    public List<Lop> getLstLop() {
        try{
            getTablesData("lop");
            while(rs.next()){
                Lop lop= new Lop(rs.getString(1), rs.getInt(3), rs.getString(5), rs.getString(6));
                lstLop.add(lop);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstLop;
    }

    public List<SinhVien> getLstSV() {
        try{
            getTablesData("sinhvien");
            while(rs.next()){
                SinhVien sv= new SinhVien(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getFloat(8), rs.getString(9));
                sv.setIdLop(rs.getString(2));
                lstSV.add(sv);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstSV;
    }

    public List<BoMon> getLstBoMon() {
        try{
            getTablesData("bomon");
            while(rs.next()){
                BoMon bomon= new BoMon(rs.getString(1), rs.getString(3));
                lstBoMon.add(bomon);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstBoMon;
    }

    public List<MonHoc> getLstMonHoc() {
        try{
            getTablesData("monhoc order by HocKi ASC");
            while(rs.next()){
                MonHoc monhoc= new MonHoc(rs.getString(1), rs.getString(3), rs.getInt(4), rs.getFloat(5), rs.getFloat(6),
                        rs.getString(7), rs.getInt(8));
                lstMonHoc.add(monhoc);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstMonHoc;
    }

    public List<GiangVien> getLstGV() {
        try{
            getTablesData("giangvien");
            while(rs.next()){
                GiangVien gv= new GiangVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                lstGV.add(gv);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstGV;
    }

    public List<ChuongTrinhHoc> getLstCTH() {
        try{
            getTablesData("chuongtrinhhoc");
            while(rs.next()){
                ChuongTrinhHoc cth= new ChuongTrinhHoc(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
                        rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16),
                        rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22));
                lstCTH.add(cth);
                }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstCTH;
    }

    public List<MonHoc> getLstMHSV(SinhVien sv) {
        String query= "select * from "+ sv.getMaSV().toLowerCase()+ ";";
        try{
            ps= conn.prepareStatement(query); // ném câu lệnh vào SQL
            rs= ps.executeQuery(); // thực thi câu lệnh query và nhận kết quả trả về
            while(rs.next()){
                MonHoc mh= new MonHoc(rs.getString(rs.findColumn("idmonhoc")), rs.getString(rs.findColumn("idGiangVien")), 
                        rs.getInt(rs.findColumn("soTinChi")), rs.getFloat(rs.findColumn("diemQuaTrinh")),
                        rs.getFloat(rs.findColumn("diemThi")), rs.getString(rs.findColumn("tenMonHoc")), rs.getInt(rs.findColumn("hocKi")));
                lstMHSV.add(mh);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lstMHSV;
    }
    
    
    public boolean ktraTableMonHocSV(SinhVien sv){
        String str="SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES Where Table_Schema = 'projectcuoikhoa'";
        try{
            ps= conn.prepareStatement(str); // ném câu lệnh vào SQL
            rs= ps.executeQuery(); // thực thi câu lệnh query và nhận kết quả trả về
            while(rs.next()){
                if(rs.getString(1).equals(sv.getMaSV().toLowerCase())){
                    return true;
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public void createTableMonHocSV(SinhVien sv){
        String str= "CREATE TABLE "+ sv.getMaSV().toLowerCase() +"(idmonhoc VARCHAR(45) PRIMARY KEY,"
                + " idBoMon VARCHAR(45), idGiangVien VARCHAR(45), soTinChi INT, diemQuaTrinh FLOAT,"
                + " diemThi Float, tenMonHoc VARCHAR(45), hocKi INT);";
        try{
            Statement stm= conn.createStatement();
            stm.executeUpdate(str);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public int getNamHienTai() {
        return namHienTai;
    }

    public int getHocKi() {
        return hocKi;
    }
    
    
    
    
}
