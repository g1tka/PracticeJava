package day2;

public class Sample201 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(5 + " + " + 2 + " = ");
        System.out.println(5+2);    //  足し算
        System.out.print(5 + " - " + 2 + " = ");
        System.out.println(5-2);    //  引き算
        System.out.print(5 + " * " + 2 + " = ");
        System.out.println(5*2);    //  掛算
        System.out.print(5 + " / " + 2 + " = ");
        System.out.print(5/2);      //  割り算
        System.out.print(" 余り ");
        System.out.println(5%2);    //  剰余
        
        System.out.println("ABC" + "DEF");
        System.out.println("答え："+3);
        
        int a;           // 変数の宣言
        int b = 3;      //  初期化と代入を同時に行う。
        int add,sub;    //  複数の変数を同時に宣言
        double avg;     //  int以外の変数を宣言
        a = 6;  //  代入（最初に値を入れるので、”初期化”と言う。
        add = a + b;            //  a,bの和を求める。
        sub = a - b;            //  a,bの差を求める。
        avg = (a + b) / 2.0;    //  a,bの平均値を求める。
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + "と" + b + "の平均値：" + avg);
	}

}
