package gui;

import utilities.DBConnect;

public class Test {
	public static void main(String[] args) {
		
		/*
		 * Kiểm tra kết nối với cơ sở dữ liệu 
		 */
		
		DBConnect.connect();
		
		System.out.println(DBConnect.getConnection());
		
	}
}
