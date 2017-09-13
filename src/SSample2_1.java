import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
    
    //()に文字を入れる事で初期値の設定
    JTextArea area1 = new JTextArea("東京都港区赤坂");
    
    //\nで改行
    JTextArea area2 = new JTextArea("こんにちは. ¥n お元気でしょうか。", 5, 20);
    JTextArea area3 = new JTextArea(3, 5);
    
    //メソッドを使った初期値設定
    area3.setText("長い文章を設定すると自動的に拡張されます。");

    p.add(area1);
    p.add(area2);
    p.add(area3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}