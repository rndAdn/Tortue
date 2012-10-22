package commande;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

import commande.Open.ExtensionFileFilter;

import objetQuiDessine.CurseurQuiDessine;
/**
 * http://www.developpez.net/forums/d37286/java/interfaces-graphiques-java/awt-swing/jfilechooser-sauvegarder-mettre-automatiquement-lextension/
 * @author slater
 * 
 * http://stackoverflow.com/questions/5655908/export-jpanel-graphics-to-png-or-gif-or-jpg 
 *
 */
public class Save implements Commande {



	JFileChooser save = new JFileChooser();
   
	public Save(){
		
		FileFilter filter1 = new ExtensionFileFilter("Fichier texte", new String[] { "txt"});
	    save.setFileFilter(filter1);
		save.setApproveButtonText("Choix du fichier"); //intitulé du bouton
	}
	@Override
	public void execute(String[] parametres, JPanel dessin,CurseurQuiDessine curseur) {
		
		//open.showOpenDialog(null); //affiche la boite de dialogue
		if (save.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){	
			System.out.println(save.getSelectedFile().getAbsolutePath());
			
		}
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	class ExtensionFileFilter extends FileFilter {
		  String description;

		  String extensions[];

		  public ExtensionFileFilter(String description, String extension) {
		    this(description, new String[] { extension });
		  }

		  public ExtensionFileFilter(String description, String extensions[]) {
		    if (description == null) {
		      this.description = extensions[0];
		    } else {
		      this.description = description;
		    }
		    this.extensions = (String[]) extensions.clone();
		    toLower(this.extensions);
		  }

		  private void toLower(String array[]) {
		    for (int i = 0, n = array.length; i < n; i++) {
		      array[i] = array[i].toLowerCase();
		    }
		  }

		  public String getDescription() {
		    return description;
		  }

		  public boolean accept(File file) {
		    if (file.isDirectory()) {
		      return true;
		    } else {
		      String path = file.getAbsolutePath().toLowerCase();
		      for (int i = 0, n = extensions.length; i < n; i++) {
		        String extension = extensions[i];
		        if ((path.endsWith(extension) && (path.charAt(path.length() - extension.length() - 1)) == '.')) {
		          return true;
		        }
		      }
		    }
		    return false;
		  }
		}

}