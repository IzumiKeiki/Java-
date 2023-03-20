package Management;

public class Prefecture {
	
	private String name;
	private String capital;
	private double area;
	
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	public Prefecture(Prefecture source) {
		this.name = source.name;
		this.capital = source.capital;
		this.area = source.area;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void printPrefecture() {
			System.out.println("都道府県名：" + name);
			System.out.println("県庁所在地：" + capital);
			System.out.println("面積：" + area + "km2");		
	}

}
