/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio4;

import java.util.Scanner;

/**
 *
 * @author joaqu
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero y le dire si es primo o no");
        double num;
        Scanner leoNum=new Scanner(System.in);
        num=leoNum.nextInt();
        System.out.println(Primo(num));
    }
    public static boolean Primo(double num){
       if(num==0 || num==1 || num==4){
           return false;
       }
        for (int i = 2; i < num/2; i++) {
            if(num % i == 0)
                return false;
}
        return true;    
            
            
            
    }    
}
        
        
               
    

    
    
    
    

