
import java.util.Scanner;

public class SLLMain23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList23 list = new SingleLinkedList23();

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa23 mhs = new Mahasiswa23(nim, nama, kelas, ipk);
            list.addLast(mhs);
        }

        System.out.println("\nHasil Linked List:");
        list.print();

        System.out.println("Data index ke-1 : " );
        list.getData(1);
        
        System.out.println("Data mahasiswa A.N. Bimon berada pada index ke " + list.indexOf("Bimon"));
        System.out.println("");

        list.removeFirst();
        list.removeLast();
        list.print();
        list.removeAt(0);
        list.print();
    }
}
