package part6;
class Foo{
	void method(Object obj) {System.out.println("Object");};
	void method(Number obj) {System.out.println("Number");};
	void method(Integer obj) {System.out.println("Integer");};
	void method(char[] obj) {System.out.println("Char[]");};
}
public class Test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//重载
		Foo foo = new Foo();
		foo.method("String");//Object
	}

}
