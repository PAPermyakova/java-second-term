public class Count {

    public static void searching(String[] arrayOfWords) {
        int count = 1;
        for (int i = 0; i < arrayOfWords.length; ++i) {
            if (arrayOfWords[i] != null) {
                for (int j = i + 1; j < arrayOfWords.length; ++j) {
                    if (arrayOfWords[i].equals(arrayOfWords[j])) {
                        ++count;
                        arrayOfWords[j] = null;
                    }
                }
                    System.out.println("количество слов " + arrayOfWords[i] + " - " + count);
            }
            count = 1;
        }
    }
}
