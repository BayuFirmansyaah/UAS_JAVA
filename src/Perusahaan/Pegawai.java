package Perusahaan;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai implements Employee {
    public int gajiPokok = 0;
    public int transport = 0;
    public int lembur = 0;
    public int tunjanganIsti = 0;
    public int tunjanganAnak = 0;
    public int denda = 100000;
    public int potongan = 0;

    public Pegawai(int gajiPokok, int transport, int lembur, int tunjanganIstri, int tunjanganAnak) {
        this.gajiPokok = gajiPokok;
        this.transport = transport;
        this.lembur = lembur;
        this.tunjanganIsti = tunjanganIstri;
        this.tunjanganAnak = tunjanganAnak;
    }

    @Override
    public void clockIn(int jamMasuk) {
        if(jamMasuk > 7){
            this.potongan += (jamMasuk - 7) * this.denda;
        }
    }

    @Override
    public void clockOut(int jamKeluar) {
        if(jamKeluar < 16){
            this.potongan += (16 - jamKeluar) * this.denda;
        }
    }

    public void getGaji(){
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat indonesiaFormat = NumberFormat.getCurrencyInstance(indonesiaLocale);

        int totalGaji = (this.gajiPokok + this.transport + this.lembur + this.tunjanganAnak + this.tunjanganIsti) - this.potongan;

        System.out.println("Gaji Pokok      : " + indonesiaFormat.format(this.gajiPokok));
        System.out.println("Transport       : " + indonesiaFormat.format(this.transport));
        System.out.println("Lembur          : " + indonesiaFormat.format(this.lembur));
        System.out.println("Tunjangan Istri : " + indonesiaFormat.format(this.tunjanganIsti));
        System.out.println("Tunjangan Anak  : " + indonesiaFormat.format(this.tunjanganAnak));
        System.out.println("Potongan Denda  : " + indonesiaFormat.format(this.potongan));
        System.out.println("Total gaji      : " + indonesiaFormat.format(totalGaji));
    }
}
