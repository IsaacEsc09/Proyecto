package icc.coleccion;

public class Libro extends Articulo {
   String autor;
   String tema;

   public Libro(String titulo, String genero, String autor, String tema) {
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
      sb.append("\u001b[1m");
      sb.append("Autor: ");
      sb.append("\u001b[0m");
      sb.append(this.autor);
      sb.append("\n");
      sb.append("\u001b[1m");
      sb.append("Tema: ");
      sb.append("\u001b[0m");
      sb.append(this.tema);
      return sb.toString();
   }
}
