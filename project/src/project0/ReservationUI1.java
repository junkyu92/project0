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

public class ReservationUI1 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

//	public static void main(String[] args) {
	public void name() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(1400, 900);
		f.getContentPane().setLayout(null);
		
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
		
		JLabel lblNewLabel = new JLabel("이름 *");
		lblNewLabel.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel.setBounds(130, 204, 253, 47);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		t1.setBounds(475, 204, 278, 51);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("주민등록번호(13자리) *");
		lblNewLabel_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_1.setBounds(130, 276, 253, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		l4.setBounds(475, 546, 278, 50);
		f.getContentPane().add(l4);
		f.setVisible(true);
		
		JLabel l5 = new JLabel("");
		l5.setFont(new Font("굴림", Font.BOLD, 20));
		l5.setBounds(740, 651, 278, 47);
		f.getContentPane().add(l5);
		
		t2 = new JTextField();
		t2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(475, 276, 278, 51);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("휴대폰번호 *");
		lblNewLabel_2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_2.setBounds(130, 351, 253, 47);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBounds(475, 348, 278, 51);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("예약일시 선택 *");
		lblNewLabel_3.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_3.setBounds(130, 640, 253, 47);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("본인인증");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ssn = t2.getText();
				// ssn을 substring으로 추출해서 int로 변환
				// label로 settext로 띄우기
				String year = ssn.substring(0, 2);
				int year2 = Integer.parseInt(year);
				if (year2 >= 92 || year2 <= 3 ) {
					l4.setText("Pfizer");
				}else if (year2 >= 81 && year2 <= 91) {
					l4.setText("Janssen");
				}else if (year2 >= 70 && year2 <= 80) {
					l4.setText("AstraZeneca");
				}else if (year2 >= 61 && year2 <= 69) {
					l4.setText("MODERNA");
				}else if (year2 >= 10 && year2 <= 60) {
					l4.setText("Pfizer");
				}else {
					l4.setText("대상자가 아닙니다");
				}
			}
		});
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		b1.setBounds(475, 418, 203, 92);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("예약일시 선택");
		b2.setForeground(Color.WHITE);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resdays = JOptionPane.showInputDialog("원하시는 예약일시를 입력해주세요.(예: 20210715)");
				l5.setText(resdays);
			}
		});
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		b2.setBounds(475, 640, 203, 67);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("예약");
		b3.setForeground(Color.WHITE);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String ssn = t2.getText();
				String tel = t3.getText();
				String vaccine = l4.getText();
				String days = l5.getText();
				ReservationDAO1 db = new ReservationDAO1();
				try {
					int result = db.create(name, ssn, tel, vaccine, days); // 
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "예약이 완료되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "예약에 실패했습니다..");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				l4.setText("");
				l5.setText("");
			}
		});
		b3.setBackground(Color.BLUE);
		b3.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		b3.setBounds(951, 750, 133, 67);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("취소");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage dao = new Mainpage();
				dao.main(null);
				f.dispose();
			}
		});
		b4.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 25));
		b4.setBackground(Color.WHITE);
		b4.setBounds(1096, 750, 133, 67);
		f.getContentPane().add(b4);
		
		JLabel lblNewLabel_1_1 = new JLabel("본인인증 *");
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(130, 429, 253, 47);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("예약대상 백신");
		lblNewLabel_1_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(130, 549, 253, 47);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(538, 287, 57, 15);
		f.getContentPane().add(label);
	}
}
