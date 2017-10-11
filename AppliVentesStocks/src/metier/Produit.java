package metier;

public class Produit {

	private String label;
	private double prixHT;
	private int quantite;
	
	public Produit(String label, double prixHT) {
		this.label = label;
		this.prixHT = prixHT;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	
}
