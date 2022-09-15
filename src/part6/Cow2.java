package part6;

class Animal2{

	//2
	public  void saySomething() {
		System.out.print("Animal2!");
	}
}

public class Cow2 extends Animal2{
	public  void saySomething() {
		System.out.print("Cow2!");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal2 animal = new Cow2();
//		animal.saySomething();//A里面没有saySomething所以编译错误
		
		//2
		animal.saySomething();//Cow2!   虽然生成的对象的子类的对象，调用的也是子类里面的方法，但是套的盒子是父类的，
		//所以在变异的是有会检查父类有没有这个方法，没有的话直接报错不管是不是子类对象  方法。父类有的话检查通过 new的是子类方法的话还是调用子类方法
	}
}
