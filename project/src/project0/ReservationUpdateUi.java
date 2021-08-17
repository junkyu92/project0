package project0;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationUpdateUi {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

//	public static void main(String[] args) {
	
	public void open1(String[] result) {
		JFrame f = new JFrame("코로나19 예방접종 사전예약 시스템");
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(1400, 900);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약정보");
		lblNewLabel.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(200, 191, 141, 83);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("주민등록번호");
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(271, 361, 149, 67);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("이름");
		lblNewLabel_1_2.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(271, 284, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2);
		
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
		btnNewButton.addActionListener(new ActionListener() {
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
		
		JLabel lblNewLabel_1_2_1 = new JLabel("백신종류");
		lblNewLabel_1_2_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1_2_1.setBounds(271, 438, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("전화번호");
		lblNewLabel_1_2_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1_2_1_1.setBounds(271, 515, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("날짜");
		lblNewLabel_1_2_1_2.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		lblNewLabel_1_2_1_2.setBounds(271, 592, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JLabel l1 = new JLabel(result[0]);
		l1.setFont(new Font("굴림", Font.BOLD, 30));
		l1.setBounds(505, 361, 284, 67);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel(result[1]);
		l2.setFont(new Font("굴림", Font.BOLD, 30));
		l2.setBounds(505, 284, 284, 67);
		f.getContentPane().add(l2);
		
		t1 = new JTextField(result[2]);
		t1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		t1.setBounds(505, 438, 284, 67);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField(result[3]);
		t2.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		t2.setColumns(10);
		t2.setBounds(505, 515, 284, 67);
		f.getContentPane().add(t2);
		
		t3 = new JTextField(result[4]);
		t3.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 24));
		t3.setColumns(10);
		t3.setBounds(505, 592, 284, 67);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("변경하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationDAO dao = new ReservationDAO();
				String ssn = l1.getText();
				String vaccine = t1.getText();
				String tel = t2.getText();
				String days = t3.getText();
				try {
					dao.update(ssn, vaccine, tel, days);
					f.dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 30));
		b1.setBounds(889, 753, 159, 48);
		f.getContentPane().add(b1);
		
		f.setVisible(true);
		
	
	}
}
