/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author paveg
 */
public class PruebaColas {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        //Object x=new ArrayList<Object>();
        char c='A';
        for (int i = 0; i < 10; i++) {
            cola.add(c+"");
            c++;
        }
        
//        while(!cola.isEmpty()){
//            System.out.println(cola.poll());
//        }
        
//        for (String string : cola) {
//            System.out.println(string);
//        }

        Iterator<String> it=cola.iterator();
                
    }
}
