package practice;

class CD{
	int r;
	CD(int r){
		this.r=r;
	}
}
 class DVD extends CD{
	int c;
	DVD(int r,int c){
		super(r);//暗黙的スーパー・コンストラクター CD() は未定義です。 別のコンストラクターを明示的に呼び出す必要があります
		//默认会调用父类的实体化方法，一定有调用super才行，实体化父类。
		super.r=r;
		this.c=c;
	}
}

public class Test10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String string="abc";
		string.toUpperCase();
		string=string.concat("def".toUpperCase());
		System.out.println(string);
		System.out.println(string.substring(4,6));
		
		
//		while (true) {//OK
//			
//		}
//		while (false) {//NG
//		
//	}
//		boolean a=false;
//		while (a=true) {//OK
//		
//		System.out.println("###");//OK
//		}
//		while (a=false) {//OK
//		System.out.println("###"); //buzhixing
//		}
//		do {
//			
//		} while (true);//OK
//		do {
//			
//		} while (false);//NG
//		
//		int day =1;
//		switch(day) {
//		case "7":System.out.println(7); break;
//		case "6":System.out.println(6); break;
//		case "5":System.out.println(5); break;
//		case "4":System.out.println(4); break;
//		}
		
		//Q22
		int x=10;
		if (x>10) {
			System.out.println(">");
		}else if (x<10) {
			System.out.println("<");
		}else {
			System.out.println("=");
		}
		System.out.println(x>10?">":x<10?"<":"=");
//		System.err.println(x>10?">"?"<":"=");
	}

}
