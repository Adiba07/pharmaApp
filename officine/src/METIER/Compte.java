package METIER;

import BDD.Parameter;
import BDD.db_connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import INTERFACE.admin;
import INTERFACE.vendeur;
import INTERFACE.Login;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Compte {
    public db_connection db;
    public ResultSet rs;
    public String type;
    public int num_cmp;
    public String login;
    public String pass_word;
    private Component Login;
    public String username; 
    public String password;
     boolean n;
    
    public Compte(){
          db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);    
     
       
    }
    public void connecter(String login1,String pass_word1) throws IOException{
        username=login1;
       password=pass_word1;
       
            rs = db.querySelectAll("compte", "login='" +login1+ "' and pass_word='" +pass_word1+ "'");
        
          try { 
              FileWriter lu=new FileWriter("fichier.txt");
              BufferedWriter out=new BufferedWriter(lu);
              
               
              while (rs.next()) {
          
                login = rs.getString("login");
                pass_word = rs.getString("pass_word");
                type = rs.getString("typ");
               
                out.write(type);
               out.close();
             }
            } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
                 int id ;
       try { 
              FileWriter l=new FileWriter("fichier1.txt");
              BufferedWriter out1=new BufferedWriter(l);
              
               
              while (rs.next()) {
          
                id=rs.getInt("id_ven");
               
                out1.write(id);
               out1.close();
             }
            } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
          
          
          

       if (login == null && pass_word == null) {
            JOptionPane.showMessageDialog(Login, "le nom utilisateur ou le mots de pass est incorrect");
            Login l = new Login();
            l.setVisible(true);

            //System.out.println("le nom utilisateur ou le mots de pass est incorrect");
        } else {
            if (type.equals("administrateur")) {
               // n=true; 
                admin a = new admin();
                a.setVisible(true);
                Login l = new Login();
                l.dispose();
                    
            } else {
                // n=false;
                vendeur b = new vendeur();
                b.setVisible(true);
                 Login l = new Login();
                l.dispose();
             
            }}
      
       
       
    }
    
    
   public boolean num_sec()
    {  
        System.out.print("n1="+n);
        return n;
    }
    
   /* public String user()
    {
       return username;
    
    }
      
    public String password()
     {
         return password;
    
       }
*/
    public void deconnecter(){
           
           db.closeconnexion();
                 Login l = new Login();
        l.setVisible(true);
    }
}
