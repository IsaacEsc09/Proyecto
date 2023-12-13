package icc.metodos;

import icc.colecciones.Discos;
import icc.colecciones.Libros;
import icc.colecciones.Peliculas;
import icc.excepciones.IllegalSizeException;
import icc.excepciones.RepeatedTitleException;
import icc.files.ReaderWriter;

public class Metodos  {
	 private static final int SIZE = 32;
   Libros[] LIBROS;
   Discos[] DISCOS;
   Peliculas[] PELICULAS;
   String fLibro = "libros.csv";
   String fDisco = "discos.csv";
   String fPelicula = "peliculas.csv";
   int index_l;
   int index_d;
   int index_p;

   public Metodos() throws IllegalSizeException {
      String s = "";
      s = s + this.loadLibros();
      s = s + this.loadDiscos();
      s = s + this.loadPeliculas();
      System.out.println(s);
   }

   public String loadLibros() {
      StringBuilder sb = new StringBuilder();
      String[] l = ReaderWriter.read(this.fLibro);
      this.LIBROS = new Libros[32];
      this.index_l = 0;

      for(int i = 0; i < l.length; ++i) {
         String[] array = l[i].split(",");
         Libros art = new Libros(array[0], array[1], array[2], array[3]);
         if (i > 32) {
            sb.append("Capacidad de libros maxima alcanzada (" + l.length + ").\n");
            break;
         }

         boolean repetido = false;

         for(int j = 0; j < this.index_l; ++j) {
            if (this.LIBROS[j].same(array[0])) {
               sb.append("Titulo repetido: " + array[0] + "\n");
               repetido = true;
               break;
            }
         }

         if (!repetido) {
            this.LIBROS[this.index_l++] = art;
         }
      }

      return sb.toString();
   }

   public String loadDiscos() {
      StringBuilder sb = new StringBuilder();
      String[] l = ReaderWriter.read(this.fDisco);
      this.DISCOS = new Discos[32];
      this.index_d = 0;

      for(int i = 0; i < l.length; ++i) {
         String[] array = l[i].split(",");
         Discos art = new Discos(array[0], array[1], array[2], Integer.parseInt(array[3]));
         if (i > 32) {
            sb.append("Capacidad de discos maxima alcanzada (" + l.length + ").\n");
            break;
         }

         boolean repetido = false;

         for(int j = 0; j < this.index_d; ++j) {
            if (this.DISCOS[j].same(array[0])) {
               sb.append("Titulo repetido: " + array[0] + "\n");
               repetido = true;
               break;
            }
         }

         if (!repetido) {
            this.DISCOS[this.index_d++] = art;
         }
      }

      return sb.toString();
   }

   public String loadPeliculas() {
      StringBuilder sb = new StringBuilder();
      String[] l = ReaderWriter.read(this.fPelicula);
      this.PELICULAS = new Peliculas[32];
      this.index_p = 0;

      for(int i = 0; i < l.length; ++i) {
         String[] array = l[i].split(",");
         Peliculas art = new Peliculas(array[0], array[1], array[2], Integer.parseInt(array[3]));
         if (i > 32) {
            sb.append("Capacidad de peliculas maxima alcanzada (" + l.length + ").\n");
            break;
         }

         boolean repetido = false;

         for(int j = 0; j < this.index_p; ++j) {
            if (this.PELICULAS[j].same(array[0])) {
               sb.append("Titulo repetido: " + array[0] + "\n");
               repetido = true;
               break;
            }
         }

         if (!repetido) {
            this.PELICULAS[this.index_p++] = art;
         }
      }

      return sb.toString();
   }

   public void libros() {
      for(int i = 0; i < this.index_l; ++i) {
         System.out.println(this.LIBROS[i]);
         System.out.println();
      }

   }

   public void discos() {
      for(int i = 0; i < this.index_d; ++i) {
         System.out.println(this.DISCOS[i]);
         System.out.println();
      }

   }

   public void peliculas() {
      for(int i = 0; i < this.index_p; ++i) {
         System.out.println(this.PELICULAS[i]);
         System.out.println();
      }

   }

   public void containsLibro(String s) throws RepeatedTitleException {
      for(int i = 0; i < this.index_l; ++i) {
         if (this.LIBROS[i].same(s)) {
            throw new RepeatedTitleException("Titulo repetido: " + s);
         }
      }

   }

   public void agregarLibro(Libros l) throws IllegalSizeException {
      if (this.index_l >= 32) {
         throw new IllegalSizeException("Capacidad maxima alcanzada.");
      } else {
         ReaderWriter.write(l.toFile(), this.fLibro);
         this.LIBROS[this.index_l++] = l;
      }
   }

   public void containsDisco(String s) throws RepeatedTitleException {
      for(int i = 0; i < this.index_d; ++i) {
         if (this.DISCOS[i].same(s)) {
            throw new RepeatedTitleException("Titulo repetido: " + s);
         }
      }

   }

   public void agregarDisco(Discos d) throws IllegalSizeException {
      if (this.index_d >= 32) {
         throw new IllegalSizeException("Capacidad maxima alcanzada.");
      } else {
         ReaderWriter.write(d.toFile(), this.fDisco);
         this.DISCOS[this.index_d++] = d;
      }
   }

   public void containsPelicula(String s) throws RepeatedTitleException {
      for(int i = 0; i < this.index_p; ++i) {
         if (this.PELICULAS[i].same(s)) {
            throw new RepeatedTitleException("Titulo repetido: " + s);
         }
      }

   }

   public void agregarPelicula(Peliculas p) throws IllegalSizeException {
      if (this.index_p >= 32) {
         throw new IllegalSizeException("Capacidad maxima alcanzada.");
      } else {
         ReaderWriter.write(p.toFile(), this.fPelicula);
         this.PELICULAS[this.index_p++] = p;
      }
   }

   public void autor(String aux) {
      for(int i = 0; i < this.index_l; ++i) {
         if (this.LIBROS[i].autor(aux)) {
            System.out.println(this.LIBROS[i]);
            System.out.println();
         }
      }

   }

   public void tema(String aux) {
      for(int i = 0; i < this.index_l; ++i) {
         if (this.LIBROS[i].tema(aux)) {
            System.out.println(this.LIBROS[i]);
            System.out.println();
         }
      }

   }

   public void titulo(String aux) {
      for(int i = 0; i < this.index_l; ++i) {
         if (this.LIBROS[i].titulo(aux)) {
            System.out.println(this.LIBROS[i]);
            System.out.println();
         }
      }

   }

   public void interprete(String aux) {
      for(int i = 0; i < this.index_d; ++i) {
         if (this.DISCOS[i].interprete(aux)) {
            System.out.println(this.DISCOS[i]);
            System.out.println();
         }
      }

   }

   public void genero(String aux) {
      for(int i = 0; i < this.index_d; ++i) {
         if (this.DISCOS[i].genero(aux)) {
            System.out.println(this.DISCOS[i].interprete());
            System.out.println();
         }
      }

   }

   public void pistas() {
      for(int i = 0; i < this.index_d; ++i) {
         if (this.DISCOS[i].pistas()) {
            System.out.println(this.DISCOS[i]);
            System.out.println();
         }
      }

   }

   public void fecha(int aux) {
      for(int i = 0; i < this.index_p; ++i) {
         if (this.PELICULAS[i].fecha(aux)) {
            System.out.println(this.PELICULAS[i]);
            System.out.println();
         }
      }

   }

   public void actores() {
      String[] actores = new String[this.index_p];
      boolean[] b = new boolean[this.index_p];

      int i;
      for(i = 0; i < this.index_p; ++i) {
         actores[i] = this.PELICULAS[i].actor();
      }

      for(i = 0; i < actores.length; ++i) {
         if (!b[i]) {
            for(int j = i + 1; j < actores.length; ++j) {
               if (actores[i].equals(actores[j])) {
                  b[i] = true;
                  b[j] = true;
               }
            }
         }
      }

      for(i = 0; i < actores.length; ++i) {
         if (b[i]) {
            System.out.println(this.PELICULAS[i]);
            System.out.println();
         }
      }

   }

   public void generoP(String aux) {
      for(int i = 0; i < this.index_p; ++i) {
         if (this.PELICULAS[i].genero(aux)) {
            System.out.println(this.PELICULAS[i]);
            System.out.println();
         }
      }

   }
	
}