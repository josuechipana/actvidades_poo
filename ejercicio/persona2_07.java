/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author chipa
 */
public class persona2_07 {
    public String nombre;
    public int edad;

    public persona2_07(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String saludar() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años.";
    }
}
