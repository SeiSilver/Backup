package img;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class testimg {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    testimg window = new testimg();
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
    public testimg() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 843, 587);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	lblNewLabel.setBounds(48, 13, 715, 488);
	frame.getContentPane().add(lblNewLabel);

	Image icon = new ImageIcon(this.getClass().getResource("/imgs/picture6.jpg")).getImage();

	lblNewLabel.setIcon(new ImageIcon(icon));
    }

}
