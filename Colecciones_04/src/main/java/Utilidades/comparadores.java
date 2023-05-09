/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class comparadores {
    
    public static Comparator<Pelicula> ordenduracionasc= new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
             return t.getDuracion().compareTo(t1.getDuracion());
          }
      };
      
       public static Comparator<Pelicula> ordenduraciondec = new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
             return t1.getDuracion().compareTo(t.getDuracion());
          }
      };
       
       public static Comparator<Pelicula> ordenpordirector = new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
              return t.getDirector().compareTo(t1.getDirector());
          }
      };
      
       public static Comparator<Pelicula> ordenarpornombre = new Comparator<Pelicula>() {
          @Override
          public int compare(Pelicula t, Pelicula t1) {
              return t.getNombre().compareTo(t1.getNombre());
          }
             
      };
}
