package part7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1,2,3,4,5};
		System.arraycopy(array, 2, array, 1, 2);
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println();
		String string=" ";
		string.trim();
		System.out.println(string+"1");
		System.out.println(string.equals("")+":"+string.isEmpty());
		
		
		String[] aryStrings = {"a","b","c"};
//		List<String> cityStrings = Arrays.asList(aryStrings);//String[]是固定长度的数组，不能改变，
//		cityStrings.add("d");//Exception in thread "main" java.lang.UnsupportedOperationException
		List<String> cityStrings = new ArrayList<>(Arrays.asList(aryStrings));
		cityStrings.add("d");
		
		String s1 = "A";
		StringBuilder s2 = new StringBuilder("A");
//		System.out.println(s2.equals(s1));  //equals比较对象
		System.out.println(s2.toString().equals(s1));
		System.out.println(s1+":"+s2);//println是toString
		
		
		//继承问题
		Y y =new Y();
		X x =y;
		Z z =x;
		System.out.print(x+" ");
		System.out.print((Y)x+" ");
		System.out.print(z+" ");
		
	}

}

interface Z{}
class X implements Z{ public String toString() {return "X";}}
class Y extends X{ public String toString() {return "Y";}}

