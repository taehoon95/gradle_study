package gradle_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gradle_study.UI.DepartmentUI;
import gradle_study.UI.TitleUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnDepartment;
	private JButton btnTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUI frame = new UserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("UserUI");
		lblTitle.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnDepartment = new JButton("\uBD80\uC11C");
		btnDepartment.addActionListener(this);
		pBtn.add(btnDepartment);
		
		btnTitle = new JButton("\uC9C1\uCC45");
		btnTitle.addActionListener(this);
		pBtn.add(btnTitle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTitle) {
			btnTitleActionPerformed(e);
		}
		if (e.getSource() == btnDepartment) {
			btnDepartmentActionPerformed(e);
		}
	}
	protected void btnDepartmentActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "부서버튼 클릭");
		DepartmentUI frame = new DepartmentUI();
		frame.setVisible(true);
	}
	protected void btnTitleActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "직책버튼 클릭");
		TitleUI frame = new TitleUI();
		frame.setVisible(true);
	}
}
