import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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

    JTextArea area1 = new JTextArea();
    
    //ピクセル単位でサイズを設定
    //この場合だと拡張がされない
    area1.setPreferredSize(new Dimension(180, 27));
    JTextArea area2 = new JTextArea(5, 24);
    area2.setPreferredSize(new Dimension(180, 27));
    JTextArea area3 = new JTextArea(5, 24);
    area3.setPreferredSize(new Dimension(180, 27));
    area3.setLineWrap(true);

    p.add(area1);
    p.add(area2);
    p.add(area3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}