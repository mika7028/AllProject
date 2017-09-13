import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class SSample9_1 extends JFrame{
  public static void main(String args[]){
    SSample9_1 frame = new SSample9_1("タイトル");
    frame.setVisible(true);
  }

  SSample9_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextArea area1 = new JTextArea("性別：男性¥n年齢：25歳", 4, 10);
   
    //キュレットの場所を指定
    area1.setCaretPosition(6);

    JTextArea area2 = new JTextArea("性別：男性¥n年齢：25歳", 4, 10);
    area2.setCaretPosition(area2.getText().length());
    
    //キュレットの色を設定
    area2.setCaretColor(Color.RED);

    p.add(area1);
    p.add(area2);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}