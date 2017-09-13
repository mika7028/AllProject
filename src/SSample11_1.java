import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample11_1 extends JFrame implements ActionListener{

  JTextField text;

  public static void main(String args[]){
    SSample11_1 frame = new SSample11_1("タイトル");
    frame.setVisible(true);
  }

  SSample11_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    text = new JTextField("住所", 20);
    
    //(始点、終点)までを選択
    text.select(0, 2);
    JButton button = new JButton("全て選択");
    button.addActionListener(this);

    p.add(text);
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
  //ボタンを押したときにすべて選択
  public void actionPerformed(ActionEvent e){
    text.requestFocusInWindow();
    text.selectAll();
  }
}