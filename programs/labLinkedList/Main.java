import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transformation transf = new Transformation();
        String inputStr;
        int N;
        do {
            System.out.print("Enter the line: ");
            inputStr = scanner.nextLine();
            if (inputStr.length() == 0) {
                break;
            }
            System.out.print("Enter the number of shifts: ");
            N = scanner.nextInt();
            String help = scanner.nextLine();
            transf.transformate(inputStr, N);
        } while (true);
    }
}
