package part5;

public class Employee {
	private String name;
	
	private int age;
	
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		// 警告：设定的话也是null
//		id = id;
		
		this.id=id;
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "name:" + this.name + ";  age:" + this.age + ";  id:" +this.id;
	}
	
}
