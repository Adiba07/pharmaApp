package METIER;

import BDD.Parameter;
import BDD.db_connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Vendeur {
public int num_vend;
public String nom;
public String prenom;
public String num_tel;
public String login;
public db_connection db;
 public Vendeur(){
     db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
    }

public  ResultSet consulter_Stock(){
  String table1="article";String table2="stock" ;
  String[] colon={"nom_art","date_exp","dci","categorie","quantite"};
  String etat="code_art";
ResultSet rs=db.jointure(table1,table2, colon, etat);
 return rs;   
}
public  ResultSet consulter_Stock2(String prix,String nom){
  String table1="article";String table2="stock" ;
  String[] colon={"nom_art","date_exp","dci","categorie","quantite"};
  String etat="code_art"  ;
ResultSet rs=db.jointure2(table1,table2, colon, etat,prix,nom);
 return rs;   
}








public Vente creer_vente(int num_vend,ArrayList<Vente> art){
return null;
}
public void annuler_vente(int num_ven){

}
public void imprimer_facture(Vente vente){

}
}