package snakegamemain;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class amthanh {
Clip clip;
URL soundURL[] =new URL[10];
public amthanh() {
	
}

public void setfile(int i) {
	soundURL[0] =getClass().getResource("/amthanh/eatfood.wav");
	soundURL[1] =getClass().getResource("/amthanh/fail.wav");
try {
	AudioInputStream ais =AudioSystem.getAudioInputStream(soundURL[i]);
	clip =AudioSystem.getClip();
	clip.open(ais);
} catch (Exception e) {
	e.printStackTrace(); 
}	
}
public void play() {
	clip.start();

}
public void stop() {
	clip.stop();
}
}
