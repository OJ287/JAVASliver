package Part3;


public class Test2 {

	public static void main(String[] args) {
		//IF ELSE 文
//		int a1 = 10;int a2 = 20;
//		if(a1=a2) {
//			System.out.println("did not run");
//		}
		
		boolean b1 = false;boolean b2 = true;
		if(b1=b2) {
			System.out.println("Runned");
		}
		
		//三元
		int test1 = 20;
		String test2 ="";
		test2 += test1 > 10 ? "大于10" : "小于10";
		System.out.println(test2);
		
		
		boolean test3 = false;
		//switch (test3) {}     ()判断式不可以是boolean。应该是 byte short int  char enum String
		
		int test4 = 20;
		//没有break的时候。从true的case开始到最后全部的case都会进行处理
		switch(test4) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		case 40:
			System.out.println("40");
		case 50:
			System.out.println("50");
		default :
			System.out.println("do not knew");
		}

		//虽然是从上向下进行的，但先去判断case的，case没有的话才会走default，
//		也就是说还有case没有进行判断就到了default的话，这时候是不会走default的
		switch(test4) {
		case 10:
			System.out.println("10");
		default :
			System.out.println("do not knew");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		case 40:
			System.out.println("40");
		case 50:
			System.out.println("50");
		}

		//虽然是从上向下进行的，但先去判断case的，case有的话就会直接进行相应case处理
//		但没有break所以还是会接下去向下走。
		switch(test4) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		default :
			System.out.println("do not knew");
		case 30:
			System.out.println("30");
		case 40:
			System.out.println("40");
		case 50:
			System.out.println("50");
		}
		

		//虽然是从上向下进行的，但先去判断case的，case没有的话才会走default，
//		全部case全部判断完成，且没有正确的时候才会走default。default没有break的时候
//		也会接着从上向下接着处理
//		default在哪里都行，不一定非得要在最后。
		test4 = 60;
		switch(test4) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		default :
			System.out.println("do not knew");
		case 30:
			System.out.println("30");
		case 40:
			System.out.println("40");
		case 50:
			System.out.println("50");
		}
		
	}
}
