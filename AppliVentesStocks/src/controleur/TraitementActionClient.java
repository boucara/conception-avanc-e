package controleur;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;

import vue.PageAcceuil;

public class TraitementActionClient extends AbstractAction  {
private PageAcceuil fenetre;
	
	public  TraitementActionClient(PageAcceuil fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String pseudoUser = fenetre.getTextField().getText();
		JFrame fenetreLogin = new JFrame("Application Ventes et Stocks");
		JLabel label = new JLabel("", JLabel.BOTTOM);
		
		label.setText("Bienvenue sur notre site de  Ventes " + pseudoUser);
		fenetreLogin.add(label);
		fenetreLogin.setLocationRelativeTo(null);
		fenetreLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetreLogin.setSize(500, 500);
		fenetreLogin.setVisible(true);
		
	
		
	}

}
