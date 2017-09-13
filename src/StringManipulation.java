
public class StringManipulation {

	public static void main(String[] args) {
	  String s1 = "すっきりJava";
	  String s2 = "Java";
	  String s3 = "java";
	  
	  //内容が等しいか比較
	  if (s2.equals(s3)){
		  System.out.println("s2とs3は等しい");
	  }
	  
	  //大、小文字の区別を無くして比較
      if (s2.equalsIgnoreCase(s3)){
    	  System.out.println("s2とs3はケース区別しなければ等しい");
      }
      //文字の長さを調べる
      System.out.println("s1の長さは" + s1.length() + "です");
      
      //空文字か調べる
      if (s1.isEmpty()){
    	  System.out.println("s1は空文字です");
      }
	}

}
