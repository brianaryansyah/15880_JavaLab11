package implementasi;

public class InterfaceMain {

    static class Kotak implements Resizeable {
        private double panjang;
        private double lebar;

        public Kotak(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public double getLuas() {
            return panjang * lebar;
        }

        public double getKeliling() {
            return 2 * (panjang + lebar);
        }

        public double getPanjang() {
            return panjang;
        }

        public double getLebar() {
            return lebar;
        }

        @Override
        public void resize(double x) {
            this.panjang = this.panjang * x;
            this.lebar = this.lebar * x;
        }
    }

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("       PROGRAM RESIZE KOTAK");
        System.out.println("====================================");

        Kotak kotak = new Kotak(4, 5);

        System.out.println("\n--- SEBELUM RESIZE ---");
        System.out.println("Panjang  : " + kotak.getPanjang());
        System.out.println("Lebar    : " + kotak.getLebar());
        System.out.println("Luas     : " + kotak.getLuas());
        System.out.println("Keliling : " + kotak.getKeliling());

        kotak.resize(2);

        System.out.println("\n--- SETELAH RESIZE (2x) ---");
        System.out.println("Panjang  : " + kotak.getPanjang());
        System.out.println("Lebar    : " + kotak.getLebar());
        System.out.println("Luas     : " + kotak.getLuas());
        System.out.println("Keliling : " + kotak.getKeliling());

        System.out.println("\n====================================");
    }
}
