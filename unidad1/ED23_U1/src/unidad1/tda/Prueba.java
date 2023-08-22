/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.tda;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        ArregloDinamico coleccionDeEnteros=new ArregloDinamico();
        coleccionDeEnteros.agregar(47);
        coleccionDeEnteros.agregar(3434);
        coleccionDeEnteros.agregar(32);
        coleccionDeEnteros.agregar(565);
        coleccionDeEnteros.agregar(4);
        coleccionDeEnteros.agregar(124);
        coleccionDeEnteros.agregar(8);
        coleccionDeEnteros.agregar(1);
        coleccionDeEnteros.agregar(-47);
        coleccionDeEnteros.agregar(488);
        coleccionDeEnteros.agregar(1884);
        
        System.out.println("Elemento con índice 9: " + coleccionDeEnteros.obtener(9));

        for (int i = 0; i < coleccionDeEnteros.tamanio(); i++) {
            System.out.println("Elemento "+ i + " - " + coleccionDeEnteros.obtener(i));
        }
    }
}