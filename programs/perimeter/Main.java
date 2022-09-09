import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Distance distance = new Distance();
        int value = 0;
        int resultX = 0;
        int resultY = 0;
        int resultZ = 0;
        int N = scanner.nextInt();
        int coordinates[][] = new int[N][2];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < 2; ++j) {
                coordinates[i][j] = scanner.nextInt();
            }
        }
        for (int s = 0; s < N; ++s) {
            for (int d = s + 1; d < N; ++d) {
                for (int k = d + 1; k < N; ++k) {
                    int sum = distance.calculating(coordinates, s, d, k);

                    if (value < sum) {
                        value = sum;
                        resultX = s;
                        resultY = d;
                        resultZ = k;
                    }
                }
            }
        }
        System.out.println(coordinates[resultX][Consts.FIRST_COLUMN] + " " + coordinates[resultX][Consts.SECOND_COLUMN]);
        System.out.println(coordinates[resultY][Consts.FIRST_COLUMN] + " " + coordinates[resultY][Consts.SECOND_COLUMN]);
        System.out.println(coordinates[resultZ][Consts.FIRST_COLUMN] + " " + coordinates[resultZ][Consts.SECOND_COLUMN]);
    }
}
