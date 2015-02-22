/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants.vs.zombies;
import Listas.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jenny
 */
public class Juego extends javax.swing.JFrame {
    int x;
    int y;   
    /** Creates new form Juego */
    public Juego(int x,int y) {   
        initComponents();
        this.x=x;
        this.y=y;
        int posx=0;
        int posy=0;
        URL direccion=null;
        ImageIcon icono=null;
        for(int a=1;a<=x;a++){
            for(int b=1;b<=y;b++){
                if(b%2==0)
                {
                    if(a%2==0)
                    {
                        direccion=getClass().getResource("/Imagenes/gblanca.png");
                        icono=new ImageIcon(direccion);  
                    }
                    else
                    {
                        direccion=getClass().getResource("/Imagenes/gverde.png");
                        icono=new ImageIcon(direccion);  
                    }
                }   
                else
                {
                    if(a%2!=0)
                    {
                        direccion=getClass().getResource("/Imagenes/gblanca.png");
                        icono=new ImageIcon(direccion);  
                    }
                    else
                    {
                        direccion=getClass().getResource("/Imagenes/gverde.png");
                        icono=new ImageIcon(direccion);  
                    }
                }
                JLabel temp=new JLabel(icono);
                temp.setBounds(posx, posy , 75, 75);        
                jpJuego.add(temp);
                posy+=75;
            }            
            posy = 0;
            posx+=75;
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPlantas = new javax.swing.JPanel();
        jpZombies = new javax.swing.JPanel();
        jpJuego = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jpPlantas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpPlantasLayout = new javax.swing.GroupLayout(jpPlantas);
        jpPlantas.setLayout(jpPlantasLayout);
        jpPlantasLayout.setHorizontalGroup(
            jpPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        jpPlantasLayout.setVerticalGroup(
            jpPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        getContentPane().add(jpPlantas);
        jpPlantas.setBounds(10, 10, 106, 600);

        jpZombies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpZombiesLayout = new javax.swing.GroupLayout(jpZombies);
        jpZombies.setLayout(jpZombiesLayout);
        jpZombiesLayout.setHorizontalGroup(
            jpZombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpZombiesLayout.setVerticalGroup(
            jpZombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        getContentPane().add(jpZombies);
        jpZombies.setBounds(900, 10, 102, 600);

        javax.swing.GroupLayout jpJuegoLayout = new javax.swing.GroupLayout(jpJuego);
        jpJuego.setLayout(jpJuegoLayout);
        jpJuegoLayout.setHorizontalGroup(
            jpJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jpJuegoLayout.setVerticalGroup(
            jpJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jpJuego);
        jpJuego.setBounds(130, 10, 750, 600);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoverde.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1420, 800);

        setSize(new java.awt.Dimension(1042, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpJuego;
    private javax.swing.JPanel jpPlantas;
    private javax.swing.JPanel jpZombies;
    // End of variables declaration//GEN-END:variables

}
