import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SSample10_1 extends JFrame implements ActionListener{

  JTextField text;
  JLabel label;

  public static void main(String args[]){
    SSample10_1 frame = new SSample10_1("タイトル");
    frame.setVisible(true);
  }

  SSample10_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    text = new JTextField("住所", 20);
    JButton button = new JButton("選択部分を取得");
    button.addActionListener(this);
    label = new JLabel();

    p.add(text);
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
    contentPane.add(label, BorderLayout.SOUTH);
  }
    //選択されてる文字の取得
  public void actionPerformed(ActionEvent e){
    label.setText(text.getSelectedText());
  }
}