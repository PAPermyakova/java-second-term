import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "Cp866");
		System.out.print("Enter the number of strings ");
		Check check = new Check();
		int n = check.checking();
		if (n < 0) {
			System.out.println("Invalid input");
		} else {
			float averageLen;
			Sum sum = new Sum();
			String[] arrayOfStr = new String[n];
			int[] arrayOfLen = new int[n];

			for (int i = 0; i < n; ++i) {
				arrayOfStr[i] = scanner.nextLine();
			}

			for (int j = 0; j < n; ++j) {
				arrayOfLen[j] = arrayOfStr[j].length();
			}

			averageLen = sum.calculating(arrayOfLen, n);

			for (int k = 0; k < n; ++k) {
				if (arrayOfLen[k] < averageLen) {
					System.out.println("string: " + arrayOfStr[k] + ", length: " + arrayOfLen[k]);
				}
			}
		}
	}
}
