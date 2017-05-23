


package METIER;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import INTERFACE.GérerProduit;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Article {
   
   db_connection db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
    private Component GérerProduit;
    int code_art;
    
   
/* 

    cette partie est faite par ghitri karim (ajouter/ modifier/ supprimer_article)
    
 */
    public void ajouter_article(String prix,String nom_art,String categorie,String n_lot,String date_fab,String date_exp,String dci,String forme,String dosage,String quan){  
            
           String[] colon = {"prix","nom_art","categorie","n_lot","dci","forme","dosage","date_fab","date_exp"};
            String[] inf = {""+prix,nom_art,""+categorie,""+n_lot,""+dci,""+forme,""+dosage,""+date_fab,""+date_exp};
            System.out.println(db.queryInsert("article",colon,inf));
            
            ResultSet rs = db.querySelectAll("article","prix='" +prix+ "' and nom_art='" +nom_art+ "'and categorie='" +categorie+ "' and n_lot='" +n_lot+ "'");
            try {
                while (rs.next()) {

                    code_art = rs.getInt("code_art");
                    
                }
            }catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
          
            String[] colon1 = {"code_art", "quantite"};
            String[] inf1 = {""+code_art,quan};
            System.out.println(db.queryInsert("stock",colon1, inf1));
            

           
             
         }     
   
   public void modifier_article(String code_art,String prix,String nom_art,String categorie,String n_lot,String dci,String forme,String dosage,String date_fab,String date_exp,String quantite){
   
       String[] colon = {"prix","nom_art","categorie","n_lot","dci","forme","dosage","date_fab","date_exp"};
             
             String[] inf = {prix,nom_art,categorie,n_lot,dci,forme,dosage,date_fab,date_exp};
             String[] colon1 = {"quantite"};
             String[] inf1 = {quantite};
             System.out.println(db.queryUpdate("article", colon, inf, "code_art=" +code_art));
             System.out.println(db.queryUpdate("stock", colon1, inf1, "code_art=" +code_art));
   }
   
    public void supprimer_article(String code){
        if (code == null){JOptionPane.showMessageDialog(GérerProduit, "Veuiller selectionner un produit !!!");}
        else{
            if (JOptionPane.showConfirmDialog(GérerProduit, "Est ce que tu es sure que tu veut suprimer ?", "Attention !!",
            JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION);
            db.queryDelete("article", "code_art=" + code);
            db.queryDelete("stock", "code_art=" + code);
        }
   }
   
    public boolean disponibilité(String prix1,String nom1) throws SQLException{
        boolean a=false;
            ResultSet rs = db.querySelectAll("article","prix='" +prix1+ "' or nom_art='" +nom1+ "'");
            if (rs.next()){ a=true;}    
        return a;
   }
}
