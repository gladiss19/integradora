/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class PRACT3S6 {
 
   public PRACT3S6() {
   }

   public static void main(String[] var0) {
      System.out.println("Cantidad de argumentos: " + var0.length);
      System.out.println();

      for(String var4 : var0) {
         System.out.println("Valor: " + var4);
         if (!var4.endsWith("F") && !var4.endsWith("f")) {
            try {
               Double.parseDouble(var4);
               System.out.println("Tipo: Double");
            } catch (NumberFormatException var6) {
               System.out.println("Tipo: Cadena");
            }
         } else {
            System.out.println("Tipo: Float");
         }

         System.out.println();
      }

   }
}

