package part5;


public class Test2 {
	//定数如果不在声明时就初期化，那么必须在构造函数中指定初期值，不然就是error
	final int a;
	public Test2(){
		this.a = 0;
	}
	
	
	
	
	
//final int a;error
	static int number =3;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1111");
//		System.out.println(number);
		//JAVA提供的Package
		/*
		 * 1.    java.lang       String    Math    Integer基本class，不声明（导入import）也可以直接使用
		 * 2.    java.io   File    printWriter     BUfferedWriter
		 * 3.    Java.net  javax.net   Socket    ServerSocket     URL
		 * 4.    java.util    HashSet     ArrayList     Vector  
		 * 5.    java.text
		 */
		
		
		foo foo = new foo();
		changeName(foo);
		System.out.println(foo.id);
		
		
	}
	private static void changeName(foo foo) {
		foo.id="test";
	}
	/**
	 * 基本知识
	 * overload函数 重载函数   一个class里面可以好几个一样名字的函数
	 * 		 引数的排序   型  个数  不一样就可
	 */
	public void overload(String name,int a) {
		System.out.println(name);
	}
	public void overload(int a,String name) {
		System.out.println(name);
	}
	//只有返回值不一样是不可以的
//	public int overload(int a,String name) {
//		System.out.println(name);
//		return a;
//	}

	
	
	//　ローカル変数にはアクセスpublicを指定できません。
	
}
