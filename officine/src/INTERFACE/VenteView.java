
/*

 par zehhar taha et boufeldja adiba 

*/


package INTERFACE;
import java.text.SimpleDateFormat;
import METIER.Compte;
import METIER.Vente;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VenteView extends javax.swing.JFrame {

    Vente v;
    int i;
    public String TypeCompte;

    
  
    public VenteView() {
        initComponents();
        v =new Vente();
        initialisation();
    }
    private void initialisation()
    {
        tablepro.setModel(v.afficherTous());
        System.out.print("on fait le select tous de articl");
        i=0;
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablepro = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_vente = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 240, 252));

        tablepro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "code_art", "prix", "nom_art", "categorie", "n_lot", "dci", "forme", "dosage", "date_fab", "date_exp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablepro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablepro);

        table_vente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n facture", "code_art", "prix", "nom", "quantite", "prix_total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_vente);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("ajouter produit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 153));
        jButton6.setText("Valider");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(382, 382, 382))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(290, 290, 290))
        );

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Prix ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Quantité : ");

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("rechercher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Recherche :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(643, 643, 643))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    /*
     
    
    cette partie est faite par adiba boufeldja  ( jButton2ActionPerformed ()) 
    
   
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        Compte cmp = new Compte();
    File file = new File("fichier.txt");
    BufferedReader BR =null;
    try{
    FileReader FR = new FileReader(file);
    BR = new BufferedReader(FR);
    TypeCompte = BR.readLine();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(VenteView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(VenteView.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
       BR.close();
    }catch(IOException e){
       System.out.println("impossible de fermer le fichier");
    }
    System.out.print(TypeCompte);  
    if(TypeCompte.equals("administrateur"))
    {    
        this.dispose();
        admin a = new admin();
        a.setVisible(true);
    }else   
    {   
            this.dispose();
            vendeur b = new vendeur();
            b.setVisible(true);           
    }        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
     
    
       cette partie est faite par zehhar taha 
    
   
    */
    
    private void tableproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproMouseClicked
        t3.requestFocus();
    }//GEN-LAST:event_tableproMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (t1.getText().equals("") && t2.getText().equals("")) {
            tablepro.setModel(v.afficherTous());
        }else{
            if (t2.getText().equals("")) {
               tablepro.setModel(v.afficherPrix(t1.getText()));
            }else if (t1.getText().equals("")) {
                tablepro.setModel(v.afficherNom(t2.getText()));
                  }else{
                    tablepro.setModel(v.afficherPrixNom(t1.getText(),t2.getText()));
                  }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(t3.getText().equals("")){
            JOptionPane.showMessageDialog(this, "SVP entrer la quantite ");
        }else{
            int ligneSelectionne = tablepro.getSelectedRow();
            String id_s = tablepro.getValueAt(ligneSelectionne, 0).toString();
            int id= Integer.parseInt(id_s);
            int r_code = (int) tablepro.getValueAt(ligneSelectionne, 0);
            double r_prix = (double) tablepro.getValueAt(ligneSelectionne, 1);
            String r_nom = (String) tablepro.getValueAt(ligneSelectionne, 2);
            int r_quatite = Integer.parseInt(t3.getText());
            double r_prixTot = (double) r_quatite * r_prix;
            System.out.print(r_prix +" "+ r_nom +" "+ r_quatite +" "+ r_prixTot);
            if(v.DispoQuant(id_s) < r_quatite)
            {
                JOptionPane.showMessageDialog(this, "la quantite disponible est : "+ v.DispoQuant(id_s));               
            }else{
                DefaultTableModel model= (DefaultTableModel)table_vente.getModel();        
                String[] row = {"","","","","",""};
                model.addRow(row);
                table_vente.setValueAt(r_code, i, 1);
                table_vente.setValueAt(r_prix, i, 2);
                table_vente.setValueAt(r_nom, i, 3);
                table_vente.setValueAt(r_quatite, i, 4);
                table_vente.setValueAt(r_prixTot, i, 5);
                i++;
                t3.setText("");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int ligneSelectionne = table_vente.getSelectedRow(); //annuler une ligne de vente_table...
        DefaultTableModel model = (DefaultTableModel) table_vente.getModel();
        model.removeRow(ligneSelectionne);
        System.out.print(table_vente.getValueAt(0, 1).toString());
        i--;        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        if(i==0){
            JOptionPane.showMessageDialog(this, "ya aucun produit !!!  ");
        }else{
            int j;// la ligne de table_vente 
            String n_fac="";
            try { //lire la valeur de numero de facture...
                n_fac = ReadFac("num_fac.txt");
            } catch (IOException ex) {
                Logger.getLogger(VenteView.class.getName()).log(Level.SEVERE, null, ex);
            }        
            for(j=0;j<i;j++){
                String ins_code = table_vente.getValueAt(0, 1).toString();
                String ins_prix = table_vente.getValueAt(0, 2).toString();
                String ins_nom  = table_vente.getValueAt(0, 3).toString();
                String ins_quan = table_vente.getValueAt(0, 4).toString();
                String ins_tot  = table_vente.getValueAt(0, 5).toString();      
                    Date Da = new Date();    //la date de systeme ...
                    DateFormat D = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
                    String ins_date = D.format(Da);
                    String num_ven = null;
                    try {
                        num_ven = ReadFac("num_ven.txt");
                    } catch (IOException ex) {
                        Logger.getLogger(VenteView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                String[] ligne={ n_fac , ins_code , ins_prix , ins_nom ,num_ven, ins_quan,ins_date, ins_tot};
                v.ajouterVente(ligne);

                int NewQuant = (v.DispoQuant(ins_code)-Integer.parseInt(ins_quan));  //Modifer la quantite dans le stock
                v.modifierStock(ins_code,NewQuant);
                DefaultTableModel model = (DefaultTableModel) table_vente.getModel();
                model.removeRow(0);      
            }

            int num_fac = Integer.parseInt(n_fac);
            num_fac++;
            try {
                WriteFac(""+num_fac);
            } catch (IOException ex) {
                Logger.getLogger(VenteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "vente bien enregistré ");
            initialisation();
        }    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed

    }//GEN-LAST:event_jButton4KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if(t3.getText().equals("")){
            JOptionPane.showMessageDialog(this, "SVP entrer la quantite ");
        }else{
            int ligneSelectionne = tablepro.getSelectedRow();
            String id_s = tablepro.getValueAt(ligneSelectionne, 0).toString();
            int id= Integer.parseInt(id_s);
            int r_code = (int) tablepro.getValueAt(ligneSelectionne, 0);
            double r_prix = (double) tablepro.getValueAt(ligneSelectionne, 1);
            String r_nom = (String) tablepro.getValueAt(ligneSelectionne, 2);
            int r_quatite = Integer.parseInt(t3.getText());
            double r_prixTot = (double) r_quatite * r_prix;
            System.out.print(r_prix +" "+ r_nom +" "+ r_quatite +" "+ r_prixTot);
                if(v.DispoQuant(id_s) < r_quatite)
                {
                    JOptionPane.showMessageDialog(this, "la quantite disponible est : "+ v.DispoQuant(id_s));               
                }else{
                    DefaultTableModel model= (DefaultTableModel)table_vente.getModel();        
                    String[] row = {"","","","","",""};
                    model.addRow(row);
                    table_vente.setValueAt(r_code, i, 1);
                    table_vente.setValueAt(r_prix, i, 2);
                    table_vente.setValueAt(r_nom, i, 3);
                    table_vente.setValueAt(r_quatite, i, 4);
                    table_vente.setValueAt(r_prixTot, i, 5);
                    i++;
                    t3.setText("");
                }
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_t3KeyPressed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
             
    }//GEN-LAST:event_t1KeyPressed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2KeyPressed

    private String ReadFac(String File) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(File)); 
	return br.readLine();
        
    }
    private void WriteFac(String numero) throws IOException
    {
        try (Writer wr = new FileWriter("num_fac.txt"))
        {wr.write(numero);}
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenteView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTable table_vente;
    private javax.swing.JTable tablepro;
    // End of variables declaration//GEN-END:variables
}