import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Offset offset = new Offset();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set a number");
		int size = scanner.nextInt();
		int number = scanner.nextInt();
		int result = 0;
		int max = 0;

		for (int i = 0; i < size; ++i) {
			result = offset.getChanging(size, number);
			number = result;
			if (result > max) {
				max = result;
			}
		}
		System.out.println (max);
	}
}