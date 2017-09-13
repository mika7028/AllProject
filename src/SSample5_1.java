import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample5_1 extends JFrame{
  public static void main(String args[]){
    SSample5_1 frame = new SSample5_1("タイトル");
    frame.setVisible(true);
  }

  SSample5_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都千代田区神田");
    
    //サイズの設定
    text1.setPreferredSize(new Dimension(200, 15));

    JTextField text2 = new JTextField("東京都千代田区神田");
    text2.setPreferredSize(new Dimension(200, 80));

    JTextField text3 = new JTextField("東京都千代田区神田");
    text3.setPreferredSize(new Dimension(100, 40));

    JTextField text4 = new JTextField("東京都千代田区神田");
    text4.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 30));
    text4.setPreferredSize(new Dimension(200, 20));

    p.add(text1);
    p.add(text2);
    p.add(text3);
    p.add(text4);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}