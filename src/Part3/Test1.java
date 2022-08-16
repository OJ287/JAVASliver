/**
 * 
 */
package Part3;

/**
 * @author liyanpeng
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 * a+b
		 * a-b
		 * ++a  a++  --a  a--
		 * 
		 * a変数b変数に対して演算子を使用してる。子の演算対象となる変数やリテラルはオペランドと呼ぶ
		 */
		
		/*
		 
		//整数/整数　＝　整数
		System.out.println(10 / 3);
		//整数/小数点数　＝　小数点数
		System.out.println(10 / 3.0);
		
		int a = 10;int b = 10;int c = 10;int d = 10;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--d);
		
		a = 10; b = 10; c = 10; d = 10;
		b = ++a;
		System.out.println("a=" + a + "; b=" + b);
		d= c++;
		System.out.println("c=" + c + "; d=" + d);
		

		a = 10; b = 10; c = 10; d = 10;
		boolean re1=a++ > 10 & ++b > 10;
		System.out.println("re1=" + re1 + a + b );

		boolean re2=c++ > 10 && ++d > 10;
		System.out.println("re2=" + re2 + c + d );
		
		 */
		//String
		
		/*
		String test1 = "hello world";
		System.out.println(test1.charAt(4));
		System.out.println(test1.substring(4,5));
		System.out.println(test1.substring(2));
		//[,)
		System.out.println(test1.substring(2,4));
		System.out.println(test1.trim());
		*/
		
		
		//StringBuffer 的方法的返回值一般都是，方法操作完的字符串、*
		/*
		StringBuffer test2 = new StringBuffer("Ab　cdefgh");
		System.out.println(test2.length());
		System.out.println(test2.replace(3, test2.length(), "TEST"));
		System.out.println(test2);
		test2=new StringBuffer("Ab　cdefgh");
		System.out.println(test2.delete(3, test2.length()));*/
		
		
		//newを使用した場合は、メモリ上に同じ文字列が既に存在しても、必ず新しい文字列が用意される
		String test3 = new String("test");
		String test4 = new String("test");
		System.out.println(test3 == test4);

		//newを使用してない場合は、メモリ上に同じ文字列が既に存在していれば、既存の文字列を参照する（参照先　対象が同じ）
		String test5 = "test";
		String test6 = "test";
		System.out.println(test5 == test6);
		
		// 7 8 是不同对象
		String test7 = "test7";
		String test8 = test7 + "test8";

		// 9 10 是不同对象
		String test9 = "test9";
		String test10 = test9.concat("test10");
		
		// 11 12 是同一个对象
		StringBuffer test11 = new StringBuffer("test11");
		StringBuffer test12 = test11.append("test12");
		
	}

}
