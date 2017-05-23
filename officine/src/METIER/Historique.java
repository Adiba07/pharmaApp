
package METIER;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Historique {
   public ArrayList<Vente> vente; 
   db_connection db;
   ResultSet rs;
   DefaultTableModel model=new DefaultTableModel();
   public Historique(){
    db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
   }
   public ResultSet afficher(){
       
      
       
       String table1="vente";String table2="vendeur" ;
  String[] colon1={"n_fac","code_art","nom","prix","quantite","prix_total","date_sys","nom_v","prenom"};
  String etat="num_ven";
 ResultSet rs=db.jointure3(table1,table2,colon1,etat);
 //TableModel m=new ResultSetTableModel(rs);
 return rs;

   }
   
   }
