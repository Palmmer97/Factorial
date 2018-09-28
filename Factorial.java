/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Alejandro Lopez Garcia 16210545
 */
public class Factorial {
 static int factorial(int n){
        int factor;
        if(n == 0){
            factor = 1;
        }
        else{
            factor = n * factorial(n - 1);
        }
        return factor;
    }
   
    public static void main(String[] args) {
       Scanner ent=new Scanner(System.in);
       int res;
       long factorial=1,Ti,Tf,t;
       int num,n,factor;
       System.out.println("----------------Menu-------------");
       System.out.println("1.Factoral Normal");
       System.out.println("2.-Factorial con recursividad");
       System.out.println("3.-Salir");
       res=ent.nextInt();
       
       switch(res)
       {
           case 1:
               Ti=System.currentTimeMillis();
               System.out.print("Introduce un número: ");
        num = ent.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        Tf= System.currentTimeMillis();
        
        t=Tf-Ti;
        System.out.println("El Tiempo de ejecucion en milisegundos es: "+t);
               break;
           case 2:
             Ti=System.currentTimeMillis();
        System.out.print("Ingresa un número para calcular el factorial: ");
        n = ent.nextInt();
        factor = factorial(n);
        System.out.println("El factorial de " + n + " es " + factor);
        Tf= System.currentTimeMillis();
        
        t=Tf-Ti;
        System.out.println("El Tiempo de ejecucion en milisegundos es: "+t);
               break;
           case 3:
          System.out.println("Salir");
                  break;
           default:
        System.out.println("Esa opcion no existe ");
               break;
       }
       
    }
    
}
