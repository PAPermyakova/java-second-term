public class Distance {

    private float a = 0;
    private float b = 0;
    private float val = 0;
    private float sum = 0;
    private float help = 0;

    public float calculating (float[][] coordinates, int value, int N) {
        for (int i = 0; i < N; ++i) {
            a = (float) Math.pow((coordinates[i][Consts.FIRST_COLUMN] - coordinates[value][Consts.FIRST_COLUMN]), Consts.SQUARE);
            b = (float) Math.pow((coordinates[i][Consts.SECOND_COLUMN] - coordinates[value][Consts.SECOND_COLUMN]), Consts.SQUARE);
            val = a + b;
            sum += (float) Math.pow(val, Consts.SQUARE_ROOT);
        }
        help = sum;
        sum = 0;
        return help;
    }
}
