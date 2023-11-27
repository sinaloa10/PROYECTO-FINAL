/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author oscar
 */
public abstract class Persona {
    String nombre;
    String apellido;
    int edad;
    
    public Persona(String nombre, String apellido, int edad){
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
    }
    
    public String Ir_al_aula(){
        return "Soy una persona y estoy llegando al aula";
    }
}
