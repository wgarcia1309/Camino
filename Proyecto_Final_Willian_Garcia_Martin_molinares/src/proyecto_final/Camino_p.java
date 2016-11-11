package proyecto_final;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JPanel;
import static proyecto_final.laberinto.generar;
import static proyecto_final.laberinto.m;

public class Camino_p {

    public static short[][] CA = new short[144][2];
    public static short[][] CO = new short[144][2];

    public static void main(String[] args) {
        generar(30);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println("");
        }
        Scanner sc =new Scanner(System.in);
        short a=sc.nextShort();
        short b=sc.nextShort();
        rc((short) 0, (short) 11, (short) a, (short) b, CA, (short) 0, CO, (short) 0);
        System.out.println("");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public static void rc(short xi, short ji, short xf, short jf, short va[][], short ta, short vo[][], short to) {
        if (xi == xf && ji == jf) {//meta¿?
            m[xi][ji] = 9;
            CA[ta][0] = xi;
            CA[ta][1] = ji;
            System.out.println("LLegue a la meta");
            for (int i = 0; i <= ta; i++) {
                System.out.println(CA[i][0] + " " + CA[i][1]);
            }
        } else {
            if (ji > 0 && ji<12) {//puedo ir al norte
                if (m[xi][ji] != 2) {//acciones norte
                    m[xi][ji] = 9;
                    CA[ta][0] = xi;
                    CA[ta][1] = ji;
                    rc(xi, --ji, xf, jf, va, ++ta, vo, to);
                }
            }
            if (xi <12 && xi>=0) {//este
                  if (m[xi][ji] != 2) {//acciones este
                    m[xi][ji] = 9;
                    CA[ta][0] = xi;
                    CA[ta][1] = ji;
                    rc(++xi,ji, xf, jf, va, ++ta, vo, to);
                }
            }
            if (xi >=0 && xi <12) { //oeste
                   if (m[xi][ji] != 2) {//acciones este
                    m[xi][ji] = 9;
                    CA[ta][0] = xi;
                    CA[ta][1] = ji;
                    rc(--xi,ji, xf, jf, va, ++ta, vo, to);
                }
            }
            
            if (ji>0 && ji < 12) {//puedo ir al sur
                if (m[xi][ji] != 2) {//acciones sur
                    m[xi][ji] = 9;
                    CA[ta][0] = xi;
                    CA[ta][1] = ji;
                    rc(xi, ++ji, xf, jf, va, ++ta, vo, to);
                }
            }
        }
    }
}
    
