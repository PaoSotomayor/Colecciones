/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.ejercicios_colecciones;


import java.util.ArrayList;
import java.util.Scanner;



/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de perro en un bucle, el mismo 
se guardará en la lista y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos 
los perros guardados en el ArrayList.
 */
public class Ejercicio_01_Perro {
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();

        int op = 0;
        do {
                    System.out.print("""
                                      __
                                 (___()'`;
                                 /,    /
                                 
                           """);
            System.out.println("----------------");
            System.out.println("MENU");
            System.out.println("1. Crear una raza");
            System.out.println("2. Salir");
            System.out.println("----------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese la raza de su perro: ");
                    razas.add(leer.next());
                    break;
                case 2:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("ERROR. Ingrese un valor correcto!");
                    break;
            }
        } while (op != 2);
        
        for (String raza : razas) {
            System.out.println(raza);
        }
    }
}