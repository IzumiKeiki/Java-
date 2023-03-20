/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	continue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package fourteen;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] letters = {"a","b","c","d","e","f","g","h","j"};
		for ( int i=0; i<letters.length; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(letters[i]);
		}
		
		System.out.println("------");
		
		for ( int j=0; j<letters.length; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(letters[j]);
		}
		
				
	}

}
