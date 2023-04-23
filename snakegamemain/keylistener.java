package snakegamemain;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener implements KeyListener{

	public char directon='R';
	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			if (directon != 'L') {
				directon = 'R';
			}
			break;
		case KeyEvent.VK_LEFT:
			if (directon != 'R') {
				directon = 'L';
			}
			break;
		case KeyEvent.VK_UP:
			if (directon != 'D') {
				directon = 'U';
			}
			break;
		case KeyEvent.VK_DOWN:
			if (directon != 'U') {
				directon = 'D';
			}
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			if (directon != 'L') {
				directon = 'R';
			}
			break;
		case KeyEvent.VK_LEFT:
			if (directon != 'R') {
				directon = 'L';
			}
			break;
		case KeyEvent.VK_UP:
			if (directon != 'D') {
				directon = 'U';
			}
			break;
		case KeyEvent.VK_DOWN:
			if (directon != 'U') {
				directon = 'D';
			}
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
