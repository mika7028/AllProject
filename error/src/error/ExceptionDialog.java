package error;
import javax.swing.JOptionPane;
public class ExceptionDialog {
	public static void main(String[] args){
		try{
			"hello".charAt(-1);
		} catch(Exception e){
			JOptionPane.showMessageDialog
			(null, "処理中にエラーが発生しました");
		}
	}

}
