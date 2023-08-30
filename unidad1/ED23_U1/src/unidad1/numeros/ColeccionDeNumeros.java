/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.numeros;

/**
 *
 * @author paveg
 */
public class ColeccionDeNumeros {
   private int n;
    private int coleccion[];

    public ColeccionDeNumeros() {
//        System.out.println("");
        this(10);
//        this.n = 10;
//        coleccion = new int [n];
    }

    public ColeccionDeNumeros(int n) {
        if(n>=2){
        this.n = n;
        coleccion = new int [n];
        }else{
         throw new IllegalArgumentException("Valor minimo de 2");
        }
        
        
    }
    
    
    
}
