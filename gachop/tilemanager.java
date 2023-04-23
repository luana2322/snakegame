package gachop;

import java.awt.Graphics2D;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import snakegamemain.giaodien;
import snakegamemain.start;

public class tilemanager {
	start m;
	giaodien gp;
	public Tile[] tile;

	public tilemanager(giaodien gp, start m) {
		this.m = m;
		this.gp = gp;
		tile = new Tile[30];
		gettileimage();
	}

	public void gettileimage() {
		try {
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/gachop/glass.png"));

			tile[1] = new Tile();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/gachop/cat.png"));

			tile[2] = new Tile();
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/gachop/gạch.png"));

			tile[3] = new Tile();
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/gachop/water.png"));

			tile[4] = new Tile();
			tile[4].image = ImageIO.read(getClass().getResourceAsStream("/gachop/tree.png"));

			// icon
			tile[5] = new Tile();
			tile[5].grass = new ImageIcon(getClass().getResource("/gachop/glass.png"));
			
			tile[6]= new Tile();
			tile[6].image = ImageIO.read(getClass().getResourceAsStream("/gachop/apple.png"));
			
			tile[7]= new Tile();
			tile[7].image = ImageIO.read(getClass().getResourceAsStream("/gachop/apple 1.png"));
			
			tile[8]= new Tile();
			tile[8].image = ImageIO.read(getClass().getResourceAsStream("/gachop/appleblue.png"));
			
			tile[9]= new Tile();
			tile[9].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeU.png"));
			
			tile[10]= new Tile();
			tile[10].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeD.png"));
			
			tile[11]= new Tile();
			tile[11].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeR.png"));
			
			tile[18]= new Tile();
			tile[18].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeL.png"));
			
			//than va duoi
			tile[12]= new Tile();
			tile[12].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakethanU.png"));

			tile[13]= new Tile();
			tile[13].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakethanR.png"));

			tile[14]= new Tile();
			tile[14].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeduoiU.png"));

			tile[15]= new Tile();
			tile[15].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeduoiD.png"));

			tile[16]= new Tile();
			tile[16].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeduoiR.png"));

			tile[17]= new Tile();
			tile[17].image = ImageIO.read(getClass().getResourceAsStream("/gachop/snakeduoiL.png"));

			tile[19]= new Tile();
			tile[19].image = ImageIO.read(getClass().getResourceAsStream("/gachop/applecat.png"));
			
			tile[20]= new Tile();
			tile[20].image = ImageIO.read(getClass().getResourceAsStream("/gachop/applewater.png"));
			
			tile[21]= new Tile();
			tile[21].image = ImageIO.read(getClass().getResourceAsStream("/gachop/applegrass.png"));


		} catch (IOException e) {
			System.out.println("aaaaa");
		}
	}

	public void draw(Graphics2D g2) {
		for (int i = 0; i <= gp.dodaicuaso; i += gp.dodaiO) {
			for (int j = 0; j <= gp.dorongcuaso; j += gp.dodaiO) {
				g2.drawImage(tile[m.a].image, i, j, gp.dodaiO, gp.dodaiO, null);
			}
		}

		for (int i = 0; i < gp.dodaicuaso; i += 48) {
			g2.drawImage(tile[m.b].image, i, 0, gp.dodaiO, gp.dodaiO, null);
		}
		for (int i = 0; i < gp.dodaicuaso; i += 48) {
			g2.drawImage(tile[m.b].image, i, gp.dorongcuaso - 48, gp.dodaiO, gp.dodaiO, null);
		}
		for (int i = 0; i < gp.dorongcuaso; i += 48) {
			g2.drawImage(tile[m.b].image, 0, i, gp.dodaiO, gp.dodaiO, null);
		}
		for (int i = 0; i < gp.dorongcuaso; i += 48) {
			g2.drawImage(tile[m.b].image, gp.dodaicuaso - 48, i, gp.dodaiO, gp.dodaiO, null);
		}

		if (m.c == 1) {
			for (int i = 240; i < gp.dodaicuaso - 240; i += 48) {

				g2.drawImage(tile[m.b].image, i, gp.dorongcuaso / 2 - 48, gp.dodaiO, gp.dodaiO, null);
			}
		}

		else if (m.c == 2) {

			g2.drawImage(tile[m.b].image, 240, 240, gp.dodaiO, gp.dodaiO, null);
			for (int i = 240; i < gp.dodaicuaso / 2 - 144; i += 48) {

				g2.drawImage(tile[m.b].image, i, 192, gp.dodaiO, gp.dodaiO, null);
			}

			g2.drawImage(tile[m.b].image, 240, 480 - 48, gp.dodaiO, gp.dodaiO, null);
			for (int i = 240; i < gp.dodaicuaso / 2 - 144; i += 48) {

				g2.drawImage(tile[m.b].image, i, 480, gp.dodaiO, gp.dodaiO, null);
			}

			g2.drawImage(tile[m.b].image, gp.dodaicuaso - 384, 240, gp.dodaiO, gp.dodaiO, null);
			for (int i = 720; i < gp.dodaicuaso - 360; i += 48) {
				g2.drawImage(tile[m.b].image, i, 192, gp.dodaiO, gp.dodaiO, null);
			}

			g2.drawImage(tile[m.b].image, gp.dodaicuaso - 384, 480 - 48, gp.dodaiO, gp.dodaiO, null);
			for (int i = 720; i < gp.dodaicuaso - 360; i += 48) {
				g2.drawImage(tile[m.b].image, i, 480, gp.dodaiO, gp.dodaiO, null);
			}
		} else if (m.c == 3) {
			for (int i = 240; i < 528; i += 48) {

				g2.drawImage(tile[m.b].image, i, gp.dorongcuaso / 2 + 48, gp.dodaiO, gp.dodaiO, null);
			}

			for (int i = 240; i < 528; i += 48) {

				g2.drawImage(tile[m.b].image, i + 720 - 96, gp.dorongcuaso / 2 - 96, gp.dodaiO, gp.dodaiO, null);
			}

			for (int i = 192; i < 432; i += 48) {

				g2.drawImage(tile[m.b].image, 624, i - 96, gp.dodaiO, gp.dodaiO, null);
			}

			for (int i = 240; i < 480; i += 48) {

				g2.drawImage(tile[m.b].image, 624 + 96, i + 192, gp.dodaiO, gp.dodaiO, null);
			}
		}
	}

}
