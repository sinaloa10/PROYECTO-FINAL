package Practica6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Prueba {
    static int opcion;
    static Scanner leer = new Scanner(System.in);
    static Figura f;
    static String color;
    
    public void Metodo() {
        do {
            System.out.println("1.Crear circulo");
            System.out.println("2.Crear Rectangulo");
            System.out.println("3.Salir\n");
            System.out.println("Elige una opción");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduzca el radio");
                    double r = leer.nextDouble();
                    System.out.println("Introduzca un color");
                    color =  leer.next();
                    f=new Circulo(r, color);
                    System.out.println("El área del circulo es" + f.area());
                    System.out.println("El perimetro del circulo es"+f.perimetro());
                    System.out.println("El color del circulo es"+f.getColor()+"\n");
                    break;
                case 2:
                    System.out.println("Introduzca la base del rectangulo");
                    double base = leer.nextDouble();
                    System.out.println("Introduzca la altura del rectangulo");
                    double altura = leer.nextDouble();
                    System.out.println("Introduzca un color");
                    color =  leer.next();
                    f=new Rectangulo(base,altura,color);
                    System.out.println("El área del rectangulo es" + f.area());
                    System.out.println("El perimetro del rectangulo es"+f.perimetro());
                    System.out.println("El color del rectangulo es"+f.getColor()+"\n");
                    break;
            }
        } while (opcion!=3);
        
    }
}
