/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;
import static proyecto_final.laberinto.m;

/**
 *
 * @author PC
 */
public class Pathi {
     public static short[][] CA = new short[144][2];
    public static short[][] CO = new short[144][2];
    public static short to = (short) 0;

    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = 0;
            }
        }
//        m[2][0]=2;
//        m[1][1]=2;
//        m[0][2]=2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
        short i =0, j = 0,pfi=3,pfj=1;
        char check=' ';
        int sa = 0;
        while (sa == 0) {
            System.out.println(j + "|" + i + "|" + pfi + "|" + pfj);
            //i,j iniciales w,z finales
            if (i == pfi && j == pfj) {
                sa = 1;
            } else {
                if ((i - 1) > -1  && i < 4 && j > -1&& j < 4&& check!='n') {
                    if( m[i - 1][j]!=2){
                        i--;
                        m[i][j] = 9;
                        System.out.println("norte");
                        check='s';
                    }
            } else if ((j + 1) < 4 && i > -1 && j > -1 && i < 4 && check!='e') {
                if( m[i][j + 1]!=2){
                    j++;
                    m[i][j] = 9;
                    System.out.println("este");
                    check='o';
                }
            } else if ((i + 1) < 4 && i > -1 && j > -1 && j < 4 && check!='s') {
                if(m[i + 1][j]!=2){
                    i++;
                    m[i][j] = 9;
                    System.out.println("sur");
                    check='n';
                }
            } else if ((j - 1) > -1 && i > -1 && i < 4 && j < 4 && check!='o') {
                if(m[i][j - 1]!=2){
                j--;
                m[i][j] =9;
                System.out.println("oeste");
                check='e';
                }
            }
        }
        }
    }
}
