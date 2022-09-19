package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q5
		//クラスの宣言時にprotectedとprivateは付与出来ない
		//Q7
		//main()メソッドもオーバーロード可能ですが、JAVAコマンド実行時に呼び出されるのはString[]型の配列を引数にとるmain()メソッドのみです
		
		//Q8
		String string8="True";
		System.out.println(string8.replace("rue", "RUE"));
		boolean val8_1 = Boolean.parseBoolean(string8);
		boolean val8_2 = Boolean.valueOf(string8);
//		System.out.println(val8_1+val8_2);//演算子 + は引数の型 boolean, boolean で未定義 です
		System.out.println(val8_1+":"+val8_2);
		
		//Q9
		//int【】【】  坐标轴：左上角为原点  第一个index是从上往下Y轴，第二个index是从左向右X轴
		
		//Q10
		ArrayList<String> list10=new ArrayList<>();
		list10.add("A");list10.add("B");list10.add("C");
		list10.add(0,"D");//public void add(int index,E element)
		//add 第一引数にindexを指定すると、その位置にオブジェクトを格納します。なお、その位置とそれ以降に要素があれば
//		それらを移動させ、各要素のindexを1に加えます
		System.out.println(list10);//[D, A, B, C]
		
		
		
		//Q13
		int[][] ary13 = new int[4][2];
		ary13[0]= new int[] {1,2,3,4};
		ary13[1]= new int[] {5,6};
		for (int[] is : ary13) {
			for (int is2 : is) {
				System.out.print(is2 +" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------");
		//Q17
//		String[] strings17=new String[3];
//		for (int i = 0; i < strings17.length; i++) {
//			System.out.println(strings17[i].concat("JAVA  "));//Exception in thread "main" java.lang.NullPointerException
//		}
		
		//Q19
		Boolean[] boolean119= new Boolean[2];
		boolean119[0]= new Boolean(Boolean.parseBoolean("true"));
		boolean119[1]=null;
		System.out.println(boolean119[0]+":"+boolean119[1]);//true:null
		
		//Q23
//		int x23,y23,
//		if (x23 ==0) {//ローカル変数 x23 が初期化されていない可能性があります
//			
//		}
		
		
		//Q27
		String string27=" taro yamada ";
		string27.trim();
		System.out.println(string27);// taro yamada 
		System.out.println(string27.indexOf(" "));
		
		//Q30
		String string30="ABCDE";
		System.out.println(string30.substring(2,4));//CD
		
		//Q32
//		byte val32=1;
//		short val32=1;
//		long val32=1;
		Integer val32=1;
		
		switch(val32) {//long  Cannot switch on a value of type long. Only convertible int values, strings or enum variables are  permitted
		case 1:System.out.println("1");
		case 2:System.out.println("2");
		}
		
//		Q36
//		StringBuilder StringのtoString()返回其文字列
		
//		Q49
		//ローカル変数にアクセス修飾子を使用しているのはエラーです
//		private int num49=10;//パラメーター num49 の修飾子が正しくありません。final のみが許可されています
		
		
		//Q53
		//ガベージコレクタ対象
		/*
		 * 今回はガベージコレクションを「掃除のおばちゃん」に例えてご説明致します。
		 * 実はガベージコレクションとは、プログラムにおける掃除のおばちゃんのような存在なのです。
		 * なぜ、ガベージコレクションが掃除のおばちゃんに例えられるかを
		 * 、「プログラム実行時にメモリ上ではどのようなことが起こっているか」の解説を通して、お伝え致します。
		 */
		
		//Q60
		/*
		 * super()
		 * this()
		 * 这两个方法必须在第一行，所以这两个方法在一个方法里面只能存在一个，不能同时存在
		 */
		//Q64
//		new B64();// abstract  抽象类不能被实例化 型 B64 のインスタンスを生成できません
		
		//Q66
		X66 obj66_1 = new X66();
		Y66 obj66_2 = new Y66();
		X66 obj66_3 = new Z66();
		X66 obj66_4 = (X66)obj66_2;
//		X66 obj66_5 = (Y66)obj66_3;//Exception in thread "main" java.lang.ClassCastException: practice.Z66 cannot be cast to practice.Y66
		//obj66_3：X型の変数ですが、実体はZです。继承関係なしのYへキャストを試みると、コンパイルできるけど実行エラーあり
		
		
		
		//Q67
		LocalDateTime date67 = LocalDateTime.now();
		System.out.println(date67.format(DateTimeFormatter.ISO_DATE_TIME));//2015-01-30   2022-09-19T21:48:47.368

		
		//Q77
		try {
			ArrayList<String> list77= new ArrayList<>();
			while (true) {
				//実行時、メモリオーバーを表すOutOfMemoryError例外が発生する
//				OutOfMemoryErrorはerrorのサブクラスであり、ExceptioやRuntimeExceptionのサブクラスではないため
//				キャッチできません。
				list77.add("a");
			}
		} catch (RuntimeException ex1) {
			// TODO: handle exception
			System.out.println("RuntimeException ex1");
		} catch (Exception ex2) {
			// TODO: handle exception
			System.out.println("Exception ex2");
		}
		System.out.println("done");
	}

}
interface A64{}
abstract class B64 implements A64{}

class X66{}
class Y66 extends X66{}
class Z66 extends X66{}
