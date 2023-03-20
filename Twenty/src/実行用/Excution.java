package 実行用;

import 処理用.*;

public class Excution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("20-----");
		
		Management.printLine();
		Management.printDay();
		
		System.out.println("");
		System.out.println("23-----");
		
		Animal lion = new Animal("ライオン", 2.3, 80);
		lion.getName();
		lion.getLength();
		lion.getSpeed();
		
//		System.out.println("-----");
//		
//		Animal cat = new Animal();
//		cat.setName("neko");
//		cat.getName();
		
	}
	
	
}
