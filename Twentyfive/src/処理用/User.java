package 処理用;

public class User {
	
	protected String name;
	
	public User (String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println(name);
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getRandom(int i) {
		double a = Math.random() * i + 1;
		int b = (int) a;
		return b;
	}
	
	public void overWrite() {
		System.out.println("こんにちは" + name + "さん");
		System.out.println("");
	}

}
