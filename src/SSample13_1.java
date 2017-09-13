import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample13_1 extends JFrame{

  JTextField text;

  public static void main(String args[]){
    SSample13_1 frame = new SSample13_1("タイトル");
    frame.setVisible(true);
  }

  SSample13_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    text = new JTextField("東京都港区赤坂", 25);

    //CUTボタンの作成
    JButton buttonCut = new JButton("CUT");
    buttonCut.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          text.cut();
        }
      }
    );

    //COPYボタンの作成
    JButton buttonCopy = new JButton("COPY");
    buttonCopy.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          text.copy();
        }
      }
    );

    //PASTEボタンの作成
    JButton buttonPaste = new JButton("PASTE");
    buttonPaste.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          text.paste();
        }
      }
    );

    p.add(text);
    p.add(buttonCut);
    p.add(buttonCopy);
    p.add(buttonPaste);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}