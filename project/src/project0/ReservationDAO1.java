package project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReservationDAO1 {
	public int create(String name, String ssn, String tel, String vaccine, String days) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. vaccine_reserv db연결 성공!!!");
		
		String sql = "insert into reservation (name, ssn, tel, vaccine, days) values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, ssn);
		ps.setString(3, tel);
		ps.setString(4, vaccine);
		ps.setString(5, days);
		System.out.println("3. sql문 생성 성공!!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송!!!");
		System.out.println("SQL문 수행 개수 " + result);
		return result;
	}
	public int update(String ssn, String days) throws Exception { 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. vaccine_reserv db연결 성공!!!");
		
		String sql = "update reservation set days = ? where ssn = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, days);
		ps.setString(2, ssn);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송!!!");
		System.out.println(result);
		return result;
	}
	public int delete(String ssn) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. vaccine_reserv db연결 성공!!!");
		
		String sql = "delete from reservation where ssn = ?"; 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ssn);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate(); 
		System.out.println("4. sql문 전송!!!");
		System.out.println(result);
		return result;
	}
	public String[] read(String ssn) throws Exception { 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. vaccine_reserv db연결 성공!!!");
		
		String sql = "select * from reservation where ssn = 1111111111111"; 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ssn);
		System.out.println("3. sql문 생성 성공!!!");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송!!!");
		System.out.println(rs.next());
		String[] result = new String[4];
						  // {"win", "win", "win", "win"}
		if (rs.next()) {
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
//			System.out.println(id2 + " " + pw + " " + name + " " + tel);
			result[0] = id2;
//			result[1] = pw;
			result[2] = name;
			result[3] = tel;
		}
		return result;
	}
}
