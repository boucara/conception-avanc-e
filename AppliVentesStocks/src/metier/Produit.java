package metier;

public class Produit {

	private String label;
	private double prixHT;
	private int quantite;
	
	public Produit(String label, double prixHT, int quantite) {
		this.label = label;
		this.prixHT = prixHT;
		this.quantite = quantite;
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

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
