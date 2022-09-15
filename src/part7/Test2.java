package part7;
import java.util.*;
import java.util.function.Function;
import java.util.function.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//コレクションAPIとラムダ式　　　Collection   
		/*
		 * Set：重複した要素を含むことができないコレクションだ。数学的な集合の概念モデルを作ったり、生徒の時間割を作るためのコースや機械で動くプロセスの集合を表現したりする。
			List：順序付けられたコレクションである。重複した要素を含むことができる。ユーザーは要素を挿入する場所やインデックスによって要素にアクセスすることを正確に制御できる。
			Queue：追加の挿入、抽出、および検査が追加されたコレクション。
		 */
		
		
		
		
		
		
		//匿名
//		https://qiita.com/sano1202/items/64593e8e981e8d6439d3
//		String string = new Function<T, R>() {
//			public R apply(T t) {};
//		};
		String string = new Function<String, String>() {
			public String apply(String tString) {
				return "hello  " + tString; 
			}
		}.apply("takano");
		System.out.println(string);
		
		//ラムダ式
		//(String tString) -> {    没有写方法名而直接{return "hello  " + tString;}实装
//		是因为関数型インタフェース只有一个抽象方法。哪怕他是还有一个static方法和一个default方法，只要是有一个抽象方法也是関数型インタフェース
//		(String tString)  直接卸写成(tString)也行  因为这个抽象方法的引数是泛型，可自己判断。有且只有一个引数的话（）也可省略
//		{}只有一句处理代码的话，{}和return都可省略
		Function<String, String> obj1 = (String tString) -> {
				return "hello  " + tString;
		};
		System.out.println(obj1.apply("takano"));
		
		Function<String, String> obj2 = tString -> "hello  " + tString;
		System.out.println(obj2.apply("takano"));
		
		
		
		

		List<String> words = Arrays.asList("Takano","Saito");
		//匿名
//		words.replaceAll(new UnaryOperator<String>() {
//			
//			@Override
//			public String apply(String t) {
//				// TODO 自動生成されたメソッド・スタブ
//				return t.toUpperCase();
//			}
//		});
		//ラムダ式
		words.replaceAll((String string2) -> {return string2.toUpperCase();});
		words.replaceAll( string3 -> string3.toUpperCase());
		System.out.println(words);
		

		List<Integer> data = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//		//匿名
//		data.removeIf(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO 自動生成されたメソッド・スタブ
//				if(t % 2 !=0) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		});
		

		//ラムダ式
		data.removeIf((Integer i2) -> {return i2%2!=0;});
		data.removeIf((i3 ->  i3%2!=0));
		System.out.println(data);
		
		
	
		/*
		 * インタフェース　　SE８導入されたdefaultメソッド
		 * default boolean removeIf(Predicate<? super E> filter)   Collectionインタフェースで提供　
		 * 指定された処理を満たすこのコレクションの要素を全て削除
		 * 
		 * default void replace(UnaryOperator<E> operator)   Listインタフェースで提供　
		 * 指定された処理を行い、現在のリストの要素を置き換える
		 */
		
		
		
		
		
		
		
	}

}
