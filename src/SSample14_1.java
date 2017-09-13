import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample14_1 extends JFrame{
  public static void main(String args[]){
    SSample14_1 frame = new SSample14_1("タイトル");
    frame.setVisible(true);
  }

  SSample14_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text = new JTextField("東京都港区赤坂", 25);
    
    //ツールチップの設定
    //※ツールチップとは
    //テキストフィールドにカーソルを合わせると説明が表示される
    text.setToolTipText("テキストを入力して下さい");

    p.add(text);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}