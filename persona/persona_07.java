/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author chipa
 */
public class persona_07 {
   //atributos

    String nombre, apellidos, lugardeNacimiento, ocupacion;
    int edad;

    //metodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + apellidos + "tengo de edad " + edad + " vivo en " + lugardeNacimiento + " mi ocupación es" + ocupacion);
    }

    //sobrecarga de metodo
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public void saludar(String nombre, String apellido) {
        System.out.println("Hola, " + nombre + " " + apellidos + "!");
    }

    //retorno
    public String getNombre() {
        return "Estiven";
    }

    public int getEdad() {
        return 10;
    }

    // Métodos con parámetros y argumentos
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void cambiarEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }   
}
