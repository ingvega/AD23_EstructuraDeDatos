/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdadiccionario;

/**
 *
 * @author paveg
 */
public class TDADiccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diccionario<Integer,String> diccionario=new Diccionario<>();
        diccionario.agregar(3, "A");
        diccionario.agregar(9, "B");
        diccionario.agregar(21, null);
        diccionario.agregar(0, "D");
        diccionario.agregar(4, "E");
        System.out.println(diccionario);
    }
    
}
