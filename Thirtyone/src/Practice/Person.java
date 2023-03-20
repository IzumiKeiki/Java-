package Practice;

public class Person {
	
	private String firstname;
	private String lastname;
	private int age;
	private double height;
	private double weight;
	
	public static int number;

	public Person(String firstname, String lastname, int age, double height, double weight) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		number++;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String fullName() {
		return this.firstname + this.lastname;
	}

	public double getBMI() {
		return weight / height * height;
	}
	
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.getBMI() + "です");
	}
	
	public static void printCount() {
		System.out.println("合計" + number + "人です");
	}
	
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
		
	}

}
