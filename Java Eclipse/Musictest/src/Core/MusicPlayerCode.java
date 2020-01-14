package Core;

import java.awt.Frame;
import java.io.BufferedInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class MusicPlayerCode {

    private String address;

    private Clip clip;

    private long cliptimepostion;

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public long getCliptimepostion() {
	return cliptimepostion;
    }

    public void setCliptimepostion(long cliptimepostion) {
	this.cliptimepostion = cliptimepostion;
    }

    public void musicStart(String address, int stt, Frame frame) {
	try {

	    InputStream fulladd = this.getClass().getResourceAsStream(address);

	    InputStream bufferedIn = new BufferedInputStream(fulladd);

	    AudioInputStream audioInput = AudioSystem.getAudioInputStream(bufferedIn);
	    clip = AudioSystem.getClip();
	    clip.open(audioInput);
	    if (stt == 1) {
		clip.start();
	    } else if (stt == 2) {
		cliptimepostion = clip.getMicrosecondPosition();
		JOptionPane.showMessageDialog(frame, "Hit ok to resume");
		clip.setMicrosecondPosition(cliptimepostion);
		clip.start();
	    } else if (stt == 3) {
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		JOptionPane.showMessageDialog(frame, "Hit ok to out");
		clip.close();
	    }

	} catch (Exception e) {
	    JOptionPane.showMessageDialog(frame, "Can't find the file.");
	    System.out.println(e);

	}
    }

    public Clip getClip() {
	return clip;
    }

    public void setClip(Clip clip) {
	this.clip = clip;
    }

}
