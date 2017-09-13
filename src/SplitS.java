//なぜか例外が出る
public class SplitS {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		
		//[,:] 正規表現パターン
	    String[] words = s.split("[,:])");
	    for(String w : words){
	    	System.out.println(w + "->");
	    }

	}

}
