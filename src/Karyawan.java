import Perusahaan.Pegawai;
public class Karyawan extends Pegawai{
    Karyawan(boolean sudahNikah, int jumlahAnak){
        super(1500000, 250000, 0, sudahNikah ? 200000 : 0, jumlahAnak > 1 ? 60000 : 130000);
    }

    public static void main(String[] args) {
        Karyawan bayu = new Karyawan(true, 2);
        bayu.clockIn(8);
        bayu.clockOut(15);
        bayu.getGaji();
    }
}
