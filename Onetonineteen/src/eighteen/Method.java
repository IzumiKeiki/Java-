package eighteen;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
		
		hello();
		plus(1);
		multiplication(2,3);
		multiplication(2.5,0.1);
		random(100);
		average();
		
	}
	
	public static void hello() {
		System.out.println("Hello Java");
	};
	
	public static int plus(int i) {
		i = i + 1;
		System.out.println(i);
		return i;
	}
	
	public static int multiplication(int a, int b) {
		int c = a*b;
		System.out.println(c);
		return c;
	}
	
	public static double multiplication(double a, double b) {
		double c = a*b;
		System.out.println(c);
		return c;
	}
	
	public static int random(int i) {
		double a = Math.random() * i + 1;
		int b = (int) a;
		System.out.println(b);
		return b;
	}
	
	public static double average() {
		int[] arr = {random(100),random(100),random(100),random(100),random(100)};
		int a = 0;
		for ( int b=0; b<arr.length; b++) {
			a = a + arr[b];
		}
		double c = a/arr.length;
		System.out.println(c);
		return c;
	}
}
