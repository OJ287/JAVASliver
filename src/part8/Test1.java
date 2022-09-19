package part8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 * try-catch
		 * try-finally
		 * try-catch-finally
		 * tryブロックのみの定義：コンパイルエラー
		 */
		try {
			int[] num1= {1,2,3,4,5};
			for (int i=0;i<6;i++) {
				System.out.print("num1:" +num1[i]);
				System.out.println("   ;"+(i+1)+"回目");
			}
			/*
			 * 没有try catch的话
			 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
				at part8.Test1.main(Test1.java:13)
			 */
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("---end ----");
		
		/*
		 * 例外：checked  uncheckedに分ける
		 * Errorクラス及びサブクラス：unchecked
		 * RuntimeExceptioanクラス及びサブクラス：unchecked
		 * RuntimeExceptioan以外のExceptionサブクラス：checked
		 * checked：DBなどJAVA実行環境以外の環境が片インで発生する例外です。
		 * unchecked：実行中のプログラムが原因で発生する例外（実行時例外）や、メモリ不足などのプログラムの例外処理で復旧出来ない例外です。
		 * checked例外：例外処理が必須である
		 * unchecked例外：例外処理が必須ではありません
		 * unchecked例外処理は例外処理が任意のため、JAVA実行環境はunchecked例外が発生すればその種類を問わず
		 * 　呼び出し元に転送し、プログラム上でキャッチしなければ、最終的にJAVA実行環境がキャットし、エラーのトレースを出すように
		 * 　作られています。
		 * checked例外：
		 * 	 IOException  ClassNotFoundException  ClassNotFoundException
		 * unchecked例外：
		 *   Error:AssertionError  OutOfMemoryError  StackOverflowError  NoClassDefFoundError
		 *   RuntimeException:ArrayIndexOutOfBoundsException  ClassCastException  IllegalArgumentException
		 *       ArithmeticException  NumberFormatException
		 *    equals:throwa指定がされていないため、例外処理任意
		 *    
		 */
		
		//マルチキャッチ
//		FileReader fReader= new FileReader("a.txt");//処理されない例外の型 FileNotFoundException
		//new FileReader 是有throw FileNotFoundException的。所以直接是会报错
		//解决方案：要么使用try catch 捕捉FileNotFoundException  。要么使用throw在方法上抛出FileNotFoundException
		try {
			System.out.println(10/0);
			FileReader fReader= new FileReader("a.txt");
		} catch (FileNotFoundException |ArithmeticException e) {//マルチキャッチ
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
