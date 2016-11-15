package javaapplication25;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class render extends DefaultTableCellRenderer {

    short[][] matriz2 = laberinto.matriz;
    int sw=laberinto.sw;
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
         
        if (matriz2[row][column] == 0 || matriz2[row][column] == 9) {
            this.setBackground(Color.WHITE);
            this.setOpaque(true);

        } else if (matriz2[row][column] == 2) {
            this.setBackground(Color.BLACK);
            this.setOpaque(true);
        }else if(matriz2[row][column] == 7  ){
            this.setBackground(Color.GRAY);
            this.setOpaque(true);
        }else if(matriz2[row][column] == 4){
            this.setBackground(Color.GREEN);
            this.setOpaque(true);
        }else {
        this.setBackground(Color.YELLOW);
            this.setOpaque(true);
        }
        return this;
    }
}
