public class Sum {

	private float sum = 0;

	public float calculating (int[] arrayOfLen, int n) {
		for (int k = 0; k < n; ++k) {
			sum += arrayOfLen[k];
		}
		return sum/n;
	}
}
