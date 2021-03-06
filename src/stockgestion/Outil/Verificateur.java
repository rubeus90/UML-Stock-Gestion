package stockgestion.Outil;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Verificateur {
    
   public static boolean isValidString(String texte){
        int res1 = texte.indexOf("'");
        int res2 = texte.indexOf('"');
         
        return res1 == -1 && res2 == -1 && texte.length() != 0;
    }   
    
    public static boolean isValidInt(String texte){
        try{
            Integer.parseInt(texte);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean isValidDouble(String texte){
        try{
            Double.parseDouble(texte);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean isValidSelection(JList list){
        return list.getSelectedIndices().length > 0;
    }
    
    public static boolean isValidSelectionTable(JTable table){
        return table.getSelectedRows().length > 0;
    }
    
    //Mettre le champs non valide en rouge
    public static void error(JComponent component){
        component.setBackground(Color.red);
    }
    
    public static void valid(JComponent component){
        component.setBackground(Color.white);
    }
    
    public static boolean isValideArticle(JTextField nom, JTextField codeBarre, JTextField prix, JTextField quantite, JTextField seuil, JList fournisseur){
        boolean valid = true;
        
        if(!isValidString(nom.getText())){
            valid = false;
            error(nom);
        } else{
            valid(nom);
        }
        
        if(!isValidInt(codeBarre.getText())){
            valid = false;
            error(codeBarre);
        } else{
            valid(codeBarre);
        }
        
        if(!isValidDouble(prix.getText())){
            valid = false;
            error(prix);
        } else{
            valid(prix);
        }
        
        if(!isValidInt(quantite.getText())){
            valid = false;
            error(quantite);
        } else{
            valid(quantite);
        }
        
        if(!isValidInt(seuil.getText())){
            valid = false;
            error(seuil);
        } else{
            valid(seuil);
        }
        
        if(!isValidSelection(fournisseur)){
            valid = false;
            error(fournisseur);
        } else{
            valid(fournisseur);
        }  
        
        return valid;
    }
    
    public static boolean isValideFournisseur(JTextField nom, JTextField adresse, JTextField codePostal, JTextField numTel){
        boolean valid = true;
        
        if(!isValidString(nom.getText())){
            valid = false;
            error(nom);
        } else{
            valid(nom);
        }       
        
        if(!isValidString(adresse.getText())){
            valid = false;
            error(adresse);
        } else{
            valid(adresse);
        }   
        
        if(!isValidInt(codePostal.getText())){
            valid = false;
            error(codePostal);
        } else{
            valid(codePostal);
        }        
        
        if(!isValidInt(numTel.getText())){
            valid = false;
            error(numTel);
        } else{
            valid(numTel);
        }
        
        return valid;
    }
}
