import java.util.Scanner;

public class UTS_1 {

    private int jam = 0;
    private int menit = 0;
    private int detik = 0;

    public UTS_1 durasi(UTS_1 masaDepan) {
        UTS_1 lama = new UTS_1();
        int lamaDetik = (masaDepan.jam - this.jam) * 3600 +
                (masaDepan.menit - this.menit) * 60 +
                (masaDepan.detik - this.detik);
        lama.jam = lamaDetik / 3600;
        lamaDetik = lamaDetik % 3600;
        lama.menit = lamaDetik / 60;
        lamaDetik = lamaDetik % 60;
        lama.detik = lamaDetik;
        return lama;
    }

    public static void main(String[] args) {
        System.out.println("Biaya tagihan anda2");
        Scanner input = new Scanner(System.in);

        UTS_1 mulai = new UTS_1();
        System.out.print("START ->   jam: ");
        mulai.jam = input.nextInt();
        System.out.print("               menit: ");
        mulai.menit = input.nextInt();
        System.out.print("               detik: ");
        mulai.detik = input.nextInt();

        UTS_1 selesai = new UTS_1();
        System.out.print("FINISH ->   jam: ");
        selesai.jam = input.nextInt();
        System.out.print("                 menit: ");
        selesai.menit = input.nextInt();
        System.out.print("                 detik: ");
        selesai.detik = input.nextInt();

        if (selesai.jam < mulai.jam) {
            System.out.println("Masukkan kembali waktu anda dengsn benar");
        } else {
            UTS_1 lama = mulai.durasi(selesai);
            System.out.println("Lama waktu/durasi: " +
                    lama.jam + " jam " +
                    lama.menit + " menit " +
                    lama.detik + " detik");
            int lamaDurasi = (lama.jam * 3600) + (lama.menit * 60) + lama.detik;
            System.out.println("Biaya : Rp" + lamaDurasi*30);
        }
    }
}
