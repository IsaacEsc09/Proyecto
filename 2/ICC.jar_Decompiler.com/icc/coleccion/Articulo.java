package icc.coleccion;

import java.io.Serializable;

public abstract class Articulo implements Serializable {
   String titulo;
   String genero;

   Articulo(String titulo, String genero) {
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
      sb.append("\u001b[1m");
      sb.append("Titulo: ");
      sb.append("\u001b[0m");
      sb.append(this.titulo);
      sb.append("\n");
      sb.append("\u001b[1m");
      sb.append("Genero: ");
      sb.append("\u001b[0m");
      sb.append(this.genero);
      return sb.toString();
   }
}
