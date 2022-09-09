public class Distance {

  public int calculating (int[][] coordinates, int x, int y, int z) {
    int a = 0;
    int b = 0;
    int sum = 0;
    int val = 0;
    a = (int) Math.pow((coordinates[x][Consts.FIRST_COLUMN] - coordinates[y][Consts.FIRST_COLUMN]), Consts.SQUARE);
    b = (int) Math.pow((coordinates[x][Consts.SECOND_COLUMN] - coordinates[y][Consts.SECOND_COLUMN]), Consts.SQUARE);
    val = a + b;
    sum += (int) Math.pow(val, Consts.SQUARE_ROOT);

    a = (int) Math.pow((coordinates[x][Consts.FIRST_COLUMN] - coordinates[z][Consts.FIRST_COLUMN]), Consts.SQUARE);
    b = (int) Math.pow((coordinates[x][Consts.SECOND_COLUMN] - coordinates[z][Consts.SECOND_COLUMN]), Consts.SQUARE);
    val = a + b;
    sum += (int) Math.pow(val, Consts.SQUARE_ROOT);

    a = (int) Math.pow((coordinates[y][Consts.FIRST_COLUMN] - coordinates[z][Consts.FIRST_COLUMN]), Consts.SQUARE);
    b = (int) Math.pow((coordinates[y][Consts.SECOND_COLUMN] - coordinates[z][Consts.SECOND_COLUMN]), Consts.SQUARE);
    val = a + b;
    sum += (int) Math.pow(val, Consts.SQUARE_ROOT);

    return sum;
  }
}
