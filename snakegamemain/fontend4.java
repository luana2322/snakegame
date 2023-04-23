package snakegamemain;

import java.awt.Color;

import javax.swing.JFrame;

public class fontend4 extends JFrame {
	
public fontend4() {
	this.setTitle("SNAKEGAME");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
	giaodien a=new giaodien();
	this.add(a);
	this.pack();
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	
}
}
