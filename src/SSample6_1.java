import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class SSample6_1 extends JFrame{
  public static void main(String args[]){
    SSample6_1 frame = new SSample6_1("タイトル");
    frame.setVisible(true);
  }

  SSample6_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextArea area1 = new JTextArea(3, 15);
    JTextArea area2 = new JTextArea(3, 15);
    
    //タブを押したときに移動する幅の設定
    //デフォルトは８
    area2.setTabSize(4);

    p.add(area1);
    p.add(area2);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
