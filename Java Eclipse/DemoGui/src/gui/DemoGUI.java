package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DemoGUI {

    private JFrame frmWibuFirstGui;
    private JTextField textField;
    private JButton btnNewButton;
    private JButton button_3;
    private JTextField txtAsd;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		try {
		    DemoGUI window = new DemoGUI();
		    window.frmWibuFirstGui.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public DemoGUI() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frmWibuFirstGui = new JFrame();
	frmWibuFirstGui.setTitle("Wibu First GUI");
	frmWibuFirstGui.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Pictures\\download.png"));
	frmWibuFirstGui.setBounds(100, 100, 901, 513);
	frmWibuFirstGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmWibuFirstGui.getContentPane().setLayout(null);

	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setBounds(240, 23, 0, 0);
	frmWibuFirstGui.getContentPane().add(lblNewLabel);

	textField = new JTextField();
	textField.setHorizontalAlignment(SwingConstants.LEFT);
	textField.setFont(new Font("Arial", Font.BOLD, 30));
	textField.setBackground(Color.LIGHT_GRAY);
	textField.setBounds(115, 90, 290, 72);
	frmWibuFirstGui.getContentPane().add(textField);
	textField.setColumns(10);

	JLabel lblNewLabel_1 = new JLabel("Basic Calculation");
	lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 40));
	lblNewLabel_1.setBounds(260, 10, 356, 66);
	frmWibuFirstGui.getContentPane().add(lblNewLabel_1);

	btnNewButton = new JButton("+");
	btnNewButton.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		int num1, num2, res;
		try {
		    num1 = Integer.parseInt(textField.getText());
		    num2 = Integer.parseInt(textField_2.getText());
		    res = num1 + num2;
		    txtAsd.setText(Integer.toString(res));
		} catch (Exception e2) {
		    JOptionPane.showMessageDialog(frmWibuFirstGui, "Please enter valid number");
		}
	    }
	});

//		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Pictures\\video icon.png");
//		Image newImage = icon.getImage().getScaledInstance(125, 53, Image.SCALE_DEFAULT);
//		icon = new ImageIcon(newImage);

//		btnNewButton.setIcon(icon);

	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setFont(new Font("Arial", Font.BOLD, 38));
	btnNewButton.setBounds(240, 208, 125, 53);
	frmWibuFirstGui.getContentPane().add(btnNewButton);

	frmWibuFirstGui.getContentPane().setBackground(Color.GRAY);

	button_3 = new JButton("-");
	button_3.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		int num1, num2, res;
		try {
		    num1 = Integer.parseInt(textField.getText());
		    num2 = Integer.parseInt(textField_2.getText());
		    res = num1 - num2;
		    txtAsd.setText(Integer.toString(res));
		} catch (Exception e2) {
		    JOptionPane.showMessageDialog(frmWibuFirstGui, "Please enter valid number");
		}
	    }

	});
	button_3.setFont(new Font("Arial", Font.BOLD, 38));
	button_3.setBackground(Color.WHITE);
	button_3.setBounds(506, 208, 125, 53);
	frmWibuFirstGui.getContentPane().add(button_3);

	txtAsd = new JTextField();
	txtAsd.setEditable(false);
	txtAsd.setHorizontalAlignment(SwingConstants.CENTER);
	txtAsd.setSelectionColor(Color.BLACK);
	txtAsd.setFont(new Font("Arial", Font.BOLD, 30));
	txtAsd.setColumns(10);
	txtAsd.setBackground(Color.LIGHT_GRAY);
	txtAsd.setBounds(240, 336, 430, 72);
	frmWibuFirstGui.getContentPane().add(txtAsd);

	textField_2 = new JTextField();
	textField_2.setHorizontalAlignment(SwingConstants.LEFT);
	textField_2.setFont(new Font("Arial", Font.BOLD, 30));
	textField_2.setColumns(10);
	textField_2.setBackground(Color.LIGHT_GRAY);
	textField_2.setBounds(454, 90, 290, 72);
	frmWibuFirstGui.getContentPane().add(textField_2);

	JLabel backgroundimg = new JLabel("New label");

//		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Pictures\\5d02f1d09568090729.jpeg");

	Image icon = new ImageIcon(this.getClass().getResource("/background.jpeg")).getImage();

	Image newImage = icon.getScaledInstance(887, 476, Image.SCALE_DEFAULT);
//		icon = new ImageIcon(newImage);

	backgroundimg.setIcon(new ImageIcon(newImage));
	backgroundimg.setBounds(0, 0, 887, 476);
//		icon = new ImageIcon(newImage);
//		btnNewButton.setIcon(icon);

	frmWibuFirstGui.getContentPane().add(backgroundimg);
    }
}
