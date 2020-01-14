package core;

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MathGame {

  private JFrame frmBasicMathGame;
  private JTextField screen;
  private JTextField Result;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MathGame window = new MathGame();
          window.frmBasicMathGame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public MathGame() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */

  public Math game = new Math();

  public int stt = 0;

  private void initialize() {
    frmBasicMathGame = new JFrame();
    frmBasicMathGame.setTitle("Basic Math Game");
    frmBasicMathGame.setBounds(100, 100, 1029, 561);
    frmBasicMathGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmBasicMathGame.getContentPane().setLayout(null);

    JButton btnNewButton = new JButton("TRUE");
    btnNewButton.setFont(new Font("Arial", Font.BOLD, 28));
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        if (stt == 0) {
          Result.setText("Press START stupid dog.");
          return;
        }
        if (stt == 1) {
          btnNewButton.setBackground(Color.ORANGE);
          stt = 2;
        }
        if (game.isStatus() == true) {
          Result.setText("Correct!");
          Result.setBackground(Color.green);
        } else {
          Result.setText("You are an idiot!");
          Result.setBackground(Color.red);
        }
      }
    });
    btnNewButton.setBounds(46, 220, 193, 92);
    frmBasicMathGame.getContentPane().add(btnNewButton);

    JButton btnFalse = new JButton("FALSE");
    btnFalse.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        if (stt == 0) {
          Result.setText("Press START stupid dog.");
          return;
        }
        if (stt == 1) {
          btnFalse.setBackground(Color.ORANGE);
          stt = 2;
        }
        if (game.isStatus() == false) {
          Result.setText("Correct!");
          Result.setBackground(Color.green);
        } else {
          Result.setText("You are an idiot!");
          Result.setBackground(Color.red);
        }
      }
    });
    btnFalse.setFont(new Font("Arial", Font.BOLD, 28));
    btnFalse.setBounds(291, 220, 193, 92);
    frmBasicMathGame.getContentPane().add(btnFalse);

    screen = new JTextField();
    screen.setHorizontalAlignment(SwingConstants.CENTER);
    screen.setFont(new Font("Arial", Font.BOLD, 26));
    screen.setText("Press Start to Begin");
    screen.setEditable(false);
    screen.setBackground(Color.WHITE);
    screen.setBounds(46, 43, 438, 143);
    frmBasicMathGame.getContentPane().add(screen);
    screen.setColumns(10);

    Result = new JTextField();
    Result.setHorizontalAlignment(SwingConstants.CENTER);
    Result.setFont(new Font("Arial", Font.BOLD, 33));
    Result.setText("Answer");
    Result.setBackground(new Color(0, 255, 255));
    Result.setEditable(false);
    Result.setBounds(46, 379, 438, 109);
    frmBasicMathGame.getContentPane().add(Result);
    Result.setColumns(10);

    JLabel lblNewLabel = new JLabel("Cre: Sei Silver");
    lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
    lblNewLabel.setBounds(878, 479, 121, 22);
    frmBasicMathGame.getContentPane().add(lblNewLabel);

    JButton btnNext = new JButton("Start");
    btnNext.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        stt = 1;
        btnNewButton.setBackground(null);
        btnFalse.setBackground(null);
        Result.setBackground(new Color(0, 255, 255));
        screen.setText(game.execute());
        Result.setText("");
      }
    });
    btnNext.setFont(new Font("Arial", Font.BOLD, 28));
    btnNext.setBounds(525, 379, 200, 109);
    frmBasicMathGame.getContentPane().add(btnNext);

    JLabel background = new JLabel("");
    background.setBounds(0, 0, 1011, 514);
    frmBasicMathGame.getContentPane().add(background);

    Image icon = new ImageIcon(this.getClass().getResource("/background.jpeg")).getImage();
    Image newImage = icon.getScaledInstance(1011, 514, Image.SCALE_DEFAULT);
    background.setIcon(new ImageIcon(newImage));

  }
}
