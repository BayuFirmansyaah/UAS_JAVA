package Perusahaan;

public interface Employee {
    public int gajiPokok = 0;
    public int transport = 0;
    public int lembur = 0;
    public int tunjanganIsti = 0;
    public int tunjanganAnak = 0;

    void clockIn(int jamMasuk);
    void clockOut(int jamKeluar);
}
