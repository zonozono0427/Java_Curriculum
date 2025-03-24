package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	/**
	 * 文字列と整数を出力するメソッド
	 * @param str 文字列
	 * @param num 整数
	 */
	public static void printMessage(String str, int num) {
		System.out.println("Hello " + str + " " + num);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	
	public static void multiplyNum(int num2, int num3) {

		System.out.println(num2 * num3);

	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }

	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiplyNum(double num2, double num3) {
		double c = num2 + num3;
		System.out.println(c);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randomNumbers(int count) {
		
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();
		
		//配列型に入れる
		int[] nums4 = new int[count];
		
		// 引数の回数分処理する
		for (int i = 0; i < count; i++) {
			
			//ランダムの数を生成
			nums4[i] = rand.nextInt(100);
		
			System.out.println(nums4[i]);
	
		}
		return nums4;
		
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	public static double rando(int[] nums4) {
        
        int sum = 0;
        for (int i : nums4) sum += i;
        
        double average = sum / nums4.length;
        
        System.out.println(average);
        
        return average;
    

	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		
		public static void printIfAbove50(int[] arr) {
	        for (int num : arr) {
	            if (num >= 50) {
	                System.out.println(true);
	            } else {
	                System.out.println(false);
	            }
	        }
	    
		
	
	
	}

	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//Q1
		printMessage("Java", 11);

		//Q2
		multiplyNum(2, 5);

		//Q3
		int[] array = {1, 2, 3, 4, 5};
        printArray(array);

       
		//Q4
		multiplyNum(2.5, 5.5);
		
		//Q5
		int[] arr2 = randomNumbers(3);
		
		//Q6
		rando(arr2);
		
		//Q7
		printIfAbove50(arr2);
	    
		
		}
	}
		
		
	

