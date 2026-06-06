package abstrak;

public class MainBangunDatar {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("       PROGRAM BANGUN DATAR");
        System.out.println("====================================");

        Kotak kotak = new Kotak(10, 5);
        kotak.pindahkan(3, 7);
        System.out.println("\n--- KOTAK ---");
        System.out.println("Jumlah Sisi : " + kotak.getJumlahSisi());
        System.out.println("Panjang     : " + kotak.getPanjang());
        System.out.println("Lebar       : " + kotak.getLebar());
        System.out.println("Luas        : " + kotak.getLuas());
        System.out.println("Keliling    : " + kotak.getKeliling());
        kotak.draw();

        Segitiga segitiga = new Segitiga(6, 8);
        segitiga.pindahkan(1, 2);
        System.out.println("\n--- SEGITIGA ---");
        System.out.println("Jumlah Sisi : " + segitiga.getJumlahSisi());
        System.out.println("Alas        : " + segitiga.getAlas());
        System.out.println("Tinggi      : " + segitiga.getTinggi());
        System.out.println("Luas        : " + segitiga.getLuas());
        System.out.println("Keliling    : " + segitiga.getKeliling());
        segitiga.draw();

        System.out.println("\n====================================");
    }
}
