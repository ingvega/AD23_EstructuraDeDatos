/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        char c='A';
        System.out.println(c);
        c=(char)(c+1);
        System.out.println(c);
        
        Queue<String> letras=new Queue<>();
//        letras.add("A");
//        letras.add("B");
//        letras.add("C");
//        letras.add("D");
//        letras.add("E");
//        letras.add("F");
        char letra='A';
        for (int i = 0; i < 10; i++) {
            letras.add(letra+"");
            letra++;
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(letras.element());
//        }
        while(!letras.empty()){
        //while(letras.empty()==false){
            String primero=letras.remove();
            System.out.println(primero);
        }
        
        for(String elemento: letras){
        
        }
    }
}
