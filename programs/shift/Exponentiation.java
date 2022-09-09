class Exponentation {
	
	public int getRaising(int size, int number) {
		int temporary = number;
		for (int i = 0; i < size - 1; ++i)
			number *= temporary;
		return number;
    }
}