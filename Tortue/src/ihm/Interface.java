/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.naming.CommunicationException;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

import objetQuiDessine.CurseurQuiDessine;
import commande.CommandeExeption;
import commande.HashTable;
/**
 *
 * @author Lunarc
 */
@SuppressWarnings("serial")
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        Curseur=new CurseurQuiDessine();
        refresh();
    }
    public static void refresh(){
    	jLabelTextPosition.setText(Curseur.getAbscisse()+" "+Curseur.getOrdonnee());
    	jLabelTextDirection.setText(Curseur.getDirection()+"");
    	jLabelTextPensize.setText(Curseur.getPensize()+"");
    	if(Curseur.isPendown()){
    		jLabelTextDessine.setText("oui");
    	}
    	else{
    		jLabelTextDessine.setText("non");
    	}
    	
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

    	//initialisation du Panel Parametre
        jPanelParametres = new javax.swing.JPanel();
        jLabelDirection = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelPensize = new javax.swing.JLabel();
        jLabelCouleur = new javax.swing.JLabel();
        jComboBoxCouleur = new javax.swing.JComboBox();
        jLabelDessine = new javax.swing.JLabel();
        jLabelTextDirection = new javax.swing.JLabel();
        jLabelTextPosition = new javax.swing.JLabel();
        jLabelTextPensize = new javax.swing.JLabel();
        jLabelTextDessine = new javax.swing.JLabel();
        
        //initialisation du Dessin
        jPanelDessin = new Dessin();
        
        //initialisation du panel History
        jScrollPaneHistory = new javax.swing.JScrollPane();
        jTextAreaHistory = new PanelHistory();
        
        //initialisation de l'invite de Commande
        jInviteDeCommande = new javax.swing.JTextField();
        jInviteDeCommande.addKeyListener(new KeyListen());
        jInviteDeCommande.setFont(new Font("Arial", Font.PLAIN, 14));
        
        //initialisation de la fenetre(resolution+op�ration de fermeture)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());

        jPanelParametres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelDirection.setText("Direction:");

        jLabelPosition.setText("Position:");

        jLabelPensize.setText("Pensize");

        jLabelCouleur.setText("Couleur");

        jComboBoxCouleur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDessine.setText("Dessine");

        jLabelTextDirection.setText(" ");

        jLabelTextPosition.setText(" ");

        jLabelTextPensize.setText(" ");

        jLabelTextDessine.setText(" ");

        //positionnement des fenetres les unes par rapport aux autres � l'aide d'un Layout
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanelParametres);
        jPanelParametres.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelDessine)
                .addGap(18, 18, 18)
                .addComponent(jLabelTextDessine)
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCouleur)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPensize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextPensize)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextDirection)
                                    .addComponent(jLabelTextPosition))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextDirection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosition)
                    .addComponent(jLabelTextPosition))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPensize, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextPensize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDessine)
                    .addComponent(jLabelTextDessine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCouleur)
                    .addComponent(jComboBoxCouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelDessin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDessin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelDessin.setPreferredSize(new java.awt.Dimension(3, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanelDessin);
        jPanelDessin.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

       // jTextAreaHistory.setColumns(20);
        //jTextAreaHistory.setRows(5);
        jTextAreaHistory.panel.setFocusable(false);
        jScrollPaneHistory.setViewportView(jTextAreaHistory.panel);

        jInviteDeCommande.setBackground(new java.awt.Color(0, 0, 0));
        jInviteDeCommande.setForeground(new java.awt.Color(255, 255, 255));
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDessin, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                    .addComponent(jInviteDeCommande, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelParametres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDessin, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addComponent(jScrollPaneHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelParametres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jInviteDeCommande))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
   
    
    @SuppressWarnings({ "rawtypes", "unused" })
	private javax.swing.JComboBox jComboBoxCouleur;
    private javax.swing.JLabel jLabelDirection;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPensize;
    private javax.swing.JLabel jLabelCouleur;
    private javax.swing.JLabel jLabelDessine;
    private javax.swing.JPanel jPanelParametres;
    private javax.swing.JPanel jPanelDessin;
    private javax.swing.JScrollPane jScrollPaneHistory;
    private PanelHistory jTextAreaHistory;
    private javax.swing.JTextField jInviteDeCommande;
   
    private static CurseurQuiDessine Curseur;
    private static javax.swing.JLabel jLabelTextDirection;
    private static javax.swing.JLabel jLabelTextPosition;
    private static javax.swing.JLabel jLabelTextPensize;
    private static javax.swing.JLabel jLabelTextDessine;
    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int)tailleEcran.getHeight();
    static int largeur = (int)tailleEcran.getWidth();
    
    // End of variables declaration
   

	public class KeyListen implements KeyListener {
		HashTable Hash=new HashTable();

		public KeyListen() {
		
		}

		public void keyTyped(KeyEvent e) {
			/* Cette m�thode est appel�e quand l'utilisateur appuie sur une touche Unicode (donc les caract�res) et ne prend pas en compte les touches comme F1, Echap, ALT, etc. */
		}

		/* Cette m�thode est appel�e quand l'utilisateur appuie sur une touche.
		 */
		
	public void keyPressed(KeyEvent e) {
		
		String s;
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			 s=jInviteDeCommande.getText();
			 s=s.trim();
			 
			 try {
				 if(!s.equals("")){
					 jTextAreaHistory.addTexte(s);
					 jInviteDeCommande.setText(" ");
				 }
				 s=s.toUpperCase();
				Hash.hgj(s+" ;", Curseur, jPanelDessin);
			} catch (NullPointerException e1) {
				// TODO Auto-generated catch block
				jTextAreaHistory.addError(s);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				refresh();
			}
			 
		}
	}

	//�tape 6 : on impl�mente la m�thode keyReleased d�finie dans l'interface KeyListener
	public void keyReleased(KeyEvent e) {
		// Le fonctionnement est le m�me que pour keyPressed, sauf que cette m�thode est appel�e quand la touche est rel�ch�e.
	}

	}

}