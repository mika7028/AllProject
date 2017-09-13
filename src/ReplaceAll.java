
public class ReplaceAll {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		
		//文字列の置換
		String w = s.replaceAll("[bef]","X");
		System.out.println(w);
        
		//最初の１つだけを置換するreplaceFirst()もある。
	}

}
