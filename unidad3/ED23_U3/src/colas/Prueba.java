/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        /*char c='A';
        System.out.println(c);
        c=(char)(c+1);
        System.out.println(c);
        */
        //Queue<String> letras=new Queue<>();
        ArrayList<String> letras=new ArrayList<>();
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
//        while(!letras.empty()){
//        //while(letras.empty()==false){
//            String primero=letras.remove();
//            System.out.println(primero);
//        }
//        
        for(String elemento: letras){
//            if(elemento.equals("E")){
//                letras.remove("E");
//            }
            //System.out.println(elemento);
        }
        Iterator<String> iteradorLetras=letras.iterator();
        while(iteradorLetras.hasNext()){
            String l=iteradorLetras.next();
            
            if(l.equals("E")){
                iteradorLetras.remove();
                //letras.add("e");
            }
            System.out.println(l);
        }
        System.out.println("------------------------");
         for(String elemento: letras){
            System.out.println(elemento);
        }
//        
//        while(iteradorLetras.hasNext()){
//            String l=iteradorLetras.next();
//            if(l.equals("E")){
//                letras.remove("E");
//            }
//            System.out.println(l);
//        }
//        System.out.println(iteradorLetras.hasNext());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.hasNext());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.hasNext());
//        System.out.println(iteradorLetras.next());
//        System.out.println(iteradorLetras.hasNext());
    }
}
