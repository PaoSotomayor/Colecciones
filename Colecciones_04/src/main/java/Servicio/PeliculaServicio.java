/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Pelicula;
import Utilidades.comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PeliculaServicio {
    
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peli = new ArrayList();

    public void Cargarpeli() {

        String op;

        do {
            Pelicula p1 = new Pelicula();
            System.out.println("               ___      \n" +
"              (o o)     \n" +
"----------ooO--(_)--Ooo---------");
            System.out.println("Ingrese el nombre de la Pelicula");
            p1.setNombre(leer.next());
            System.out.println("Ingrese el director de la pelicula" );
            p1.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la peli en horas" );
            p1.setDuracion(leer.nextInt());
            peli.add(p1);
            System.out.println("-----------");
            System.out.println("Quiere ingresar otra pelicula? (s/n)");
            System.out.println("");
            op = leer.next();
            
        } while (op.equalsIgnoreCase("s"));
    }

    public void Mostrarpeli() {
        peli.forEach((aux) -> System.out.println(aux));
    }

    public void pelidemasdeunahora() { //peliculas de duracion mayor a una hora
        for (Pelicula pelicula : peli) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void duracionasc() { //orden ascendente
        Collections.sort(peli, comparadores.ordenduracionasc);
        peli.forEach((aux) -> System.out.println(aux));

    }

    public void duraciondec() { //orden descendente
        Collections.sort(peli, comparadores.ordenduraciondec);
        peli.forEach((aux) -> System.out.println(aux));
    }

    public void nombrealf() {
        Collections.sort(peli, comparadores.ordenarpornombre);
        peli.forEach((aux) -> System.out.println(aux));
    }

    public void directoralf() {
        Collections.sort(peli, comparadores.ordenpordirector);
        peli.forEach((aux) -> System.out.println(aux));
    }
}