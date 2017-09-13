import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample7_1 extends JFrame{
  public static void main(String args[]){
    SSample7_1 frame = new SSample7_1("タイトル");
    frame.setVisible(true);
  }

  SSample7_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都千代田区神田", 20);
    
    //文字列の位置を左に
    text1.setHorizontalAlignment(JTextField.LEFT);

    JTextField text2 = new JTextField("東京都千代田区神田", 20);
    
    //文字列の位置を中央に
    text2.setHorizontalAlignment(JTextField.CENTER);

    JTextField text3 = new JTextField("東京都千代田区神田", 20);
    
    //文字列の位置を右に
    text3.setHorizontalAlignment(JTextField.RIGHT);

    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}