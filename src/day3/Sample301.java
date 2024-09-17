package day3;

public class Sample301 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//標準出力
        int a = 10; //  整数値（いろいろ変えてみましょう）
        System.out.println("a="+a);
        //  入力した値が、正の数かどうかを調べる
        if(a > 0){
            System.out.println("aは正の数です。");  //  正の数だった場合に実行
        }
        
        int b = -5; //  整数値（いろいろ変えてみましょう）
        System.out.println("b="+b);
        //  入力した値が、正の数かどうかを調べる
        if(b > 0){
            System.out.println("bは正の数です。");  //  正の数だった場合に実行
        }else{
            System.out.println("bは正の数ではありません。");        //  正の数ではなかった場合
        }
        
        //標準出力
        int num = 1;                    //  整数値（いろいろ変えてみましょう）
        if(num == 1){
            System.out.println("one");    //  numが1だった場合の処理
        }else if(num == 2){
            System.out.println("two");    //  numが2だった場合の処理
        }else if(num == 3){
            System.out.println("three");  //  numが3だった場合の処理
        }else{
            System.out.println("不適切な値です。"); //  それ以外の値が入力された場合の処理
        }
        
        int dice = (int)(Math.random()*7)+1;    //  1から7までの乱数を発生させる
        //  サイコロの目を入力
        System.out.println("さいころの目:"+dice);
        //  値が、サイコロの目の範囲内かどうかを調べる
        if(1 <= dice && dice <= 6){
            //  さいころの目が、偶数か、奇数かで、処理を分ける。
            if(dice == 2 || dice == 4 || dice == 6){
                System.out.println("丁（チョウ）です。");  //  偶数ならば丁（チョウ）
            }else{
                System.out.println("半（ハン）です。");   //  奇数ならば半（ハン）
            }
        }else{
            System.out.println("範囲外の数値です。");
        }
	}

}
