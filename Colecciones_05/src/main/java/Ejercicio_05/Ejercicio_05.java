/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio_05;

import Servicio.PaisesServicio;

/**
 *
 * @author user
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
       PaisesServicio servicio = new PaisesServicio();
       servicio.cargarPais();
       servicio.mostrarPaises();
       
       
    }
}
