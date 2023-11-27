/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author ACER
 */
public class Circulo implements Figura {
    private final float diametro;
    
    public Circulo(float diametro){
        this.diametro = diametro;
    }
    
    @Override
    public float area(){
        return (PI*diametro/4f); 
    }
}
