/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04;

import Servicio.PeliculaServicio;

/**
 *
 * @author user
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ser = new PeliculaServicio();
        ser.Cargarpeli();
        System.out.println("La lista de pelis es ");
        ser.Mostrarpeli();
        System.out.println("--------");
        System.out.println("Lista de pelis con duración de mas de una hora");
        ser.pelidemasdeunahora();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada con duración ascendente");
        ser.duracionasc();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada con duración descendente");
        ser.duraciondec();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada por nombre ");
        ser.nombrealf();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada por el nombe del director");
        ser.directoralf();
    }
    
}
