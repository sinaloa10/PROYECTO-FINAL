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
public abstract class Figura {
    private String color;
    
    public Figura(String color){
        this.color = color;
    }
    
    abstract double area();
    abstract double perimetro();
    
    public String getColor(){
        return color;
    }
}
