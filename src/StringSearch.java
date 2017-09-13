
public class StringSearch {

	public static void main(String[] args) {
	  String s1 = "Java and JavaScript";
	  
	  //検索したい文字列が含まれているかを調べる
	  if (s1.contains("Java")){
	    System.out.println("文字列s1は、Javaを含んでいます");
	}
	  
	  //指定した文字が最初にあるか調べる
	  if (s1.startsWith("Java")){
		  System.out.println("文字列s1は、Javaから始まります");
	  }
	  //指定した文字が末尾にあるか調べる
	  if(s1.endsWith("Java")){
		 System.out.println("文字列s1は、Javaが末尾にあります");
	  }
      //指定した文字が最初に登場する位置を調べる
	  System.out.println
	  ("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
      
	  //文字列の後ろから数えて指定した文字が登場する位置を調べる
	  System.out.println
      ("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}
}