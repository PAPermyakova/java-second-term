import java.util.Scanner;

public class Check {

    public static int checking () {
        Scanner scanner = new Scanner(System.in, "Cp866");
		if(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            return n;
		}
		return -1;
	}
}
