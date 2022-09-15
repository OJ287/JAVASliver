package part6;

import part5.Employee;

public class Sales extends Employee {
	public Sales() {
		//默认super()
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Sales(String a) {
		//默认super()
	}
	public static void staticMerhod() {
		System.out.println("Sales.staticMerhod");
	}

	private String clientName;
	
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getName() {
		return "Sales的getName";
	}
}
