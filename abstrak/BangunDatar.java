package abstrak;

public abstract class BangunDatar {
    protected int jumlahSisi;
    protected int x;
    protected int y;

    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
        this.x = 0;
        this.y = 0;
    }

    public void pindahkan(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Menggambar bangun datar di titik (" + x + "," + y + ")");
    }

    public void resize() {
        System.out.println("Merubah ukuran bangun datar");
    }

    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public abstract double getLuas();
    public abstract double getKeliling();
}
