package Practica6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Rectangulo extends Figura {
    private double x;
    private double y;
    
    public Rectangulo(double x, double y, String color){
        super(color);
        this.x = x;
        this.y = y;
    }
    
    @Override
    double area(){
        return x*y;
    }
    
    @Override
    double perimetro(){
        return ((2*x)+(2*y));
    }
}
