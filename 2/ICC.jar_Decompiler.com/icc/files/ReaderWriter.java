package icc.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ReaderWriter {
   public static String[] read(String fileName) {
      LinkedList<String> l = null;
      BufferedReader in = null;

      String[] var5;
      try {
         in = new BufferedReader(new FileReader(fileName));
         l = new LinkedList();

         String line;
         while((line = in.readLine()) != null) {
            l.add(line);
         }

         return (String[])l.toArray(new String[l.size()]);
      } catch (FileNotFoundException var17) {
         var5 = new String[0];
      } catch (IOException var18) {
         System.out.println(var18);
         return (String[])l.toArray(new String[l.size()]);
      } finally {
         try {
            if (in != null) {
               in.close();
            }
         } catch (IOException var16) {
            System.out.println(var16);
         }

      }

      return var5;
   }

   public static void write(String articulo, String fileName) {
      FileWriter out = null;

      try {
         out = new FileWriter(fileName, true);
         out.write(articulo);
         out.write("\n");
      } catch (IOException var12) {
         System.out.println(var12);
      } finally {
         try {
            if (out != null) {
               out.close();
            }
         } catch (IOException var11) {
            System.out.println(var11);
         }

      }

   }
}
