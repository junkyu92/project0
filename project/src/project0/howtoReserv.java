package project0;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class howtoReserv {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void howoReserv() {
		JFrame j = new JFrame();
		j.getContentPane().setBackground(Color.WHITE);
		j.setSize(1400, 900);
		j.getContentPane().setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel_1 = new JLabel("<html>코로나 19 예방접종! 온라인 예약 어려우신가요?<p> 차근차근~ 안내해드리겠습니다!</html>");
		lblNewLabel_1.setOpaque(true);// 구글링
		lblNewLabel_1.setBackground(SystemColor.desktop);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("G마켓 산스 TTF Bold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(167, 37, 932, 125);
		j.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("코로나19 예방접종 온라인 예약은 현재 접속 중인 해당 홈페이지에서 진행하실 수 있습니다.");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Light", Font.ITALIC, 20));
		lblNewLabel_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1.setBounds(167, 239, 932, 63);
		j.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("◆코로나19 예방접종 온라인 예약◆");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("G마켓 산스 TTF Bold", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1_1.setBounds(167, 190, 415, 63);
		j.getContentPane().add(lblNewLabel_1_1_1);

		JButton btnNewButton = new JButton("<html>코로나19 예방접종<p>온라인 예약하러 가기</html>\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservationUI1 dao = new ReservationUI1();
				dao.name();
				j.dispose();
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("G마켓 산스 TTF Bold", Font.BOLD, 14));
		btnNewButton.setBounds(952, 612, 383, 136);
		j.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("☎콜센터 안내"); // 새창데이터전달
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call_CenterUI dao = new call_CenterUI();
				try {
					dao.callCenter();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				j.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("G마켓 산스 TTF Bold", Font.BOLD, 14));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(1135, 37, 200, 125);
		j.getContentPane().add(btnNewButton_1);

		j.setVisible(true);

		JLabel p1 = new JLabel("");
		p1.setBounds(167, 291, 773, 457);
		j.getContentPane().add(p1);
		ImageIcon t1 = new ImageIcon("예약방법1.png");
		p1.setIcon(t1);

		JLabel lblNewLabel = new JLabel("1.이름,주민등록번호,휴대폰번호를 입력해주세요.");
		lblNewLabel.setBounds(952, 361, 301, 35);
		j.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("2.본인인증을 클릭하면 나이에따라 백신의 종류가 정해집니다.");
		lblNewLabel_2.setBounds(952, 456, 383, 35);
		j.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("3.예약일시를 선택하고, 예약버튼을 누르면 끝!!");
		lblNewLabel_2_1.setBounds(952, 569, 344, 35);
		j.getContentPane().add(lblNewLabel_2_1);

	}
}
