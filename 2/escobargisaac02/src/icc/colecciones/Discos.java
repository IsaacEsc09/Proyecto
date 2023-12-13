package icc.colecciones;

public class Discos extends Articulos {
   String interprete;
   int pistas;

   public Discos(String titulo, String genero, String interprete, int pistas) {
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
      sb.append("Interprete: ");
      sb.append(this.interprete);
      sb.append("\n");
      sb.append("Numero de pistas: ");
      sb.append(this.pistas);
      return sb.toString();
   }
}
