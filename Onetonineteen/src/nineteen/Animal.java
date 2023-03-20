package nineteen;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		Dog myDog = new Dog("husky",3);
		myDog.getName();
		myDog.getNumber();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd H:m:s");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
		
	}
}
