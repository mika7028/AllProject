import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Matcher1 {
  public static void main(String[]args){
	  String str1 = "How are you?";
	  String str2 = "Howareyou";
	  
	  String regex1 = "\\bar";
	  Pattern p1 = Pattern.compile(regex1);
	  
	  String regex2 = "\\Bar";
	  Pattern p2 = Pattern.compile(regex2);
	  
	  String regex3 = "you\\b";
	  Pattern p3 = Pattern.compile(regex3);
	  
	  String regex4 = "\\bHow";
	  Pattern p4 = Pattern.compile(regex4);
	  
	  System.out.println("パターン : " + regex1);

	    check(p1, str1);
	    check(p1, str2);

	    System.out.println("\nパターン : " + regex2);

	    check(p2, str1);
	    check(p2, str2);

	    System.out.println("\nパターン : " + regex3);

	    check(p3, str1);
	    check(p3, str2);

	    System.out.println("\nパターン : " + regex4);

	    check(p4, str1);
	    check(p4, str2);
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
