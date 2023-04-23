package snakegamemain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class bangxephang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
					bangxephang frame = new bangxephang();
					
		
	}

	/**
	 * Create the frame.
	 */
	public bangxephang() {
		init();
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		
	}
		public void init() {
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 669);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 204));
		panel.setBounds(87, 23, 442, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BẢNG XẾP HẠNG");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 422, 43);
		lblNewLabel.setOpaque(true);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(22, 54, 554, 568);
		panel_1.setForeground(Color.BLUE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/chess-king.png")));
		lblNewLabel_1.setBounds(30, 47, 60, 52);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/chess-queen.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(30, 121, 60, 52);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/chess-king-alt.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(30, 197, 60, 52);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("4");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(30, 287, 60, 52);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("5");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setBounds(30, 382, 60, 52);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("6");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_3.setBounds(30, 472, 60, 52);
		panel_1.add(lblNewLabel_1_1_1_3);
		
		JLabel txt1 = new JLabel("");
		txt1.setBackground(new Color(0, 0, 255));
		txt1.setFont(new Font("Tahoma", Font.BOLD, 30));
		txt1.setBounds(100, 53, 217, 46);
		panel_1.add(txt1);
		
		JLabel txt2 = new JLabel("");
		txt2.setFont(new Font("Tahoma", Font.BOLD, 22));
		txt2.setBounds(100, 127, 217, 46);
		panel_1.add(txt2);
		
		JLabel txt3 = new JLabel("");
		txt3.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt3.setBounds(100, 197, 217, 46);
		panel_1.add(txt3);
		
		JLabel txt4 = new JLabel("");
		txt4.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt4.setBounds(100, 293, 217, 46);
		panel_1.add(txt4);
		
		JLabel txt5 = new JLabel("");
		txt5.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt5.setBounds(100, 382, 217, 46);
		panel_1.add(txt5);
		
		JLabel txt6 = new JLabel("");
		txt6.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt6.setBounds(100, 478, 217, 46);
		panel_1.add(txt6);
		
		JLabel txtdiem1 = new JLabel("");
		txtdiem1.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/apple-whole (1).png")));
		txtdiem1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtdiem1.setBounds(387, 53, 157, 46);
		panel_1.add(txtdiem1);
		
		JLabel txtdiem2 = new JLabel("");
		txtdiem2.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/apple-whole (1).png")));
		txtdiem2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtdiem2.setBounds(387, 127, 157, 46);
		panel_1.add(txtdiem2);
		
		JLabel txtdiem3 = new JLabel("");
		txtdiem3.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/apple-whole (1).png")));
		txtdiem3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtdiem3.setBounds(387, 203, 157, 46);
		panel_1.add(txtdiem3);
		
		JLabel txtdiem4 = new JLabel("");
		txtdiem4.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/apple-whole (1).png")));
		txtdiem4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtdiem4.setBounds(387, 293, 157, 46);
		panel_1.add(txtdiem4);
		
		JLabel txtdiem5 = new JLabel("");
		txtdiem5.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/apple-whole (1).png")));
		txtdiem5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtdiem5.setBounds(387, 388, 157, 46);
		panel_1.add(txtdiem5);
		
		JLabel txtdiem6 = new JLabel("");
		txtdiem6.setIcon(new ImageIcon(bangxephang.class.getResource("/gachop/apple-whole (1).png")));
		txtdiem6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtdiem6.setBounds(387, 478, 157, 46);
		panel_1.add(txtdiem6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 109, 490, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 185, 490, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(40, 275, 490, 2);
		panel_1.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(40, 370, 490, 2);
		panel_1.add(separator_1_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(40, 460, 490, 2);
		panel_1.add(separator_1_3);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBounds(40, 544, 490, 2);
		panel_1.add(separator_1_4);
		
		
		
		Connection c=null;

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:MySQl://localhost:3306/dangnhap";
			String username="root";
			String password="";
			c=DriverManager.getConnection(url, username, password);
			
			Statement stmt=c.createStatement();
			
			String sql="select * from dangnhap.tt where tt.maxpoint=(select max(tt.maxpoint) from tt);";
			ResultSet rs=stmt.executeQuery(sql);
            
			while(rs.next()) {
				
			txt1.setText(rs.getString("user"));
			txtdiem1.setText(String.valueOf(rs.getInt("maxpoint")));
			}
			
			
			String sql1="with a as(select * from tt order by tt.maxpoint desc limit 1,1) select * from a;";
			 rs=stmt.executeQuery(sql1);
			while(rs.next()) {
				
				txt2.setText(rs.getString("user"));
				txtdiem2.setText(String.valueOf(rs.getInt("maxpoint")));
				}
			
			
			
			String sql2="with a as(select * from tt order by tt.maxpoint desc limit 2,1) select * from a;";
			 rs=stmt.executeQuery(sql2);
			while(rs.next()) {
				
				txt3.setText(rs.getString("user"));
				txtdiem3.setText(String.valueOf(rs.getInt("maxpoint")));
				}
			
			
			
			String sql3="with a as(select * from tt order by tt.maxpoint desc limit 3,1) select * from a;";
			 rs=stmt.executeQuery(sql3);
			
			while(rs.next()) {
				
				txt4.setText(rs.getString("user"));
				txtdiem4.setText(String.valueOf(rs.getInt("maxpoint")));
				}
			
			String sql4="with a as(select * from tt order by tt.maxpoint desc limit 4,1) select * from a;";
			 rs=stmt.executeQuery(sql4);
			
			while(rs.next()) {
				
				txt5.setText(rs.getString("user"));
				txtdiem5.setText(String.valueOf(rs.getInt("maxpoint")));
				}
			
			
			String sql5="with a as(select * from tt order by tt.maxpoint desc limit 5,1) select * from a;";
		 rs=stmt.executeQuery(sql5);
			
			while(rs.next()) {
				
				txt6.setText(rs.getString("user"));
				txtdiem6.setText(String.valueOf(rs.getInt("maxpoint")));
				}
			
				
			rs.close();stmt.close();	 c.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		
		
		
		
		
		
	}
}
