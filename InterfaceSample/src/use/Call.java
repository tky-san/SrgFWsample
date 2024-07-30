package use;

import used.AddCalc;
import used.Calclator;
import used.SubCalc;

public class Call {

	public static void main(String[] args) {
		
		// Integerの値を用意
		Integer x = 10;
		Integer y = 5;
		
		// 加算クラス処理
		// 加算クラスをインスタンス化
		Calclator calclatorAdd = new AddCalc();
		// メソッドを実行
		Integer resultAdd = calclatorAdd.calc(x, y);
		// 結果を表示
		System.out.println("計算結果(加算)は「" + resultAdd + "」です。");
		
		// 減算クラス処理
		// 減算クラスをインスタンス化
		Calclator calclatorSub = new SubCalc();
		// メソッドを実行
		Integer resultSub = calclatorSub.calc(x, y);
		// 結果を表示
		System.out.println("計算結果(減算)は「" + resultSub + "」です。");
		
	}

}
