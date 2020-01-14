package Core;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Main window = new Main();
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public Main() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */

    public MusicPlayerCode m = new MusicPlayerCode();
    int stt = 0;

    private void initialize() {
	frame = new JFrame();
	frame.setResizable(false);
	frame.setBounds(100, 100, 800, 485);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	JButton btnNewButton = new JButton("Start");
	btnNewButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		if (stt == 1) {
		    m.getClip().close();
		    stt--;
		}
		m.musicStart("/music/music.wav", 1, frame);
		stt++;
	    }
	});
	btnNewButton.setFont(new Font("Arial", Font.BOLD, 41));
	btnNewButton.setBounds(59, 236, 199, 103);
	frame.getContentPane().add(btnNewButton);

	JButton btnPause = new JButton("Pause");
	btnPause.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (stt == 1) {
		    m.getClip().stop();
		    m.setCliptimepostion(m.getClip().getMicrosecondPosition());
		    stt--;
		}

		m.musicStart("/music/music.wav", 2, frame);
		stt++;

	    }
	});
	btnPause.setFont(new Font("Arial", Font.BOLD, 41));
	btnPause.setBounds(303, 236, 199, 103);
	frame.getContentPane().add(btnPause);

	JButton btnLoop = new JButton("Loop");
	btnLoop.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (stt == 1) {
		    m.getClip().stop();
		    stt--;
		}
		m.musicStart("/music/music.wav", 3, frame);
		stt++;
	    }
	});
	btnLoop.setFont(new Font("Arial", Font.BOLD, 41));
	btnLoop.setBounds(548, 236, 199, 103);
	frame.getContentPane().add(btnLoop);

	Image bg = new ImageIcon(this.getClass().getResource("/Img/background.jpg")).getImage();

	Image setbgImage = bg.getScaledInstance(frame.getWidth(), frame.getHeight(),
	                Image.SCALE_DEFAULT);

	JLabel background = new JLabel("");
	background.setBounds(0, -12, frame.getWidth(), frame.getHeight());
	frame.getContentPane().add(background);
	background.setIcon(new ImageIcon(setbgImage));

    }

}
