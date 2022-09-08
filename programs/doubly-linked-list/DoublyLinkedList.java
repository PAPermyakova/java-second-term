import java.util.Objects;

public class DoublyLinkedList implements List {

    private int size;

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(int o) {
        Node current = head;
        do {
            if (current.element == o) {
                return true;
            }
            current = current.next;
        } while (current != null);
        return false;
    }

    @Override
    public int[] toArray() {
        Node current = head;
        int[] mass = new int[size];
        for (int i = 0; i < size; ++i) {
            mass[i] = current.element;
            current = current.next;
        }
        return mass;
    }

    @Override
    public void add(int e) {
        Node temp = new Node(e);
        if (isEmpty()) {
            head = temp;
            temp.next = null;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
        ++size;
    }

    @Override
    public void add(int index, int element) {
        rengeCheckForAdd(index);
        Node temp = new Node(element);
        if (index == 0) {
            temp.next = head;
            head.prev = temp;
            head = temp;
            head.prev = null;
        } else if (index == size) {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            tail.next = null;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; ++i) {
                current = current.next;
            }
            temp.next = current.next;
            temp.prev = current;
            current.next = temp;
            temp.next.prev = temp;
        }
        ++size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        List list = (List) o;
        if (list.size() != this.size) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (list.get(i) != get(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        Node current = head;
        String help = "";
        str.append("[");
        do {
            if (current == null) {
                return "";
            } else {
                str.append(current.element);
                if(current != tail) {
                    str.append(",");
                }
            }
            current = current.next;
        } while (current != null);
        str.append("]");
        return str.toString();
    }

    @Override
    public int get(int index) {
        rengeCheckForGet(index);
        Node current = head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }
        return current.element;
    }

        @Override
    public int remove(int index) {
        int help = 0;
        Objects.checkIndex(index, size);
        Node current;
        if (index == 0) {
            current = head;
            head = head.next;
        } else if (index == size - 1) {
            current = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; ++i) {
                temp = temp.next;
            }
            current = temp.next;
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
        help = current.element;
        current = null;
        --size;
        return help;
    }

    @Override
    public int indexOf(int o) {
        Node current = head;
        int count = 0;
        do {
            if (current.element == o) {
                return count;
            }
            current = current.next;
            ++count;
        } while (current != null);
        return -1;
    }

    private void rengeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            String massage = String.format("Index: %d, Size: %d", index, size);
            throw new IndexOutOfBoundsException(massage);
        }
    }
        private void rengeCheckForGet(int index) {
            if (index < 0 || index >= size) {
                String massage = String.format("Index: %d, Size: %d", index, size);
                throw new IndexOutOfBoundsException(massage);
        }
    }
}
