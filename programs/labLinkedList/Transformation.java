public class Transformation {

    private Node head = new Node();
    Shift shift = new Shift();

    public void transformate(String inputStr, int N) {
        head.value = inputStr.charAt(0);
        Node current = head;
        for (int i = 1; i < inputStr.length(); ++i) {
            current.next = new Node(); // выделяю новые узлы под буквы
            current.next.value = inputStr.charAt(i);
            current = current.next;
        }
        current.next = null;
        shift.shifting(head, N);
    }
}
