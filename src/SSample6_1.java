import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

class SSample6_1 extends JFrame{
  public static void main(String args[]){
    SSample6_1 frame = new SSample6_1("タイトル");
    frame.setVisible(true);
  }

  SSample6_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都千代田区神田");

    JTextField text2 = new JTextField("東京都千代田区神田");
    
    //余白の設定
    text2.setMargin(new Insets(20, 40, 20, 40));

    JTextField text3 = new JTextField("東京都千代田区神田");
    text3.setPreferredSize(new Dimension(250, 50));
    text3.setMargin(new Insets(20, 20, 20, 20));

    JTextField text4 = new JTextField(20);
    //枠線の設定
    text4.setBorder(new LineBorder(Color.BLUE, 4, true));

    p.add(text1);
    p.add(text2);
    p.add(text3);
    p.add(text4);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}