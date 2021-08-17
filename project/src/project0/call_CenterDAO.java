package project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class call_CenterDAO { // Data Access object. 클래스. 테이블당 하나씩 만들어야함
	// 자바에서 db처리할때는 DML중심으로 클래스를 만든다.
	// db연결할 대는 db를 단위로 연결한다.
	// db연결하여 데이터처리를 하는 클래스를 만들 때는 테이블단위로 만든다.
	// 테이블(엔티티,개체)
	// create(insert~into values)

	public int create(String center_num, String address, String ins_tel, String open_day, String open_time)
			throws Exception {

// 1.jdbc connector설정  드라이브or커넥터 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!");

// 2.db로 연결: 연결할주소 url(ip,port,db명),usrname,password
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv"; // 북으로 바꿔
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.call_center db 연결 승인/연결 성공!");

//3.sql문을 만든다.
		String sql = "insert into call_center values (?,?,?,?,?)"; // ?가 문법임
		// PreparedStatement: sql을 나타내는 부품. sql 객체.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, center_num);// 위에 1번 물음표
		ps.setString(2, address);
		ps.setString(3, ins_tel);
		ps.setString(4, open_day);
		ps.setString(5, open_time);

		// 부품을 램에 넣어놓은 주소만 있으면 됨
		// ps부품을 2단계에서 획득한 con부품이 만들어서 리턴.
		System.out.println("3.sql문 생성 성공!!");

		// 4.sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!");
		System.out.println("SQL문 수행 개수 " + result + "개. 0이면 실패입니다."); // 1이라고뜨면 성공. 하나 완료했다는뜻.
		return result;

	}

	public int delete(String id) throws Exception {

// 1.jdbc connector설정  드라이브or커넥터 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!");

// 2.db로 연결: 연결할주소 url(ip,port,db명),usrname,password
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.call_center db 연결 승인/연결 성공!");

//3.sql문을 만든다.
		// String sql = "insert into member values ('apple2','apple2','apple2','019')";
		// //sql는 싱글따옴표. "쓰면 String"" 이거 끝나는줄암
		String sql = "delete from call_center where center_num=?"; // ?갯수 하나
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에 id를 넣어라.

		// PreparedStatement: sql을 나타내는 부품.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 리턴.
		System.out.println("3.sql문 생성 성공!!");

// 4.sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!");
		System.out.println(result); // 1이라고뜨면 성공쓰 하나 완료했다는뜻.
		return result;
	}

	public int update(String center_num, String wantUpdate, String content) throws Exception {
		// 자바와 db연결하는 프로그램: (jdbc)

// 1.jdbc connector설정  드라이브or커넥터 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!");

// 2.db로 연결: 연결할주소 url(ip,port,db명),usrname,password
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.call_center db 연결 승인/연결 성공!");

//3.sql문을 만든다.
		// String sql = "insert into member values ('apple2','apple2','apple2','019')";
		// //sql는 싱글따옴표. "쓰면 String"" 이거 끝나는줄암
		// String sql = "delete from member where id='apple'";
		// String sql = "update call_center set ? = ? where center_num=?"; // 물음표 순서대로 .
		String sql = "update call_center set " + wantUpdate + "=" + "? where center_num=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, content);
		ps.setString(2, center_num);

		// PreparedStatement: sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨
		// ps부품을 2단계에서 획득한 con부품이 만들어서 리턴.
		System.out.println("3.sql문 생성 성공!!");

// 4.sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!");
		System.out.println(result); // 1이라고뜨면 성공쓰 하나 완료했다는뜻.
		return result;

	}

	public String[] read(int id) throws Exception {

		// 1.jdbc connector설정 드라이브or커넥터 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!");

		// 2.db로 연결: 연결할주소 url(ip,port,db명),usrname,password
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.call_center db 연결 승인/연결 성공!");

		// 3.sql문을 만든다.
		// String sql = "insert into member values ('apple2','apple2','apple2','019')";
		// //sql는 싱글따옴표. "쓰면 String"" 이거 끝나는줄암
		String sql = "select * from call_center where center_num=?"; // ?갯수 하나
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, id);// 1번 물음표에 id를 넣어라.

		// PreparedStatement: sql을 나타내는 부품.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 리턴.
		System.out.println("3.sql문 생성 성공!!");

		// 4.sql문을 mysql로 전송한다.
		// int result = ps.executeUpdate(); //executeUpdate는 무조건 int로 반환해서.. 테이블로 갖고올려면
		ResultSet rs = ps.executeQuery();// 이거 써줘야함. 해당 컬럼의 값을 나타내주는애 ★

		System.out.println("4.sql문 전송 성공!");
		// System.out.println(rs.next()); // 1 이라고뜨면 하나 성공했다는뜻. //있어야 값을 꺼내오니까 next!!!!
		// ★
		String[] result = new String[5];

		if (rs.next()) {
			// 테이블에 검색결과가 있다라고 얘기.
			String center_num = rs.getString(1);
			String address = rs.getString(2);
			String ins_tel = rs.getString(3);
			String open_day = rs.getString(4);
			String open_time = rs.getString(5);

			System.out.println(center_num + " " + address + " " + ins_tel + " " + open_day + " " + open_time);

			result[0] = center_num;
			result[1] = address;
			result[2] = ins_tel;
			result[3] = open_day;
			result[4] = open_time;
		}
		return result;

	}

}
