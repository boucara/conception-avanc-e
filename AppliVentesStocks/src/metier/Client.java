package metier;

public class Client {
	private String pseudo;
	private String motDePasse ;
	private String nom;
	private String prenom;
	public  Client(String pseudo , String motDePasse) {
		this.setPseudo(pseudo) ;
		this.setMotDePasse(motDePasse) ;
		
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
