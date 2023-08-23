/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.tdaGenerico;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        ArregloDinamico<String> arreglo=new ArregloDinamico<>();
        ArregloDinamico<Integer> arregloEnteros=new ArregloDinamico<>();
        ArregloDinamico arregloObjetos=new ArregloDinamico<>();
        
        arreglo.agregar("A");
        arreglo.agregar("Otra cadena");
        arreglo.agregar("nuevo");
        arreglo.agregar("hwskjs");
        
        for (int i = 0; i < arreglo.tamanio(); i++) {
            System.out.println(arreglo.obtener(i));
        }
       
        Estudiante
                NoControl
                Nombre
                Apellidos
                Semestre
        
        
        
    }
}
