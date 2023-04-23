package snakegamemain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class mainframe extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JLabel lblNewLabel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */public static void main(String[] args) {
		mainframe a=new mainframe();
	}
	public mainframe() {
		init();
	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.progress();
	}
	

	/**
	 * Create the frame.
	 */
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1131, 669);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 progressBar = new JProgressBar();
		 progressBar.setBackground(new Color(128, 255, 255));
		progressBar.setStringPainted(true);
		progressBar.setBounds(158, 607, 837, 52);
		panel.add(progressBar);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1131, 669);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
	
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1131, 669);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(mainframe.class.getResource("/gachop/Hinh-nen-iPad-4K.png")));
		
		JButton btnNewButton = new JButton("SNAKEGAME");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 34));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(362, 10, 359, 154);
		panel.add(btnNewButton);
	}
	public void progress() {
		int i=0;
		while(i<=100) {
			i++;
			progressBar.setValue(i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==100) {
				framedangnhap frame = new framedangnhap();
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
				frame.setVisible(true);
				dispose();

		
			}
			
		}
	}
}
