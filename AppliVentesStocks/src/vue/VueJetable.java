package vue;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.EnumTypeEcran;
import controleur.Session;

public class VueJetable{
	JLabel headerLabel;

	JTextField txtEmail;

	JPanel mainPanel;
	JLabel labelEmail ;
	JPasswordField password ;
	JLabel labelMdp;
	JPanel p1;
	JPanel p2;
	public void affichageEcranAcceuil() {
		JFrame frameAcceuil=new JFrame("Application Ventes et Stoks");
		

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(BorderFactory.createEmptyBorder(70, 100, 70, 100));

		JLabel headerLabel = new JLabel("French Chic", JLabel.CENTER);
		Font font = new Font("Arial", Font.PLAIN, 43);
		headerLabel.setFont(font);
		headerLabel.setForeground(new Color(206, 0, 206));
		headerLabel.setAlignmentX(frameAcceuil.CENTER_ALIGNMENT);

		password = new JPasswordField();
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		txtEmail.setBorder(BorderFactory.createLineBorder(new Color(165, 189, 206)));
		password.setBorder(BorderFactory.createLineBorder(new Color(165, 189, 206)));
		password.setFont(new Font("Arial", Font.PLAIN, 20));
		txtEmail.setSize(100, 50);
		txtEmail.setColumns(10);
		password.setColumns(10);

		Box box = Box.createVerticalBox();
		box.add(Box.createVerticalStrut(60));
		box.add(headerLabel);
		box.add(Box.createVerticalStrut(80));

		labelEmail = new JLabel("Pseudo");
		labelMdp = new JLabel("Mot de passe");
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEADING, 66, 0));
		p1.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));
		p1.add(labelEmail);
		p1.add(txtEmail);
		p1.setBackground(Color.WHITE);
		box.add(p1);

		box.add(Box.createVerticalStrut(10));
		password.setAlignmentX(frameAcceuil.LEFT_ALIGNMENT);
		p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 0));
		p2.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));
		p2.add(labelMdp);
		p2.add(password);
		p2.setSize(150, 30);
		p2.setBackground(Color.WHITE);
		box.add(p2);

		box.add(Box.createVerticalStrut(50));
		box.setBackground(Color.white);
		box.setBorder(BorderFactory.createLineBorder(new Color(165, 189, 206)));

		mainPanel.add(box, BorderLayout.CENTER);

		frameAcceuil.add(mainPanel);
		frameAcceuil.setSize(800, 600);
		frameAcceuil.setLocationRelativeTo(null);
		frameAcceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAcceuil.setVisible(true);
	}
	
	public void affichageEcranPerso(String nom , String prenom) {
		
		 	JFrame fenetreLogin = new JFrame("Application Ventes et Stocks");
		 	JLabel label = new JLabel("", JLabel.BOTTOM);
		 	
		 	label.setText("Bienvenue sur notre site de  Ventes " + prenom +nom);
			fenetreLogin.add(label);
		 	fenetreLogin.setLocationRelativeTo(null);
		 	fenetreLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	fenetreLogin.setSize(500, 500);
		 	fenetreLogin.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session controleur  = new Session();
		VueJetable vue=new VueJetable();
		if(controleur.traitementConnexion()==EnumTypeEcran.ECRAN_ACCUEIL) {
			vue.affichageEcranAcceuil();
		}
		if(controleur.traitementConnexion()==EnumTypeEcran.ECRAN_PERSO) {
			
			vue.affichageEcranPerso(controleur.clientCourrant.getNom(), controleur.clientCourrant.getPrenom());
		}
		
	}

}
