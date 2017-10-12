package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import metier.Client;

public class Session{

	List<Client> clients = new ArrayList<Client>();
	public Client clientCourrant;
	String demande=" ";
	EnumTypeEcran typeEcran;
	public Session() {
		Client unClient=new Client("dupontmari","000");
		unClient.setPrenom("Marie");
		unClient.setNom("Dupond");
		clients.add(unClient);
		
	}


	
	public EnumTypeEcran traitementConnexion() {
		
		return EnumTypeEcran.ECRAN_ACCUEIL;
	}

	public EnumTypeEcran  traiterIdentification(String pseudo, String mdp) {
		clientCourrant= new Client(pseudo,mdp);
		if(!this.clients.isEmpty()&& this.clients.contains(clientCourrant)) {
			return EnumTypeEcran.ECRAN_PERSO;
			
		}
		else
			return null;
		
	}

}