/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integradora;

/**
 *
 * @author 52558
 */
public class Integradora {


    public static void main(String[] args) {

        System.out.println("Cantidad de argumentos: " + args.length);
        System.out.println();

        for (String dato : args) {

            System.out.println("Valor: " + dato);

            if (dato.endsWith("F") || dato.endsWith("f")) {
                System.out.println("Tipo: Float");
            } else {
                try {
                    Double.parseDouble(dato);
                    System.out.println("Tipo: Double");
                } catch (NumberFormatException e) {
                    System.out.println("Tipo: Cadena");
                }
            }

            System.out.println();
        }
    }
}