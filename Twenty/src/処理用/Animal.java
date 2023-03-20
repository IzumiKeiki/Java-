package 処理用;

/*

下記がコンソールに出力されるように作成してください
※thisとsetterとgetterとフィールドを使ってください

動物名：ライオン
体長：2.1m
速度：80km/h

*/

public class Animal {
	
	private String name;
	private double length;
	private int speed;
	
	public Animal (String name,double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		System.out.println("動物名： " + name);
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getLength() {
		System.out.println("体長： " + length + "m");
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public int getSpeed() {
		System.out.println("速度： " + speed + "km/h");
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
