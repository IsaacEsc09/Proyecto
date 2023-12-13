package icc.colecciones;

public class Libros extends Articulos {
   String autor;
   String tema;

   public Libros(String titulo, String genero, String autor, String tema) {
      super(titulo, genero);
      this.autor = autor;
      this.tema = tema;
   }

   public String toFile() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toFile());
      sb.append(",");
      sb.append(this.autor);
      sb.append(",");
      sb.append(this.tema);
      return sb.toString();
   }

   public boolean autor(String aux) {
      return this.autor.equals(aux);
   }

   public boolean tema(String aux) {
      return this.tema.equals(aux);
   }

   public boolean titulo(String aux) {
      return super.titulo.equals(aux);
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString());
      sb.append("\n");
      sb.append("Autor: ");
      sb.append(this.autor);
      sb.append("\n");
      sb.append("Tema: ");
      sb.append(this.tema);
      return sb.toString();
   }
}
