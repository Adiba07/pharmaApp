  /*

    cette partie est faite par bourmaki imane ( ajouter compte / modifier compte / supprimer compte / table)    

    */


package METIER;

import BDD.Parameter;
import BDD.db_connection;

import INTERFACE.GérerCompte;
import INTERFACE.Login;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Admin extends Vendeur{
    ResultSet rs;
    ResultSet rs1;
    db_connection db;
    int nv;
    DefaultTableModel model=new DefaultTableModel();
    public Admin(){
     db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
    }
    public void ajouter_compte(String nom,String prenom,String num_tel,String login,String pass_word,String type){
         if (nom.equals("") || prenom.equals("") || num_tel.equals("")||
            login.equals("") || pass_word.equals("")) {
            JOptionPane.showMessageDialog(null, "SVP entrer les informations complete");
             
        } else {
            
            String[] colon = {"nom_v","prenom","n_tel"};
            String[] inf = {nom, prenom, num_tel};
            System.out.println(db.queryInsert("vendeur",colon,inf));
            rs = db.querySelectAll("vendeur","n_tel='"+num_tel+"'");
            try {
                while (rs.next()) {

                    nv = rs.getInt("num_ven");
                    System.out.println(nv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            String[] colon1 = {"num_venc", "login","pass_word","typ"};
            String[] inf1 = {""+nv,login,pass_word,type};
            System.out.println(db.queryInsert("compte",colon1, inf1));
            JOptionPane.showMessageDialog(null,"le compte est ajouté");
            GérerCompte c = new GérerCompte();
            c.setVisible(true);            
        }
        
    }
   
   

    public void modifier_compte(String id,String nom,String prenom,String num_tel,String login,String pass_word,String type){
     try{
       if(JOptionPane.showConfirmDialog(null,"confirmer la modification","modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
       {
           String[] colon = {"nom_v","prenom","n_tel"};
           String[] inf = {nom,prenom,num_tel}; 
           String[] colon1 = {"login","pass_word","typ"};
           String[] inf1 = {login,pass_word,type};
           db.queryUpdate("vendeur",colon,inf,"num_ven='"+id+"'");
           db.queryUpdate("compte",colon1,inf1,"num_venc='"+id+"'");
           JOptionPane.showMessageDialog(null,"le compte est modifier");
            GérerCompte g = new GérerCompte();
            g.setVisible(true);  
       
               }
       }catch(Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!"+e.getMessage());
       System.err.println(e);}
    
    }
    public void supprimer_compte(String id){
               if (id == null){JOptionPane.showMessageDialog(null,"selectionner un compte");}
        else{
        if (JOptionPane.showConfirmDialog(null, "est ce que tu veux suuprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            System.out.println( db.queryDelete("compte", "num_venc="+ id));
            System.out.println( db.queryDelete("vendeur","num_ven="+id));
        } 
    }
}
        public ResultSet table(){
       
        
        String colon[]={"num_ven","nom_v","prenom","n_tel","login","pass_word","typ"};
        rs = db.jointure4("vendeur","compte", colon,"num_ven","num_venc");
     
        return rs;
    } 

}
