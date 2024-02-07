import Perusahaan.Pegawai;
public class Hrd extends Pegawai{
    Hrd(boolean sudahNikah, int jumlahAnak){
        super(5000000, 750000, 0, sudahNikah ? 250000 : 0, jumlahAnak > 1 ? 190000 : 90000);
    }

    public static void main(String[] args) {
        Hrd bayu = new Hrd(false, 2);
        bayu.clockIn(8);
        bayu.getGaji();
    }
}
