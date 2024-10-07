// Membuat class sebagai template

class Mahasiswa{
    // Ciri-ciri atau atribut object
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) {
        
        // instansiasi object
        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.nama = "Udin";
        mhs_1.NIM = "11333355";
        mhs_1.jurusan = "PTI";
        mhs_1.IPK = 3.22;
        mhs_1.umur = 25;

        Mahasiswa mhs_2 = new Mahasiswa();
        mhs_2.nama = "jojo";
        mhs_2.NIM = "23232323";
        mhs_2.jurusan = "Kimia";
        mhs_2.IPK = 2.90;
        mhs_2.umur = 23;

        Mahasiswa mhs_3 = new Mahasiswa();
        mhs_3.nama = "nuri";
        mhs_3.NIM = "0897654";
        mhs_3.jurusan = "Arsitek";
        mhs_3.IPK = 2.91;
        mhs_3.umur = 26;

        // Cetak object
        System.out.println("Nama Mahasiswa : " + mhs_1.nama);
        System.out.println("NIM : " + mhs_1.NIM);
        System.out.println("Jurusan : " + mhs_1.jurusan);
        System.out.println("IPK : " + mhs_1.IPK);
        System.out.println("Umur : " + mhs_1.umur);
        System.out.println();
        System.out.println("Nama Mahasiswa : " + mhs_2.nama);
        System.out.println("NIM : " + mhs_2.NIM);
        System.out.println("Jurusan : " + mhs_2.jurusan);
        System.out.println("IPK : " + mhs_2.IPK);
        System.out.println("Umur : " + mhs_2.umur);
    }
}




class Kalkulator{
    double Perkalian;
    double Penjumlahan;
    double Pengurangan;
    double Pembagian;

    Kalkulator (double Input1, double Input2, double Input3, double Input4){
        Perkalian = Input1 * Input2 * Input3 * Input4;
        Penjumlahan = Input1 + Input2 + Input3 + Input4;
        Pengurangan = Input1 - Input2 - Input3 - Input4;
        Pembagian = Input1 / Input2 / Input3 / Input4;

        System.out.println("Hasil Perkalian: " + Perkalian);
        System.out.println("Hasil Penjumlahan: " + Penjumlahan);
        System.out.println("Hasil Pengurangan: " + Pengurangan);
        System.out.println("Hasil Pembagian: " + Pembagian);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Kalkulator Kalkulator1 = new Kalkulator(5, 2, 4, 10);

        Kalkulator kalkulator2 = new Kalkulator(10, 5, 8, 4);
    }
}




// class tanpa constructor "class polos"
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    // atribut
    String nama;
    String NIM;
    String prodi;

    // constructor nama sama dengan nama class
    // constructor dipanggil saat object pertama kali dibuat
    // construkctor tidak mengembalikan nilai (tidak punya return)

    //constructor dengan parameter
    
    Mahasiswa (String InputNama, String InputNIM, String InputProdi){
        nama = InputNama;
        NIM = InputNIM;
        prodi = InputProdi;

        // cetak
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + prodi);
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        
        // //instansiasi object class polos
        // Polos objectPolos = new Polos();

        // // pengisian data
        // objectPolos.dataString = "Polos";
        // objectPolos.dataInteger = 10;

        // // cetak
        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

        // instansiasi object class Mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("ucup", 
        "23231010", "Arsitek");
        
        Mahasiswa mhs_2 = new Mahasiswa("Udin", 
        "11333355", "Kimia");
    }
}

