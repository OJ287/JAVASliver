package part6;

public class Test1 {
	public static void main(String[] args) {// TODO 自動生成されたメソッド・スタブ
		
		//インタフェースに宣言できる変数はstatic定数のみ
		/*
		 * で、インタフェース変数は　強制的にpublic static final暗黙
		 * インタフェースメソッドは強制的にpublic abstract暗黙
		 * 
		 * インタフェース中除了抽象方法，SE8开始也可以定义具象方法，单修饰子只能是public
		 * public default 返回值 方法名
		 * 但是，java.lang.Obkect 的equals hashCode  toString 不能在interface中被具象化
		 */
		Sales sales = new Sales();
		
	    //interface的方法没有声明public，实装class的重写也必须带上public
		MyClass myClass = new MyClass();
		System.out.println("A" + myClass.methodA(10));
		System.out.println("C" + myClass.methodC(10, 20));
		myClass.methodB();
		myClass.bianliang();
		
		//interface的static不可以使用实体化对象调用，普通class的static方法可以使用实体化对象调用
//		myClass.methodD();  //NG
//		sales.staticMerhod(); //警告 //型 Sales からの static メソッド staticMerhod() には static を参照してください
		
		Interface2.methodD();
		Sales.staticMerhod();
	}
	
	
	//重写与重载
//	https://www.runoob.com/java/java-override-overload.html

}
