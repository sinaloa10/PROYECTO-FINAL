/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesPolimorficas;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class VariablesPolimorficas {
    public void Metodo() {
        ArrayList lista = new ArrayList();
        agregar(lista);
        mostrar(lista);
    }
    
    static void agregar(ArrayList lista){
        lista.add(true);
        lista.add("H");
        lista.add(23);
        lista.add("Juan");
    }
    
    static void mostrar(ArrayList lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(""+ lista.get(i));
        }
    }
}
