import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MultiLine2 {
  public static void main(String[]args){
	  String s1 = "abc def";
	  String s2 = "def abc";
	  String s3 = "abc\ndef";
	   
	  String regex1 = "abc$";
	  Pattern p1 = Pattern.compile(regex1);
	  
	  String regex2 = "abc$";
	  Pattern p2 = Pattern.compile(regex2, Pattern.MULTILINE);
	  
	  System.out.println("パターン : " + regex1);
	  
	  check(p1, s1);
	  check(p1, s2);
	  check(p1, s3);
	  
	  System.out.println("\nマルチラインモードに変更\n");
	  System.out.println("パターン : " + regex2);
	  
	  check(p2, s1);
	  check(p2, s2);
	  check(p2, s3);
  }
  private static void check(Pattern p, String target){
	  Matcher m = p.matcher(target);
	  
	  if(m.find()){
		  System.out.println("〇" + target);
	  } else {
		  System.out.println("×" + target);
	  }
  }
}
