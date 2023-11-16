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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona1_07 persona1 = new persona1_07("josue", 30);
        persona1_07 persona2 = new persona1_07("anguie", 25);

        persona1.saludar();
        persona2.saludar();

        persona2_07 persona3 = new persona2_07("josue", 30);
        persona2_07 persona4 = new persona2_07("anguie", 25);
        System.out.println(persona3.saludar());
        System.out.println(persona4.saludar());
    }
    
}
