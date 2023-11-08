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
public class Nodo {
    private Object dato;
    private Nodo izdo;
    private Nodo dcho;
    
    public Nodo(Object dato){
        this.dato=dato;
        //izdo=dcho=null;
    }
    
    public Nodo(Nodo izdo, Object dato, Nodo dcho){
        this(dato);
        this.izdo=izdo;
        this.dcho=dcho;
    }
    
    public void recorrerPreorden(){
        System.out.println(this.dato);
        if (izdo!=null) 
            izdo.recorrerPreorden();
        
        if (dcho!=null) 
            dcho.recorrerPreorden();
        
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    
}
