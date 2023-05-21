package practice;

public class Test2 {
	static int num1;
	int x =3;
	static int y=2;
	public static void main(String[] args) {
		int num2;
		String string="String";
		toChange(string);
		System.out.println(num1);//0
//		System.out.println(num2);//ローカル変数 num2 が初期化されていない可能性があります
		System.out.println(string);//String
		
		Test2 test2= new Test2();
		System.out.println(test2.x+"==="+y);
	}
	public Test2() {
		// TODO 自動生成されたコンストラクター・スタブ
		x=x+1;
	}
	static {
		y+=y;
	}
	static void toChange(String a) {
		a="changed";
	}
}
