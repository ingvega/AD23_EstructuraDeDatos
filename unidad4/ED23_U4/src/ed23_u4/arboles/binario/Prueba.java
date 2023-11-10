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
public class Prueba {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Nodo n1=new Nodo("Maria");
//        Nodo n2=new Nodo("Rodrigo");
//        Nodo n3=new Nodo(n1,"Esperanza",n2);
//        
//        Nodo n4=new Nodo("Anyora");
//        Nodo n5=new Nodo("Abel");
//        Nodo n6=new Nodo(n4,"M Jesus",n5);
//        
//        Nodo n7=new Nodo(n3,"Esperanza",n6);
//        ArbolBinario ab=new ArbolBinario(n7);
//        
//    }
    public static void main(String[] args) {
        Nodo raiz=new Nodo("A");
        ArbolBinario ab=new ArbolBinario(raiz);
        
        Nodo nIz=new Nodo("B");
        Nodo nDe=new Nodo("C");
        raiz.setIzdo(nIz);
        raiz.setDcho(nDe);
        
        nIz.setIzdo(new Nodo("D"));
        nIz.setDcho(new Nodo("E"));
        
        nDe.setIzdo(new Nodo("F"));
        nDe.setDcho(new Nodo("G"));
        
        nIz.getIzdo().setDcho(new Nodo("I"));
        nIz.getIzdo().setIzdo(new Nodo("H"));
        
        Nodo G=nDe.getDcho();
        G.setIzdo(new Nodo("N"));
        G.setDcho(new Nodo("O"));
        
        ab.imprimir();
        System.out.println(ab.contarNodos());
    }
    
    
}
