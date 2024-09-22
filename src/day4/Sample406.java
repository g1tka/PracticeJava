package day4;

public class Sample406 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("6が出たら終了");
        //  無限ループ
        while(true){
            int dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if(dice == 6){
                break;      //  ループから抜ける
            }
        }
        System.out.println("終了");
	}

}

// 「6が出たら終了」と言う文字が出力され1から6の乱数が次々出力される。
// 1から5の数値だと、そのまま繰り返されるが、6が出ると終了
//
//while(true)とすると、基本的に処理は無限に繰り返される。
//break（ブレイク）があると、ループから出ることができる。
//Eclipseで無限ループが発生した場合、強制終了するには：
//
//停止ボタンをクリック: Eclipseの上部にある「停止」ボタン（赤い四角）をクリック
//ショートカットキー: キーボードショートカット「Ctrl + F2」
