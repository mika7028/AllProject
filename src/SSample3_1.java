import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample3_1 extends JFrame{
  public static void main(String args[]){
    SSample3_1 frame = new SSample3_1("タイトル");
    frame.setVisible(true);
  }

  SSample3_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都", 20);

    JTextField text2 = new JTextField("東京都", 20);
    
    //文字色変更
    text2.setForeground(Color.BLUE);
    
    //背景色変更
    text2.setBackground(Color.BLACK);
    
    JTextField text3 = new JTextField("大阪府", 20);
    
    //true,falseで非透明、透明の切り替え
    text3.setOpaque(false);
    text3.setBackground(Color.BLACK);

    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}