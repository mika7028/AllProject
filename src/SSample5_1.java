import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class SSample5_1 extends JFrame{
  public static void main(String args[]){
    SSample5_1 frame = new SSample5_1("タイトル");
    frame.setVisible(true);
  }

  SSample5_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextArea area1 = new JTextArea("Tokyo City", 3, 15);
    JTextArea area2 = new JTextArea("Tokyo City", 3, 15);
    
    //フォントの設定
    area2.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 16));
    JTextArea area3 = new JTextArea("Tokyo City", 3, 15);
    area3.setFont(new Font("Arial", Font.PLAIN, 20));

    p.add(area1);
    p.add(area2);
    p.add(area3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}