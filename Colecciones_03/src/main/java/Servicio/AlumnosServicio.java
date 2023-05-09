/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlumnosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   ArrayList<Alumnos> alumnos = new ArrayList();

   public void crearAlumno() {
      String opcion = "";
      do {
         Alumnos nuevoAlumno = new Alumnos();
         System.out.println("Ingrese el nombre del alumno: ");
         nuevoAlumno.setNombre(leer.next());

         System.out.println("Ingrese la primera nota: ");
         ArrayList<Integer> notasAlumnoList = new ArrayList();
         notasAlumnoList.add(leer.nextInt());

         System.out.println("Ingrese la segunda nota: ");
         notasAlumnoList.add(leer.nextInt());

         System.out.println("Ingrese la tercera nota: ");
         notasAlumnoList.add(leer.nextInt());

         nuevoAlumno.setNotas(notasAlumnoList);

         alumnos.add(nuevoAlumno);

         System.out.println("Desea crear otro alumno?  S / N ");

         opcion = leer.next();
      } while (!"n".equalsIgnoreCase(opcion));

      alumnos.forEach((e) -> System.out.println(e));

     
   }

   public void notaFinal() {

      System.out.println("Digite el nombre del alumno a buscar: ");
      String nombreAlumno = leer.next();

      int suma = 0;
      int promedio = 0;
      for (Alumnos alumno : alumnos) {
         if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {

            for (Integer notas : alumno.getNotas()) {
               suma = suma + notas;
            }
            promedio = suma / alumno.getNotas().size();
            System.out.println("El promedio de notas del alumno " + alumno.getNombre() + " es: " + promedio);

            return;
         }
      }
      System.out.println("Alumno no encontrado... ");
   }
}