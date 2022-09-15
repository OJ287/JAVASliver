package part6;

import part5.Employee;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//强转　キャスト
		double d=10.5;
		int i = (int)d;
		System.err.println("i= " +i );//i= 10小数部が切り捨てられ
		foo((short)i);
		
		
		byte b1 =10;//OK
//		byte b2 = 150;//NG   -128~127
		
		
		short s1=10;
		s1=++s1;
//		s1=s1+1;//型の不一致: int から short には変換できません
		/*
		 * 一方のdoubleの場合、演算前には他方のオペランドはdoubleに変換
		 * 一方のfloatの場合、他方のオペランドdoubleじゃない場合floatへ変換
		 * 一方の longの場合、他方のオペランドdouble、floatじゃない場合longへ変換
		 * 両方のオペランドはlong,float,doubleのいずれでもない場合、演算前には双方にintへ変換
		 * 
		 */
		
		
		Interface1 if1= new MyClass();
		System.out.println(if1.methodA(s1));//小转大默认转，大转小强转
		System.out.println(if1.methodA((int)s1));
		if1.methodB();
		
		Employee employee = new Sales();
		employee.setAge(s1);
		System.out.println(employee.getAge());
		
		
		Employee employee2 = new Sales();
		System.out.println(employee2.getName());
//		employee2.getClientName();//メソッド getClientName() は型 Employee で未定義です
		Sales employee3=(Sales)employee2;
		System.out.println(employee3.getClientName());
		
		Employee employee4 =new Employee();
//		Sales sales =(Sales)employee4;//実行時エラー
		
		
		//instanceof
		Sales sales=new Sales();
		System.out.println(sales instanceof Interface1);
		System.out.println(sales instanceof Employee);
		System.out.println(sales instanceof Sales);
//		System.out.println(sales instanceof Test1);//编译错误 //互換条件オペランド型 Sales と Test1
		
		
		
		
		int i1 =10;
		Integer obj=i1;//autoboxing
		int i2 = obj;//Unboxing
		System.out.println(i1+i2+obj);
		
		double d1=10;//OK  基本データ型暗黙の型変換
//		Double d2 =10;//NG //型の不一致: int から Double には変換できません
		

		int i5=10;//OK  基本データ型暗黙の型変換
		long l1=i5;//基本データ型暗黙の型変換  小变大的基本数据类型是默认变化，但是对象的数据类型就不能小变大
//		Long l2=i5;//型の不一致: int から Long には変換できません
		
		
		
		int i6 =10;
		foo(i6);// int  完全一致　　long暗黙の変換　Long　Autoboxing//foo  int
		//優先順位
//		完全一致　⇨　暗黙の型変換　⇨　Autoboxing　⇨　可変長因数
		
		
	//ポリモフィズム　多態性
		

		
		
	}

	static void foo(short a) {
		System.out.println("a= " + a);//a= 10
	}
	
	
	
	public static void foo(int a) {
		System.out.println("foo  int");
	}
	public static void foo(long a) {
		System.out.println("foo  long");
	}
	public static void foo(Integer a) {
		System.out.println("foo  Integer");
	}
}
