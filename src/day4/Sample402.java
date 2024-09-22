package day4;

public class Sample402 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//  forの二重ループ
        for(int i = 1;i <= 2;i++){
            for(int j = 1; j <=3 ; j++){
                int k = i + j;
                System.out.print(i+"+" + j +  "=" + k +" ");
            }
            System.out.println();
        }
	}

}
//これもforで、二重にできるという紹介。
//＞1+1=2 1+2=3 1+3=4 2+1=3 2+2=4 2+3=5　の６回処理する。
