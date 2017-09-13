import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample8_1 extends JFrame{
  public static void main(String args[]){
    SSample8_1 frame = new SSample8_1("タイトル");
    frame.setVisible(true);
  }

  SSample8_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text = new JTextField("こんにちは", 20);
    
    //キャレット(文字入力時の縦線)を最後に移動
    text.setCaretPosition(text.getText().length());
    
    //キャレットの色を赤に設定
    text.setCaretColor(Color.BLUE);

    p.add(text);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}