/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03;

import Servicio.AlumnosServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio_03_Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in).useDelimiter("/n");
        AlumnosServicio service = new AlumnosServicio();
        ArrayList<Integer> notasF;
        notasF = new ArrayList();

        service.crearAlumno();
        service.notaFinal();

    }
}
