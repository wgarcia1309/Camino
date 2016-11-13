package proyecto_final;

import static proyecto_final.laberinto.m;
import static proyecto_final.laberinto.generar;
public class Path {

    public static short[][] CA = new short[144][2];
    public static short[][] CO = new short[144][2];
    public static short to = (short) 0;

    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = 0;
            }
        }
        m[1][1] = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        rc((short) 0, (short) 0, (short) 2, (short) 1, CA, (short) 0, ' ');
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        if(to==(short)0)System.out.println("No hay camino");
        else{
            System.out.println("El camino Optimo es:");
            for (int i = 0; i <to; i++) {
                System.out.println("Paso " + (i + 1) + " " + CO[i][0] + " " + CO[i][1]);
            }
    }
    }

    static void rc(short xi, short ji, short xf, short jf, short va[][], short ta, char check) {
        if (xi == xf && ji == jf) {//meta¿?
            m[xi][ji] = 9;
            CA[ta][0] = xi;
            CA[ta][1] = ji;
            if (to == (short)0) {
                for (int i = 0; i <=ta; i++) {
                    CO[i][0] = CA[i][0];
                    CO[i][1] = CA[i][1];
                }
                to = (short) (ta + 1);
            }else if(ta<to){
                for (int i = 0; i <=ta; i++) {
                    CO[i][0] = CA[i][0];
                    CO[i][1] = CA[i][1];
                }
                to = (short) (ta + 1);
            }
        } else {
            m[xi][ji] = 9;
            CA[ta][0] = xi;
            CA[ta][1] = ji;
            System.out.println(" "+check);
            //limite inicial+1[v] tamaño final[v]
            if (xi > 0 & xi < 3 && check != 'n') {//puedo ir al norte
                if (m[xi - (short) 1][ji] != 2 && hormigas(CA, ta, (short) (xi - 1), ji) == false) {//acciones norte
                    rc((short)(xi-1), ji, xf, jf, va, (short)(ta+1), 's');
                }
            }
            //limite inicial[h] tamaño final[h]-1
            if (ji >= 0 && ji < 2 && check != 'e') {//este
                if (m[xi][ji + 1] != 2 && hormigas(CA, ta, xi, (short) (ji + 1)) == false) {//acciones este
                    rc(xi, (short)(ji+1), xf, jf, va, (short)(ta+1), 'o');
                }
            }
            //limite inicial[h]+1 tamaño final[h]
            if (ji > 1 && ji < 3 && check != 'o') { //oeste
                if (m[xi][ji - 1] != 2 && hormigas(CA, ta, xi, (short) (ji - 1)) == false) {//acciones oeste
                    rc(xi,(short) (ji - 1), xf, jf, va, (short)(ta+1), 'e');
                }
            }
            //limite inicial tamaño final[v]-1
            
            if (xi >= 0 && xi <2 && check != 's') {//puedo ir al sur
                if (m[xi + 1][ji] != (short)2 && hormigas(CA, ta, (short) (xi + 1), ji) == false) {//acciones sur
                    rc((short)(xi+1), ji, xf, jf, va, (short)(ta+1), 'n');
                }
            }
        }
    }
    static boolean hormigas(short recorrido[][], short pasos, short pi, short pf) {
        for (int i = 0; i < pasos; i++) {
            if (recorrido[i][0] == pi && recorrido[i][1] == pf) {
                return true;
            }
        }
        return false;
    }
}
