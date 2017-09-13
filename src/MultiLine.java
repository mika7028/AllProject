import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MultiLine {

	public static void main(String[] args) {
		String str1 = "abc def";
	    String str2 = "def abc";
	    String str3 = "abc¥ndef";
	    String str4 = "def abc¥n";
        
	    String regex1 = "abc\\Z";
	    Pattern p1 = Pattern.compile(regex1);
	    
	    String regex2 = "abc\\Z";
	    Pattern p2 = Pattern.compile(regex2);
	    
	    System.out.println("パターン : " + regex1);
	    
	    check(p1, str1);
	    check(p1, str2);
	    check(p1, str3);
	    check(p1, str4);
	    
	    System.out.println("パターン : " + regex2);

	    check(p2, str1);
	    check(p2, str2);
	    check(p2, str3);
	    check(p2, str4);
	}
    private static void check(Pattern p, String target){
    	Matcher m = p.matcher(target);
    	if(m.find()){
    		  System.out.println("○ " + target);
        }else{
          System.out.println("× " + target);
        }

    	
    }
}
