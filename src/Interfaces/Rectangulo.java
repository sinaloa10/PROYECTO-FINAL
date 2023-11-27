package Interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Rectangulo implements Figura {
    private final float lado;
    private final float altura;
    
    public Rectangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public float area(){
        return lado*altura; 
    }
}
