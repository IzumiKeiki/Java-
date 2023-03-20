package 実行用;

/*名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 Projectを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

//import java.util.Random;

import 処理用.Stage;
import 処理用.User;

public class Excution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("25-----");
	
//		Random random = new Random();
//		int a =	random.nextInt(1000);
//		System.out.println(a);
		
		User senior = new User("senior");
		Stage junior = new Stage("junior");
		senior.overWrite();
		junior.overWrite();
		
	}
	
}
