/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author Oscar
 */
public class Prueba1 {
    int  a = 100;
}
class HijoUno1 extends Prueba1{
    int  a = 200;
    void mostrar(){
        System.out.println(a);
        System.out.println(a);
    }
    public void Mostrar(){
        new HijoUno1().mostrar();
    }
}




