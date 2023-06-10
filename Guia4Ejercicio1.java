/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicios;

import java.util.Scanner;

/**
 *
 * @author joaqu
 */
public class Guia4Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio1 
        System.out.println("Igrese dos numeros");
        int num1,num2,opcion;
        Scanner leoNum=new Scanner(System.in);
        num1=leoNum.nextInt();
        num2=leoNum.nextInt();
        System.out.println("Ingrese que operacion desea realizar");
        System.out.println("1_SUMAR;2_RESTAR;3_MULTIPLICAR;4_DIVIDIR");
        opcion=leoNum.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma de sus numeros es: "+sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta de sus numeros es: "+resta(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicación de sus numeros es: "+multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("La división de sus numeros es: "+division(num1,num2));
                break;
            default:
                    System.out.println("Opcion inexistente");
                    break;
            }
        
    }
    public static int sumar(int num1,int num2){
        int suma=num1+num2;
        
     return suma;   
    }
    public static int resta(int num1,int num2){
        int resta;
        if(num1>num2){
            resta=num1-num2;
        }else{
            resta=num2-num1;
        }
         return resta;   
    }
    public static int multiplicar(int num1,int num2){
        int multiplicacion=num1*num2;
        
     return multiplicacion;   
    }    
    public static int division(int num1,int num2){
        int division;
        if(num1>num2){
            division=num1/num2;
        }else{
            division=num2/num1;
        }
         return division;   
    }   
  
}