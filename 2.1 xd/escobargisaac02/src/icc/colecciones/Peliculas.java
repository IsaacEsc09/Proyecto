package icc.colecciones;

public class Peliculas extends Articulos {
   String actor;
   int fecha;

   public Peliculas(String titulo, String genero, String actor, int fecha) {
      super(titulo, genero);
      this.actor = actor;
      this.fecha = fecha;
   }

   public String toFile() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toFile());
      sb.append(",");
      sb.append(this.actor);
      sb.append(",");
      sb.append(this.fecha);
      return sb.toString();
   }

   public boolean fecha(int aux) {
      return this.fecha == aux;
   }

   public String actor() {
      return this.actor;
   }

   public boolean actor(String aux) {
      return this.actor.equals(aux);
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString());
      sb.append("\n");
      sb.append("Actor o actriz principal: ");
      sb.append(this.actor);
      sb.append("\n");
      sb.append("Año de filmacion: ");
      sb.append(this.fecha);
      return sb.toString();
   }
}
