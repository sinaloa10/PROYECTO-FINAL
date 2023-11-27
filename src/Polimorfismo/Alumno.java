/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author oscar
 */
public class Alumno extends Persona{
    //Atributo que sólo va a tener nuestra clase hija "Alumno":
    String no_control;
    
    public Alumno(String nombre, String apellido, int edad, String no_control){
        super(nombre, apellido, edad);
        this.no_control = no_control;
    }
    
    public String entregarTarea(){
        return "He finalizado mi tarea";
    }
    
    @Override
    public String Ir_al_aula(){
        return "Soy un alumno y tomaré la clase";
    }

   
}
