import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JSample1_1 {
  public static void main(String[] args){
	  String s1 = "Hello";
	  String s2 = "Hey";
	  //「"e"で始まり任意の文字が0回以上繰り返された後で"o"が出現する
	  String  regex = "e.*o";
	  Pattern p = Pattern.compile(regex);
	  
	  //s1はパターンに合うか検証
	  Matcher m1 = p.matcher(s1);
	  System.out.print(s1 + "は");
	  if(m1.find()){
		  System.out.println("マッチします");
	  } else {
		  System.out.println("マッチしません");
	  }
	  //s2はパターンに合うか検証
	  Matcher m2 = p.matcher(s2);
	  System.out.print(s2 + "は");
	  if(m2.find()){
		  System.out.println("マッチします");
	  } else {
		  System.out.println("マッチしません");
	  }
  }
}
