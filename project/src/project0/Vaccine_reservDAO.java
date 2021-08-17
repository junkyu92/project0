package project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Vaccine_reservDAO {
	public int create(String insNum, String insName, String address, String insTel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "glen123qwe!";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공!!!");
		
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, insNum);
		ps.setString(2, insName);
		ps.setString(3, address);
		ps.setString(4, insTel);
		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println("SQL문 수행 개수 "  + result + "개");
		return result;
		
	}//create end
	public void update(String id, String tel) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		//2. java에서 db로 연결: 
		//   연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "glen123qwe!";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		
		//3. sql문을 만든다.
		String sql = "update member set tel = ? where id= ?";
		//PrepareStatment : sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 잇으면 됨.
		//ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, id);
		ps.setString(1, tel);
		System.out.println("3. sql문 생성 성공!!!");

		
		//4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		
		
	}//create end
	public int delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "glen123qwe!";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		
		String sql = "delete from member where id = ?"; //1
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
		
		
	}//create end
} //class end
