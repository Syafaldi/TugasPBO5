package tugaspbocrud;
import java.sql.*;

public class DBConfig {
    public Connection getKoneksi()throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mahasiswa";
        Connection con = (Connection)DriverManager.getConnection(url,"root","");
        return con;
    }
}
