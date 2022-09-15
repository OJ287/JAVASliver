package part6;

public interface Interface1 {
	double methodA(int num);
	default void methodB() {
		System.out.println("methodB");
	}
}
