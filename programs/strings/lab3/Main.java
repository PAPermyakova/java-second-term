import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");

        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        input = input.replaceAll("[\\pP]", " ");
        input = input.replaceAll("([' ']{2,})", " ");

        String[] arrayOfWords = input.split(" ");
        Count.searching(arrayOfWords);
    }
}
