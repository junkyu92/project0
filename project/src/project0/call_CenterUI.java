package project0;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import project0.call_CenterDAO;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableStringConverter;
import javax.xml.transform.Result;
import javax.swing.ScrollPaneConstants;

public class call_CenterUI {
	static JTable table; // CRUD가 끝나면 removeall(); 해주기위해서 전역변수로 만듬
	static String[] cart; // CRUD용 전용 배열

	public static void callCenter() throws Exception {
		JFrame f = new JFrame();
		f.setSize(1400, 900);
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 눌렀을때 빨간네모 사라짐
		String[] title = { "센터고유번호", "주소(구)", "전화번호", "운영요일", "운영시간" }; // 제이테이블 타이틀
		String[][] contents = new String[15][5]; // 제이테이블 컨텐츠. 컬럼값들을 넣기위한 공간

		call_CenterDAO dd = new call_CenterDAO(); //

		for (int i = 0; i < contents.length; i++) {// UI가 켜지면 바로 select을 통해서 컬럼값 가져오기
			cart = dd.read(i);
			for (int j = 0; j < 5; j++) {
				contents[i][j] = cart[j];
			}
			cart = null; // CRUD할때마다 사용하기위해서 초기화 시켜버림
		}
		// 제이테이블+스크롤 생성.
		table = new JTable(contents, title);
		table.setBounds(12, 216, 1360, 443);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(131, 181, 1140, 264);
		f.getContentPane().add(scroll);

		// 행 추 가 버 튼
		JButton btnNewButton = new JButton("행 추가");
		btnNewButton.setBounds(131, 101, 97, 70);
		btnNewButton.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String center_num = JOptionPane.showInputDialog("센터고유번호를 입력하세요. 예)1");
				String address = JOptionPane.showInputDialog("주소를 입력하세요. 예)Yongsan");
				String ins_tel = JOptionPane.showInputDialog("센터전화번호를 입력하세요 예)02-000-0000");
				String open_day = JOptionPane.showInputDialog("운영요일을 입력하세요. week 또는 weekend");
				String open_time = JOptionPane.showInputDialog("운영시간을 입력하세요. 예)09:00~18:00");

				call_CenterDAO db = new call_CenterDAO();

				try {
					int result = db.create(center_num, address, ins_tel, open_day, open_time);
					if (result != 0) {
						JOptionPane.showMessageDialog(f, "센터고유번호 " + center_num + "번 행 추가 성공.");
						// table.setVisible(false);
						table.removeAll();
						
						for (int i = 0; i < contents.length; i++) {
							cart = dd.read(i);
							for (int j = 0; j < 5; j++) {
								contents[i][j] = cart[j];
							}
							cart = null;
						}

						table = new JTable(contents, title);
						table.setBounds(12, 216, 1360, 443);
						JScrollPane scroll = new JScrollPane(table);
						scroll.setBounds(131, 181, 1140, 264);
						f.getContentPane().add(scroll);
						// table.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(f, "센터고유번호 " + center_num + "번 행 추가 실패. 관리자에게 문의하세요.");

					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnNewButton.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton);

		// 행 제거 버 튼
		JButton btnNewButton_1 = new JButton("행 제거");
		btnNewButton_1.setBounds(240, 101, 97, 70);
		btnNewButton_1.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String center_num = JOptionPane.showInputDialog("삭제할 센터고유번호 입력 예)1");
				call_CenterDAO db = new call_CenterDAO();
				try {
					int result = db.delete(center_num);
					if (result != 0) {
						JOptionPane.showMessageDialog(f, "센터고유번호 " + center_num + "번의 행이 성공적으로 삭제되었습니다.");
						// table.setVisible(false);
						table.removeAll();
						for (int i = 0; i < contents.length; i++) {
							cart = dd.read(i);
							for (int j = 0; j < 5; j++) {
								contents[i][j] = cart[j];
							}
							cart = null;
						}
						table = new JTable(contents, title);
						table.setBounds(12, 216, 1360, 443);
						JScrollPane scroll = new JScrollPane(table);
						scroll.setBounds(131, 181, 1140, 264);
						f.getContentPane().add(scroll);
						// table.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(f, "센터고유번호 " + center_num + "번의 행 삭제 실패. 관리자에게 문의하세요.");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton_1);

		// 행 업데이트 버튼
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.setBounds(349, 101, 122, 70);
		btnNewButton_2.setFont(new Font("G마켓 산스 TTF Light", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String center_num = JOptionPane.showInputDialog(f, "변경할 센터고유번호를 입력하세요 예)1");
				String wantUpdate = JOptionPane
						.showInputDialog("변경할 칼럼 입력\n [address] [ins_tel] [open_day] [open_time]");
				// String ins_tel = JOptionPane.showInputDialog(f, "변경할 내용 입력을 하세요.");
				String content = JOptionPane.showInputDialog(f,
						"센터번호 " + center_num + "번의 " + wantUpdate + "을 어떻게 변경하시겠습니까?");

				call_CenterDAO db = new call_CenterDAO();
				try {
					int result = db.update(center_num, wantUpdate, content);
					if (result != 0) {
						JOptionPane.showMessageDialog(f,
								"센터고유번호 " + center_num + "번의 " + wantUpdate + "칼럼이 수정 완료되었습니다.");

						// table.setVisible(false);
						table.removeAll();

						for (int i = 0; i < contents.length; i++) {
							cart = dd.read(i);
							for (int j = 0; j < 5; j++) {
								contents[i][j] = cart[j];
							}
							cart = null;
						}
						table = new JTable(contents, title);
						table.setBounds(12, 216, 1360, 443);
						JScrollPane scroll = new JScrollPane(table);
						scroll.setBounds(131, 181, 1140, 264);
						f.getContentPane().add(scroll);
						// table.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(f, "센터고유번호 " + center_num + "번의 행 수정이 실패했습니다. 관리자에게 문의하세요.");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_4 = new JLabel("☎콜센터 안내 [서울]");
		lblNewLabel_4.setBounds(131, 36, 231, 55);
		lblNewLabel_4.setFont(new Font("G마켓 산스 TTF Bold", Font.BOLD, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		f.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("온라인 예약방법");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				howtoReserv s = new howtoReserv();
				s.howoReserv();
				f.dispose();
				
				
			}
		});
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setFont(new Font("G마켓 산스 TTF Bold", Font.PLAIN, 12));
		btnNewButton_3.setBounds(1137, 37, 134, 55);
		f.getContentPane().add(btnNewButton_3);

		f.setVisible(true);

	}

	protected Object callCenter;
}
