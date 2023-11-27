/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author oscar
 */
public class Profesor extends Persona{
    //Atributo que sólo va a tener nuestra clase hija "Profesor":
    String materia;
    
    public Profesor(String nombre, String apellido, int edad, String materia){
        //Recibimos los atributos de nuestra clase principal con la palabra reservada "Super":
        super(nombre, apellido, edad);
        //Si creamos un objeto del tipo Profesor pediremos un atributo extra, en este caso "Materia":
        this.materia = materia;
    }
    
    //Metodo que sólo va a tener nuestra clase hija "Profesor"
    public String Calificar(double ca_unidad1, double ca_unidad2, double ca_unidad3){
        return "Obtuviste un promedio de: "+(ca_unidad1+ca_unidad2+ca_unidad3)/3;
    }
    
    /*En este método reescribiremos lo que habíamos escrito anteriormente en la clase prinicpal
    agregandole una nueva funcionalidad con "@Override"*/ 
    @Override
    public String Ir_al_aula(){
        return "Soy un profesor y empezaré a dar clases";
    }
 
    
}
