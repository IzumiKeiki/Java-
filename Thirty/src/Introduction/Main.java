package Introduction;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("鈴木太郎", 20, 1.7, 0);
		   
	    System.out.println(person1.getName());
	    System.out.println(person1.getAge());
	    System.out.println(person1.getHeight());
	    
	    person1.setWeight(60);
	    
	    System.out.println(person1.getBMI());
	    person1.print();
	    Person.printCount();
	    
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();
	    Person.printCount();

	}

}
