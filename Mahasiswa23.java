
public class Mahasiswa23 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa23() {
    }

    Mahasiswa23(String nm, String name, String kls, double ip) {
        nim = nm;
        nama  = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
