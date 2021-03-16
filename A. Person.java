package amaliasiskakurniawati;
/**
 *
 * @author AMALIA SISKA KURNIAWATI | E41201005
 */
public class Person {
    
    private String namaDepan, namaBelakang, idSiswa, statusSiswa;

    public Person(String namaDepan, String namaBelakang, String idSiswa, String statusSiswa) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.idSiswa = idSiswa;
        this.statusSiswa = statusSiswa;
    }

    public String get_namaDepan() {
        return namaDepan;
    }

    public String get_namaBelakang() {
        return namaBelakang;
    }

    public String get_idSiswa() {
        return idSiswa;
    }

    public String get_statusSiswa() {
        return statusSiswa;
    }
    
    public static void main(String[] args) {
        Person getData = new Person ("Amalia Siska", "Kurniawati", "E41201005", "Active");
        
        System.out.println();
        System.out.println("Nama Siswa    : " + getData.get_namaDepan() + " " + getData.get_namaBelakang());
        System.out.println("ID Siswa      : " + getData.get_idSiswa());
        System.out.println("Status Siswa  : " + getData.get_statusSiswa());
        System.out.println();
    }
    
}