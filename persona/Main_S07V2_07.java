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
public class Main_S07V2_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona_07 objpersona1 = new persona_07();
        objpersona1.nombre = "josue";
        objpersona1.apellidos = " chipana ";
        objpersona1.edad = 18;
        objpersona1.lugardeNacimiento = " Perú ";
        objpersona1.ocupacion = " Programador ";

        objpersona1.cambiarNombre("alberto");
        objpersona1.cambiarEdad(20);
        objpersona1.saludar();
    }
    }
    
