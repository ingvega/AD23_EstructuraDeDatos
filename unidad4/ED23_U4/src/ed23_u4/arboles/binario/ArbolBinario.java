/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u4.arboles.binario;

/**
 *
 * @author paveg
 */
public class ArbolBinario {
    private Nodo raiz;
    
    public ArbolBinario(){}
   
    public ArbolBinario(Nodo raiz){
        this.raiz=raiz;
    }
    
    /*public ArbolBinario(Nodo ramaIzq, Object dato, Nodo ramaDer){
        raiz = new Nodo(ramaIzq,dato,ramaDer);
    }*/
    
    public void imprimir(){
        raiz.recorrerPreorden();
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public boolean estaVacio(){
        return raiz==null;
    }
    
    public static Nodo nuevoArbol(Nodo ramaIzq, Object dato, Nodo ramaDer){
        return new Nodo(ramaIzq,dato,ramaDer);
    }
}
