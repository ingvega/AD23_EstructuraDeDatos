/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Stack<Integer> numeros=new Stack<>();
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);
        while(!numeros.empty()){
            System.out.println(numeros.pop());
        }
        System.out.println(numeros.pop());
        
    }
}
