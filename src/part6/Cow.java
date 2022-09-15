package part6;

class Animal{
	public static void saySomething() {
		System.out.println("Gurrr!");
	}
}

public class Cow extends Animal{
	public static void saySomething() {
		System.out.println("Moo!");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal[] animals= {new Animal(),new Cow()};
		for (Animal animal : animals) {
			animal.saySomething();//型 Animal からの static メソッド saySomething() には static を参照してください
		}
		new Cow().saySomething();//型 Cow からの static メソッド saySomething() には static を参照してください
		
	}
	/*
	 * Gurrr!
		Gurrr!
		Moo!
		ポリモフィズムはstaticメンバには適用されず、変数宣言時のクラス側のメソッドが呼び出されるため、GGMとなる
	 */

	public void name(int a) {
		
	}
	private void name() {
		System.out.println("hello");
	}
}
