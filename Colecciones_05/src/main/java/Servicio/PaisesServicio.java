/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Servicio;


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El programa pedirá un país en un 
bucle, se guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, si decide 
salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si está en 
el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. 
Si el país no se encuentra en el conjunto se le informará al usuario.
 */
public class PaisesServicio {
    Scanner leer = new Scanner(System.in);
    TreeSet<String> pais = new TreeSet();
    public void cargarPais() {
        String op;
        do {

            System.out.println("-----( ͡° ͜ʖ ͡° )------");
            System.out.println("   Ingrese un País ");
            System.out.println("--------------------");
            pais.add(leer.next());
          
            System.out.println("Desea agregar un nuevo país a la lista? (s/n)");
            op = leer.next();
             
        } while (op.equalsIgnoreCase("s"));
         eliminarPais(pais);
   }
    
    public void mostrarPaises() {
        pais.forEach((aux) -> System.out.println(aux));
        System.out.println("");
        System.out.println(pais);
    }

    public void eliminarPais( TreeSet<String> pais){
       Iterator<String> it = pais.iterator();
        int cont = 0;
        System.out.println("-------Lista de paises ingresados-------");
        pais.forEach((e) -> System.out.println(e));
        System.out.println("Ingrese el país que desee eliminar de la lista: ");
        String nombre = leer.next();
       
         
         while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(nombre)) {
                it.remove();
                cont ++;
            }
        }
        if (cont == 0) {
            System.out.println("Este país no se encuentra!!!!");
        }
        System.out.println("-------Lista final ordenada-------");
         for (String pai : pais) {
            
        }
    }
}
    

