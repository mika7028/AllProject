import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class SSample1_1 extends JFrame{
  public static void main(String args[]){
    SSample1_1 frame = new SSample1_1("タイトル");
    frame.setVisible(true);
  }

  SSample1_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextArea area1 = new JTextArea();
    JTextArea area2 = new JTextArea(3, 20);
    JTextArea area3 = new JTextArea();
    
    //行数の設定
    area3.setRows(6);
    
    //幅の設定
    area3.setColumns(15);

    p.add(area1);
    p.add(area2);
    p.add(area3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}