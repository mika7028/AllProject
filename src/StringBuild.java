
public class StringBuild {
  public static void main(String[] args){
	  StringBuilder sb = new StringBuilder();
	  for (int i = 0; i < 10; i++){
		  
		  //バッファに指定した文字を追加
		  sb.append("JAVA");
	  }
	  
	  //完成した連結した文字列を取り出す
      String s = sb.toString();
      System.out.println(s);
  }
}
