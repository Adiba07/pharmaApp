

package METIER;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.sql.ResultSet;
import javax.swing.table.TableModel;


public class Stock {
public int code;
public int qte;
public String nom;
public db_connection db;
public Stock(){
     db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
    }

/*
 
  cette partie est fait par ghitri karim

*/

public  TableModel affiche2(String prix,String nom){
  String table1="article";String table2="stock" ;
  String[] colon={"nom_art","date_exp","dci","categorie","quantite","prix"};
  String etat="code_art"  ;
ResultSet rs=db.jointure2(table1,table2, colon, etat,prix,nom);
TableModel m=new ResultSetTableModel(rs);
 return m;   
}

public TableModel afficher(){
   
    String table1="article";String table2="stock" ;
  String[] colon={"nom_art","date_exp","dci","forme","dosage","categorie","quantite","prix"};
  String etat="code_art";
ResultSet rs=db.jointure(table1,table2, colon, etat);
TableModel m=new ResultSetTableModel(rs);
return m;
}
}