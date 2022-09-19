package part8;

public class MyException1 extends Exception {

	//エラーを追跡し発生箇所を特定する（エラートレース）を出力する
	public void printStackTrace() {
		
	}
	//エラーメッセージを取得
	public String getMessage() {
		
		return "自定义的Exception";
	}
	private int age;
	public void setAge(int age) {
		this.age =age;
	}
	public int getAge() {
		return this.age;
	}
}
