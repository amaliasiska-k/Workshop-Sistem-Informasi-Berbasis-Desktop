package amaliasiskakurniawati;
/**
 *
 * @author AMALIA SISKA KURNIAWATI | E41201005
 */
public class ManagingPeople {
    
    private String namaDepan, namaBelakang, idSiswa, statusSiswa;

    public ManagingPeople(String namaDepan, String namaBelakang, String idSiswa, String statusSiswa) {
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
        ManagingPeople getData1 = new ManagingPeople ("Amalia Siska", "Kurniawati", "E41201452", "Active");
        ManagingPeople getData2 = new ManagingPeople ("Iqbal Ramadhan", "Kurniawan", "E41208764", "Active");
     
        // Mengambil Data Berdasarkan Variabel (ID Siswa)
        if (getData1.get_idSiswa() == getData2.get_idSiswa()) {
            System.out.println(getData1.get_namaDepan()+ " is the same status as " + getData2.get_namaDepan());
        }
        else {
            System.out.println(getData1.get_namaDepan()+ " is NOT the same status as " + getData2.get_namaDepan());
        }
        
        // Mengambil Data Berdasarkan Variabel (Status Siswa)
        if (getData1.get_statusSiswa() == getData2.get_statusSiswa()) {
            System.out.println(getData1.get_namaDepan()+ " is the same status as " + getData2.get_namaDepan());
        }
        else {
            System.out.println(getData1.get_namaDepan()+ " is NOT the same status as " + getData2.get_namaDepan());
        }
    }
}