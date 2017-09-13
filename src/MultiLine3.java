import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MultiLine3 {
  public static void main(String[] args){
	  String s1 = "abc def";
	  String s2 = "def abc";
	  String s3 = "def\nabc";
	  
	  String regex = "\\Aabc";
	  Pattern p = Pattern.compile(regex);
	  
	  System.out.println("パターン : " + regex);
      
	  check(p, s1);
	  check(p, s2);
	  check(p, s3);
  }
  private static void check(Pattern p, String target){
	  Matcher m = p.matcher(target);
	  if (m.find()){
		  System.out.println("〇" + target);
	  }
	  System.out.println("×" + target);
  }
}
