package practice;

public class Test51 {

	int a;
	void x(int y) {this.a =y;};
	public static void main(String[] args) {
		//a変数を初期化するため
		Test51 test51=new Test51();
		test51.a=100;
//		a=200;//非 static フィールド a を static 参照できません
//		this.a=300;//非 static フィールド a を static 参照できません
//		Test51.class=400;非 static フィールド a を static 参照できません
		test51.x(100);
//		x(500);//型 Test51 から非 static メソッド x(int) に static 参照する
	}
}
