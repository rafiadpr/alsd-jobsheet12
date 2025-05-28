
public class SLLMain23 {

    public static void main(String[] args) {
        SingleLinkedList23 list = new SingleLinkedList23();

        Mahasiswa23 mhs1 = new Mahasiswa23("101", "Andre", "TI-A", 3.5);
        Mahasiswa23 mhs2 = new Mahasiswa23("102", "Adi", "TI-B", 3.7);
        Mahasiswa23 mhs3 = new Mahasiswa23("103", "Evan", "TI-C", 3.9);
        Mahasiswa23 mhs4 = new Mahasiswa23("104", "Icun", "TI-D", 3.2);

        list.print();
        list.addFirst(mhs4);
        list.print();
        list.addLast(mhs1);
        list.print();
        list.insertAfter("Icun", mhs3);
        list.InsertAt(2, mhs2);
        list.print();
    }
}
