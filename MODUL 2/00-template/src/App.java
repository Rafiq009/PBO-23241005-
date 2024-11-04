class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;
    

    public MOTOR(String merk, int tahun, String noPolisi, String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;

    }

    void showinfoMotor(){
        System.out.println("Merk : "+ this.merk);
        System.out.println("Tahun : "+ this.tahun);
        System.out.println("NO Polisi : "+ this.noPolisi);
        System.out.println("Warna : "+ this.warna);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MOTOR mtrl = new MOTOR("Honda GL Pro",1997,"g 5879","hitam");
        mtrl.showinfoMotor();
    }
}
 

