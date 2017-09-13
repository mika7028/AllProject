
public class StringConversion {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JAVA";
		String s3 = " java ";
		
		System.out.println
		("小文字を大文字に変換→" + s1.toUpperCase());
        System.out.println
        ("大文字を小文字に変換→" + s2.toLowerCase());
        
        //全角のスペースは除去できない
        System.out.println
        ("前後の空白の除去→" + s3.trim());
        System.out.println
        ("文字列の変換→" + s1.replace(s1, s2));
	}

}
