
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
  private static Connection mysqlconfig;
public static Connection configDB() throws SQLException{  
try {
    String url="jdbc:mysql://localhost/penjualan_rumah";
  String user="root"; 
  String pass="";
  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  mysqlconfig=DriverManager.getConnection(url,user,pass);
}  catch (SQLException e){
    System.err.println("koneksi gagal" +e.getMessage());
}
return mysqlconfig;
    }
}
    
   

