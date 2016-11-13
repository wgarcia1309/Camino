package proyecto_final;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class laberinto extends JFrame {
    
    static Scanner leer = new Scanner(System.in);
    static Random rnd = new Random();
    static short[][] m = new short[12][12];
    static JPanel[][] paneles = new JPanel[12][12];
    public int numero;

    public laberinto() {
        initComponents();
        setSize(600, 622);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Laberinto");
        generar(Integer.parseInt(Proyecto_Final.v1.t1.getText()));
        int x = 0, y = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                JPanel panel = new JPanel();
                panel.setSize(50, 50);
                if (m[i][j] == 0) {
                    panel.setBackground(Color.WHITE);
                    panel.setLocation(y, x);
                    this.add(panel);
                } else if (m[i][j] == 2) {
                    panel.setBackground(Color.RED);
                    panel.setLocation(y, x);
                    this.add(panel);
                }
                System.out.print(m[j][i] + " ");
                x += 50;
            }
            System.out.println("");
            x = 0;
            y += 50;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(196, 15, 63));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        setBounds(0, 0, 579, 340);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(laberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laberinto().setVisible(true);
            }
        });
    }
 public static void generar(int num) {
        int h = 0;
        while (h < num) {
            int x = (int) (rnd.nextDouble() * 12.0);
            int y = (int) (rnd.nextDouble() * 12.0);
            while (m[x][y] == 2) {
                x = (int) (rnd.nextDouble() * 12.0);
                y = (int) (rnd.nextDouble() * 12.0);
            }
            m[x][y] = 2;
            h++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
