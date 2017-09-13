import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JSample6_1 {
  public static void main(String[] args){
	  String s1 = "Tomato is 100yen, Lemon is 80yen";
	  String regex = "\\d.+?yen";
	  Pattern p = Pattern.compile(regex);
	  
	  System.out.println("Target : " + s1);
	  System.out.println("Pattern : " + regex + "\n");
	  
	  check(p, s1);
  }
  private static void check(Pattern p, String target){
	  Matcher m = p.matcher(target);
	  while(m.find()){
		  System.out.println("match : " + m.group());
	  }
  }
}
