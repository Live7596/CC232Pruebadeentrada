/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Promedio;

/**
 *
 * @author Alumno
 */
public class Persona {
    public String nombre;
    public float edad;
    public String genero;
    public Persona(){
    }
    
    public Persona(String nombre, float edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    

    public float obtenerEdad() {
        return edad;
    }

    public void setearEdad(float edad) {
        this.edad = edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void setearNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public float calcularPromedio(Persona p1,Persona p2,Persona p3){
        float promedio;
        promedio = p1.obtenerEdad() + p2.obtenerEdad() + p3.obtenerEdad();
        return promedio/3 ;
    }
 
    
    
}
