
public class SingleLinkedList23 {

    Node23 head;
    Node23 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node23 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa23 input) {
        Node23 newNode = new Node23(input, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa23 input) {
        Node23 newNode = new Node23(input, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Mahasiswa23 input) {
        Node23 newNode = new Node23(input, null);
        Node23 tmp = head;

        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                newNode.next = tmp.next;
                tmp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void InsertAt(int index, Mahasiswa23 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node23 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node23(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }

    public void getData(int index) {
        Node23 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node23 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node23 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak bisa dihapus");
        } else {
            Node23 tmp = head;
            while (tmp != null) {
                if ((tmp.data.nama.equalsIgnoreCase(key)) && (tmp == head)) {
                    this.removeFirst();
                    break;
                } else if (tmp.data.nama.equalsIgnoreCase(key)) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node23 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}
