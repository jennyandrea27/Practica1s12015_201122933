package plants.vs.zombies;

import Listas.Personaje;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jenny
 */

public class InicioPVZ extends javax.swing.JFrame {
    public static LinkedList <LinkedList> Jugadores=new LinkedList<LinkedList>();
    public static LinkedList <Personaje> CPlantas=new LinkedList<Personaje>();
    public static LinkedList <Personaje> CZombie=new LinkedList<Personaje>();
    /**
     * Creates new form InicioPVZ
     */
    public InicioPVZ() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPlantas = new javax.swing.JButton();
        bZombies = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bComenzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tbX = new javax.swing.JTextField();
        tbY = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        bPlantas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bPlantas.setText("Plantas");
        bPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlantasActionPerformed(evt);
            }
        });
        getContentPane().add(bPlantas);
        bPlantas.setBounds(20, 210, 83, 25);

        bZombies.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bZombies.setText("Zombies");
        bZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZombiesActionPerformed(evt);
            }
        });
        getContentPane().add(bZombies);
        bZombies.setBounds(410, 210, 83, 25);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Bienvenido, seleccione tipo de juego:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 210, 250, 25);

        bComenzar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bComenzar.setText("COMENZAR JUEGO");
        bComenzar.setEnabled(false);
        bComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(bComenzar);
        bComenzar.setBounds(170, 380, 160, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese las dimensiones del campo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 270, 210, 17);

        tbX.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbXActionPerformed(evt);
            }
        });
        getContentPane().add(tbX);
        tbX.setBounds(160, 310, 60, 30);

        tbY.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tbY);
        tbY.setBounds(290, 310, 60, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PVZ.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(515, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlantasActionPerformed
        // TODO add your handling code here:
        bPlantas.setEnabled(false);
        Registro regP=new Registro("p");
        regP.setVisible(true);
        if(!bZombies.isEnabled() && !bPlantas.isEnabled()){
            bComenzar.setEnabled(true);
        }      
        
    }//GEN-LAST:event_bPlantasActionPerformed

    private void bZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZombiesActionPerformed
        // TODO add your handling code here:
        bZombies.setEnabled(false);
        Registro regZ=new Registro("z");
        regZ.setVisible(true);
        if(!bZombies.isEnabled() && !bPlantas.isEnabled()){
            bComenzar.setEnabled(true);
        }
    }//GEN-LAST:event_bZombiesActionPerformed

    private void bComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComenzarActionPerformed
        // TODO add your handling code here:                
        
        int x=Integer.parseInt(tbX.getText());
        int y=Integer.parseInt(tbY.getText());
        if(0<x && x<=10 && 0<y && y<=8){
            Juego juego=new Juego(x,y);
            juego.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Las dimensiones no pueden exceder de 10 x 9");
        }
        
    }//GEN-LAST:event_bComenzarActionPerformed

    private void tbXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbXActionPerformed

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
            java.util.logging.Logger.getLogger(InicioPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPVZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPVZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bComenzar;
    private javax.swing.JButton bPlantas;
    private javax.swing.JButton bZombies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tbX;
    private javax.swing.JTextField tbY;
    // End of variables declaration//GEN-END:variables
}
