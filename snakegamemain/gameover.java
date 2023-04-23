package snakegamemain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class gameover extends JFrame {

	private JPanel contentPane;
	giaodien a = new giaodien();
	framedangnhap frame = new framedangnhap();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		gameover frame = new gameover();

	}

	/**
	 * Create the frame.
	 */

	public gameover() {
		init();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void init() {

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("New label");
		label1.setFont(new Font("Tahoma", Font.BOLD, 19));
		label1.setBounds(0, 227, 83, 35);
		contentPane.add(label1);
		label1.setText("Point:" + a.point);

		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Connection c = null;

				try {
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					String url = "jdbc:MySQl://localhost:3306/dangnhap";
					String username = "root";
					String password = "";
					c = DriverManager.getConnection(url, username, password);

					Statement stmt = c.createStatement();

					String sql = "select * from dangnhap.tt";
					ResultSet rs = stmt.executeQuery(sql);

					int b = a.point;
					int a = 0;
					while (rs.next()) {
						String user = rs.getString("user");
						String pw = rs.getString("pw");
						int o = rs.getInt("maxpoint");

						if (b > o && frame.user1.equals(user)) {
							String sql1 = "update dangnhap.tt set maxpoint =" + b + " where" + " user='" + frame.user1
									+ "';";
							int p = stmt.executeUpdate(sql1);

						}

					}

					stmt.close();
					c.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (JOptionPane.showConfirmDialog(null, "Do you want to exit ?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {

				} else {
					System.exit(0);
				}

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(335, 228, 101, 35);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Connection c = null;

				try {
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					String url = "jdbc:MySQl://localhost:3306/dangnhap";
					String username = "root";
					String password = "";
					c = DriverManager.getConnection(url, username, password);

					Statement stmt = c.createStatement();

					String sql = "select * from dangnhap.tt";
					ResultSet rs = stmt.executeQuery(sql);

					int b = a.point;
					int a = 0;
					while (rs.next()) {
						String user = rs.getString("user");
						String pw = rs.getString("pw");
						int o = rs.getInt("maxpoint");

						if (b > o && frame.user1.equals(user)) {
							String sql1 = "update dangnhap.tt set maxpoint =" + b + " where" + " user='" + frame.user1
									+ "';";
							int p = stmt.executeUpdate(sql1);

						}

					}

					stmt.close();
					c.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (JOptionPane.showConfirmDialog(null, "Do you want to log out?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {

				} else {
					framedangnhap frame = new framedangnhap();
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					dispose();
				}

			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(226, 227, 109, 37);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("GAME OVER");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 56));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 436, 229);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("New Game");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Connection c = null;

				try {
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					String url = "jdbc:MySQl://localhost:3306/dangnhap";
					String username = "root";
					String password = "";
					c = DriverManager.getConnection(url, username, password);

					Statement stmt = c.createStatement();

					String sql = "select * from dangnhap.tt";
					ResultSet rs = stmt.executeQuery(sql);

					int b = a.point;
					int a = 0;
					while (rs.next()) {
						String user = rs.getString("user");
						String pw = rs.getString("pw");
						int o = rs.getInt("maxpoint");

						if (b > o && frame.user1.equals(user)) {
							String sql1 = "update dangnhap.tt set maxpoint =" + b + " where" + " user='" + frame.user1
									+ "';";
							int p = stmt.executeUpdate(sql1);

						}

					}

					stmt.close();
					c.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				start n = new start();
				n.setLocationRelativeTo(null);
				n.setVisible(true);
				dispose();
				a.point = 0;

			}
		});
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(92, 228, 109, 35);
		contentPane.add(label);
	}
}
