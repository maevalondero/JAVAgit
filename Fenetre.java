package apratique9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame{
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    //ajouter police differente chercher
    
    
    public Fenetre(){
        //mettre titre
        this.setTitle("Selection bouton couleur");
        //taille de la fenetre
        this.setSize(600,600);
        //action quand on ferme
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // mettre fenetre au milieu
        this.setLocationRelativeTo(null);
        
        //Boutons
        //bouton 1
        JButton bouton1 = new JButton("Rouge");
        panel.add(bouton1);
        //bouton1.addActionListener(new Bouton1Listener());
        
        //bouton 2 
        JButton bouton2 = new JButton();
        bouton2.setText("Vert");
        panel.add(bouton2);        
        //bouton2.addActionListener(new bouton2listener());        
        
                //bouton 3 
        JButton bouton3 = new JButton();
        bouton3.setText("Bleu");
        panel.add(bouton3);        
        //bouton3.addActionListener(new bouton3listener());  
        
                //bouton 4 
        JButton bouton4 = new JButton();
        bouton4.setText("Jaune");
        panel.add(bouton4);        
        //bouton4.addActionListener(new bouton4listener());  
        
        //mettre couleur fond
        panel.setBackground(Color.white);
        panel.add(label);
        this.setContentPane(panel);
        this.setVisible(true);
        
    class Bouton1Listener implements ActionListener{
   
        public void actionPerformed(ActionEvent arg0){
            label.setForeground(Color.black);
            label.setText("ROUGE");
            panel.setBackground(Color.red);
        }
                    
            
        }
        
        
        
                
                
                
    }

    
}
