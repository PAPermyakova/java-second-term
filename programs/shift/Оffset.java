class Offset {
	
	public int getChanging(int size, int number) {
		Exponentation exponentation  = new Exponentation();
		int value = number;
		
		if (number % 2 == 0) { // значит на конце двоичного представления 0
			number >>= 1; // сдвиг вправо на 1 бит
		} else { // число нечётное - на конце 1
			value = number >> 1;
			number = value + exponentation.getRaising((size - 1), 2);
		  }
		return number;
	}
}