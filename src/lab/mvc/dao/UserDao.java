package lab.mvc.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




import lab.mvc.model.UserInfo;

public class UserDao {
	public void insertUser(UserInfo user) {
		// 用户注册方法
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;

		try {
			conn = dbmanage.initDB();
			sta = conn.createStatement();
			String sql = ("insert into UserInfo(email,password,firstName,lastName,tel)value('"+user.getEmail()+"','"+user.getPassword()+"','"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getTel()+"')");
    		System.out.println("data inserted");
			
			sta.executeUpdate(sql);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// 执行完关闭数据库
			dbmanage.closeDB(sta, conn);
		}
	}

	public UserInfo judgeUserPassword(String email, String password) {
		 // 用户登录验证
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserInfo user = null;
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            System.out.println(email);
            System.out.println(password);
            String sql = "SELECT * FROM UserInfo WHERE email = '"+ email + "' AND password= '" + password + "'";
            rs = sta.executeQuery(sql);
            
            while (rs.next()) {
            	
            	user = new UserInfo();
            	user.setEmail(rs.getString("email"));
            	user.setPassword(rs.getString("password"));
            	System.out.println("user exist");

            }


        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }

        return user;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public ArrayList<UserInfo> selectNotDeleteList() {
//        // 查询所有正常用户
//        Dbmanage dbmanage = new Dbmanage();
//        Connection conn = null;
//        Statement sta = null;
//        ResultSet rs = null;
//        UserInfo user = null;
//        ArrayList<UserInfo> list = new ArrayList<UserInfo>();
//        try {
//            conn = dbmanage.initDB();
//            sta = conn.createStatement();
//
//            String sql = "SELECT * FROM UserInfo";
//
//            rs = sta.executeQuery(sql);
//            while (rs.next()) {
//
//            	user = new UserInfo();
//                user.setEmail(rs.getString("email"));
//            	user.setPassword(rs.getString("password"));
//            	user.setFirstName(rs.getString("firstName"));
//            	user.setLastName(rs.getString("lastName"));
//            	user.setTel(rs.getString("tel"));
//            	user.setHouseId(rs.getString("houseId"));
//
//                list.add(user);
//            }
//
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//        } finally {
//            // 执行完关闭数据库
//            dbmanage.closeDB(rs, sta, conn);
//        }
//        return list;
//    }
//	
//	
//	
	public UserInfo selectOneUserInfo(String email) {
        // 查看单一用户信息
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserInfo user = null;

        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "SELECT * FROM UserInfo WHERE email = '"+ email + "'";
            rs = sta.executeQuery(sql);
            while (rs.next()) {
                user = new UserInfo();
                user.setEmail(rs.getString("email"));
            	user.setPassword(rs.getString("password"));
            	user.setFirstName(rs.getString("firstName"));
            	user.setLastName(rs.getString("lastName"));
            	user.setTel(rs.getString("tel"));
            	user.setHouseId(rs.getString("houseId"));

            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }
        return user;

    }

	
}
