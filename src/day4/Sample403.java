package day4;

public class Sample403 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;
	       while(i <= 5){
	           System.out.print(i+" ");
	           i++;
	       }
	       System.out.println();
	       
	       
	     int x = 0;
	       do{
	           System.out.print(x+" ");
	           x++;
	       }while(x <= 5);
	       System.out.println();
	}

}
// 実行結果は、0,1,2,3,4,5となる。i=0から順に1を足した結果。
// i=5までは( <=5 )trueなので実行（print）するが、i=6 ( >5 ) だとfalseなので実行しない。終わり。
// for()文と違うのは、インクリメント・デクリメントといった処理や、初期値を設定する処理がループ内に存在しないこと。
// 

// 実行結果は、0,1,2,3,4,5となる。
// do～whileの書式
//do{
//    処理
//}whlie(条件式）; ← whileの後にセミコロンがついている。注意。
// 
// 
