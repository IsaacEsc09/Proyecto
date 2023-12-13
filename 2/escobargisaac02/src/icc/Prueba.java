package icc;

import java.util.Scanner;
import icc.colecciones.Discos;
import icc.colecciones.Libros;
import icc.colecciones.Peliculas;
import icc.excepciones.IllegalSizeException;
import icc.excepciones.RepeatedTitleException;
import icc.colors.Colors;

public class Prueba {

	public static int getInt(String mensaje, String error, int min, int max) {
        int val = 0;
        String s;
        Scanner scn = new Scanner(System.in);

        boolean continuar;

        do {
            try {
                Colors.println(mensaje, Colors.HIGH_INTENSITY);
                s = scn.next();
                val = Integer.parseInt(s);
                // (-infinito, min) || (max, infinito)
                if (val < min || max < val) {
                    throw new NumberFormatException();
                } else {
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                continuar = true;
                scn.reset();
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
            }
        } while (continuar);

        return val;
    }

    public static void main (String args[]) throws IllegalSizeException, RepeatedTitleException{
        int opcion;

        Colors.println("Bienvenido este programa es un gestor de articulos de entretenimiento.", Colors.WHITE+Colors.HIGH_INTENSITY);


    }
    
}
