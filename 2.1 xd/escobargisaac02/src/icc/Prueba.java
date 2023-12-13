package icc;

import java.util.Scanner;
import icc.colecciones.Discos;
import icc.colecciones.Libros;
import icc.colecciones.Peliculas;
import icc.metodos.Metodos;
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

    public static void main(String[] args) throws IllegalSizeException, RepeatedTitleException {
        Scanner scn = new Scanner(System.in);
        Metodos mt = new Metodos();
        int opcion=0, opcion2=0;

        //Mensajes para el menú.
        String err="Por favor ingresa una opción válida.";
        String ms1="1. Gestionar Libros.\n"+"2. Gestionar Discos.\n"+"3. Gestionar Peliculas.\n"+"0. Salir.\n";
        String msL="1. Consulta por autor.\n"+"2. Consulta por tema.\n"+"3. Consulta por titulo.\n"+"4. Consulta completa.\n" + "5. Añadir libro.\n" + "0. Regresar al menu anterior.\n";
        String msD="1. Consulta por interprete.\n"+"2. Consulta por genero.\n"+"3. Consulta por mas de 10 pistas.\n"+"4. Consulta completa.\n"+"5. Añadir disco.\n"+"0. Regresar al menu anterior.\n";
        String msP="1. Consulta por año.\n"+"2. Consultar actores o actrices que aparezcan en mas de una pelicula.\n"+"3. Consulta por genero.\n"+"4. Consulta completa.\n"+"5. Añadir pelicula.\n"+"0. Regresar al menu anterior.\n";

        Colors.println("Bienvenido, este programa es un gestor de artículos de entretenimiento.",Colors.WHITE+Colors.HIGH_INTENSITY);

        do{
            try{
                opcion=getInt(ms1, err, 0,3);
                String aux;
                switch (opcion) {
                case 1:
                    while (true){
                        opcion2=getInt(msL, err, 0, 5);
                        switch(opcion2){
                            case 1:
                                Colors.println("Ingrese autor a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);
                                aux = scn.next();
                                mt.autor(aux);
                                break;
                            case 2:
                                Colors.println("Ingrese tema a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);
                                aux = scn.next();
                                mt.tema(aux);
                                break;
                            case 3:
                                Colors.println("Ingrese título a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);
                                aux = scn.next();
                                mt.titulo(aux);
                                break;
                            case 4:
                                mt.libros();
                                break;
                            case 5:
                               // mt.agregarLibro(newLibro());
                                break;
                        }

                        if(opcion2==0){
                            break;
                        }

                    }break;
                case 2:
                    while (true){
                        opcion2=getInt(msD, err, 0, 5);
                        switch(opcion2){
                            case 1:
                                Colors.println("Ingrese interprete a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);

                                break;
                            case 2:
                                Colors.println("Ingrese genero a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);

                                break;
                            case 3:
                                
                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                        }

                        if(opcion2==0){
                            break;
                        }

                    }break;
                case 3:
                    while (true){
                        opcion2=getInt(msP, err, 0, 5);
                        switch(opcion2){
                            case 1:
                                Colors.println("Ingrese año a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);

                                break;
                            case 2:
                                Colors.println("Ingrese genero a buscar.",Colors.WHITE+Colors.HIGH_INTENSITY);

                                break;
                            case 3:
                                
                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                        }

                        if(opcion2==0){
                            break;
                        }

                    }break;

                default:
                    Colors.println("Vuelve pronto. :)", Colors.BLUE+Colors.HIGH_INTENSITY);
                    break;  
                }

            } catch (Exception var14) {
            System.out.print("No se pudo realizar accion: ");
            Colors.println(var14.getMessage(),Colors.RED+Colors.HIGH_INTENSITY);
         }

        }while(opcion != 0);

    }
}
