package project0;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationCheckUI {
	private static JTextField t1;
	private static JTextField t2;

//	public static void main(String[] args) {
	public void ReservationCheckUi() {
		
		JFrame f = new JFrame("코로나19 예방접종 사전예약 시스템");
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(1400, 900);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약조회");
		lblNewLabel.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(200, 191, 141, 83);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(247, 326, 149, 67);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("주민등록번호");
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(247, 446, 149, 67);
		f.getContentPane().add(lblNewLabel_1_1);
	
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 24));
		t1.setBounds(582, 326, 281, 67);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 24));
		t2.setColumns(10);
		t2.setBounds(582, 446, 281, 67);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage dao = new Mainpage();
				dao.main(null);
				f.dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(130, 68, 225, 67);
		f.getContentPane().add(btnNewButton);
		
		ImageIcon logo = new ImageIcon("logo.png");
		btnNewButton.setIcon(logo);
		
		JButton btnNewButton_1 = new JButton("예약조회/취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationCheckUI dao = new ReservationCheckUI();
				dao.ReservationCheckUi();
				f.dispose();
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 20));
		btnNewButton_1.setBounds(685, 133, 192, 48);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("의료기관 찾기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search dao = new Search();
				try {
					dao.name();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				f.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(889, 133, 192, 48);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("알림마당");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				howtoReserv dao = new howtoReserv();
				dao.howoReserv();
				f.dispose();
			}
		});
		btnNewButton_1_2.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(1093, 133, 149, 48);
		f.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("예약하기");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationUI1 dao = new ReservationUI1();
				dao.name();
				f.dispose();
			}
		});
		btnNewButton_1_3.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 20));
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(532, 133, 141, 48);
		f.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("조회하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String ssn = t2.getText();
				
				ReservationDAO db = new ReservationDAO();
				try {
					db.read(name, ssn);
					f.dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(1028, 722, 155, 48);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
		
	}
}
