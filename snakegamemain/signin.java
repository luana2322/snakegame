package snakegamemain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class signin extends JFrame {

	private JPanel contentPane;
	private JTextField txtusernameup;
	private JPasswordField txtpassword;
	private JPasswordField txtconfirmpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
				
		
	}

	/**
	 * Create the frame.
	 */
	public signin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1127, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		panel.setBounds(0, 0, 1113, 515);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "SIGN UP", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(249, 88, 677, 358);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtusernameup = new JTextField();
		txtusernameup.setBounds(100, 41, 480, 55);
		panel_1.add(txtusernameup);
		txtusernameup.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StringBuilder emty=new StringBuilder();
				if(txtusernameup.getText().equals("")) {
					emty.append("Username must be entered!");
				}
				if(txtpassword.getText().equals("")) {
					emty.append("\nPassword must be entered!");
				}
				if(txtconfirmpassword.getText().equals("")) {
					emty.append("\nConfirm password must be entered!");
				}
				if(!emty.isEmpty()) {
					JOptionPane.showMessageDialog(null, emty);
				} else if(!txtpassword.getText().equals(txtconfirmpassword.getText())) {
					JOptionPane.showMessageDialog(null, "Password and confirm password must be the same.");
				}else {
					
			
				
				
				Connection c=null;

				try {
					DriverManager.registerDriver( new com.mysql.jdbc.Driver());
					String url="jdbc:MySQl://localhost:3306/dangnhap";
					String username="root";
					String password="";
					c=DriverManager.getConnection(url, username, password);
					
					Statement stmt=c.createStatement();
					
					
					
					String name=txtusernameup.getText();
					String pass= txtpassword.getText();
					String pass1=txtconfirmpassword.getText();
					
				
					
					String sql1="select * from dangnhap.tt;";
					
					 ResultSet rs1=stmt.executeQuery(sql1);
					 int a=0;
					 while(rs1.next()) {
						 String name1=rs1.getString("user");
						 String pass2=rs1.getString("pw");
						 
						 if(name.equals(name1)) {
								JOptionPane.showMessageDialog(null, "Username already exists");
								a+=1;
						 }else {
					
							 
						 }
					 }
					 if(a==0) {
						 String sql="insert into dangnhap.tt values ('"+name+"','"+pass+"','"+0+"');";
						 int b=stmt.executeUpdate(sql);
						 
						 if(b>0) {
							 JOptionPane.showMessageDialog(null, "Sign Up success!");
							 framedangnhap frame=new framedangnhap();
							 frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
							 frame.setLocationRelativeTo(null);
							 frame.setVisible(true);
								dispose();
						 }
					 }
				
			
					stmt.close();	 c.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
				}
				
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(172, 285, 351, 41);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(574, 325, 91, 25);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(100, 18, 82, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(100, 106, 132, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(100, 196, 148, 18);
		panel_1.add(lblNewLabel_2);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(100, 131, 480, 55);
		panel_1.add(txtpassword);
		
		txtconfirmpassword = new JPasswordField();
		txtconfirmpassword.setBounds(100, 215, 480, 55);
		panel_1.add(txtconfirmpassword);
	}
}
