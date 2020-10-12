/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ismael Cuenca Galgo 
 */
public class EntradaSalida {
    
   static  Scanner sc = new Scanner(System.in);
   
    
    public static int menuOpcion() //@menuOpcion , menú de selección de Ejercicios 
    {
        System.out.println("MENU DE OPCIONES"+"\n"+
                            "1.-Ejercicio 1"+"\n"+
                            "2.-Ejercicio 2"+"\n"+
                            "3.-Ejercicio 3"+"\n"+
                            "4.-Ejercicio 4"+"\n"+
                            "5.-Ejercicio 5"+"\n"+
                            "6.-Ejercicio 6"+"\n"+
                            "7.-Ejercicio 7"+"\n"+
                            "8.-Ejercicio 8"+"\n"+
                            "9.-Ejercicio 9"+"\n"+
                            "10.-Ejercicio 10"+"\n"+
                            "11.-Ejercicio 11"+"\n"+
                            "12.-Ejercicio 12"+"\n"+
                            "13.-Ejercicio 13"+"\n"+
                            "14.-Ejercicio 14"+"\n"+
                            "15.-Ejercicio 15"+"\n"+
                            "16.-Ejercicio 16"+"\n"+
                            "17.-Ejercicio 17"+"\n"+
                            "18.-Ejercicio 18"+"\n"+
                            "19.-Ejercicio 19"+"\n"+
                            "20.-Ejercicio 20"+"\n"+
                            "21.-Ejercicio 21"+"\n"+
                            "22.-Ejercicio 22"+"\n"+
                            "23.-Ejercicio 23"+"\n"+
                            "24.-Ejercicio 24"+"\n"+
                            "25.-Ejercicio 25"+"\n"+
                            "26.-Ejercicio 26"+"\n"+
                            "27.-Ejercicio 27"+"\n"+
                            "28.-Ejercicio 28"+"\n"+
                            "29.-Ejercicio 29"+"\n"+
                            "30.-Ejercicio 30"+"\n"+
                            "31.-Salir");    
        int a = sc.nextInt();
        String b = sc.nextLine();
        return a;          
    }
    public static String datosProducto()
    {
        System.out.println("Introduce la descripcion del nuevo producto");
        String descripcion = sc.nextLine();
        System.out.println("Introduce el nombre  del nuevo producto");
        String nombre =  sc.nextLine();
        System.out.println("Introduce el precio del nuevo producto");
        int precio = sc.nextInt();
        Producto c = new Producto(descripcion, nombre, precio);
        String insertar ="INSERT INTO productos VALUES('"+c.getDescripcion()+"', '"+c.getNombre()+"', '"+c.getPrecio()+"')";
        return insertar;       
    }
       public static String entradaNombre()
   {
       System.out.println("Introduce el nombre que deseas buscar");
       String nombre = sc.nextLine();      
       return nombre;
   }   
    public static void SalidaDatos(ArrayList<Producto> lista_productos)
    {
        for (int i = 0; i < lista_productos.size(); i++) {
            Producto p =  lista_productos.get(i);
            System.out.println("La Descripcion del producto es "+p.getDescripcion()+"\n"+
                                "El Nombre del producto es"+p.getNombre()+"\n"+
                                "El precio del producto es"+p.getPrecio()+"\n"+"\n");
            
        }
    }
    
}
