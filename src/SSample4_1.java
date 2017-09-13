import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample4_1 extends JFrame{
  public static void main(String args[]){
    SSample4_1 frame = new SSample4_1("タイトル");
    frame.setVisible(true);
  }

  SSample4_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都千代田区");
    
    //フォントの設定
    JTextField text2 = new JTextField("東京都千代田区");
    text2.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 8));

    JTextField text3 = new JTextField("東京都千代田区");
    text3.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 30));

    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}