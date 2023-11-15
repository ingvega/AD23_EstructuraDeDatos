/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u4.arboles.binariobusqueda;

import java.util.PriorityQueue;

/**
 *
 * @author paveg
 */
public class PruebaConObjeto {
    public static void main(String[] args) {
        /*PriorityQueue<Alumno> pq=new PriorityQueue<>();
        pq.add(new Alumno("S23120001","JUAN PEREZ","SISTEMAS COMP"));
        pq.add(new Alumno("C21120235","ALBERTO DOMINGUEZ","GASTRONOMÍA"));
        */
        ArbolBinarioDeBusqueda<Alumno> arbol=new ArbolBinarioDeBusqueda<>();
        arbol.agregar(new Alumno("S23120001","JUAN PEREZ","SISTEMAS COMP"));
        arbol.agregar(new Alumno("C21120235","ALBERTO DOMINGUEZ","GASTRONOMÍA"));
        arbol.agregar(new Alumno("S22120178","ERICK BARRERA","SISTEMAS COMP"));
        arbol.agregar(new Alumno("D23120432","PAULA JIMENEZ","INDUSTRIAL"));
        arbol.agregar(new Alumno("S22120400","DENISE AGUADO","SISTEMAS COMP"));
        arbol.agregar(new Alumno("E20120090","LUIS URIBE","ELECTRONICA"));
        arbol.agregar(new Alumno("G22120145","ANA HERNANDEZ","GESTION"));
        arbol.agregar(new Alumno("S21120023","ANDRES LUNA","SISTEMAS COMP"));
        //arbol.imprimir();
        
        System.out.println(arbol.buscar(new Alumno("C21120235",null,null)));
        
    }
}
