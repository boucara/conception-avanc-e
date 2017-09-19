package metier;

public class Client {
	private String pseudo;
	private String motDePasse ;
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

}
