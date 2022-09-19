package part8;


public class Test3 {

//	private short s;//  s=0;  i=5  初期值 0
//	private int i;//  s=0;  i=5  初期值 0
	private Short s;//Exception   初期值null
	private Integer i;//Exception  初期值null
	
	public Test3(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.i = this.i + i +s;//Exception in thread "main" java.lang.NullPointerException
		this.s=0;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		String s1="123.45";
//		System.out.println(Integer.parseInt(s1));//Exception in thread "main" java.lang.NumberFormatException: For input string: "123.45"
		
		Test3 test3=new Test3(5);
		test3.print();
		
	}
	public void print() {
		System.out.println("s="+s+";  i="+i);
	}

}
