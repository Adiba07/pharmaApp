/***
 
 faite par  le groupe 
 
 ***/
package BDD;


import java.net.Socket;

import java.sql.*;

public class db_connection {
    Connection connection;
    Statement statement;
    String SQL;
    String url;
    String username;
    String password;
    Socket client;
    int Port;
    String Host;

  
  public db_connection(String url, String username, String password, String Host, int Port) {

      
  this.url = url;
  this.username = username;
  this.password = password;
  this.Host = Host;
  this.Port = Port;
    }

   
 public Connection connexionDatabase() {

      
  try {
            Class.forName("com.mysql.jdbc.Driver");
           System.out.println("driver");
  connection = DriverManager.getConnection(url, username, password);
  System.out.println("database connecte");
        } catch (Exception e) 
{System.err.println(e);//
        }
        return connection;
    }

 
   public Connection closeconnexion() {

        try {
            connection.close();
        } catch (Exception e) {System.err.println(e);//
        }
        return connection;
    }

    public ResultSet exécutionQuery(String sql) {
        connexionDatabase();
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {System.err.println(ex);//
        }
          System.out.println("execute query");
        return resultSet;
    }

    public String exécutionUpdate(String sql) {
        connexionDatabase();
        String result = "";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            result = sql;

        } catch (SQLException ex) {
            result = ex.toString();
        }
        return result;

    }

    public ResultSet querySelectAll(String nomTable) {

        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable;
        System.out.println(SQL);
        System.out.println("select");
        return this.exécutionQuery(SQL);
       

    }

    public ResultSet querySelectAll(String nomTable, String état) {

        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable + " WHERE " + état;
        return this.exécutionQuery(SQL);

    }

    public ResultSet querySelect(String[] nomColonne, String nomTable) {

        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable;
        return this.exécutionQuery(SQL);

    }

    public ResultSet fcSelectCommand(String[] nomColonne, String nomTable, String état) {

        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable + " WHERE " + état;
        return this.exécutionQuery(SQL);

    }

    public String queryInsert(String nomTable, String[] contenuTableau) {

        connexionDatabase();
        int i;
        SQL = "INSERT INTO " + nomTable + " VALUES(";

        for (i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.exécutionUpdate(SQL);

    }

    public String queryInsert(String nomTable, String[] nomColonne, String[] contenuTableau) {

        connexionDatabase();
        int i;
        SQL = "INSERT INTO " + nomTable + "(";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += ") VALUES(";
        for (i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.exécutionUpdate(SQL);

    }

    public String queryUpdate(String nomTable, String[] nomColonne, String[] contenuTableau, String état) {

        connexionDatabase();
        int i;
        SQL = "UPDATE " + nomTable + " SET ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i] + "='" + contenuTableau[i] + "'";
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " WHERE " + état;
        return this.exécutionUpdate(SQL);

    }

    public String queryDelete(String nomtable) {

        connexionDatabase();
        SQL = "DELETE FROM " + nomtable;
        return this.exécutionUpdate(SQL);

    }

    public String queryDelete(String nomTable, String état) {

        connexionDatabase();
        SQL = "DELETE FROM " + nomTable + " WHERE " + état;
        return this.exécutionUpdate(SQL);

    }
    // jointure et jointure2 et jointure3 et jointure4 fait par bouyakoub djelel  
       public ResultSet jointure(String table1,String table2,String[] colone,String etat1){
        String SQL="SELECT";
        int i;
        for (i = 0; i <= colone.length - 1; i++) {
            SQL +="`"+ colone[i] + "`";
            if (i < colone.length - 1) {SQL += ",";}
             }
        
                SQL += " FROM "+table1+" INNER JOIN "+table2+" ON "+table1+"."+etat1+"="+table2+"."+etat1+" ORDER BY `nom_art`,`forme`,`dosage` asc ;";
                 
           
        return this.exécutionQuery(SQL); 
        
        
    }
    
    
public ResultSet jointure2(String table1,String table2,String[] colone,String etat1,String priR,String nomR){
        String SQL="SELECT";
        int i;int j;
        for (i = 0; i <= colone.length - 1; i++) {
            SQL +="`"+ colone[i] + "`";
            if (i < colone.length - 1) {SQL += ",";}
             }
SQL += " FROM "+table1+" INNER JOIN "+table2+" ON "+table1+"."+etat1+"="+table2+"."+etat1+ "" ;
                
    if (priR!=null) { if (nomR!=null){ SQL+= " WHERE `prix`='"+priR+"' OR `nom_art`='"+nomR+"' ORDER BY `nom_art`,`forme`,`dosage` asc ;" ;}      
                          else { SQL+= " WHERE`prix`='"+priR+"';";}}
        else { if (nomR!=null) { SQL+= " WHERE `nom_art`='"+nomR+"';";}
        else {SQL+=";" ;} }

                
              
          
                
        return this.exécutionQuery(SQL); 
    
    
    
    }
 public ResultSet jointure3(String table1,String table2,String[] colone,String etat1){
        String SQL="SELECT";
        int i;
        for (i = 0; i <= colone.length - 1; i++) {
            SQL +="`"+ colone[i] + "`";
            if (i < colone.length - 1) {SQL += ",";}
             }
        
                SQL += " FROM "+table1+" INNER JOIN "+table2+" ON "+table1+"."+etat1+"="+table2+"."+etat1+" ORDER BY `date_sys` desc ;";
                 
           
        return this.exécutionQuery(SQL); 
}
 
        public ResultSet jointure4(String table1,String table2,String[] colone,String etat1,String etat2){
        String SQL="SELECT";
        int i;
        for (i = 0; i <= colone.length - 1; i++) {
            SQL +="`"+ colone[i] + "`";
            if (i < colone.length - 1) {SQL += ",";}
             }
        
                SQL += " FROM "+table1+" INNER JOIN "+table2+" ON "+table1+"."+etat1+"="+table2+"."+etat2+";";
                 
           
        return this.exécutionQuery(SQL); 
        
        
    }
}