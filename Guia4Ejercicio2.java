/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio2;

import java.util.Scanner;

/**
 *
 * @author joaqu
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre="";
        int edad=0;
        String respuesta="";
        funcion(nombre,edad,respuesta);
    }
   public static void funcion(String nombre,int edad,String respuesta){
       Scanner leo=new Scanner(System.in);
       do {
           System.out.println("Ingrese un nombre");
           nombre=leo.next();
           System.out.println("Ingrese la edad");
           edad=leo.nextInt();
           System.out.println("nombre: "+nombre+ " edad: "+edad);
           if(edad>=18){
               System.out.println("La persona es mayor de edad");
           }else{
               System.out.println("La persona es menor de edad");
           }
           System.out.println("¿Desea seguir mostrando personas?");
           System.out.println("Ingrese Si o No");
           respuesta=leo.next();
       }while(respuesta.equals("Si"));
       
       
       
       
       
   }
    
    
    
    
    
    
}
