import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        String consonants = "бвгджзйклмнпрстфхцчшщъьБВГДЖЗЙКЛМНПРСТФХЦЧШЩЪЬ";
        String input = scanner.nextLine();
        input = input.replaceAll("(['.']{2,})", ".");
        input = input.replaceAll("[!?;]", ".");

        Count.counting (input, vowels, consonants);
    }
}
