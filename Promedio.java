/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Promedio;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre1;
    float edad1;
    String genero1;
    Scanner lectura = new Scanner (System.in);


    System.out.println("Programa para el registro de personas y hallar la edad promedio");
    System.out.println("Brindeme el nombre de la primera persona: ");
    nombre1 = lectura.next();
    System.out.println("Brindeme la edad de la primera persona");
    edad1= lectura.nextInt();
    System.out.println("Brindeme el genero de la primera persona");
    genero1 = lectura.next();
    Persona persona1 = new Persona(nombre1,edad1,genero1);
    
    System.out.println("Brindeme el nombre de la segunda persona: ");
    nombre1 = lectura.next();
    System.out.println("Brindeme la edad de la segunda persona: ");
    edad1= lectura.nextInt();
    System.out.println("Brindeme el genero de la segunda persona: ");
    genero1 = lectura.next();
    Persona persona2 = new Persona(nombre1,edad1,genero1);
    
    System.out.println("Brindeme el nombre de la tercera persona: ");
    nombre1 = lectura.next();
    System.out.println("Brindeme la edad de la tercera persona: ");
    edad1= lectura.nextInt();
    System.out.println("Brindeme el genero de la tercera persona: ");
    genero1 = lectura.next();
    Persona persona3 = new Persona(nombre1,edad1,genero1);
   
    System.out.println("El promedio es: " + persona1.calcularPromedio(persona1, persona2, persona3));
    
    /*
    float promedio;
    promedio = (persona1.obtenerEdad() + persona2.obtenerEdad()+ persona3.obtenerEdad())/3 ;
    
    System.out.println("El promedio de las edades es:" + promedio);
    Persona persona2 = new Persona("luis",14,"M");
    Persona persona3 = new Persona("Luisa",18,"F");   
     System.out.println("La edad de juan es:" + juan.obtenerEdad());
    }kjkjk
    */
    }
}
