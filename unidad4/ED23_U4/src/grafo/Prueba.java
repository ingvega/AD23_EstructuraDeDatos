/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        try {
            GrafoMatriz g = new GrafoMatriz(true);
            g.agregarVertice("A");
            g.agregarVertice("B");
            g.agregarVertice("C");
            g.agregarVertice("D");
            g.agregarVertice("E");
            g.agregarArco("A", "B",10);
            g.agregarArco("A","C" , 40);
            g.agregarArco("B", "D", 10);
            g.agregarArco("D", "B", 10);
            g.agregarArco("C", "E", 20);
            g.agregarArco("E", "C", 20);
            g.agregarArco("C", "D", 5);
            g.agregarArco("D", "C", 5);
            g.agregarArco("B", "E", 20);
            g.agregarArco("D", "E", 5);
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
        
    }
}
