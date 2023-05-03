/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicios_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista con un 
Iterator, se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la 
lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
 */
public class Ejercicio_02_PerroIterator {
      public static void main(String[] args) {
    
Scanner leer = new Scanner(System.in);
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
                    System.out.println("ERROR. Ingrese una opción válida!");
                    break;
            }
        } while (op != 2);
          
        System.out.println("Las razas ingresadas son: ");
        
        for (String raza : razas) {
            System.out.println(raza);
        }
       //recorrer y buscar con ITERATOR
        Iterator<String> it = razas.iterator();
        
        System.out.println("Ingrese una raza que desee eliminar de la lista");
        String raza1 = leer.next();
        int cont = 0;
       //remover con ITERATOR
        while (it.hasNext()) {
            if (it.next().equals(raza1)) {
                it.remove();
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Esta raza no se encuentra!!!!");
        }
        
        //ordenar con Collection.sort
        Collections.sort(razas);
        
          System.out.println("----Lista ordenada----");
        for (String Raza : razas) {
            System.out.println(Raza);
        }
    }    
}
