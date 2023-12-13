package icc.colors;

public class Colors {
   public static final String BLACK = "\u001b[0;30m";
   public static final String RED = "\u001b[0;31m";
   public static final String GREEN = "\u001b[0;32m";
   public static final String YELLOW = "\u001b[0;33m";
   public static final String BLUE = "\u001b[0;34m";
   public static final String MAGENTA = "\u001b[0;35m";
   public static final String CYAN = "\u001b[0;36m";
   public static final String WHITE = "\u001b[0;37m";
   public static final String RESTORE = "\u001b[0m";
   public static final String HIGH_INTENSITY = "\u001b[1m";
   public static final String LOW_INTENSITY = "\u001b[2m";
   public static final String ITALICS = "\u001b[3m";
   public static final String UNDERLINE = "\u001b[4m";
   public static final String BLINK = "\u001b[5m";
   public static final String FAST_BLINK = "\u001b[6m";
   public static final String REVERSE = "\u001b[7m";
   public static final String INVISIBLE_TEXT = "\u001b[8m";
   public static final String BGD_BLACK = "\u001b[0;40m";
   public static final String BGD_RED = "\u001b[0;41m";
   public static final String BGD_GREEN = "\u001b[0;42m";
   public static final String BGD_YELLOW = "\u001b[0;43m";
   public static final String BGD_BLUE = "\u001b[0;44m";
   public static final String BGD_MAGENTA = "\u001b[0;45m";
   public static final String BGD_CYAN = "\u001b[0;46m";
   public static final String BGD_WHITE = "\u001b[0;47m";

   public static final void println(Object s, String format) {
      System.out.println(format + s + "\u001b[0m");
   }

   public static final void print(Object s, String format) {
      System.out.print(format + s + "\u001b[0m");
   }
}
