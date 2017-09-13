import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample12_1 extends JFrame 
{

  public static void main(String args[]){
    SSample12_1 frame = new SSample12_1("タイトル");
    frame.setVisible(true);
  }

  SSample12_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("東京都港区赤坂", 20);
    JTextField text2 = new JTextField("東京都港区赤坂", 20);
    
    //true,falseで編集可能、不可の設定(コピー可)
    text2.setEditable(false);
    JTextField text3 = new JTextField("東京都港区赤坂", 20);
    
    //tlue,falseで有効、無効の設定(コピー不可)
    text3.setEnabled(false);
    //色の設定
    text3.setDisabledTextColor(Color.BLACK);



    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}