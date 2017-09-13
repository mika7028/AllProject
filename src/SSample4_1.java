import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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

    JTextArea area1 = new JTextArea(3, 10);
    JTextArea area2 = new JTextArea(3, 10);
    
    //設定した幅を超えると自動で改行
    area2.setLineWrap(true);
    JTextArea area3 = new JTextArea(3, 10);
    area3.setLineWrap(true);
    
    //改行を単語(半角文字のみ)ごとで行う
    area3.setWrapStyleWord(true);

    p.add(area1);
    p.add(area2);
    p.add(area3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}