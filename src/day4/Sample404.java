package day4;

public class Sample404 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,num;
        num = 1;
        //  whileループで実行
        System.out.print("whileで実行:");
        i = 1;
        while(i < num){
            System.out.print("*");
            i++;
        }
        System.out.println();
        //  do～whileループで実行
        System.out.print("do～whileで実行:");
        i = 1;
        do{
            System.out.print("*");
            i++;
        }while(i < num);
	}

}

// 実行結果は以下の通りになる。
// whileで実行:
// do～whileで実行:*

// whileの場合、iの値はもともと条件を満たしていないので、{}内の処理が実行されない。
//これに対し、 do～whileの場合、まず{}の処理を実行してから条件判定をしているため、
//仮に条件式を満たしていなくても最低限1度は処理が実行されることによる。

//"whileで実行:"と出力されます。
//iが1に設定され、whileループが開始されます。
//while(i < num)の条件は、iがnum（1）より小さい場合に真です。
//しかし、iは1なので、whileループは条件を満たさず、ループの本体は一度も実行されません。
//そのため、アスタリスクは出力されません。

//"do～whileで実行:"と出力されます。
//iを1に設定し、doブロックが実行されます。
//doブロック内のコードは、条件に関係なく必ず一度
//実行されるため、最初にアスタリスクが1つ出力されます。
//次にiを1増やし、while(i < num)の条件をチェックします。
//この時点でiは2になっており、条件は偽（2 < 1ではない）になるため、ループは終了します。


