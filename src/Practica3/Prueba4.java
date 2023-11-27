/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author Oscar
 */
public class Prueba4 {
    int  a = 100;
    void mostrar(){
        System.out.println(a);
    }  
}
 
class HijoUno4 extends Prueba4{
    int  a = 200;
    @Override
    void mostrar(){
        super.mostrar();
        System.out.println(a);
    }
    public void Mostrar(){
        new HijoUno4().mostrar();
    }
}

