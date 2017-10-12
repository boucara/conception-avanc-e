package vue;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.EnumTypeEcran;
import controleur.Session;

public class VueJetable extends JFrame{
	JTextField txtEmail;
	JPasswordField password ;
	Session controleur  = new Session();
	
	public VueJetable() {
		super("Application Ventes et Stoks");
		this.setVisible(false);
	}
	
	public void affichageEcranAccueil() {
		
		//Initialisation des objets utilis� pour la cr�ation de la page
		
		JPanel mainPanel;
		JLabel labelEmail ;
		
		JLabel labelMdp;
		JPanel p1;
		JPanel p2;
		JButton bouton;
		JFrame frameAcceuil;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(BorderFactory.createEmptyBorder(70, 100, 70, 100));

		JLabel headerLabel = new JLabel("French Chic", JLabel.CENTER);
		Font font = new Font("Arial", Font.PLAIN, 43);
		headerLabel.setFont(font);
		headerLabel.setForeground(new Color(206, 0, 206));
		headerLabel.setAlignmentX(this.CENTER_ALIGNMENT);

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
		password.setAlignmentX(this.LEFT_ALIGNMENT);
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
		bouton = new JButton("S'identifier");
		bouton.addActionListener(new TraitementBouton());
		p2.add(bouton);

		this.add(mainPanel);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void affichageEcranPanier() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		this.add(panel);
		
		JLabel headerLabel = new JLabel("Votre Panier", JLabel.LEFT);
		Font font = new Font("Arial", Font.PLAIN, 43);
		headerLabel.setFont(font);
		headerLabel.setForeground(new Color(206, 0, 206));
		headerLabel.setAlignmentX(this.LEFT_ALIGNMENT);
		
		panel.add(headerLabel);
		
		this.setVisible(true);
		
	}
	public JTextField getTextField(){
		 	return txtEmail;
		 	}
	public JTextField getPassWordField(){
	 	return password;
	 	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VueJetable vue=new VueJetable();
		//vue.affichageEcranPanier();
		if(vue.controleur.traitementConnexion()==EnumTypeEcran.ECRAN_ACCUEIL) {
			vue.affichageEcranAccueil();;
		}
		
		
	}

	

}
