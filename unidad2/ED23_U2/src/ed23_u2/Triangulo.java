/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u2;

/**
 *
 * @author paveg
 */
public class Triangulo {
    public static void main(String[] args) {
        imprimir(5);
    }
    
    public static void imprimir(int n){
        imprimir2(n-1,1);
    }
    private static void imprimir2(int n,int p){
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        if(n>=0){
            imprimir1(n-1,p);
        }
    }
    private static void imprimir1(int n, int p){
        if(n>=-1){
            for (int i = 0; i < p; i++) {
                System.out.print(".");
            }
            System.out.println("");
            if(n>=0){
                imprimir2(n,p+2);
            }
        }
    }
}
