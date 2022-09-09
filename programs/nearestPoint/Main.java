import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Distance distance = new Distance();
        int N = scanner.nextInt();
        float coordinates[][] = new float[N][2];
        float summ[] = new float[N];
        int result = 0;
        float max = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < 2; ++j) {
                coordinates[i][j] = scanner.nextFloat();
            }
        }
        int value = 0;
        for (int k = 0; k < N; ++k) {
            summ[k] = distance.calculating(coordinates, value, N);
            ++value;
        }
        max = summ[0];
        for (int k = 1; k < N; ++k) {
            if (summ[k] > max) {
                max = summ[k];
                result = k;
            }
        }
        System.out.println((int)coordinates[result][Consts.FIRST_COLUMN] + " " + (int)coordinates[result][Consts.SECOND_COLUMN]);
    }
}
