/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class PruebaInterfaces {
    public void Metodo() {
        Figura circ1 = new Circulo(3.5f);
        Figura circ2 = new Circulo(4f);
        Figura rect1 = new Rectangulo(2.55f,2.55f);
        Figura rect2 = new Rectangulo(12f,3f);
        ArrayList <Figura> serieDeFiguras = new ArrayList <Figura> ();
        serieDeFiguras.add(circ1);
        serieDeFiguras.add(circ2);
        serieDeFiguras.add(rect1);
        serieDeFiguras.add(rect2);
        float areaTotal = 0;
        for (Figura tmp: serieDeFiguras) {
            areaTotal = areaTotal + tmp.area();
        }
        System.out.println("Tenemos un total de "+serieDeFiguras.size()+" figuras y su área total es de "+areaTotal + " uds cuadradas");
    }
}
