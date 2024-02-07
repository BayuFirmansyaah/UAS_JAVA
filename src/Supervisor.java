import Perusahaan.Pegawai;
public class Supervisor extends Pegawai{
    Supervisor(boolean sudahNikah, int jumlahAnak){
        super(10000000, 1000000, 0, sudahNikah ? 300000 : 0, jumlahAnak > 1 ? 200000 : 100000);
    }

    public static void main(String[] args) {
        Supervisor bayu = new Supervisor(false, 2);
        bayu.clockIn(8);
        bayu.getGaji();
    }
}
