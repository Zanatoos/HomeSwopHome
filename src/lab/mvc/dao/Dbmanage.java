package lab.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class Dbmanage {
	private static String url = "jdbc:derby:/Users/Ziguette/Documents/Workspace/GitHub/HomeSwopHome/homeswophome_db;create=true";
	private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    public Connection initDB() {
    	
        Connection conn = null;
        try {
        	Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "root");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return conn;
        // 返回数据库连接
    }

    public void closeDB(Statement sta, Connection conn) {
        // 关闭数据库连接（无结果集）
    	try
        {
            if (sta != null)
            {
                sta.close();
            }
            if (conn != null)
            {
                sta.close();
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }

    public void closeDB(ResultSet rs, Statement sta, Connection conn) {
        // 关闭数据库连接（有结果集）
        try {
            rs.close();
            sta.close();
            conn.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}
