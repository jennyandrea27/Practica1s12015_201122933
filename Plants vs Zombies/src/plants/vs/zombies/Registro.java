/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plants.vs.zombies;
/**
 *
 * @author Jenny
 */
public class Registro extends javax.swing.JFrame {
    String tipo;
    /**
     * Creates new form SeleccionZ
     */
    public Registro(String tipo) {
        this.tipo = tipo;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        bExtra = new javax.swing.JButton();
        tfExtra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("INGRESAR DATOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 160, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 110, 49, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 150, 52, 17);

        tfNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfNombre);
        tfNombre.setBounds(190, 100, 141, 23);

        tfCantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfCantidad);
        tfCantidad.setBounds(190, 140, 141, 23);

        bExtra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bExtra.setText("Agregar Campo");
        getContentPane().add(bExtra);
        bExtra.setBounds(194, 224, 121, 25);

        tfExtra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfExtra);
        tfExtra.setBounds(70, 225, 100, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Campo Extra:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 196, 77, 17);

        bGuardar.setText("GUARDAR");
        getContentPane().add(bGuardar);
        bGuardar.setBounds(240, 266, 81, 23);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(331, 266, 61, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExtra;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfExtra;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}