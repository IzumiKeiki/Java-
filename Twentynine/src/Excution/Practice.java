package Excution;

import java.util.Scanner;
import java.util.Arrays;

import Management.*;

/*
	
	0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8
	5
	9
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/

public class Practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many prefectures do you want to put information ?");
		
		int number1 = Integer.parseInt(scan.nextLine());
		
		List list = new List(number1);
		
		System.out.println("Type prefecture information here:");
	
		while (scan.hasNextLine()) {
			
			String input = scan.nextLine();
			if (input.isEmpty() || input.toLowerCase().equals("done")) {
		        break;
		    }
			String input2 = input.trim();
			
			String[] rank = input2.split(",", -1);
			String infor = rank[1].replace("\"", "");
			String[] ken = infor.split(":", -1);
			
			Prefecture prefecture = new Prefecture(ken[0],ken[1],Integer.parseInt(ken[2]));
			list.setPrefecture(Integer.parseInt(rank[0]), prefecture);
		}
		
//		System.out.println("Which prefecture do you want to get information ?");
//		
//		while(true) {
//			String input2 = scan.nextLine();
//			
//			if ( input2.toLowerCase().equals("done")) {
//				break;
//			}
//			
//			list.printItem(Integer.parseInt(input2));
//			
//			System.out.println("Input again if you want to continue or Done if you want to close");
//		}
		
		System.out.println("How many prefectures do you want to get information ?");
		
		int number2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Which prefectures do you want to get information ?");
		
		int[] prelist = new int[number2];
		
		for (int i = 0; i < prelist.length; i++) {
			String input3 = scan.nextLine();
	        prelist[i] = Integer.parseInt(input3);
	    }
		
		System.out.println("Type ACS or DECS");
		
		while (scan.hasNextLine()) {
			String answer = scan.nextLine();

			if ( answer.toLowerCase().equals("acs")) {
				Arrays.sort(prelist);
				
				for ( int item : prelist ) {
					list.printItem(item);
				}
			} else if (answer.toLowerCase().equals("decs")) {
				Arrays.sort(prelist);
				reverse(prelist);
				
				for ( int item : prelist ) {
					list.printItem(item);
				}
			}
			
		}
		
		scan.close();

	}
	
	 public static void reverse(int[] array)
	    {
	        int n = array.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = array[i];	 
	            array[i] = array[n - i - 1];
	            array[n - i - 1] = temp;
	        }
	    }

}
