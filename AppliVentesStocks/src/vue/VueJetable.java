package vue;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controleur.EnumTypeEcran;
import controleur.Session;
import metier.Produit;

public class VueJetable extends JFrame {
	
	
	public VueJetable() {
		super("Application Ventes et Stoks");
		this.setVisible(false);
	}
	
	public void affichageEcranAccueil() {
		
		//Initialisation des objets utilisé pour la création de la page
		JTextField txtEmail;
		JPanel mainPanel;
		JLabel labelEmail ;
		JPasswordField password ;
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
		p2.add(bouton);

		this.add(mainPanel);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void affichageEcranPerso(String nom , String prenom) {

		JLabel label = new JLabel("", JLabel.BOTTOM);

		label.setText("Bienvenue sur notre site de  Ventes " + prenom +nom);
		this.add(label);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);

	}
	
	public void affichageEcranPanier(HashMap<Produit, Integer> panierClient) {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		this.add(panel);
		panel.setLayout(new BorderLayout());
		
		JLabel headerLabel = new JLabel("Votre Panier", JLabel.LEFT);
		Font font = new Font("Arial", Font.PLAIN, 43);
		headerLabel.setFont(font);
		headerLabel.setForeground(new Color(206, 0, 206));
		headerLabel.setAlignmentX(this.LEFT_ALIGNMENT);
		
		JPanel p1 = new JPanel();
		
		String[] nomCols = {"Libellé", "Prix HT", "Quantité", "Montant"};
		
		Object[][] datas = new Object[panierClient.size()][4];
		
		int i = 0;
		int j = 0;
		// Génération des données pour le tableau
		for(Entry<Produit, Integer> entry : panierClient.entrySet()) {
			
			Produit produitDuPanier = entry.getKey();
			Integer quantite = entry.getValue();
			
			datas[i][0] = produitDuPanier.getLabel();
			datas[i][1] = Double.toString(produitDuPanier.getPrixHT());
			datas[i][2] = quantite.toString();
			datas[i][3] = Double.toString(quantite.doubleValue() * produitDuPanier.getPrixHT());
			
			i++;
		}
		
		JTable table = new JTable(datas, nomCols);
		table.setCellSelectionEnabled(false);
		table.setDragEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setPreferredSize(new Dimension(700, 500));
		table.setGridColor(new Color(206, 0, 206));
		table.setBackground(Color.LIGHT_GRAY);
		table.setBorder(BorderFactory.createLineBorder(new Color(206, 0, 206)));
		panel.add(headerLabel, BorderLayout.NORTH);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		p1.setBackground(Color.WHITE);
		
		Box box = Box.createVerticalBox();
		box.add(Box.createVerticalStrut(30));
		
		JLabel labelMontant = new JLabel("Montant panier");
		JTextField montant = new JTextField();
		montant.setPreferredSize(new Dimension(50, 20));
		montant.setAlignmentX(this.RIGHT_ALIGNMENT);
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 0));
		p2.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));
		p2.add(labelMontant);
		p2.add(montant);
		p2.setSize(150, 30);
		p2.setBackground(Color.WHITE);
		box.add(p2);
		
		panel.add(box, BorderLayout.SOUTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 350);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session controleur  = new Session();
		VueJetable vue=new VueJetable();
		HashMap<Produit, Integer>panier = new HashMap<Produit, Integer>();
		//vue.affichageEcranPanier(panier);
		
		if(controleur.traitementConnexion()==EnumTypeEcran.ECRAN_ACCUEIL) {
			vue.affichageEcranAccueil();
		}
		if(controleur.traitementConnexion()==EnumTypeEcran.ECRAN_PERSO) {
			
			vue.affichageEcranPerso(controleur.clientCourrant.getNom(), controleur.clientCourrant.getPrenom());
		}
		
	}

}
