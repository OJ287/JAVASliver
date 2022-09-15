package part6;

public class Test5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Test5 obj1 = new Foo2();
//		obj1.method();//メソッド method() は型 Test5 で未定義です
		//onj1はTest5型であり、test５にはmethod()ないから　コンパイルエラー
//		(Foo2)obj1.method();//Foo2 は変数に解決できません    メソッド method() は型 Test5 で未定義です
		//(Foo2)使用了但是，但是不是呼出的返回对象的值的method()
		((Foo2)obj1).method();
		//((Foo2)obj1).  这样是得到了返回对象的Foo对象才能调用method()
		

		Foo2 obj2 = new Foo2();
		obj2.method();//メソッド method() は型 Test5 で未定義です
//		(Foo2)obj2.method();//Foo2 は変数に解決できません  
		((Foo2)obj2).method();
		
	}

}
class Foo2 extends Test5 implements MyInter{ 
	public void method() {
		System.out.println("hello");
	}
}

interface MyInter{
	void method();
}