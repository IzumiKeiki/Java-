package 処理用;

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/

import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private String name;
	
	public Management (String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println(name);
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void printLine() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
	}
	
	public static void printDay() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd H:m:s");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));
	}

}
