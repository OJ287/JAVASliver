package part6;

public class MyClass implements Interface1, Interface2 {
	int a ;
	String string;
	Sales sa;

	@Override
	public double methodC(int num1,int num2) {
		// TODO 自動生成されたメソッド・スタブ
		return num1 + num2;
	}

	@Override
	public double methodA(int num) {
		// TODO 自動生成されたメソッド・スタブ
		return num *0.3;
	}

	public void bianliang() {
		int b;
		System.out.println(a);
		System.out.println(string);
		System.out.println(sa);
		if (a==0) System.out.println("全局变量不用初期化默认是int 0 String null 对象 null");//
//		if (b==0) System.out.println("ローカル変量不声明不可以使用");//ローカル変数 b が初期化されていない可能性があります
		
		
	}
}
