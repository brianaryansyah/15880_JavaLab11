package abstrak;

public class SepedaMain {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("         PROGRAM SEPEDA");
        System.out.println("====================================");

        // Membuat objek sepeda 
        Sepeda sepedaListrik = new Sepeda("Sepeda Listrik", "i-Volt", true);
        Sepeda sepedaManual = new Sepeda("Sepeda Manual", "Monanza", false);

        // Menampilkan informasi sepeda listrik
        System.out.println("\n--- SEPEDA LISTRIK ---");
        System.out.println("Merk        : " + sepedaListrik.getMerk());
        System.out.println("Model       : " + sepedaListrik.getModel());
        System.out.println("Jumlah Roda : " + sepedaListrik.getJumlahRoda());
        System.out.print("Jenis       : ");
        sepedaListrik.jenis();
        System.out.print("Nyalakan    : ");
        sepedaListrik.nyalakan();

        // Menampilkan informasi sepeda manual
        System.out.println("\n--- SEPEDA MANUAL ---");
        System.out.println("Merk        : " + sepedaManual.getMerk());
        System.out.println("Model       : " + sepedaManual.getModel());
        System.out.println("Jumlah Roda : " + sepedaManual.getJumlahRoda());
        System.out.print("Jenis       : ");
        sepedaManual.jenis();
        System.out.print("Nyalakan    : ");
        sepedaManual.nyalakan();

        System.out.println("\n====================================");
    }
}