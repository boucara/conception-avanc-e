package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.TraitementActionClient;

public class PageAcceuil extends JFrame {
	JLabel headerLabel, contentLabel;
	JPanel controlPanel;
	JTextField txtEmail;

	public PageAcceuil() {
		this.setTitle("Application Ventes et Stoks");
		headerLabel = new JLabel("French Chic", JLabel.CENTER);
		// headerLabel.setSize(1000,500);
		Font font = new Font("Arial", Font.BOLD, 36);
		headerLabel.setFont(font);
		headerLabel.setForeground(Color.pink);

		JPasswordField password = new JPasswordField("Mot de passe");
		 txtEmail = new JTextField("Pseudo");

		txtEmail.setPreferredSize(new Dimension(200, 24));
		JButton bouton = new JButton(new TraitementActionClient(this, "S'identifier"));

		

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 4, 7, 7));
		p.setBackground(Color.white);

		p.add(headerLabel);
		p.add(txtEmail);
		p.add(password);
		p.add(bouton);

		this.add(p);

		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public JTextField getTextField(){
		return txtEmail;
	}
	

}
