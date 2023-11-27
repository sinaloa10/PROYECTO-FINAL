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
public class Circulo extends Figura{
    private double r;
    
    public Circulo(double r, String color){
        super(color);
        this.r = r;
    }
    
    @Override
    double area(){
        return Math.PI*r*r;
    }
    
    @Override
    double perimetro(){
        return (2*Math.PI)*r;
    }
}
