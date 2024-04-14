package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Email;
import utilities.DBConnect;

public class Email_DAO {
	
	// Khai báo kết nối
	private Connection conn;
	
	public Email_DAO() {
		super();
		// Lấy kết nối
		conn = DBConnect.getConnection();
	}
	
	// Viết các hàm thêm, sửa, xóa, tìm kiếm, lấy tất cả và lấy theo ID email
	
	public boolean insertEmail(Email email) {
		
		//String query = "INSERT INTO .......";
		// Gợi ý: Viết truy vấn thêm dữ liệu vào bảng email
		// Gợi ý: Sử dụng PreparedStatement để tránh SQL Injection
		// Gợi ý: Thay thế dấu ? bằng giá trị tương ứng, bắt đầu từ 1
		// Gợi ý: Thực thi truy vấn thêm dữ liệu (INSERT, UPDATE, DELETE)
		// Gợi ý: Bắt lỗi nếu có
		
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// Khi lỗi chương trình sẽ trả về false
			return false;
		}
		// Thực hiện hết mà không lỗi gì sẽ trả về true
		
		return true;
	}
	
	
	// Mẫu hàm sửa, có thể tham khảo nếu chưa rõ
	public boolean editEmail(Email email) {
		// Viết truy vấn cập nhật, thay những giá trị bằng dấu ?
		// Dấu ? đầu tiên sẽ tính là 1 -> n (Khác mảng, mảng bắt đầu từ 0)
		String query = "UPDATE email SET sender = ?, receiver = ?, subject = ?, body = ?, status = 'BAN_NHAP') WHERE id = ?";
		
		try {
			// Chuẩn bị truy vấn
			PreparedStatement ps = conn.prepareStatement(query);
			
			// Thay thế dấu ? bằng giá trị tương ứng, bắt đầu từ 1
			// Chuỗi dùng setString, số nguyên dùng setInt, số thực dùng setDouble,......
			ps.setString(1, email.getFrom());
			ps.setString(2, email.getTo());
			ps.setString(3, email.getSubject());
			ps.setString(4, email.getContent());
			ps.setInt(5, email.getId());
			
			// Thực thi truy vấn cập nhật (INSERT, UPDATE, DELETE)
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public List<Email> getAllEmail() {
		
		List<Email> list = new ArrayList<Email>();
		//String query = "SELECT * FROM email";
		
		// Gợi ý: Sử dụng try-catch để bắt lỗi 
		// Gợi ý: Sử dụng ResultSet để lấy dữ liệu từ câu truy vấn
		// Gợi ý: Sử dụng vòng lặp while để lấy dữ liệu từ ResultSet (Dùng hàm next() trên ResultSet)
		// Gợi ý: Thêm dữ liệu vào list
		// Gợi ý: Trả về list
		
		return list;
	}
	
	public Email findEmailByID(int id) {
		
		String query = "SELECT * FROM email WHERE id = ?";
	
		// Gợi ý: Sử dụng try-catch để bắt lỗi
		// Gợi ý: Sử dụng PreparedStatement để tránh SQL Injection
		// Gợi ý: Sử dụng ResultSet để lấy dữ liệu từ câu truy vấn
		// Gợi ý: Sử dụng hàm next() trên ResultSet để lấy dữ liệu
		// Gợi ý: Trả về đối tượng Email
		
		
		return null;
	}
	
}
