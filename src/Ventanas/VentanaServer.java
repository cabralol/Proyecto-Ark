/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import arkcontrolador.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guille
 */


public class VentanaServer extends javax.swing.JFrame {
    
 
 /**
     * Creates new form VentanaServer
     */
      Connection cn=null;
      ConexionMySQL mysql = new ConexionMySQL();
    public VentanaServer(String Mapa) throws SQLException {
        initComponents();
         
         cn= mysql.Conectar();

        titulo.setText(Mapa);
        panelMacho.setVisible(false);
        panelHembra.setVisible(false);
        JLMacho.setVisible(false);
        JLHembra.setVisible(false);
        int numeroDinos=0;
      
        String sqlNombreDino   ="Select Nombre from nombredino";
        String numDinos = "Select count(Nombre) as Nombre from nombredino";
       
                
        
        PreparedStatement  contarDinos =  cn.prepareStatement(numDinos);
        PreparedStatement nombresDinos = cn.prepareStatement(sqlNombreDino);
     
        
        
      
        ResultSet rs =contarDinos.executeQuery();
        ResultSet rsDinos =nombresDinos.executeQuery();
        
        if (rs.next()) {
             numeroDinos = rs.getInt(1);
        }
        
     
        for (int i = 0; i <= numeroDinos; i++) {
            while(rsDinos.next()){
            ComboDinos.addItem(rsDinos.getString("Nombre"));
            }
        }
                
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboDinos = new javax.swing.JComboBox<>();
        panelMacho = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        eStamina1 = new javax.swing.JLabel();
        eComida1 = new javax.swing.JLabel();
        eOxigeno1 = new javax.swing.JLabel();
        eDaño1 = new javax.swing.JLabel();
        ePeso1 = new javax.swing.JLabel();
        eVelocidad1 = new javax.swing.JLabel();
        eVida1 = new javax.swing.JLabel();
        panelHembra = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        eStamina2 = new javax.swing.JLabel();
        eComida2 = new javax.swing.JLabel();
        eOxigeno2 = new javax.swing.JLabel();
        eDaño2 = new javax.swing.JLabel();
        ePeso2 = new javax.swing.JLabel();
        eVelocidad2 = new javax.swing.JLabel();
        eVida2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLMacho = new javax.swing.JLabel();
        JLHembra = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        JLMote1 = new javax.swing.JLabel();
        JLMote2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ComboDinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Dinosaurio Top" }));
        ComboDinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDinosActionPerformed(evt);
            }
        });

        jLabel15.setText("Estamina");

        jLabel16.setText("Comida");

        jLabel17.setText("Oxigeno");

        jLabel18.setText("Vida");

        jLabel19.setText("Peso");

        jLabel20.setText("Daño");

        jLabel21.setText("Velocidad");

        eStamina1.setText("jLabel1");

        eComida1.setText("jLabel9");

        eOxigeno1.setText("jLabel10");

        eDaño1.setText("jLabel11");

        ePeso1.setText("jLabel12");

        eVelocidad1.setText("jLabel13");

        eVida1.setText("jLabel14");

        javax.swing.GroupLayout panelMachoLayout = new javax.swing.GroupLayout(panelMacho);
        panelMacho.setLayout(panelMachoLayout);
        panelMachoLayout.setHorizontalGroup(
            panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMachoLayout.createSequentialGroup()
                .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMachoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(eVelocidad1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMachoLayout.createSequentialGroup()
                        .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMachoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMachoLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eStamina1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addGap(2, 2, 2))
                                    .addGroup(panelMachoLayout.createSequentialGroup()
                                        .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMachoLayout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eOxigeno1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMachoLayout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(eComida1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20))))
                            .addGroup(panelMachoLayout.createSequentialGroup()
                                .addGap(40, 89, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(24, 24, 24)
                                .addComponent(eVida1)
                                .addGap(5, 5, 5)))
                        .addGap(28, 28, 28)
                        .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eDaño1)
                            .addComponent(ePeso1))))
                .addGap(17, 17, 17))
        );
        panelMachoLayout.setVerticalGroup(
            panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMachoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(eStamina1)
                    .addComponent(jLabel19)
                    .addComponent(ePeso1))
                .addGap(16, 16, 16)
                .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(eComida1)
                    .addComponent(jLabel20)
                    .addComponent(eDaño1))
                .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMachoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(eOxigeno1)
                            .addComponent(jLabel21)
                            .addComponent(eVelocidad1)))
                    .addGroup(panelMachoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelMachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eVida1)
                            .addComponent(jLabel18))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel22.setText("Estamina");

        jLabel23.setText("Comida");

        jLabel24.setText("Oxigeno");

        jLabel25.setText("Vida");

        jLabel26.setText("Peso");

        jLabel27.setText("Daño");

        jLabel28.setText("Velocidad");

        eStamina2.setText("eStamina1");

        eComida2.setText("jLabel9");

        eOxigeno2.setText("jLabel10");

        eDaño2.setText("jLabel11");

        ePeso2.setText("jLabel12");

        eVelocidad2.setText("jLabel13");

        eVida2.setText("jLabel14");

        javax.swing.GroupLayout panelHembraLayout = new javax.swing.GroupLayout(panelHembra);
        panelHembra.setLayout(panelHembraLayout);
        panelHembraLayout.setHorizontalGroup(
            panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHembraLayout.createSequentialGroup()
                .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHembraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(eVelocidad2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHembraLayout.createSequentialGroup()
                        .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHembraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelHembraLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eStamina2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26)
                                        .addGap(2, 2, 2))
                                    .addGroup(panelHembraLayout.createSequentialGroup()
                                        .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHembraLayout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eOxigeno2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHembraLayout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(eComida2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27))))
                            .addGroup(panelHembraLayout.createSequentialGroup()
                                .addGap(40, 75, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(24, 24, 24)
                                .addComponent(eVida2)
                                .addGap(5, 5, 5)))
                        .addGap(28, 28, 28)
                        .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eDaño2)
                            .addComponent(ePeso2))))
                .addGap(17, 17, 17))
        );
        panelHembraLayout.setVerticalGroup(
            panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHembraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(eStamina2)
                    .addComponent(jLabel26)
                    .addComponent(ePeso2))
                .addGap(16, 16, 16)
                .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(eComida2)
                    .addComponent(jLabel27)
                    .addComponent(eDaño2))
                .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHembraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(eOxigeno2)
                            .addComponent(jLabel28)
                            .addComponent(eVelocidad2)))
                    .addGroup(panelHembraLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelHembraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eVida2)
                            .addComponent(jLabel25))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        JLMacho.setText("MACHO");

        JLHembra.setText("HEMBRA");

        titulo.setText("jLabel3");

        JLMote1.setText("jLabel1");

        JLMote2.setText("JLMote2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboDinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelMacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(JLMacho)
                                .addGap(90, 90, 90)
                                .addComponent(JLMote1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(panelHembra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(JLHembra)
                                .addGap(70, 70, 70)
                                .addComponent(JLMote2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(15, 15, 15)
                .addComponent(ComboDinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLMacho)
                            .addComponent(JLMote1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLHembra)
                            .addComponent(JLMote2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelHembra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void sacarDino(String nombre) throws SQLException{
              
     
          
                     
}
    
    private void ComboDinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDinosActionPerformed
         
             
             if (ComboDinos.getSelectedIndex()!=0) {
                 try {
                     panelMacho.setVisible(true);
                     panelHembra.setVisible(true);
                     JLMacho.setVisible(true);
                     JLHembra.setVisible(true);
                     cn =mysql.Conectar();
                      String nombre =String.valueOf(ComboDinos.getSelectedItem());
                      String dinoMacho="Select Nombre,Mote,sexo,stamina,comida,oxigeno,peso,daño,velocidad,vida from dinos Where Sexo ='Macho' AND Nombre ='"+nombre+"' AND TOP= 1;";
                      String dinoHembra="Select Nombre,Mote,sexo,stamina,comida,oxigeno,peso,daño,velocidad,vida from dinos Where sexo ='Hembra' AND Nombre ='"+nombre+"' AND TOP= 1;";
                        PreparedStatement DinoMacho =cn.prepareStatement(dinoMacho);
                        PreparedStatement DinoHembra= cn.prepareStatement(dinoHembra);    
                        
                     try {
                         ResultSet rsMacho = DinoMacho.executeQuery();
                         if (rsMacho.next()) {
                             JLMote1.setText(rsMacho.getString("Mote"));
                             eStamina1.setText(String.valueOf(rsMacho.getInt("stamina")));
                             eComida1.setText(String.valueOf(rsMacho.getString("comida")));
                             eOxigeno1.setText(String.valueOf(rsMacho.getString("oxigeno")));
                             ePeso1.setText(String.valueOf(rsMacho.getString("peso")));
                             eDaño1.setText(String.valueOf(rsMacho.getString("daño")));
                             eVelocidad1.setText(String.valueOf(rsMacho.getString("velocidad")));
                             eVida1.setText(String.valueOf(rsMacho.getString("vida")));
                         }
                         ResultSet rsHembra = DinoHembra.executeQuery();
                         if (rsHembra.next()) {
                             JLMote2.setText(rsMacho.getString("Mote"));
                             eStamina2.setText(rsMacho.getString("stamina"));
                             eComida2.setText(rsMacho.getString("comida"));
                             eOxigeno2.setText(rsMacho.getString("oxigeno"));
                             ePeso2.setText(rsMacho.getString("peso"));
                             eDaño2.setText(rsMacho.getString("daño"));
                             eVelocidad2.setText(rsMacho.getString("velocidad"));
                             eVida2.setText(rsMacho.getString("vida"));
                         }else{
                      panelHembra.setVisible(false);
                          JLHembra.setVisible(false);
                          JLMote2.setVisible(false);
                         }
                     } catch (SQLException ex) {
                         Logger.getLogger(VentanaServer.class.getName()).log(Level.SEVERE, null, ex);
                         
                         
                         
                         
                     }
                     
                     
                 } catch (SQLException ex) {
             Logger.getLogger(VentanaServer.class.getName()).log(Level.SEVERE, null, ex);
             
             
             
             
         }
                 
                 
             }
        
    }//GEN-LAST:event_ComboDinosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDinos;
    private javax.swing.JLabel JLHembra;
    private javax.swing.JLabel JLMacho;
    private javax.swing.JLabel JLMote1;
    private javax.swing.JLabel JLMote2;
    private javax.swing.JLabel eComida1;
    private javax.swing.JLabel eComida2;
    private javax.swing.JLabel eDaño1;
    private javax.swing.JLabel eDaño2;
    private javax.swing.JLabel eOxigeno1;
    private javax.swing.JLabel eOxigeno2;
    private javax.swing.JLabel ePeso1;
    private javax.swing.JLabel ePeso2;
    private javax.swing.JLabel eStamina1;
    private javax.swing.JLabel eStamina2;
    private javax.swing.JLabel eVelocidad1;
    private javax.swing.JLabel eVelocidad2;
    private javax.swing.JLabel eVida1;
    private javax.swing.JLabel eVida2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelHembra;
    private javax.swing.JPanel panelMacho;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
