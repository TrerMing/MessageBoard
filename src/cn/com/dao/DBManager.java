package cn.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	public static Connection getConnection(){
		Connection conn = null;
		try {
			
			Class.forName("org.sqlite.JDBC");// 加载驱动 
	    	conn = DriverManager.getConnection("jdbc:sqlite:F:/MyJavaProject/MessageBoard/messageboard.db");// 连接数据库 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;	
	}
	
	public  static void closeConnection(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}
