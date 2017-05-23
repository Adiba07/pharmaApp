
package METIER;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import METIER.Article;
import METIER.Vente;
import BDD.Parameter;
import BDD.db_connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class Vente {

    ResultSet rs;
    int n_fac;
    db_connection db;
    public Vente()
    {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
           n_fac=0;
    }
 
 public TableModel afficherPrix(String prix)
 {
     rs = db.querySelectAll("article", "prix ='" + prix + "'");
     TableModel M = new ResultSetTableModel(rs);
     return M; 
 
 }
  public TableModel afficherNom(String Nom)
 {
     rs = db.querySelectAll("article", "nom_art = '" + Nom + "'");
     TableModel M = new ResultSetTableModel(rs);
     return M; 
 
 }
 public TableModel afficherPrixNom(String prix,String Nom)
 {
     rs = db.querySelectAll("article", "prix ='" + prix + "'and nom_art ='"+ Nom +"'");
     TableModel M = new ResultSetTableModel(rs);
     return M; 
 }
 public TableModel afficherTous()
 {
     rs = db.querySelectAll("article");
     TableModel M = new ResultSetTableModel(rs);
     return M; 
 }
    public void ajouterVente(String[] tab)
 {
     System.out.print("\n\n entree dans AjouterVente");
     String[] Col= {"n_fac","code_art","prix","nom","num_ven","quantite","date_sys","prix_total"};
     System.out.print("execution de la requete AjouterVente");      
     String rss = db.queryInsert("vente", Col, tab);
     System.out.print("\n\n apres dans AjouterVente");
     
 }
 public int DispoQuant(String code)
 {
     String[] quante =  {"quantite"};
     rs=db.fcSelectCommand(quante,"stock","code_art ='"+ code+"'");
     System.out.print("\n apres la selec");
     String S = new String();
        try {
                 System.out.print("\n dans try");

            while(rs.next()){
            S = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vente.class.getName()).log(Level.SEVERE, null, ex);
        }
             System.out.print("\n apres catch");

     int QuantStock = Integer.parseInt(S);
     return QuantStock;
 }
 public String modifierStock(String id,int quant)
 {
     System.out.print("\n\n on es dans modifier stock");
     String[] Col={"quantite"};
     String[] Val={""+quant};
     String rss = db.queryUpdate("stock", Col,Val, "code_art = '" +id+"'");
     return rss;
 }
 
 /*
 public String Date(String D)
 {
     String[] tabCol = {"code_art","prix","nom","quantite","date_sys","prix_total"};
     String[] tabVal = {"15","2000","nom11","4",""+D,"2000"};
     System.out.print("\n\n vente avant la requete \n\n");
     String rss = db.queryInsert("vente", tabCol, tabVal);
     System.out.print(rss);

     System.out.print("\n\nvente apres la requete\n\n");
     return rss;
 }*/
}
