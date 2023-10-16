/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesenlazadas.linkedqueue;

import coleccionesenlazadas.linkedqueue.LinkedQueue;

/**
 *
 * @author paveg
 */
public class PruebaLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<String> valores=new LinkedQueue<>();
        for (int i = 0; i < 10; i++) {
            valores.add("valor " + (i+1));
        }
        
        System.out.println(valores.remove());
        System.out.println(valores.remove());
        while(!valores.empty()){
            System.out.println(valores.remove());
        }
    }
}
