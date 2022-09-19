package part8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//throw
		try {
			int age =-10;
			checkAge(age);
		} catch (MyException1 e) {
			// TODO: handle exception
			System.out.println("不正确的值。age： "+e.getAge());
		}
	}
	public static void checkAge(int age) throws MyException1{
		if (age>0) {
			System.out.println("OK");
		}else {
			MyException1 myException1=new MyException1();
			myException1.setAge(age);
			throw myException1;
		}
	}

}


class Super{void method() throws IOException{}}

class SubA extends Super{void method(){}}
class SubB extends Super{void method() throws FileNotFoundException{}}
//class SubC extends Super{void method() throws Exception{}}//コンパイルエラー　　
//例外 Exception は Super.method() にある throws 節と矛盾します
//part8.Super.method をオーバーライドします
//class SubD extends Super{void method() throws ClassNotFoundException{}}//コンパイルエラー　SuperのIOException関係なし（継乗関係）
//例外 ClassNotFoundException は Super.method() にある throws 節と矛盾します
//part8.Super.method をオーバーライドします
class SubE extends Super{void method() throws RuntimeException{}}


/*
 * オーバーライドのルール
 * https://blog.csdn.net/dietime1943/article/details/53161364?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166348725516800182147262%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=166348725516800182147262&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-53161364-null-null.142^v47^body_digest,201^v3^add_ask&utm_term=JAVA%E9%87%8D%E5%86%99&spm=1018.2226.3001.4187
 * オーバーライドとは、メソッド名、引数リストが全く同じメソッドをサブクラスで定義
 * 戻り値は、スーパークラスで定義したメソッドが返す型と同じか、その型のサブクラス型とする
 * アクセス修飾子はスーパークラアスと同じものか、それより公開範囲が広いものであれば使用可能
 * throwsには、スーパークラスのメソッドがthrowsに指定した例外クラスとそのサブクラスが指定できる
 * ただし、RuntimeExceptionクラスおよびそのサブクラスは、制約なしにthrowsに指定できる
 * スーパークラスのメソッドにthrowsがあっても、throws（サブクラスには）を指定しなくても良い
 */


