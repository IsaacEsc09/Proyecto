package icc;

import icc.coleccion.Disco;
import icc.coleccion.Libro;
import icc.coleccion.Pelicula;
import icc.colors.Colors;
import icc.excepciones.IllegalSizeException;
import icc.excepciones.RepeatedTitleException;
import icc.gestor.Gestor;
import java.util.Scanner;

public class Prueba {
   public static int getInt(String mensaje, String error, int min, int max) {
      Scanner scn = new Scanner(System.in);

      while(true) {
         while(true) {
            System.out.println(mensaje);
            if (scn.hasNextInt()) {
               int val = scn.nextInt();
               if (val >= min && max >= val) {
                  return val;
               }

               System.out.println(error);
            } else {
               scn.next();
               System.out.println(error);
            }
         }
      }
   }

   public static Libro newLibro(Gestor g) throws RepeatedTitleException {
      Scanner scn = new Scanner(System.in);
      System.out.println("Ingrese el titulo del libro.");
      String titulo = scn.next();
      g.containsLibro(titulo);
      System.out.println("Ingrese el genero del libro.");
      String genero = scn.next();
      System.out.println("Ingrese el autor del libro.");
      String autor = scn.next();
      System.out.println("Ingrese el tema del libro.");
      String tema = scn.next();
      return new Libro(titulo, genero, autor, tema);
   }

   public static Disco newDisco(Gestor g) throws RepeatedTitleException {
      Scanner scn = new Scanner(System.in);
      System.out.println("Ingrese el titulo del disco.");
      String titulo = scn.next();
      g.containsDisco(titulo);
      System.out.println("Ingrese el genero del disco.");
      String genero = scn.next();
      System.out.println("Ingrese el interprete del disco.");
      String interprete = scn.next();
      int pistas = getInt("Ingrese el numero de pistas del disco.", "Por favor ingresa una opcion valida.", 0, Integer.MAX_VALUE);
      return new Disco(titulo, genero, interprete, pistas);
   }

   public static Pelicula newPelicula(Gestor g) throws RepeatedTitleException {
      Scanner scn = new Scanner(System.in);
      System.out.println("Ingrese el titulo de la pelicula.");
      String titulo = scn.next();
      g.containsPelicula(titulo);
      System.out.println("Ingrese el genero de la pelicula.");
      String genero = scn.next();
      System.out.println("Ingrese el actor o actriz principal  de la pelicula.");
      String actor = scn.next();
      int fecha = getInt("Ingrese el año de filmacion de la pelicula.", "Por favor ingresa una opcion valida.", 0, Integer.MAX_VALUE);
      return new Pelicula(titulo, genero, actor, fecha);
   }

   public static void main(String[] args) throws IllegalSizeException, RepeatedTitleException {
      Colors.println("Bienvenido este programa es un gestor de articulos de entretenimiento.", "\u001b[1m");
      String error = "Por favor ingresa una opcion valida.";
      StringBuilder sb = new StringBuilder();
      sb.append("\u001b[1m");
      sb.append("1. Gestionar Libros.\n");
      sb.append("2. Gestionar Discos.\n");
      sb.append("3. Gestionar Peliculas.\n");
      sb.append("0. Salir.\n");
      sb.append("\u001b[0m");
      String mensajePrincipal = sb.toString();
      sb = new StringBuilder();
      sb.append("\u001b[1m");
      sb.append("1. Consulta por autor.\n");
      sb.append("2. Consulta por tema.\n");
      sb.append("3. Consulta por titulo.\n");
      sb.append("4. Consulta completa.\n");
      sb.append("5. Añadir libro.\n");
      sb.append("0. Regresar al menu anterior.\n");
      sb.append("\u001b[0m");
      String mensajeLibros = sb.toString();
      sb = new StringBuilder();
      sb.append("\u001b[1m");
      sb.append("1. Consulta por interprete.\n");
      sb.append("2. Consulta por genero.\n");
      sb.append("3. Consulta por mas de 10 pistas.\n");
      sb.append("4. Consulta completa.\n");
      sb.append("5. Añadir disco.\n");
      sb.append("0. Regresar al menu anterior.\n");
      sb.append("\u001b[0m");
      String mensajeDiscos = sb.toString();
      sb = new StringBuilder();
      sb.append("\u001b[1m");
      sb.append("1. Consulta por año.\n");
      sb.append("2. Consultar actores o actrices que aparezcan en mas de una pelicula.\n");
      sb.append("3. Consulta por genero.\n");
      sb.append("4. Consulta completa.\n");
      sb.append("5. Añadir pelicula.\n");
      sb.append("0. Regresar al menu anterior.\n");
      sb.append("\u001b[0m");
      String mensajePeliculas = sb.toString();
      Scanner scn = new Scanner(System.in);
      int opcion = -1;
      Gestor g = new Gestor();

      label60:
      do {
         try {
            opcion = getInt(mensajePrincipal, error, 0, 3);
            int secundaria;
            String aux;
            switch(opcion) {
            case 1:
               while(true) {
                  secundaria = getInt(mensajeLibros, error, 0, 5);
                  switch(secundaria) {
                  case 1:
                     System.out.println("Ingrese autor a buscar.");
                     aux = scn.next();
                     g.autor(aux);
                     break;
                  case 2:
                     System.out.println("Ingrese tema a buscar.");
                     aux = scn.next();
                     g.tema(aux);
                     break;
                  case 3:
                     System.out.println("Ingrese titulo a buscar.");
                     aux = scn.next();
                     g.titulo(aux);
                     break;
                  case 4:
                     g.libros();
                     break;
                  case 5:
                     g.agregarLibro(newLibro(g));
                  }

                  if (secundaria == 0) {
                     continue label60;
                  }
               }
            case 2:
               while(true) {
                  secundaria = getInt(mensajeDiscos, error, 0, 5);
                  switch(secundaria) {
                  case 1:
                     System.out.println("Ingrese interprete a buscar.");
                     aux = scn.next();
                     g.interprete(aux);
                     break;
                  case 2:
                     System.out.println("Ingrese genero a buscar.");
                     aux = scn.next();
                     g.genero(aux);
                     break;
                  case 3:
                     g.pistas();
                     break;
                  case 4:
                     g.discos();
                     break;
                  case 5:
                     g.agregarDisco(newDisco(g));
                  }

                  if (secundaria == 0) {
                     continue label60;
                  }
               }
            case 3:
               while(true) {
                  secundaria = getInt(mensajePeliculas, error, 0, 5);
                  switch(secundaria) {
                  case 1:
                     g.fecha(getInt("Ingrese año a buscar.", error, 0, 2022));
                     break;
                  case 2:
                     g.actores();
                     break;
                  case 3:
                     System.out.println("Ingrese genero a buscar.");
                     aux = scn.next();
                     g.generoP(aux);
                     break;
                  case 4:
                     g.peliculas();
                     break;
                  case 5:
                     g.agregarPelicula(newPelicula(g));
                  }

                  if (secundaria == 0) {
                     continue label60;
                  }
               }
            default:
               Colors.println("Vuelve pronto.", "\u001b[0;34m\u001b[1m");
            }
         } catch (Exception var14) {
            System.out.print("No se pudo realizar accion: ");
            Colors.println(var14.getMessage(), "\u001b[0;31m\u001b[1m");
         }
      } while(opcion != 0);

   }
}
