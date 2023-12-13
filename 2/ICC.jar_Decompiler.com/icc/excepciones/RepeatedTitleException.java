package icc.excepciones;

public class RepeatedTitleException extends Exception {
   public RepeatedTitleException() {
   }

   public RepeatedTitleException(String message) {
      super(message);
   }
}
