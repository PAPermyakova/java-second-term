public class Count {

    public static void counting (String input, String vowels, String consonants) {
        String answer = "";
        char endOfSentence = '.';
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        int numberOfSentences = 0;
        boolean isEllipsis;

        for (int i = 0; i < input.length(); ++i) {
            for (int j = 0; j < vowels.length(); ++j) {
                if (input.charAt(i) == vowels.charAt(j)) {
                    ++numberOfVowels;
                }
            }
            for (int k = 0; k < consonants.length(); ++k) {
                if (input.charAt(i) == consonants.charAt(k)) {
                    ++numberOfConsonants;
                }
            }
            if (input.charAt(i) == endOfSentence) {
                answer = Compare.comparing(numberOfVowels, numberOfConsonants, answer);
                ++ numberOfSentences;
                if (answer == "ошибка") {
                    System.out.println("Пользователь не ввёл предложение номер " + numberOfSentences);
                } else if (answer == "одинаково") {
                    System.out.println("В " + numberOfSentences + " предложении число гласных и согласных " + answer);
                } else {
                    System.out.println("В " + numberOfSentences + " предложении больше " + answer);
                }
                numberOfVowels = 0;
                numberOfConsonants = 0;
            }
        }
    }
}
