package project0;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;

public class Search {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JButton b2;

//	public static void main(String[] args) {
		public void name() {
		JFrame f= new JFrame();
		f.setSize(1400,900);
		f.getContentPane().setLayout(null);
		
		JButton b0 = new JButton("");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage dao = new Mainpage();
				dao.main(null);
				f.dispose();
			}
		});
		b0.setBackground(Color.WHITE);
		b0.setBounds(130, 68, 225, 67);
		f.getContentPane().add(b0);
		
		ImageIcon logo = new ImageIcon("logo.png");
		b0.setIcon(logo);
		
		JButton btnNewButton;
		b2 = new JButton("예약조회/취소");
		b2.setBounds(737, 48, 192, 66);
		b2.setBackground(Color.WHITE);
		b2.setFont(new Font("Gmarket Sans", Font.BOLD, 25));
		f.getContentPane().add(b2);

		JButton b3 = new JButton("의료기관 찾기");
		b3.setBounds(941, 48, 192, 66);
		b3.setFont(new Font("Gmarket Sans", Font.BOLD, 25));
		b3.setBackground(Color.WHITE);
		f.getContentPane().add(b3);

		JButton b4 = new JButton("알림마당");
		b4.setBounds(1145, 48, 192, 66);
		b4.setFont(new Font("Gmarket Sans", Font.BOLD, 25));
		b4.setBackground(Color.WHITE);
		f.getContentPane().add(b4);

		JButton b1 = new JButton("예약하기");
		b1.setBounds(592, 48, 133, 66);
		b1.setFont(new Font("Gmarket Sans", Font.BOLD, 25));
		b1.setBackground(Color.WHITE);
		f.getContentPane().add(b1);
		
		t1 = new JTextField();
		t1.setBounds(101, 331, 224, 61);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(425, 331, 224, 61);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(749, 331, 224, 61);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(1073, 331, 224, 61);
		f.getContentPane().add(t4);
		
		JButton btnNewButton1 = new JButton("의료기관찾기");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String insNum = t1.getText();
				String insName = t2.getText();
				String address = t3.getText();
				String insTel = t4.getText();
				
				Vaccine_reservDAO db = new Vaccine_reservDAO();
				try {
					int result  = db.create(insNum, insName, address, insTel);
					if (result == 1) {
						JOptionPane.showConfirmDialog(f, "검색 완료");
					}else {
						JOptionPane.showConfirmDialog(f, "해당 기관이 없습니다");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton1.setFont(new Font("Gmarket Sans", Font.BOLD, 30));
		btnNewButton1.setBounds(610, 486, 213, 71);
		f.getContentPane().add(btnNewButton1);
		
		JLabel lblNewLabel = new JLabel("의료기관 찾기");
		lblNewLabel.setFont(new Font("Gmarket Sans", Font.BOLD, 35));
		lblNewLabel.setBounds(94, 154, 230, 66);
		f.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("광역시도");
		l1.setFont(new Font("Noto Sans KR", Font.PLAIN, 14));
		l1.setBounds(425, 308, 61, 16);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("시군구");
		l2.setFont(new Font("Noto Sans KR", Font.PLAIN, 14));
		l2.setBounds(749, 308, 61, 16);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("읍면동");
		l3.setFont(new Font("Noto Sans KR", Font.PLAIN, 14));
		l3.setBounds(1073, 308, 61, 16);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("전체의료기관");
		l4.setFont(new Font("Noto Sans KR", Font.PLAIN, 14));
		l4.setBounds(101, 308, 97, 16);
		f.getContentPane().add(l4);
		f.setVisible(true);
		

	}
}
