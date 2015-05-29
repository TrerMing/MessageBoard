package cn.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDao {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
				try
		        {
					Class.forName("org.sqlite.JDBC");// 加载驱动 
					Connection conn = DriverManager.getConnection("jdbc:sqlite:F:/MyJavaProject/Blog/blog.db");// 连接数据库 
		         
		         Statement stat = conn.createStatement();
		         
		        //stat.executeUpdate( "create table t_user(id INTEGER PRIMARY KEY autoincrement,email varchair(100), username varchair(100), password varchair(100), registerDate datetime default (datetime('now', 'localtime')));" );//创建一个表，两列

		         
		         //stat.executeUpdate( "insert into t_user(email,username,password) values('270107721@qq.com','tanhaiyuan','tanhaiyuan');" ); //插入数据

		        
		         ResultSet rs = stat.executeQuery("select * from t_user;"); //查询数据 

		         while (rs.next()) { //将查询到的数据打印出来

		             System.out.print("username = " + rs.getString("username") + " "); //列属性一

		             System.out.println("password = " + rs.getString("password")); //列属性二
		             System.out.println("registerDate = " + rs.getString("registerDate")); //列属性二

		         }
		         rs.close();
		         conn.close(); //结束数据库的连接 

		        }
		        catch( Exception e )
		        {
		         e.printStackTrace ( );
		        }
	}
}

