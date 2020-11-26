package SQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataProvider {
    private static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
    private static final String DB_URL= "jdbc:mysql://localhost/projectcuoikhoa";
    
    private Connection conn= null;
    private static DataProvider INSTANCE= new DataProvider();
    
    private DataProvider(){
    }
    
    public static DataProvider get(){
        return INSTANCE;
    }
    
    public Connection connect(){
        try{
            //nếu đang kết nối thí ko kết nối nữa
            if(conn!= null && !conn.isClosed()){
                return conn;
            }
            //thực hiện kết nối
            Class.forName(JDBC_DRIVER);
            conn= DriverManager.getConnection(DB_URL, "root", "123456789");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
}
