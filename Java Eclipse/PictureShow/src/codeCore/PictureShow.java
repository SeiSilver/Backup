package codeCore;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PictureShow {

    private JFrame frmAnimePictureShow;

    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    PictureShow window = new PictureShow();
		    window.frmAnimePictureShow.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public PictureShow() {
	initialize();
    }

    public Image loadImage(String address, int width, int height) {
	Image panalicon = new ImageIcon(this.getClass().getResource(address)).getImage();
	Image iconnew = panalicon.getScaledInstance(width, height, Image.SCALE_DEFAULT);
	return iconnew;
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frmAnimePictureShow = new JFrame();
	frmAnimePictureShow.setResizable(false);
	frmAnimePictureShow.setBackground(new Color(0, 0, 0));
	frmAnimePictureShow.setForeground(new Color(0, 0, 0));
	frmAnimePictureShow.setFont(new Font("Arial", Font.BOLD, 18));
	frmAnimePictureShow.setTitle("Anime Picture Show");
	frmAnimePictureShow.setBounds(100, 100, 963, 687);
	frmAnimePictureShow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmAnimePictureShow.getContentPane().setLayout(null);

	JLabel panel = new JLabel("Piture will auto zoom to this panel");
	panel.setFont(new Font("Arial", Font.BOLD, 39));
	panel.setHorizontalAlignment(SwingConstants.CENTER);
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel.setForeground(new Color(0, 0, 139));
	panel.setBounds(49, 13, 839, 434);
	panel.setBackground(Color.blue);

	frmAnimePictureShow.getContentPane().add(panel);

	JButton button1 = new JButton("");
	button1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		panel.setText(null);
		panel.setIcon(new ImageIcon(loadImage("/imgs/picture1.jpg", panel.getWidth(),
		                panel.getHeight())));
	    }
	});

	button1.setBounds(136, 474, 165, 70);

	JButton btnNewButton = new JButton("Clear");
	btnNewButton.setBackground(new Color(0, 191, 255));
	btnNewButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setIcon(null);
		panel.setText("Piture will auto zoom to this panel");
	    }
	});

	// btnNewButton.setBackground(Color.blue);
	btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
	btnNewButton.setBounds(27, 474, 97, 153);
	frmAnimePictureShow.getContentPane().add(btnNewButton);

	button1.setIcon(new ImageIcon(
	                loadImage("/imgs/picture1.jpg", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button1);

	JButton button5 = new JButton("");
	button5.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setText(null);

		panel.setIcon(new ImageIcon(loadImage("/imgs/picture5.jpg", panel.getWidth(),
		                panel.getHeight())));
	    }
	});
	button5.setBounds(136, 557, 165, 70);

	button5.setIcon(new ImageIcon(
	                loadImage("/imgs/picture5.jpg", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button5);

	JButton button2 = new JButton("");
	button2.setBounds(324, 474, 165, 70);
	button2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		panel.setText(null);

		panel.setIcon(new ImageIcon(loadImage("/imgs/picture2.png", panel.getWidth(),
		                panel.getHeight())));

	    }
	});

	button2.setIcon(new ImageIcon(
	                loadImage("/imgs/picture2.png", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button2);

	JButton button3 = new JButton("");
	button3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setText(null);

		panel.setIcon(new ImageIcon(loadImage("/imgs/picture3.jpg", panel.getWidth(),
		                panel.getHeight())));

	    }
	});
	button3.setBounds(520, 474, 165, 70);

	button3.setIcon(new ImageIcon(
	                loadImage("/imgs/picture3.jpg", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button3);

	JButton button4 = new JButton("");
	button4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setText(null);

		panel.setIcon(new ImageIcon(loadImage("/imgs/picture4.jpg", panel.getWidth(),
		                panel.getHeight())));

	    }
	});
	button4.setBounds(723, 474, 165, 70);

	button4.setIcon(new ImageIcon(
	                loadImage("/imgs/picture4.jpg", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button4);

	JButton button6 = new JButton("");
	button6.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setText(null);

		panel.setIcon(new ImageIcon(loadImage("/imgs/picture6.jpg", panel.getWidth(),
		                panel.getHeight())));

	    }
	});
	button6.setBounds(324, 557, 165, 70);

	button6.setIcon(new ImageIcon(
	                loadImage("/imgs/picture6.jpg", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button6);

	JButton button7 = new JButton("");
	button7.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setText(null);

		panel.setIcon(new ImageIcon(loadImage("/imgs/picture7.PNG", panel.getWidth(),
		                panel.getHeight())));
	    }
	});
	button7.setBounds(520, 557, 165, 70);

	button7.setIcon(new ImageIcon(
	                loadImage("/imgs/picture7.PNG", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button7);

	JButton button8 = new JButton("");
	button8.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setText(null);
		panel.setIcon(new ImageIcon(loadImage("/imgs/picture8.png", panel.getWidth(),
		                panel.getHeight())));
	    }
	});
	button8.setBounds(723, 557, 165, 70);
	button8.setIcon(new ImageIcon(
	                loadImage("/imgs/picture8.png", button1.getWidth(), button1.getHeight())));

	frmAnimePictureShow.getContentPane().add(button8);

	JLabel lblNewLabel = new JLabel("Cre: Sei Silver");
	lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
	lblNewLabel.setBounds(824, 630, 121, 22);
	frmAnimePictureShow.getContentPane().add(lblNewLabel);

    }
}
