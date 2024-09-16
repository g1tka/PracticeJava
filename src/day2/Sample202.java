package day2;

public class Sample202 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a;
        double b,c,d;
        a = (int)1.23;  //  キャストで代入
        b = 1.23;
        c = 10;         //  キャストなしで代入
        d = (double)c;  //  キャストありで代入
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        
        String s1,s2,s3;
        s1 = "ABC";     //  s1に文字列「ABC」を代入
        s2 = "DEF";     //  s1に文字列「ABC」を代入
        s3 = s1 + s2;   //  s3に、s1とs2を結合したものを代入
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 + s2);
        System.out.println(s3);
        
        final int NUMBER = 100;
        final String STRING = "Hoge";
        System.out.println(NUMBER);
        System.out.println(STRING);
        //  finalがついた変数は値を変えられない(エラーになる)
        //NUMBER = 1001;
        //STRING = "fuga";
	}

}
