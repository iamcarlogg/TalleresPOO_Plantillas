/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iamcarlogg.calculadora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b;
        int opcion;
        
        do{
            System.out.println("Ingrese el primer numero: ");
            a = s.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            b = s.nextDouble();
            Menu();
            opcion = s.nextInt();
            switch(opcion){
               case 1 -> {
                   System.out.println(Suma(a,b));
               }
               case 2 -> {
                   System.out.println(Resta(a,b));
               }
               case 3 -> {
                   System.out.println(Multiplicacion(a,b));
               }
               case 4 -> {
                   System.out.println(Division(a,b));
               }
               case 5 -> {
                   RandomOp(a,b);
               }
               case 6 ->{
                   break;
               }
               default -> {
                   System.out.println("Ingrese una opcion valida");

               }
        }}while(opcion!=6);
} 
        
        
        
        
        
    
    public static double Suma(double a, double b){
        return a+b;
    }
    public static double Resta(double a, double b){
        return a-b;
    }
    public static double Multiplicacion(double a, double b){
        return a*b;
    }
    public static double Division(double a, double b){
        if(b==0){
            return 0;
        }
        else return a/b;
    }
    public static void RandomOp(double a, double b){
        Random r = new Random();
        int n = r.nextInt(4)+1;
        switch(n){
             case 1 -> {
                System.out.println("Se realizo Suma: "+Suma(a,b));
            }
            case 2 -> {
                System.out.println("Se realizo Resta:"+ Resta(a,b));
            }
            case 3 -> {
                System.out.println("Se realizo Multiplicacion: "+Multiplicacion(a,b));
            }
            case 4 -> {
                System.out.println("Se realizo Division: "+Division(a,b));
            }
            default -> {
                
            }
        }  
    }
    public static void Menu(){
        System.out.println("\n--- Calculadora ---");
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Restar");
        System.out.println("4. Dividir");
        System.out.println("5. Hacer una operación aleatoria");
        System.out.println("6. Salir");
        System.out.println("Seleccione una opción: ");
    }
}
