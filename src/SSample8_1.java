import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

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

    JTextArea area1 = new JTextArea("明日の東京都の天気は、晴れのち曇りです。", 4, 10);
    area1.setLineWrap(true);

    JTextArea area2 = new JTextArea("明日の東京都の天気は、晴れのち曇りです。", 4, 10);
    area2.setLineWrap(true);
    area2.setMargin(new Insets(10, 10, 10, 10));

    JTextArea area3 = new JTextArea("明日の東京都の天気は、晴れのち曇りです。");
    area3.setPreferredSize(new Dimension(180, 40));
    area3.setLineWrap(true);
    area3.setBorder(new EtchedBorder(EtchedBorder.LOWERED));

    JTextArea area4 = new JTextArea("明日の東京都の天気は、晴れのち曇りです。");
    area4.setMargin(new Insets(10, 10, 10, 10));
    area4.setPreferredSize(new Dimension(180, 40));
    area4.setLineWrap(true);
    area4.setBorder(new EtchedBorder(EtchedBorder.RAISED));

    p.add(area1);
    p.add(area2);
    p.add(area3);
    p.add(area4);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}