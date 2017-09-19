package controleur;

import java.awt.Color;
import java.awt.Font;
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String pseudoUser = fenetre.getTextField().getText();
		JFrame fenetreLogin = new JFrame("Application Ventes et Stocks");
		JLabel label = new JLabel("", JLabel.CENTER);
		Font font = new Font("Arial", Font.BOLD, 16);
		label.setFont(font);
		label.setForeground(Color.BLUE);
		
		label.setText("Bienvenue sur notre site de  Ventes " + pseudoUser);
		fenetreLogin.add(label);
		fenetreLogin.setLocationRelativeTo(null);
		fenetreLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetreLogin.setSize(500, 500);
		fenetreLogin.setVisible(true);
		
	
		
	}

}
