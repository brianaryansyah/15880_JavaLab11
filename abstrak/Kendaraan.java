package abstrak;

public abstract class Kendaraan {
	private String merk;
	private String model;
	private int jumlahRoda;
	
	//Getter dan Setter merk
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}

	//Getter dan Setter model -> eror kalo hilang
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	//Getter dan Setter jumlah roda
	public int getJumlahRoda() {
		return jumlahRoda;
	}
	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}

	// Method abstrak menyalakan kendaraan
	public abstract void nyalakan();
}