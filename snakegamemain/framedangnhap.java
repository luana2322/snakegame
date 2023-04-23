package snakegamemain;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import snakegamemain.signin;
import javax.swing.ImageIcon;

public class framedangnhap extends JFrame {

	private JPanel contentPane;
	public JTextField txtuser;
	private JPasswordField txtpass;
	public static String user1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		framedangnhap frame = new framedangnhap();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
	
	}

	/**
	 * Create the frame.
	 */
	public framedangnhap() {
		init();
	
		
	}
	public void init() {
		setTitle("LOG IN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1175, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(framedangnhap.class.getResource("/gachop/Hinh-nen-iPad-4K.png")));
		lblNewLabel_2.setBounds(-11, -30, 1172, 553);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(394, 109, 88, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(391, 22, 141, 21);
		contentPane.add(lblNewLabel);
		
		txtpass = new JPasswordField();
		txtpass.setBackground(new Color(128, 255, 255));
		txtpass.setBounds(298, 204, 453, 49);
		contentPane.add(txtpass);
		
		JButton btncreate = new JButton("Create an acount");
		btncreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				signin frame=new signin();
				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				
			}
		});
		btncreate.setForeground(Color.GREEN);
		btncreate.setBackground(new Color(255, 255, 255));
		btncreate.setBounds(399, 383,  255, 21);
		contentPane.add(btncreate);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				Connection c=null;

				try {
					DriverManager.registerDriver( new com.mysql.jdbc.Driver());
					String url="jdbc:MySQl://localhost:3306/dangnhap";
					String username="root";
					String password="";
					c=DriverManager.getConnection(url, username, password);
					
					Statement stmt=c.createStatement();
					
					String sql="select * from dangnhap.tt";
					ResultSet rs=stmt.executeQuery(sql);

					int a=0;
					while(rs.next()) {
						String  user=rs.getString("user");
						String  pw=rs.getString("pw");
				
						 user1=txtuser.getText();
						String pw1=txtpass.getText();
						
						if(user1.equals(user)&&pw1.equals(pw)) {
							a+=1;
							
						}
	
					}
					
					if(a==0) {
						JOptionPane.showMessageDialog(null, "Wrong information!");
					}else {
						
			
						
			start d=new start();
			d.setDefaultCloseOperation(EXIT_ON_CLOSE);
			d.setLocationRelativeTo(null);
			d.setVisible(true);
			dispose();
				
						
						
					}
					rs.close();stmt.close();	 c.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
				
			}
		});
		btnlogin.setForeground(Color.WHITE);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlogin.setBackground(new Color(0, 128, 64));
		btnlogin.setBounds(299, 303, 453, 49);
		contentPane.add(btnlogin);
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtuser.setColumns(10);
		txtuser.setBackground(new Color(128, 255, 255));
		txtuser.setBounds(299, 72, 453, 49);
		contentPane.add(txtuser);
	}
}
