import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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

    JTextArea area1 = new JTextArea("東京都港区赤坂", 3, 20);
    JTextArea area2 = new JTextArea("東京都港区赤坂", 3, 20);
    
    //文字色の設定
    area2.setForeground(Color.RED);
    
    //背景色の設定
    area2.setBackground(Color.BLACK);
    JTextArea area3 = new JTextArea("東京都港区赤坂", 3, 20);
    
    //true,falsで非透明、透明の設定
    area3.setOpaque(false);

    p.add(area1);
    p.add(area2);
    p.add(area3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}