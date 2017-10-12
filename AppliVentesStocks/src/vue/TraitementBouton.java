package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.EnumTypeEcran;
import controleur.Session;

public class TraitementBouton  implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Session controleur = new Session();
		VueJetable vue = new VueJetable();
		JPanel panelConnexion = new JPanel();
		String pseudoUser = vue.getTextField().getText();
		String password=vue.getPassWordField().getSelectedText();
		if(controleur.traiterIdentification(pseudoUser, password)== EnumTypeEcran.ECRAN_PERSO) {
			String nom = controleur.clientCourrant.getNom();
			String prenom = controleur.clientCourrant.getPrenom();
			JLabel label = new JLabel("", JLabel.BOTTOM);
			label.setText("Bienvenue sur notre site de  Ventes " + prenom +nom);
			vue.setContentPane(panelConnexion);
			vue.setVisible(true);
		}
	}

}
