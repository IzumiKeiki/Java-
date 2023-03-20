package Introduction;

public class Person {
	
	public String name;
	public int age;
	public double height;
	public double weight;
	
	public static int count = 0;

	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count ++;
	}

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
	

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + this.getName() + "です");
		System.out.println("年は" + this.getAge() + "です");
	}
	
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}

}
