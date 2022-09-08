import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test test = new Test();
		int smallCount = 1;
		int result = 0;
		int n = 0;
		int N = scanner.nextInt();
		int[][] arrPrices = new int[N][N];
		for (int i = 0; i < N; ++i) {
		    for (int j = 0; j < (N - i); ++j) {
		        arrPrices[i][j + n] = scanner.nextInt();
		    }
		    ++n;
		}
		for (int bigCount = 1; bigCount < N; ++bigCount) {
			for (int k = 0; k < bigCount; ++k) {
				arrPrices[0][bigCount] = test.minNumber(arrPrices[0][bigCount - 1] + arrPrices[smallCount][bigCount], arrPrices[0][bigCount]);
				++smallCount;
			}
			smallCount = 1;
			result = arrPrices[0][bigCount];
		}
		System.out.println(result);
	}
}