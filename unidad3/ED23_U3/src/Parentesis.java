/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;

/**
 *
 * @author paveg
 */
public class Parentesis {
    public static void main(String[] args) {
        Stack<Character> pila=new Stack<>();
//        pila.push(x);
//        pila.pop();
//        pila.peek(); ->top()
//        pila.isEmpty(); ->empty()
        String expresion="(3+5*(9-3))*(-3)";
        for (int i = 0; i < expresion.length(); i++) {
            char c=expresion.charAt(i);
            if(c=='('){
                pila.push(c);
            }else if(c==')'){
                
            }
        }
                
            
             
    }
}
