package project0;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Mainpage {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1400, 900);
		f.getContentPane().setLayout(null);

		JButton b99 = new JButton("");
		b99.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage dao = new Mainpage();
				dao.main(null);
				f.dispose();
			}
		});
		b99.setBackground(Color.WHITE);
		b99.setBounds(130, 68, 225, 67);
		f.getContentPane().add(b99);
		
		ImageIcon logo = new ImageIcon("logo.png");
		b99.setIcon(logo);
		
		JButton btnNewButton = new JButton("예약조회/취소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationCheckUI dao = new ReservationCheckUI();
				dao.ReservationCheckUi();
				f.dispose();
			}
		});
		btnNewButton.setBounds(675, 48, 223, 66);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 25));
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("의료기관 찾기");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(910, 48, 223, 66);
		btnNewButton_1.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.WHITE);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("알림마당");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				howtoReserv dao = new howtoReserv();
				dao.howoReserv();
				f.dispose();
			}
		});
		btnNewButton_1_1.setBounds(1145, 48, 192, 66);
		btnNewButton_1_1.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 25));
		btnNewButton_1_1.setBackground(Color.WHITE);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_2 = new JButton("예약하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationUI1 dao = new ReservationUI1();
				dao.name();
				f.dispose();
			}
		});
		btnNewButton_2.setBounds(517, 48, 146, 66);
		btnNewButton_2.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 25));
		btnNewButton_2.setBackground(Color.WHITE);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("사전예약 기간 안내");
		lblNewLabel.setForeground(UIManager.getColor("List.selectionForeground"));
		lblNewLabel.setFont(new Font("G마켓 산스 TTF Bold", Font.BOLD, 30));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(225, 190, 259, 44);
		f.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("List.selectionBackground"));
		panel.setBounds(188, 162, 1028, 419);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<HTML>-사전예약이 종료되어 예약 취소시 누리집을 통한 재예약은 불가하<br>일정 및 장소 변경은 예방접종센터로 문의해주시기 바랍니다</HTML>");
		lblNewLabel_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(UIManager.getColor("List.selectionForeground"));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(35, 148, 364, 71);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("예방접종 예약하기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationUI1 dao = new ReservationUI1();
				dao.name();
				f.dispose();
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 30));
		btnNewButton_3.setBounds(601, 108, 370, 85);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("접종예약 조회/취소");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationCheckUI dao = new ReservationCheckUI();
				dao.ReservationCheckUi();
				f.dispose();
			}
		});
		btnNewButton_3_1.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 30));
		btnNewButton_3_1.setForeground(Color.BLACK);
		btnNewButton_3_1.setBounds(601, 241, 370, 85);
		panel.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("<HTML>-사전예약기간 내 예약하지 않은 경우에도, 접종기간 종료 전까지<br>예방접종센터를 통해 예약하실 수 있습니다</HTML>");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(35, 231, 364, 71);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("<AZ 초과예약자 및 30세 미만 2분기 접종 대상자 사전예약 종료안내>");
		lblNewLabel_4.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(34, 98, 475, 26);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("코로나19 예방접종");
		lblNewLabel_2.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(188, 610, 133, 37);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("온라인 예약방법");
		lblNewLabel_3.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_3.setBounds(188, 642, 153, 31);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("코로나19 예방접종");
		lblNewLabel_2_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(592, 610, 133, 37);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("콜센터 안내");
		lblNewLabel_3_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(592, 642, 153, 31);
		f.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("코로나19 예방접종");
		lblNewLabel_2_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(1003, 610, 133, 37);
		f.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("의료기관찾기");
		lblNewLabel_3_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(1003, 642, 153, 31);
		f.getContentPane().add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				howtoReserv dao = new howtoReserv();
				dao.howoReserv();
				f.dispose();
			}
		});
		btnNewButton_4.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_4.setBounds(174, 593, 234, 167);
		f.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call_CenterUI dao = new call_CenterUI();
				try {
					dao.callCenter();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				f.dispose();
			}
		});
		btnNewButton_4_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_4_1.setBounds(582, 593, 234, 167);
		f.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
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
		btnNewButton_4_1_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_4_1_1.setBounds(990, 593, 234, 167);
		f.getContentPane().add(btnNewButton_4_1_1);
		
		f.setVisible(true);

	}
}
