package lab.mvc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import lab.mvc.model.HouseInfo;


public class HouseDao {
	
	public void insertHouse(HouseInfo house) {
		// 用户注册方法
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;

		try {
			conn = dbmanage.initDB();
			sta = conn.createStatement();
			String sql = ("insert into HouseInfo(houseId, adrs_1, adrs_2, city, code_postal, country, date_start, date_fin, num_people, house_type, service, constraints, description)value('"+house.getHouseId()+"','"+house.getAdrs_1()+"','"+house.getAdrs_2()+"','"+house.getCity()+"','"+house.getCode_postal()+"','"+house.getCountry()+"','"+house.getDate_start()+"','"+house.getDate_fin()+"','"+house.getNum_people()+"','"+house.getHouse_type()+"','"+house.getService()+"','"+house.getConstraints()+"','"+house.getDescription()+"')");
    		System.out.println("data inserted");
			
			sta.executeUpdate(sql);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// 执行完关闭数据库
			dbmanage.closeDB(sta, conn);
		}
	}

	

}
