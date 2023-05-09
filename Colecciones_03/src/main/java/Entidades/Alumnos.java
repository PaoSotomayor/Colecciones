/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá como atributos, su 
nombre y una lista de tipo Integer con sus 3 notas.
 */
public class Alumnos {

    private String Nombre;
    private ArrayList<Integer> notas;

    public Alumnos() {
        this.notas = new ArrayList();

    }

    public Alumnos(String Nombre, ArrayList<Integer> notas) {
        this.Nombre = Nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "Nombre=" + Nombre + ", notas=" + notas + '}';
    }

    
    }

  
