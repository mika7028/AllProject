import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample2_1 extends JFrame{
  public static void main(String args[]){
    SSample2_1 frame = new SSample2_1("タイトル");
    frame.setVisible(true);
  }

  SSample2_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    //初期値の設定
    JTextField text1 = new JTextField("東京都");
    JTextField text2 = new JTextField("東京都", 10);
    JTextField text3 = new JTextField(15);
    text3.setText("住所を入力して下さい");

    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}