import Perusahaan.Pegawai;
public class Teknisi extends Pegawai{
    Teknisi(boolean sudahNikah, int jumlahAnak){
        super(3000000, 500000, 0, sudahNikah ? 200000 : 0, jumlahAnak > 1 ? 75000 : 150000);
    }

    public static void main(String[] args) {
        Teknisi bayu = new Teknisi(true, 2);
        bayu.clockIn(8);
        bayu.clockOut(15);
        bayu.getGaji();
    }
}
