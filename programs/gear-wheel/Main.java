import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wheel = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arrWheel = new int[wheel];
        int[] arrWheelOne = new int[wheel];
        int[] arrSystem = new int[n];
        int[] arrSystemOne = new int[n];
        int value = 0;
        int k = 0;
        boolean check = false;
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
            }
            arrSystem[i] = a;
            arrSystemOne[i] = b;
            ++k;
            if (arrWheel[a - 1] == 0) {
                arrWheel[b - 1] = 1;
                arrWheelOne[b - 1] = 1;
            } else {
                arrWheel[b - 1] = 0;
                arrWheel[b - 1] = 0;
            }
            if (i == 0) {
                arrWheel[a - 1] = 0;
                arrWheel[b - 1] = 1;
            } else {
                for (int j = 0; j < k - 1; ++j) {
                    if (b == arrSystemOne[j]) {
                        if (arrWheel[a - 1] == 0) {
                            arrWheel[b - 1] = 1;
                        } else {
                            arrWheel[b - 1] = 0;
                        }
                        if (arrWheelOne[b - 1] == arrWheel[b - 1]) {
                            check = false;
                        } else {
                            check = true;
                        }
                    }
                }
            }
        }
        if (check) {
            System.out.println("block");
        } else {
            for (int i = 0; i < wheel; i++) {
                if (arrWheel[i] == 0) {
                    System.out.println("clockwise");
                } else {
                    System.out.println("counter-clockwise");
                }
            }
        }
    }
}
