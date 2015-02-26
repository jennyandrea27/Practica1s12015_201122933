/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants.vs.zombies;
import Listas.Personaje;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static plants.vs.zombies.InicioPVZ.*;

/**
 *
 * @author Jenny
 */
public class Juego extends javax.swing.JFrame implements Runnable{    
    int x;
    int y;   
    public static LinkedList<Personaje> ColaP=new LinkedList<Personaje>();
    public static Stack<Personaje> PilaZ=new Stack<Personaje>();
    public static Thread hilo=new Thread();
    public static int contplantas=5;
    public static int contzombies=5;
   
    
    /** Creates new form Juego */
    public Juego(int x,int y) {   
        initComponents();
        this.x=x;
        this.y=y;
        int posx=0;
        int posy=0;
        //Graficar campo de juego
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
        //Recorrer lista Plantas
//        int xp=0;
//        int yp=0;
//        Iterator i=CPlantas.iterator();
//        while(i.hasNext())
//        {
//            Personaje plantatemp=(Personaje) i.next();
//            JLabel lp=new JLabel(plantatemp.getImagen());
//            lp.setBounds(xp, yp, 75, 75);
//            jpPlantas.add(lp);
//            jpPlantas.repaint();
//            xp+=80;
//        }
        
        //Recorrer lista zombies
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

        jpPlantas.setBackground(new java.awt.Color(168, 241, 134));
        jpPlantas.setLayout(null);
        getContentPane().add(jpPlantas);
        jpPlantas.setBounds(10, 10, 110, 640);

        jpZombies.setBackground(new java.awt.Color(168, 241, 134));
        jpZombies.setLayout(null);
        getContentPane().add(jpZombies);
        jpZombies.setBounds(900, 10, 110, 640);

        jpJuego.setBackground(new java.awt.Color(168, 241, 134));
        jpJuego.setLayout(null);
        getContentPane().add(jpJuego);
        jpJuego.setBounds(130, 30, 750, 600);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoverde.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1420, 800);

        setSize(new java.awt.Dimension(1064, 707));
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
    public static javax.swing.JPanel jpPlantas;
    public static javax.swing.JPanel jpZombies;
    // End of variables declaration//GEN-END:variables

    void HiloCola(JPanel jpanel)
    {
        int tamp=InicioPVZ.CPlantas.size();            
        int posp=(int)(Math.random()*100)%tamp;            
        ColaP.add(InicioPVZ.CPlantas.get(posp));
        jpPlantas.removeAll();
        int posy=0;
            
        Iterator ip=ColaP.iterator();
        while(ip.hasNext())
        {           
            Personaje temp=(Personaje)ip.next();
            ImageIcon iplanta=new ImageIcon(temp.getImagen());
            JLabel lp=new JLabel(iplanta);
            lp.setBounds(0, posy, 75, 75);
            jpPlantas.add(lp);  
            posy+=80;
        }
        jpPlantas.repaint();
    }
    void HiloPila(JPanel jpanel)
    {
        int tamz=InicioPVZ.CZombie.size();            
        int posz=(int)(Math.random()*100)%tamz;            
        PilaZ.add(InicioPVZ.CZombie.get(posz));
        jpZombies.removeAll();
        int posy=0;
            
        Iterator iz=PilaZ.iterator();
        while(iz.hasNext())
        {           
            Personaje temp=(Personaje)iz.next();
            ImageIcon izombie=new ImageIcon(temp.getImagen());
            JLabel lz=new JLabel(izombie);
            lz.setBounds(0, posy, 75, 75);
            jpZombies.add(lz);  
            posy+=80;
        }
        jpZombies.repaint();   
    }
    
    @Override
    public void run() {
                              
        try
            {    
                hilo.sleep(5000);

            }
        catch(InterruptedException ex)
        {

        }
            //Insercion plantas                      
        int cantidadp=Integer.parseInt(InicioPVZ.Jugadores.get(0).get(1).toString());

        while(contplantas<cantidadp)
        {
            HiloCola(jpPlantas);
            HiloPila(jpZombies);

            contplantas+=1; 
            try
            {    
                hilo.sleep(5000);
            }
            catch(InterruptedException ex)
            {

            }
        }
        
    }
}
