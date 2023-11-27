/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author ACER
 */
public class EjecutablePersistencia2 {
    String nombre;
    String carrera;
    String no_control;
    
    public EjecutablePersistencia2(){
        nombre = new String("Sin nombre");
        carrera = new String("Sin carrera");
        no_control = new String("cccccc");
    }
    
    public EjecutablePersistencia2 (String d, String m, String a){
        nombre = new String(d);
        carrera = new String(m);
        no_control = new String(a);
    }
    public String escribe(){
        String a = ("Dueño: "+nombre+"\nCoche"+carrera+""+no_control);
        return a;
    }
    
    public void mostrarventana(){
        Ventana2Per vnt1 = new Ventana2Per();
        vnt1.setVisible(true);
        vnt1.setLocationRelativeTo(null);
        vnt1.setTitle("Persistencia");
        
    }
}
