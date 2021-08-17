package project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ReservationDAO {
	
	public int delete(String ssn) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db연결 성공!!!");
		
		String sql = "delete from reservation where ssn = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ssn);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송");
		System.out.println(result);
		return result;
	}
	
	public int update(String ssn, String vaccine, String tel, String days) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db연결 성공!!!");
		
		String sql = "update reservation set vaccine = ? where ssn = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vaccine);
		ps.setString(2, ssn);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		
		sql = "update reservation set tel = ? where ssn = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, ssn);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		int result2 = ps.executeUpdate();
		
		sql = "update reservation set days = ? where ssn = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, days);
		ps.setString(2, ssn);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		int result3 = ps.executeUpdate();
		
		
		System.out.println("4. sql문 전송");
		System.out.println(result);
		if (result == 0 && result2 == 0 && result3 == 0) {
			JOptionPane.showMessageDialog(null, "수정실패");
		} else {
			sql = "select * from reservation where ssn = ?";
			PreparedStatement ps1 = con.prepareStatement(sql);
			ps1.setString(1, ssn);
			ResultSet rs = ps1.executeQuery();
			
			ReservationCancelUi dao = new ReservationCancelUi();
			String[] result1 = new String[5];
			
			if (rs.next()) {	
				result1[0] = rs.getString(1);
				result1[1] = rs.getString(2);
				result1[2] = rs.getString(3);
				result1[3] = rs.getString(4);
				result1[4] = rs.getString(5);
			dao.open1(result1);
		}
		}
		return result;
	}

	public void read(String name, String ssn) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "select * from reservation where name = ? and ssn = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, ssn);
		ResultSet rs = ps.executeQuery();
		
		ReservationCancelUi rc = new ReservationCancelUi();
		String[] result = new String[5];
		
		if (rs.next()) {	//True일경우 다른 UI로 넘어가게 만들기
			result[0] = rs.getString(1);
			result[1] = rs.getString(2);
			result[2] = rs.getString(3);
			result[3] = rs.getString(4);
			result[4] = rs.getString(5);
			rc.open1(result);
		} else {
			JOptionPane.showMessageDialog(null, "예약이 없습니다.");
		}
		
		
	}
	
}

