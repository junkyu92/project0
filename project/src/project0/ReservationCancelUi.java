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

public class ReservationCancelUi {
	
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
		
		JLabel l3 = new JLabel(result[2]);
		l3.setFont(new Font("굴림", Font.BOLD, 30));
		l3.setBounds(505, 438, 284, 67);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel(result[3]);
		l4.setFont(new Font("굴림", Font.BOLD, 30));
		l4.setBounds(505, 515, 284, 67);
		f.getContentPane().add(l4);
		
		JLabel l5 = new JLabel(result[4]);
		l5.setFont(new Font("굴림", Font.BOLD, 30));
		l5.setBounds(505, 592, 284, 67);
		f.getContentPane().add(l5);
		
		JButton btnNewButton_2 = new JButton("예약취소");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ssn = result[0]; 				//l1에 있는 DB에서 받아온 예약번호변수로 변경
				ReservationDAO db = new ReservationDAO();
				try {
					int result = db.delete(ssn);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "예약 취소되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "예약 취소실패");
					}
					f.dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 30));
		btnNewButton_2.setBounds(889, 753, 159, 48);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("정보수정");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationUpdateUi dao = new ReservationUpdateUi();
				dao.open1(result);
				f.dispose();
			}
		});
		btnNewButton_2_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 30));
		btnNewButton_2_1.setBounds(1060, 753, 159, 48);
		f.getContentPane().add(btnNewButton_2_1);
		
		f.setVisible(true);
		
	}
}
