import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JSample3_1 {

	public static void main(String[] args) {
	  String s1 = "stat[改革]end";
	  String s2 = "array[abc]";
	  
	  String regex = "\\[.*\\]";
	  Pattern p = Pattern.compile(regex);
	  
	  check(p, s1);
	  check(p, s2);

	}
    private static void check(Pattern p, String target){
    	Matcher m = p.matcher(target);
    	if(m.find()){
    		System.out.println("マッチします");
    		System.out.println("マッチした部分は" + m.group() + "です");
    	} else {
    		System.out.println("マッチしません");
    	}
    }
}
