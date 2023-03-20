package nineteen;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	
	// Q2：フィールドに動物の数の変数を定義してください。
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
	private String name;
	private int number;
	
	public Dog (String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		System.out.println(name);
		return name;
	}
	
	public int getNumber() {
		System.out.println(number);
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	public void setNumber(int number) {
		this.number = number;
		System.out.println(number);
	}
	
}
