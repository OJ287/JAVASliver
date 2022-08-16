package part4;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		while (true) {
//			System.out.println("1");
//		}
//		while (true) 后面的处理将按照编译错误
//		System.out.println("111");

//		while (false) 直接编译错误
//	while (false) {
//				
//			}
		
		//死循环
//		for(;;) {
//			
//		}
//		int i2 = 0;
		 for (int i1 = 0 , i2 = 0;i1+i2<10;i1++,i2++) {
			 System.out.println(i2);
		 }
		 
		 int i3 = 0;int i4 = 0;
		 for (i3=0,i4=4;i3+i4<10;i3++,i4++) {
			
		}
		 
		 
		 int[] test1 = {1,2,3,4,5,6,7,8};
		 for (int i : test1) {
			System.out.print(i);
		}
		 System.out.println();
		 for (int i = 0; i < 10; i++) {
			if (i % 4 ==0 ) {
				System.out.print(i);
			}
		}
		 
		 System.out.println();System.out.println();System.out.println();
		 loop1:
			 for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println("i:" + i + ";j:" + j);
					if(i==1 && j ==1 ) {
						System.out.println("BREAK");
						break loop1;
					}
				}
			}
		 loop2:
			 for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println("i:" + i + ";j:" + j);
					if(i==1 && j ==1 ) {
						System.out.println("continue");
						continue loop2;
					}
				}
			}
		 /*
		 i:0;j:0
		 i:0;j:1
		 i:0;j:2
		 i:1;j:0
		 i:1;j:1
		 BREAK
		 i:0;j:0
		 i:0;j:1
		 i:0;j:2
		 i:1;j:0
		 i:1;j:1
		 continue
		 i:2;j:0
		 i:2;j:1
		 i:2;j:2
			*/ 
	}

}
