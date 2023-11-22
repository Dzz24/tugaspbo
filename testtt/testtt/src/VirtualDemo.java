public class VirtualDemo{
    public static void main(String[] args) {
        Pegawai karyawan = new Pegawai("Dzikri", "Bukittinggi", 1);
        Pegawai karyawanPay = new Gaji("Dzikri", "Bukittinggi", 1, 120000);
        karyawan.mailCheck();
        karyawanPay.mailCheck();

        Pegawai karyawan2 = new Pegawai("Anton", "Padang", 2);
        Pegawai karyawanPay2 = new Gaji("Anton", "Padang", 2, 20);
        karyawan2.mailCheck();
        karyawanPay2.mailCheck();

        Pegawai karyawan3 = new Pegawai("Tono", "Batusangkar", 3);
        Pegawai karyawanPay3 = new Gaji("Tono", "Batusangkar", 3, 500000);
        karyawan3.mailCheck();
        karyawanPay3.mailCheck();
         
        double bayar1 = ((Gaji) karyawanPay).computePay();
        double bayar2 = ((Gaji) karyawanPay2).computePay();
        double bayar3 = ((Gaji) karyawanPay3).computePay();
        
        System.out.println("Pembayaran bulanan untuk " + karyawanPay.getName() + ": " + bayar1);
        System.out.println("Pembayaran bulanan untuk " + karyawanPay2.getName() + ": " +bayar2);
        System.out.println("Pembayaran bulanan untuk " + karyawanPay2.getName() + ": " +bayar3);
    }
}