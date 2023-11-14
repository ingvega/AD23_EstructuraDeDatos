/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u4.arboles.binariobusqueda;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        ArbolBinarioDeBusqueda<Integer> arbolBB=new ArbolBinarioDeBusqueda<>();
        System.out.println(arbolBB.buscar(30));
        arbolBB.agregar(30);
        System.out.println(arbolBB.buscar(15));
        arbolBB.agregar(15);
        arbolBB.agregar(45);
        arbolBB.agregar(1);
        arbolBB.agregar(7);
        arbolBB.agregar(100);
        System.out.println(arbolBB.buscar(30));
        arbolBB.agregar(30);
        
        arbolBB.imprimir();
    }
}
