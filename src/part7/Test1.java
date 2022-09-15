package part7;

import java.util.Arrays;
import java.util.List;

class Foo1{
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1,2,3};
		Class obj1 = array.getClass();
		System.out.println(obj1.getName());//[I [配列   Iint型
		
		Foo1 foo1 = new Foo1();
		Class obj2  =foo1.getClass();//Class は raw 型です。 総称型 Class<T> への参照は、パラメーター化する必要があります
		System.out.println(obj2.getName());//part7.Foo1
		Foo1 foo2 = foo1;
		System.out.println(foo1.equals(foo2));//true  参照对象：比较内存地址  但是对于字符串的equals还是比较内容（==的字符串比较式比较内存地址
		//因为String内的equals被重写了，变成了比较字符串内容。其他的class(StringBuffer也是)还是比较内存地址
	//https://blog.csdn.net/fat_cai_niao/article/details/103050451?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166289982016782391889000%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=166289982016782391889000&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-1-103050451-null-null.142^v47^body_digest,201^v3^add_ask&utm_term=java%20%3D%3D%20equals&spm=1018.2226.3001.4187）
		
		String s1="test";
		String  s2 =s1;
		System.out.println(s1==s2);//true
		s1= s1+";";
		System.out.println(s1==s2);//false
		
//		short s1 =10;
//		s1=++s1;
		/**
		 * 这里的第二行代码可以正常编译，原因是在使用复合赋值运算符（这里指：+=）时，类型之间的转换是自动的不需要手动参与。
		    至于运算符：+=为什么可以进行自动转换？
		    猜测：因为在重载的过程中加入了类型转换的代码。...
		https://blog.csdn.net/sanshou/article/details/28885463?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166290089916782248536224%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=166290089916782248536224&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~baidu_landing_v2~default-1-28885463-null-null.142^v47^body_digest,201^v3^add_ask&utm_term=short%20%2B1&spm=1018.2226.3001.4187
		后来参看了，《java语言规范》在15.26.2 Compound Assignment Operators 一节说明了这个问题，
		+=就相当于 s=(short)(s+1);   //就像我上面猜测的那样。
		 */
//		s1= s1+1;// 型の不一致: int から short には変換できません
		//执行s1= s1+1;代码的时候，系统会把s+1的结果转换为int类型，而s(left)是short类型，比int类型小。需要强制进行转换为short才可以通过编译。（一般损失精度的转换都要采用强制的，就像这样：s=(short)(s+1);）
	/*
	 * 这个与运算符的类型有关，只要是发生了算数运算，此时就会把结果转化为int。

		是由于开发者考虑到，人们在计算的时候，大多会忽略取值这个范围
		
		所以为了简化底层逻辑，开发者设计，当没有任何关键字的时候，当接收到了
		
		byte、short、char这些数据类型，进行数学运算时，会在这个过程中
		
		将其转化为int类型！
			 */
	
		System.out.println("------------------------------");
		Integer val1 =1;
		Integer val2 =1;
		System.out.println(val1==val2);//true
		//-128~127の値であれば、既にメモリ上に値があれば、それを使用（String と一緒）
		//

		Integer val3 =150;
		Integer val4 =150;
		System.out.println(val3==val4);//false   127超える
		System.out.println(val3.equals(val4));//true　　　内容（数値）の比較
		
		Integer val5 = new Integer(1);
		System.out.println(val1==val5);//false　　new新対象 
		System.out.println(val1.equals(val5));//true
		
		Long val6 =new Long(150);
		Double val7 =new Double(150.0);
		System.out.println(val3.equals(val6));//false   Unlikely argument type for equals(): Long seems to be unrelated to Integer
		//異なるラッパークラス間でのequalsによる比較はfalseになる
		System.out.println(val3.equals(val7));//false    Unlikely argument type for equals(): Long seems to be unrelated to Integer
		
		System.out.println(val3.equals(val6.intValue()));//true
		//intValue　int型として取り出しequalsによる比較を行う　　　Intergerとintの比較ではなく、inyはAutoBoxingによりIntergerとして扱われる
		System.out.println(val3.equals(val7.intValue()));//true
		
		

		System.out.println("------------------------------");
		int[] i_array = {10,20,50,30,40};
		int[] i_array2 = new int[4];
		//1:コピー元   2:コピー元の開始index　3:コピー先   4: コピー先の開始index  5:  コピー元からコピーしたいの長さ 
		System.arraycopy(i_array, 2, i_array2, 0, 3);
		for (int i : i_array2) {
			System.out.print(i + "  ");//50  30  40  0  
		}System.out.println();
		
		String[] array1= {"q","a","z"};
		List<String> list1 = Arrays.asList(array1);
		System.out.println(list1.size());//asList 生成固定长度的List（array1.length的长度）3
//		list1.add("w");//所以运行时会error   Exception in thread "main" java.lang.UnsupportedOperationException
		for (String string : list1) {
			System.out.print(string);//qaz
		}System.out.println();
		
		
		//asListはList型を返すため、ArrayListで変数を宣言するとerror
//		ArrryLis<String> error0 = Arrays.asList("q","a","z");//型の不一致: List<String> から ArrryLis<String> には変換できません
		int[] ary2 = {10,20};
//		List<Integer> list3 = Arrays.asList(ary2);//型の不一致: List<int[]> から List<Integer> には変換できません
		List<Integer> list4 = Arrays.asList(10,20);//正常：AutoBoxingによりIntergerとして扱われる
		
		
		int[][] array3 = {{1,2,3},{4,5,6,7,8}};
		System.out.println(array3.getClass());//class [[I
		System.out.println(array3.getClass().isArray());//true
		/*
		 * Determines if this Class object represents an array class.
			Returns:
			true if this object represents an array class; false otherwise.
		 */
	}

}
