package vue;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PageAcceuil  extends JFrame{
	 JLabel headerLabel ;
	 JPanel  controlPanel ;
	 public PageAcceuil(){
		    this.setTitle("Application Ventes et Stoks");
		    headerLabel = new JLabel("French Chic", JLabel.CENTER); 
		    //headerLabel.setSize(1000,500);
		    Font font = new Font("Arial",Font.BOLD,36);
		    headerLabel.setFont(font);

		   // headerLabel.setForeground(Color.pink);
		    controlPanel = new JPanel();
		    controlPanel.setLayout(new FlowLayout());

		    controlPanel.add(headerLabel);
		    this.add(controlPanel);
		    
		    this.setSize(1000, 500);
		    this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		    this.setVisible(true);
		  }

}
