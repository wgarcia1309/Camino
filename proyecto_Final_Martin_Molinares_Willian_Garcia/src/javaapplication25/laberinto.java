package javaapplication25;

import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.Random;
import javax.swing.JOptionPane;

public class laberinto extends javax.swing.JFrame {

    static Random rnd = new Random();
    public static short[][] CA = new short[144][2];
    public static short[][] CO = new short[144][2];
    public static short pif[][] = new short[2][2];
    public static short to = (short) 0;
    static short[][] matriz = new short[12][12];
    static int sw = 0, sw2 = 0, sw3 = 0, x1, x2, y1, y2;

    public laberinto() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Laberinto");
        jTable2.setVisible(false);
        jTable2.getTableHeader().setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        te1 = new javax.swing.JTextField();
        bu1 = new javax.swing.JButton();
        np = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCellSelectionEnabled(true);
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(30);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(1).setMinWidth(30);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(2).setMinWidth(30);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(3).setMinWidth(30);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(4).setMinWidth(30);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(5).setMinWidth(30);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(6).setMinWidth(30);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(6).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(7).setMinWidth(30);
            jTable2.getColumnModel().getColumn(7).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(7).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(8).setMinWidth(30);
            jTable2.getColumnModel().getColumn(8).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(8).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(9).setMinWidth(30);
            jTable2.getColumnModel().getColumn(9).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(9).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(10).setMinWidth(30);
            jTable2.getColumnModel().getColumn(10).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(10).setMaxWidth(30);
            jTable2.getColumnModel().getColumn(11).setMinWidth(30);
            jTable2.getColumnModel().getColumn(11).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(11).setMaxWidth(30);
        }

        te1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                te1KeyTyped(evt);
            }
        });

        bu1.setText("Generar");
        bu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu1ActionPerformed(evt);
            }
        });

        np.setText("N. P");
        np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npActionPerformed(evt);
            }
        });

        jButton1.setText("Camino.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bu1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(te1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(36, 36, 36)
                                .addComponent(np)
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(te1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(np)
                            .addComponent(jButton1))
                        .addGap(1, 1, 1)))
                .addComponent(bu1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu1ActionPerformed
        try {
            int x = Integer.parseInt(te1.getText());
            if (x > 47 && x <= 72) {
                sw = 0;
                sw2 = 0;
                generar(Integer.parseInt(te1.getText()));
                jTable2.updateUI();
                jTable2.setVisible(true);
                jTable2.setDefaultRenderer(Object.class, new render());
            } else {
                JOptionPane.showMessageDialog(null, "Por razones de eficiencia tiene que bloquear entre [48,72]");
            }
        } catch (Exception e) {
            te1.setText("");
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_bu1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int fila = jTable2.rowAtPoint(evt.getPoint());
        int columna = jTable2.columnAtPoint(evt.getPoint());
        if (sw != 1 || sw2 != 1) {
            if (matriz[fila][columna] == 2) {
                JOptionPane.showMessageDialog(null, "Posición invalida");
            } else if (matriz[fila][columna] == 7 || matriz[fila][columna] == 4) {
                JOptionPane.showMessageDialog(null, "Posición invalida");
            } else if (sw == 1) {
                matriz[fila][columna] = 4;
                jTable2.updateUI();
                jTable2.setVisible(true);
                jTable2.setDefaultRenderer(Object.class, new render());
                sw2 = 1;
                x2 = fila;
                y2 = columna;
            } else {
                matriz[fila][columna] = 7;
                jTable2.updateUI();
                jTable2.setVisible(true);
                jTable2.setDefaultRenderer(Object.class, new render());
                sw = 1;
                x1 = fila;
                y1 = columna;
            }
        } else {
            jTable2.updateUI();
            jTable2.setVisible(true);
            jTable2.setDefaultRenderer(Object.class, new render());
            sw3 = 1;
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void te1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_te1KeyTyped
        char v3 = evt.getKeyChar();
        if (v3 == VK_ENTER) {
            if (te1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entradas invalidas");
            } else {
                bu1.doClick();
            }
        }
        if (Character.isLetter(v3)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
    }//GEN-LAST:event_te1KeyTyped

    private void npActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npActionPerformed

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (matriz[i][j] != 2) {
                    matriz[i][j] = 0;
                }
            }
            sw = 0;
            sw2 = 0;
            if (sw3 != 1) {
                jTable2.updateUI();
                jTable2.setVisible(true);
                jTable2.setDefaultRenderer(Object.class, new render());
            }
            matriz[x1][y1] = 0;
            matriz[x2][y2] = 0;
            jTable2.updateUI();
            jTable2.setVisible(true);
            jTable2.setDefaultRenderer(Object.class, new render());
        }
    }//GEN-LAST:event_npActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            to = 0;
            pif[0][0] = cordenada_i(matriz, 7);
            pif[0][1] = cordenada_j(matriz, 7);
            pif[1][0] = cordenada_i(matriz, 4);
            pif[1][1] = cordenada_j(matriz, 4);
            rc(pif[0][0], pif[0][1], pif[1][0], pif[1][1], CA, (short) 0, ' ');
            if (pif[0][0] != -1 && pif[0][1] != -1 && pif[1][0] != -1 && pif[1][1] != -1) {
                if (to == (short) 0) {
                    JOptionPane.showMessageDialog(null, "No hay camino posible");
                } else {
                    for (int i = 1; i < to; i++) {
                        matriz[CO[i][0]][CO[i][1]] = 8;
                    }

                    matriz[pif[0][0]][pif[0][1]] = 7;
                    matriz[pif[1][0]][pif[1][1]] = 4;

                    jTable2.updateUI();
                    jTable2.setVisible(true);
                    jTable2.setDefaultRenderer(Object.class, new render());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Termine de realizar su seleccion");
            JOptionPane.showMessageDialog(null, "El error es:\n" + e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    static short cordenada_i(short v[][], int num) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (matriz[i][j] == num) {
                    return (short) i;
                }
            }
        }
        return -1;
    }

    static short cordenada_j(short v[][], int num) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (matriz[i][j] == num) {
                    return (short) j;
                }
            }
        }
        
        return -1;
    }

    public void generar(int num) {
        int h = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = 0;
            }
        }
        while (h < num) {
            int x = (int) (rnd.nextDouble() * 12.0);
            int y = (int) (rnd.nextDouble() * 12.0);
            while (matriz[y][x] == 2) {
                x = (int) (rnd.nextDouble() * 12.0);
                y = (int) (rnd.nextDouble() * 12.0);
            }
            matriz[y][x] = 2;
            h++;
        }
    }

    static void rc(short xi, short ji, short xf, short jf, short va[][], short ta, char check) {
        if (xi == xf && ji == jf) {//meta¿?
            matriz[xi][ji] = 9;
            CA[ta][0] = xi;
            CA[ta][1] = ji;
            if (to == (short) 0) {
                for (int i = 0; i <= ta; i++) {
                    CO[i][0] = CA[i][0];
                    CO[i][1] = CA[i][1];
                }
                to = (short) (ta + 1);
            } else if (ta < to) {
                for (int i = 0; i <= ta; i++) {
                    CO[i][0] = CA[i][0];
                    CO[i][1] = CA[i][1];
                }
                to = (short) (ta + 1);
            }
        } else {
            matriz[xi][ji] = 9;
            CA[ta][0] = xi;
            CA[ta][1] = ji;
            //limite inicial+1[v] tamaño final[v]
            if (xi > 0 && xi < 12 && check != 'n') {//puedo ir al norte
                if (matriz[xi - (short) 1][ji] != 2 && hormigas(CA, ta, (short) (xi - 1), ji) == false) {//acciones norte
                    rc((short) (xi - 1), ji, xf, jf, va, (short) (ta + 1), 's');
                }
            }
            //limite inicial[h] tamaño final[h]-1
            if (ji >= 0 && ji < 11 && check != 'e') {//este
                if (matriz[xi][ji + 1] != 2 && hormigas(CA, ta, xi, (short) (ji + 1)) == false) {//acciones este
                    rc(xi, (short) (ji + 1), xf, jf, va, (short) (ta + 1), 'o');
                }
            }
            //limite inicial[h]+1 tamaño final[h]
            if (ji >= 1 && ji < 12 && check != 'o') { //oeste
                if (matriz[xi][ji - 1] != 2 && hormigas(CA, ta, xi, (short) (ji - 1)) == false) {//acciones oeste
                    rc(xi, (short) (ji - 1), xf, jf, va, (short) (ta + 1), 'e');
                }
            }
            //limite inicial tamaño final[v]-1

            if (xi >= 0 && xi < 11 && check != 's') {//puedo ir al sur
                if (matriz[xi + 1][ji] != (short) 2 && hormigas(CA, ta, (short) (xi + 1), ji) == false) {//acciones sur
                    rc((short) (xi + 1), ji, xf, jf, va, (short) (ta + 1), 'n');
                }
            }
        }
    }

    static boolean hormigas(short recorrido[][], short pasos, short pi, short pf) {
//        if (indice < pasos) {
//            if (recorrido[indice][0] == pi && recorrido[indice][1] == pf) {
//                return true;
//            }
//            hormigas(recorrido, pasos, pi, pf, (short) (indice + 1));
//        }
//        return false;
        for (int i = 0; i < pasos; i++) {
            if (recorrido[i][0] == pi && recorrido[i][1] == pf) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laberinto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton np;
    private javax.swing.JTextField te1;
    // End of variables declaration//GEN-END:variables
}
