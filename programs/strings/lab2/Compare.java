public class Compare {

    public static String comparing (int numberOfVowels, int numberOfConsonants, String answer) {
        if (numberOfVowels == 0 && numberOfConsonants == 0) {
            answer = "ошибка";
            return answer;
        } else if (numberOfVowels == numberOfConsonants) {
            answer = "одинаково";
            return answer;
        } else if (numberOfVowels > numberOfConsonants) {
            answer = "гласных";
            return answer;
        }
        answer = "согласных";
        return answer;
    }
}
