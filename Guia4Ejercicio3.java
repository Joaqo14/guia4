/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio3;

import java.util.Scanner;

/**
 *
 * @author joaqu
 */
public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        double euros;
        int opcion;
        Scanner leoEu = new Scanner(System.in);
        euros=leoEu.nextDouble();
        System.out.println("Ingrese a que moneda desea covertir");
        System.out.println("1;libras_2;dolares_3;yenes");
        opcion=leoEu.nextInt();
        switch(opcion){
            case 1:
                System.out.println(euros +" euro/s son: "+Libras(euros)+" libra/s");
                break;
            case 2:
                System.out.println(euros+" euro/s son: "+Dolares(euros)+" usd");
                break;
            case 3:
                System.out.println(euros+" euro/s son: "+Yenes(euros)+" yenes");
                break;
            default: System.out.println("Su opcion no es valida");   
        }
}
  public static double Libras(double euros){
      double libra=euros*0.86;
    return libra;
  }
 public static double Dolares(double euros){
     double dolar=euros*1.28611;
   return dolar;
 }   
  public static double Yenes(double euros){
     double yenes=euros*129.852;
   return yenes; 
   
 }      
}
