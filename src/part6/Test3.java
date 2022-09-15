package part6;

public class Test3 {

	/*
	 * class里面没有一个构造函数的话会默认给你加一个无参的构造函数
	 * 但你要是写了任何一个构造函数的话，就不会自动在给你增加构造函数
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//	練習問題
		//new Test3()  调用toString
		////在输出语句中输出一个对象自动调用toString函数
		//如果不重写toString的话  输出part6.Test3@15db9742
//		part6.Test3@6d06d69c
		Test3 test3=new Test3();
		System.out.println(new Test3());
		System.out.println(test3);
	}
	private String msg;
	public Test3() {
		this("Good");
	}
	public Test3(String msg) {
		msg=msg;
		//This.msg =msg
	}
	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "msg : " + msg;
	}
	
}

