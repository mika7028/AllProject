import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
	  
	  //Integer型でArrayListを宣言
	  ArrayList<Integer> points = new ArrayList<Integer>();
	  
	  //自動的にIntegerに変換・格納される
	  points.add(10);
	  points.add(80);
	  points.add(75);
	  
	  //enhanced-for文も利用可能
	  for (int i : points){
		  System.out.println(i);
	  }

	}

}
