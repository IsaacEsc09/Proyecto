package icc.coleccion;

public class Disco extends Articulo {
   String interprete;
   int pistas;

   public Disco(String titulo, String genero, String interprete, int pistas) {
      super(titulo, genero);
      this.interprete = interprete;
      this.pistas = pistas;
   }

   public String toFile() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toFile());
      sb.append(",");
      sb.append(this.interprete);
      sb.append(",");
      sb.append(this.pistas);
      return sb.toString();
   }

   public boolean interprete(String aux) {
      return this.interprete.equals(aux);
   }

   public boolean pistas() {
      return this.pistas >= 10;
   }

   public String interprete() {
      return this.interprete;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString());
      sb.append("\n");
      sb.append("\u001b[1m");
      sb.append("Interprete: ");
      sb.append("\u001b[0m");
      sb.append(this.interprete);
      sb.append("\n");
      sb.append("\u001b[1m");
      sb.append("Numero de pistas: ");
      sb.append("\u001b[0m");
      sb.append(this.pistas);
      return sb.toString();
   }
}
