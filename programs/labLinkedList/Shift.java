public class Shift {

    public void shifting(Node head, int N) {

        Node current = head;
        Node headWord = null;
        Node tailWord = null;

        while (current != null) {
            if (current.value != ' ') {
                headWord = current;
                while (current.next != null) {
                    if (current.next.value == ' ') {
                        tailWord = current;
                        break;
                    }
                    current = current.next;
                }
                tailWord = current;

                Node pass;
                char help;
                char word;
                for (int i = 0; i < N; ++i) {
                    pass = headWord;
                    word = pass.value;
                    while (pass != tailWord) {
                        help = pass.next.value; // запоминаем следующую букву
                        pass.next.value = word; // заменяем следующую букву
                        word = help; // перезаписываем word
                        pass = pass.next; // двигаемся
                    }
                    headWord.value = word;
                }
                current = current.next;
            }
            if (current != null) { // вот это если current.value == ' '
                current = current.next;
            }
        }
        current = head;
        System.out.println();
        while (current != null) {
            System.out.print(current.value);
            current = current.next;
        }
        System.out.println();
    }
}
