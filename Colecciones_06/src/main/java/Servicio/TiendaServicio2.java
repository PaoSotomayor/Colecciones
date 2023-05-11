/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TiendaServicio2 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<String, Double> productos = new HashMap();

    String productoIng;
    double precio;
    int cont = 0;

    public void menu() {

        int op = 0;

        do {
            System.out.println("---------MENU---------");
            System.out.println("1- Ingresar producto");
            System.out.println("2- Modificar precio");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Mostrar un producto");
             System.out.println("5- Mostrar todos los productos");
            System.out.println("6- Salir");
            System.out.println("---------------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    mostrarProducto();
                    break;
//                case 5:
//                    mostrarTodos();
//                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("( ㄏ-᷅_-᷄)ㄏ. Ingrese una opción válida");
                    break;
            }
        } while (op != 6);
    }

    public void ingresarProducto() {
        System.out.println("Ingrese un producto: ");
        productoIng = leer.next();
        System.out.println("Ingrese el precio de este producto: ");
        precio = leer.nextDouble();
        productos.put(productoIng, precio);
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto para modificar su precio: ");
        productoIng = leer.next();

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double val = entry.getValue();
            if (productoIng.equalsIgnoreCase(key)) {
                System.out.println("Ingrese el precio nuevo");
                entry.setValue(leer.nextDouble());
                System.out.println("El nuevo precio del producto " + entry.getKey()
                        + " es u$ " + entry.getValue());
                cont++;
            }

        }
        if (cont == 0) {
            System.out.println("El producto no se encuentra en la base de datos");
        }
    }

    public void eliminarProducto(Map<String, Double> productos) {
        System.out.println("Ingrese el producto que desee eliminar de la base de datos");
        productoIng = leer.next();
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            
            if (productoIng.equalsIgnoreCase(key)) {
                productos.remove(productoIng);
                System.out.println("El producto ha sido eliminado de la base de datos");
                cont++;
            }
            break;
        }
        if (cont == 0) {
            System.out.println("El producto no se encuentra en la base de datos");
        }

    }

    public void mostrarProducto() {
        System.out.println("Ingrese el producto a consultar: ");
        productoIng = leer.next();
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double val = entry.getValue();
            if (key.equalsIgnoreCase(productoIng)) {
                System.out.println(entry.getKey() + " = $" + entry.getValue());
                System.out.println("");
                System.out.println("----Lista total de productos----");
                System.out.println("Producto: " + key + " Precio: " + val + "u$ ");
            }

        }
        if (cont == 0) {
            System.out.println("El producto no se encuentra en la base de datos");
        }
    }
//    public void mostrarTodos() {
//        System.out.println("----Lista final de productos----");
//        for (Map.Entry<String, Double> entry : productos.entrySet()) {
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            
//            System.out.println("Producto: " + key + " Precio: " + val + "u$ ");
//        }
//        
//    }
}
