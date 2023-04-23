package snakegamemain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import gachop.tilemanager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.Book;

public class start extends JFrame {
	public static int a;
	public static int b = 4;
	public static int c;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	public static String combobox;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JComboBox comboBox;
	private JLabel labelhienthi;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start s= new start();
					s.setLocationRelativeTo(null);
					s.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public start() {
		setFont(new Font("Dialog", Font.BOLD, 17));
		setTitle("CHOOSE OPTION");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0, 255, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("      SNAKE GAME BY ME");
		lblNewLabel.setBackground(new Color(0, 0, 160));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(123, 0, 515, 60);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBackground(Color.black);
		lblNewLabel.setOpaque(true);

		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		comboBox.setBounds(154, 70, 45, 32);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Level of difficult:");
	
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(22, 70, 130, 32);
		contentPane.add(lblNewLabel_1);
		

		JButton btnstartgame = new JButton("START GAME");
		btnstartgame.setBackground(new Color(255, 255, 0));
		btnstartgame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				combobox = comboBox.getSelectedItem().toString();
				if (chckbxNewCheckBox.isSelected()) {
					a = 3;
				} else if (chckbxNewCheckBox_1.isSelected()) {
					a = 0;
				} else if (chckbxNewCheckBox_2.isSelected()) {
					a = 1;
				}
				if (chckbxNewCheckBox_3.isSelected()) {
					b = 4;
				} else if (chckbxNewCheckBox_4.isSelected()) {
					b = 2;
				}
				fontend4 a = new fontend4();
				dispose();
			}
		});

		btnstartgame.setFont(new Font("Tahoma", Font.BOLD, 51));
		btnstartgame.setBounds(10, 208, 782, 45);
		contentPane.add(btnstartgame);

		JLabel lblNewLabel_2 = new JLabel("Map:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(259, 68, 68, 32);
		contentPane.add(lblNewLabel_2);

		chckbxNewCheckBox = new JCheckBox("Water");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(306, 81, 93, 21);
		contentPane.add(chckbxNewCheckBox);

		chckbxNewCheckBox_1 = new JCheckBox("Grass");
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(306, 122, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);

		chckbxNewCheckBox_2 = new JCheckBox("Sand");
		buttonGroup.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setBounds(306, 157, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);

		JLabel lblNewLabel_3 = new JLabel("Map Border:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(22, 122, 103, 21);
		contentPane.add(lblNewLabel_3);

		chckbxNewCheckBox_3 = new JCheckBox("Tree");
		buttonGroup_1.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_3.setBounds(137, 118, 93, 21);
		contentPane.add(chckbxNewCheckBox_3);

		chckbxNewCheckBox_4 = new JCheckBox("Brick");
		buttonGroup_1.add(chckbxNewCheckBox_4);
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox_4.setBounds(137, 155, 93, 21);
		contentPane.add(chckbxNewCheckBox_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=2;
				labelhienthi.setText("You have selected terrain:3");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(start.class.getResource("/gachop/map3.png")));
		btnNewButton_1.setBounds(610, 119, 82, 79);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=0;
				labelhienthi.setText("You have selected terrain:2");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(start.class.getResource("/gachop/map2.png")));
		btnNewButton_2.setBounds(518, 119, 82, 79);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				labelhienthi.setText("You have selected terrain:1");
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(start.class.getResource("/gachop/map1 (2).png")));
		btnNewButton_3.setBounds(426, 119, 82, 79);
		contentPane.add(btnNewButton_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 160));
		separator.setBackground(new Color(0, 0, 160));
		separator.setBounds(405, 205, 0, -133);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Terrain:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(426, 81, 103, 32);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=3;
				labelhienthi.setText("You have selected terrain:4");
			}
		});
		btnNewButton.setIcon(new ImageIcon(start.class.getResource("/gachop/map4.png"))); 
		btnNewButton.setBounds(702, 118, 82, 80);
		contentPane.add(btnNewButton);
		
		 labelhienthi = new JLabel("");
		labelhienthi.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelhienthi.setBounds(518, 81, 245, 32);
		contentPane.add(labelhienthi);
		labelhienthi.setBackground(Color.orange);
		labelhienthi.setOpaque(true);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bangxephang g=new bangxephang(); 
			}
		});
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(start.class.getResource("/gachop/signal-alt-2.png")));
		lblNewLabel_5.setBounds(740, 0, 52, 60);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel_5);
	

	}
}
