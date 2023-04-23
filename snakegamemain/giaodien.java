package snakegamemain;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import gachop.tilemanager;

import java.util.Random;
import java.util.Scanner;

public class giaodien extends JPanel implements ActionListener {
	public final int dodaiO = 48;
	public final int dodaicuaso = 48 * 30;
	public final int dorongcuaso = 48 * 16;
	public final int toadotrongcuaso = (dodaicuaso * dorongcuaso) / dodaiO;
	public int delay = 100;
	int foodX, foodY;
	public int lenghtsnake;
	public static int point = 0;
	start m = new start();
	int[] ranX;
	int[] ranY;

	amthanh sound =new amthanh();
	tilemanager y = new tilemanager(this, m);
	public boolean run = false;

	private Graphics g;
	keylistener a = new keylistener();

	Timer timer = new Timer(delay, this);

	public giaodien() {
		this.setPreferredSize(new Dimension(dodaicuaso, dorongcuaso));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(a);

		startgame();

	}

	public void startgame() {
		ranX = new int[toadotrongcuaso];
		ranY = new int[toadotrongcuaso];
		newfood();
		run = true;
		if (m.combobox == "1") {
			delay = 500;
			timer = new Timer(delay, this);
		}
		if (m.combobox == "2") {
			delay = 200;
			timer = new Timer(delay, this);
		}
		if (m.combobox == "3") {
			delay = 100;
			timer = new Timer(delay, this);
		}
		if (m.combobox == "4") {
			delay = 50;
			timer = new Timer(delay, this);
		}
		if (m.combobox == "5") {
			delay = 30;
			timer = new Timer(delay, this);
		}
		a.directon = 'R';
		lenghtsnake = 4;
		timer.start();
		

	}

	public void dichuyen() {

		for (int i = lenghtsnake; i > 0; i--) {
			ranX[i] = ranX[i - 1];
			ranY[i] = ranY[i - 1];

		}
		
		switch (a.directon) {
		case 'R':
			ranX[0] += dodaiO;
			break;
		case 'L':
			ranX[0] -= dodaiO;
			break;
		case 'U':
			ranY[0] -= dodaiO;
			break;
		case 'D':
			ranY[0] += dodaiO;
			break;
		}

	}

	public void checkcolistion() {
		for (int i = lenghtsnake; i > 0; i--) {
			if (ranX[0] == ranX[i] && ranY[0] == ranY[i]) {
				timer.stop();
				run = false;playmusic(1);

			}
		}

		if (ranX[0] < 0 || ranY[0] < 0 || ranY[0] > dorongcuaso - 144 || ranX[0] > dodaicuaso - 144) {
			timer.stop();
			run = false;playmusic(1);

		}
		if (m.c == 1) {
			for (int i = 192; i < dodaicuaso - 288; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == dorongcuaso / 2 - 96)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == dorongcuaso / 2 - 96)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}

		} else if (m.c == 2) {
			// Tren trai
//			for (int i = 240; i < gp.dodaicuaso / 2 - 144; i += 48) {
//
//				g2.drawImage(tile[2].image, i, 192, gp.dodaiO, gp.dodaiO, null);
//			}
			for (int i = 192; i < dodaicuaso / 2 - 192; i += 48) {

				if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == dorongcuaso / 2 - 240)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}
//			g2.drawImage(tile[2].image, 240, 240, gp.dodaiO, gp.dodaiO, null);
			if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == 240 && ranY[0] == 240)) {

			}

			else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
					&& (ranX[0] == 192 && ranY[0] == 192)) {
				timer.stop();
				run = false;playmusic(1);

			}
			// Duoi trai

//
////			for (int i = 240; i < gp.dodaicuaso / 2 - 144; i += 48) {
////
////				g2.drawImage(tile[2].image, i, 480, gp.dodaiO, gp.dodaiO, null);
//			}
			for (int i = 192; i < dodaicuaso / 2 - 192; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == i && ranY[0] == 480)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == 480 - 48)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}
////			g2.drawImage(tile[2].image, 240, 480 - 48, gp.dodaiO, gp.dodaiO, null);
			if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == 240 && ranY[0] == 480 - 48)) {

			} else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
					&& (ranX[0] == 192 && ranY[0] == 480 - 96)) {
				timer.stop();
				run = false;playmusic(1);

			}
////Tren phai
////			for (int i = 720; i < gp.dodaicuaso - 360; i += 48) {
////				g2.drawImage(tile[2].image, i, 192, gp.dodaiO, gp.dodaiO, null);
////			}
			for (int i = 720 - 48; i < dodaicuaso - 408; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == dorongcuaso / 2 - 192)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == dorongcuaso / 2 - 240)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}
////				g2.drawImage(tile[2].image, gp.dodaicuaso - 384, 240, gp.dodaiO, gp.dodaiO, null);
			if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
					&& (ranX[0] == dodaicuaso - 384 && ranY[0] == 240)) {

			}

			else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
					&& (ranX[0] == dodaicuaso - 432 && ranY[0] == 192)) {
				timer.stop();
				run = false;playmusic(1);

			}
//  Duoi phai
//				for (int i = 720; i < gp.dodaicuaso - 360; i += 48) {
//					g2.drawImage(tile[2].image, i, 480, gp.dodaiO, gp.dodaiO, null);
//				}
			for (int i = 720 - 48; i < dodaicuaso - 408; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == i && ranY[0] == 480)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == 480 - 48)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}
//				g2.drawImage(tile[2].image, gp.dodaicuaso - 384, 480 - 48, gp.dodaiO, gp.dodaiO, null);
			if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
					&& (ranX[0] == dodaicuaso - 384 && ranY[0] == 480 - 48)) {

			}

			else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
					&& (ranX[0] == dodaicuaso - 432 && ranY[0] == 480 - 96)) {
				timer.stop();
				run = false;playmusic(1);

			}

		} else if (m.c == 3) {
//				for (int i = 240; i <528; i += 48) {
//
//					g2.drawImage(tile[2].image, i, gp.dorongcuaso / 2+48 , gp.dodaiO, gp.dodaiO, null);
//				}
			for (int i = 192; i < 480; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == i && ranY[0] == 480)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i && ranY[0] == dorongcuaso / 2)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}

//				for (int i = 240; i <528; i += 48) {
//
//					g2.drawImage(tile[2].image, i+720-96, gp.dorongcuaso / 2-96 , gp.dodaiO, gp.dodaiO, null);
//				}
			for (int i = 192; i < 480; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == i && ranY[0] == 480)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == i + 720 - 96 && ranY[0] == dorongcuaso / 2 - 144)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}

//				for (int i = 192; i <432; i += 48) {
//
//					g2.drawImage(tile[2].image, 618, i -96, gp.dodaiO, gp.dodaiO, null);
//				}

			for (int i = 96; i < 336; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == i && ranY[0] == 480)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == 576 && ranY[0] == i - 48)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}
//				for (int i = 240; i <480; i += 48) {
//
//					g2.drawImage(tile[2].image, 624+96, i +192, gp.dodaiO, gp.dodaiO, null);
//				}
			for (int i = 144; i < 384; i += 48) {

				if ((ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) && (ranX[0] == i && ranY[0] == 480)) {

				}

				else if (!(ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48)
						&& (ranX[0] == 624 + 48 && ranY[0] == i + 240)) {
					timer.stop();
					run = false;playmusic(1);

				}
			}
		}
	}

	public void eatfood() {
		
		if (ranX[0] + 48 == foodX + 48 && ranY[0] + 48 == foodY + 48) {
			
			newfood();
			lenghtsnake += 1;
			point += 1;
			playmusic(0);
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (run) {
			Graphics2D g2 = (Graphics2D) g;
			y.draw(g2);

			g.setColor(Color.green);
//			g.fillRect(foodX + 48, foodY + 48, dodaiO, dodaiO);
			if(m.a==0) {
			g.drawImage(y.tile[21].image, foodX + 48, foodY + 48, dodaiO, dodaiO, m);
			}else if(m.a==1) {
				g.drawImage(y.tile[19].image, foodX + 48, foodY + 48, dodaiO, dodaiO, m);
				}else if(m.a==3) {
					g.drawImage(y.tile[20].image, foodX + 48, foodY + 48, dodaiO, dodaiO, m);
				}

			for (int i = 0; i < lenghtsnake; i++) {

				if (i == 0) {

					switch (a.directon) {
					case 'R':
						g.drawImage(y.tile[11].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'L':
						g.drawImage(y.tile[18].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'U':
						g.drawImage(y.tile[9].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'D':
						g.drawImage(y.tile[10].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					}

				} else if (0 < i && i < lenghtsnake - 1) {
					switch (a.directon) {
					case 'R':
						g.drawImage(y.tile[13].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'L':
						g.drawImage(y.tile[13].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'U':
						g.drawImage(y.tile[12].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'D':
						g.drawImage(y.tile[12].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					}
				} else {
					g.setColor(Color.BLUE);

					switch (a.directon) {
					case 'R':
						g.drawImage(y.tile[16].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'L':
						g.drawImage(y.tile[17].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'U':
						g.drawImage(y.tile[14].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					case 'D':
						g.drawImage(y.tile[15].image, ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO, m);
						break;
					}
				}

			}

//			
//			for(int i=0;i<lenghtsnake;i++) {
//				g.fillRect(ranX[i] + 48, ranY[i] + 48, dodaiO, dodaiO);
//			}
//			

		} else {
			gameover b = new gameover();
			b.setLocationRelativeTo(null);
			b.setVisible(true);
			
		}

	}

	public void newfood() {

		Random random = new Random();
		foodX = random.nextInt((dodaicuaso - 96) / dodaiO) * dodaiO;
		foodY = random.nextInt((dorongcuaso - 96) / dodaiO) * dodaiO;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (run == true) {
			dichuyen();
			checkcolistion();
			eatfood();

		}
		repaint();

	}
	
	public void playmusic (int i) {
		sound.setfile(i);
		sound.play();

	}
	public void stopmusic() {
		sound.stop();
	}

}
