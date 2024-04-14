/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author duong
 */
public class DBConnect {
	
	/*
	 * Lớp Connect Database tham khảo
	 */
	
	private static Connection conn;
	 
	public static void connect() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=IUHGDSC_Workshop_JavaSwing";
		try {
			conn = DriverManager.getConnection(url, "sa", "sapassword");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Kết nối thất bại, vui lòng kiểm tra tên Database, địa chỉ connect.");
			System.err.println("Cũng có thể lỗi đến từ việc chưa import thư viện, hãy: kiểm tra thư mục lib -> chọn sqljdbc -> chuột phải -> Build Path -> Add to Build Path.");

			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
	
	public static void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
