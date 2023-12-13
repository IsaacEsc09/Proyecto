package icc.colecciones;

import java.io.Serializable;

public abstract class Articulos implements Serializable {
   
   String titulo;
   String genero;

   Articulos(String titulo, String genero) {
      this.titulo = titulo;
      this.genero = genero;
   }

   public String toFile() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.titulo);
      sb.append(",");
      sb.append(this.genero);
      return sb.toString();
   }

   public boolean genero(String aux) {
      return this.genero.equals(aux);
   }

   public boolean same(String s) {
      return this.titulo.equals(s);
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Titulo: ");
      sb.append(this.titulo);
      sb.append("\n");
      sb.append("Genero: ");
      sb.append(this.genero);
      return sb.toString();
   }
}
