package icc;

import icc.equipos.Calendarizacion;
import icc.colors.Colors;
import java.util.Scanner;

public class Prueba {

    public static int getInt(String mensaje, String error, int min, int max) {
        Scanner scn = new Scanner(System.in);
        int val;

        while (true) {
            System.out.println(mensaje);
            if (scn.hasNextInt()) {
                val = scn.nextInt();
                if (val >= min && val <= max) {
                    break;
                }
            } else {
                scn.next();
            }
            System.out.println(error);
        }
        return val;
    }

    public static void main(String[] args) {
        Colors.println("Bienvenido, este programa es un simulador de un torneo Round-Robin de vóleybol.");

        String error = "Por favor, ingresa una opción válida.";
        int numeroEquipos = getInt("¿De cuántos equipos consiste tu simulación? (2, inf)", error, 2, Integer.MAX_VALUE);

        String[] nombresEquipos = new String[numeroEquipos];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < numeroEquipos; ++i) {
            Colors.println("Ingresa el nombre del equipo ");
            nombresEquipos[i] = scn.next();
        }

        Calendarizacion calendario = new Calendarizacion(nombresEquipos);

        int opcion;
        do {
            System.out.println("1. Consultar puntuaciones."+
                               "2. Continuar simulación."+
                               "0. Salir.");
            opcion = getInt(error, error, 0, 2);

            switch (opcion) {
                case 1:
                    calendario.consultar();
                    break;
                case 2:
                    if (calendario.simular()) {
                        System.out.println("El torneo ha terminado. Los puntajes finales son:");
                        calendario.consultar();
                        opcion = -1;
                    }
                    break;
                default:
                    Colors.println("Vuelve pronto.");
            }
        } while (opcion != 0 && opcion != -1);

        if (opcion == -1) {
            Colors.println("El torneo ha finalizado.");

            System.out.println("1. Consultar todas las puntuaciones."+
                                "2. Consultar puntuación de un equipo en particular."+
                                "3. Ver campeón."+
                                "0. Salir.");

            String[] nombresEquiposConsulta = calendario.equipos();
            System.out.println("Elige el equipo a consultar:");

            for (int i = 0; i < nombresEquiposConsulta.length; ++i) {
                System.out.println(i + ". " + nombresEquiposConsulta[i]);
            }

            do {
                opcion = getInt(error, error, 0, 3);

                switch (opcion) {
                    case 1:
                        calendario.consultar();
                        break;
                    case 2:
                        int numEquipo = getInt("Selecciona el número de equipo a consultar:", error, 0, nombresEquiposConsulta.length - 1);
                        calendario.mostrar(numEquipo);
                        break;
                    case 3:
                        calendario.campeon();
                        break;
                    default:
                        Colors.println("Vuelve pronto.");
                }
            } while (opcion != 0);
        }
    }
}
