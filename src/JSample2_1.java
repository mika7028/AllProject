import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JSample2_1 {
  public static void main(String[] args){
	  String s1 = "abcde";
	  String s2 = "defabc";
	  
	  //abcという文字列が含まれるか調べる
	  String regex1 = "abc";
	  Pattern p1 = Pattern.compile(regex1);
	  
	  //先頭にabcという文字列が含まれるか調べる
	  String regex2 = "^abc";
	  Pattern p2 = Pattern.compile(regex2);
	  
	  check(p1, s1);
	  check(p1, s2);
	  check(p2, s1);
	  check(p2, s2);
  }
  private static void check(Pattern p, String target){
	  Matcher m = p.matcher(target);
	  
	  System.out.print(target + "は");
	  if(m.find()){
		  System.out.println("マッチします");
	  } else {
		System.out.println("マッチしません");  
	  }
  }
}
